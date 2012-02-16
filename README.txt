See http://wouter.coekaerts.be/puzzles for an explanation of these puzzles.

There are three ways to compile and run these puzzles:
* The easiest is to run them within your IDE (Eclipse, IntelliJ, Netbeans,...):
  Import the project as a maven project, and run the included main class.
  Add "-Djava.security.manager" to the jvm arguments in the run configuration.
* With maven:
  Run "mvn clean test".
  The puzzles are not unit tests. Look at the output of exec:exec to see if you were successful
  Add "-q" to remove the other distracting output from maven.
* With a shell script:
  Run "./run.sh" from this dir, or "../run.sh" from a sub-directory to run just that puzzle
