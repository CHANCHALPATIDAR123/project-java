import java.util.Scanner;

public class index_find_of_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of num:");
        int num = sc.nextInt();
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the element of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Display the array element:" + arr[i] + " ");
        }
        int index = -1;
        // int arrlen=sizeofarr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        if (index > -1) {
            System.out.print("index value:" + index);
        } else {
            System.out.print(" no present the value in array");
        }
        sc.close();
    }

}
