#!/bin/bash
set -e

# runs the puzzle in the given directory
function run {
    local puzzle="$1"

    # extract main class name from property in pom.xml, with very poor but good enough xml parsing
    local main=$(sed -rn 's|.*<exec.main>(.*)</exec.main>|\1|p' $puzzle/pom.xml)
    if [ -z "$main" ]; then
        echo Error: Main class not found in pom.xml in $puzzle
        exit 1
    fi

    # prepare output directory
    rm -rf $puzzle/out
    mkdir $puzzle/out

    echo Compiling and executing $main in $puzzle
    javac -cp $puzzle/src -d $puzzle/out $puzzle/src/*/*.java
    java -cp $puzzle/out -Djava.security.manager $main
}

# if executed from this directory
if [ $(dirname $0) = . ]; then
    echo Compiling and executing all puzzles
    for puzzle in $(sed -rn 's|.*<module>(.*)</module>|\1|p' pom.xml); do
        run $puzzle
    done
else # assume we're executed in the directory of a specific puzzle
    run .
fi
