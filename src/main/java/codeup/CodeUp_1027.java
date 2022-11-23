package codeup;
import java.util.Scanner;

public class CodeUp_1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.substring(0,4);
        String str2 = str.substring(5,7);
        String str3 = str.substring(8);
        System.out.println(str3+"-"+str2+"-"+str1);

        }
    }
