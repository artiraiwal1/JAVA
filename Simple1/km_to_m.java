import java.util.Scanner;

public class km_to_m {
    public static void main(String[] args) {
        double km, m = 0;
        System.out.println("Enter KM : ");
        Scanner sc = new Scanner(System.in);
        km = sc.nextDouble();
        m = km * 0.62137;
        System.out.println("Meetars = " + m);
        sc.close();
    }
}
