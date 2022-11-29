package codeup;
import java.util.Scanner;

public class CodeUp_1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long n2  = sc.nextLong();
        if (n>n2){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}
