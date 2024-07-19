import java.util.Scanner;

public class max_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the array element:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Display the array element:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        int max = arr[0], min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            } else {
                System.out.print("both are equal");
            }

        }
        System.out.println("Maximun value of array:" + max);
        System.out.println("minimum value of array:" + min);
        sc.close();

    }
}
