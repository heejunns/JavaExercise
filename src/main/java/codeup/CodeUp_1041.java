package codeup;
import java.util.Scanner;

public class CodeUp_1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = (int)str.charAt(0);
        System.out.println((char)(num+1));
    }
}
