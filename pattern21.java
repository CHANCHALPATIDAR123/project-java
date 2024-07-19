public class pattern21 {
    public static void main(String args[]) {
        int ch = 1;
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = i; k >= 1; k--) {
                    System.out.print(ch + " ");
                    ch++;
                }
                System.out.println(" ");
            }
        }
    }
}
