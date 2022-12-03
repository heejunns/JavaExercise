package codeup;
import java.util.Scanner;

public class CodeUp_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n<3 || n>11) {
            System.out.println("winter");
        } else if(n>2 && n<6){
            System.out.println("spring");
        } else if (n>5 && n<9){
            System.out.println("summer");
        } else if (n>8 && n<12){
            System.out.println("fall");
        }


    }
}

