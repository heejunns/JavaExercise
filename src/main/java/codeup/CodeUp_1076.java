package codeup;

import java.util.Scanner;

public class CodeUp_1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.charAt(0);
        for (int i=97; i<=n; ++i){
            System.out.print((char)i+" ");
        }
    }
}


