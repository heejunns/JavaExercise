package codeup;
import java.util.Scanner;

public class CodeUp_1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long n2 = sc.nextLong();

        System.out.println(n+n2);
        System.out.println(n-n2);
        System.out.println(n*n2);
        System.out.println(n/n2);
        System.out.println(n%n2);
        System.out.printf("%.2f",n/(double)n2);
    }
}
