import java.util.Scanner;

public class sumofneturenumber {
    public static int neturalNumber(int n) {
        if (n <= 1)
            return n;
        return n + neturalNumber(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        neturalNumber(n);
        sc.close();

    }
}
