import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        // int a, b;
        boolean b1;
        System.out.println("Enter Two num : ");
        Scanner sc = new Scanner(System.in);
        // a = sc.nextInt();
        // b = sc.nextInt();
        // System.out.println(a + b);
        b1 = sc.hasNextInt();
        System.out.println(b1);
        sc.close();
    }
}