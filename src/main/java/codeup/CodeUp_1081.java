package codeup;
import java.util.Scanner;

public class CodeUp_1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = Integer.parseInt(str,16);
        for(int i=1; i<=15; ++i){
            System.out.printf("%s*%s=%s\n",str,Integer.toHexString(i).toUpperCase(),Integer.toHexString(n*i).toUpperCase());
        }

    }
}



