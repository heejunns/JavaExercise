package codeup;
import java.util.Scanner;

public class CodeUp_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.indexOf(":");
        String str2 = str.substring(n+1);
        int n2 = str2.indexOf(":");
        System.out.println(Integer.parseInt(str.substring(n+1,n+n2+1)));

        }
    }
