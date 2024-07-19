import java.util.Scanner;

public class fibonacci_series {

    public static int printFibonacci(int n) {

        if (n <= 1) {
            return n;
        } else {
            System.out.println(n);
            return printFibonacci(n - 1) + printFibonacci(n - 2);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(0);
        // System.out.println(1);
        // printFibonacci(n);
        System.out.print(printFibonacci(n));
        sc.close();
    }
}
