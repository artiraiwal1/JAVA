import java.util.Scanner;

public class swap_two_num {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter two num : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("A = " + a + "\n" + "B = " + b);
        sc.close();
    }
}
