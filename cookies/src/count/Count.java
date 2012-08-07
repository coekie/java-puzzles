package count;

import monster.CookieMonster;

public class Count {
    public static void main(String[] args) {
        String noCookie = CookieMonster.eat("cookie");
        if (noCookie.isEmpty() && CookieMonster.eat(noCookie).length() < noCookie.length()) {
            // The goal is to reach this line
            System.out.println("Minus one cookie!");
        }
    }
}
