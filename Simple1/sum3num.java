import java.util.Scanner;

public class sum3num {
    public static void main(String[] args) {
        int a, b, c, sum;
        System.out.println("Enter three num : ");
        java.util.Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sum = a + b + c;
        System.out.println(sum);
        sc.close();
    }
}
