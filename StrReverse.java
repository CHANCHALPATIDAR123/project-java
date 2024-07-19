public class StrReverse {
    public static void main(String[] args) {
        String s = "chanchal";
        int len = s.length();
        for (int i = 0; i <= len - 1; i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
