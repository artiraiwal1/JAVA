import java.util.Scanner;

public class multiply_to_fnum {
    public static void main(String[] args) {
        float a, b, malti;
        System.out.println("Enter Two float num : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        malti = a * b;
        System.out.println(malti);
        sc.close();
    }
}
