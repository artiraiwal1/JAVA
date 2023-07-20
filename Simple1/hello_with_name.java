import java.util.Scanner;

public class hello_with_name {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Hello " + str);
        sc.close();
    }
}