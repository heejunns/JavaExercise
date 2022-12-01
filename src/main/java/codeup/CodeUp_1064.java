package codeup;
import java.util.Scanner;

public class CodeUp_1064 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int n4 = Math.min(n1,n2);
            System.out.println(Math.min(n4,n3));
        }
    }

