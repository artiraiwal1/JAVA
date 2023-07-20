import java.util.Scanner;

public class swap_two_num_1 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two num : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A = " + a + "\n" + "B = " + b);
        sc.close();
    }
}
