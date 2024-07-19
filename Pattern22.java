public class Pattern22 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            char ch = 'a';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
