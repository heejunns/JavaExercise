package codeup;

import java.util.Scanner;

public class CodeUp_1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for(int i=1; i<=n; ++i){
            if(i%2==0){
                total+=i;
            }
        }
        System.out.println(total);
    }
}


