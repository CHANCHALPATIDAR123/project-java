import java.util.Scanner;

public class aavarge_valueof_array {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array:");
    int size = sc.nextInt();

    int[] num = new int[size];
    System.out.println("Enter the array element:");
    for (int i = 0; i < size; i++) {
      num[i] = sc.nextInt();
    }
    System.out.println("Display the element:");
    for (int i = 0; i < size; i++) {
      System.out.print(num[i] + " ");
    }

    System.out.println(" ");
    System.out.println("Avarge value of array element:");
    int sum = 0;
    // float averge = 0f;
    for (int i = 0; i < size; i++) {
      sum = sum + num[i];
    }

    System.out.println("Sum of Array element:" + sum);

    System.out.println("Avarege of array element:");

    double averge = (double) sum / size;
    System.out.println("Avarege value of array:" + averge);
    sc.close();
  }
}
