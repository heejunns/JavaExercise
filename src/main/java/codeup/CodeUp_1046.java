package codeup;
import java.util.Scanner;

public class CodeUp_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long n2 = sc.nextLong();
        long n3 = sc.nextLong();
        long total = n+n2+n3;
        System.out.println(total);
        System.out.printf("%.1f",total/3.0);
    }
}
