import java.util.Scanner;

public class parsentages {
    public static void main(String[] args) {
        float sub1, sub2, sub3, sub4, sub5, per;
        System.out.println("Enter Five sub marks : ");
        Scanner sc = new Scanner(System.in);
        sub1 = sc.nextFloat();
        sub2 = sc.nextFloat();
        sub3 = sc.nextFloat();
        sub4 = sc.nextFloat();
        sub5 = sc.nextFloat();
    //    per = ((sub1 + sub2 + sub3 + sub4 + sub5) / 500) * 100;
        per = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

        System.out.println("Percentages = " + per);
        sc.close();
    }
}
