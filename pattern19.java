public class pattern19 {
    public static void main(String args[]) {
        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = 5; i >= 1; i--) {
            for (int k = i; k <= 5; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
