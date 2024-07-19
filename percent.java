import java.util.Scanner;

public class percent {
    public static void main(String[] args) {
        System.out.println("student subject number:");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the Hindi Marks:");
        double Hindi = sc.nextDouble();

        System.out.println("enter the English Marks:");
        double English = sc.nextDouble();

        System.out.println("enter the science Marks:");
        double science = sc.nextDouble();

        System.out.println("enter the social science Marks:");
        double socialscience = sc.nextDouble();

        System.out.println("enter the maths Marks:");
        double math = sc.nextDouble();

        System.out.println("Percentes of students:");
        double total = Hindi + English + science + socialscience + math;

        Double percent = (total / (5 * 100)) * 100;

        System.out.println("Total Marks:" + total);
        System.out.println("percent:" + percent);
        System.out.println(total);

        sc.close();
    }
}
