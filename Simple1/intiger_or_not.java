import java.util.Scanner;;

public class intiger_or_not {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
        boolean a = sc.hasNextInt();
        System.out.println(a);
        sc.close();
    }
}
