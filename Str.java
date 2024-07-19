public class Str {
    public static void main(String args[]) {
        /*
         * String s = "Chanchal";
         * char p = 'r';
         * System.out.println(s + p);
         */
        /*
         * String s = "chanchal";
         * int l = s.length();
         * for (int i = l - 1; i >= 0; i--) {
         * System.out.print(s.charAt(i));
         * }
         */
        String s = "chanchAl";
        int count = 0;
        int l = s.length();
        for (int i = 0; i <= l - 1; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' ||
                    s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                count++;
            }

        }
        System.out.println(count);
    }
}
