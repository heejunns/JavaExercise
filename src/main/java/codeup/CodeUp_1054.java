package codeup;
import java.util.Scanner;

public class CodeUp_1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        if (n==1 && n2 == 1){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}
