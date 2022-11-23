package codeup;
import java.util.Scanner;

public class CodeUp_1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=10000;i>=1; i = i/10){
            System.out.println("["+(n/i)*i+"]");
            n = n%i;
        }
    }
}
