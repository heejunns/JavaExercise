package codeup;
import java.util.Scanner;

public class CodeUp_1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (-n > n){
            System.out.println("minus");
        } else if (-n < n){
            System.out.println("plus");
        }
        if (n%2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}

