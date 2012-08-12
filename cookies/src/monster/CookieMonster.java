package monster;

public class CookieMonster {
    public static <C extends CharSequence> C eat(String cookie) {
        return (C) (cookie.length() > 0 ? "" : new CharSequence() {
            public int length() {
                return -1;
            }

            public char charAt(int index) {
                throw new UnsupportedOperationException();
            }

            public CharSequence subSequence(int start, int end) {
                throw new UnsupportedOperationException();
            }
        });
    }
}
