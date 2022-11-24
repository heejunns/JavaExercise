package codeup;
import java.util.Scanner;

public class CodeUp_1035 {
    public static void main(String[] args) { // 16 진수 -> 8 진수
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num  = Integer.parseInt(str,16);
        String octal = Integer.toOctalString(num);
        System.out.print(octal);
        }
    }
