package codeup;
import java.util.Scanner;

public class CodeUp_1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String str1 = Integer.toBinaryString(n1);
        String str2 = Integer.toBinaryString(n2);
        if (str1.length() > str2.length()){
            int len = str1.length()-str2.length();
            for (int i = 0; i < len; ++i){
                str2 = "0"+str2;
            }
        } else if (str1.length() < str2.length()){
            int len = str2.length()-str1.length();
            for (int l = 0; l < len; ++l){
                str1 = "0"+str1;
            }
        }
        int total = 0;
        int m = 0;
        for (int k = str1.length()-1; k>=0; --k){
            if (str1.charAt(k) == '1' || str2.charAt(k) == '1'){
                total+=(int)Math.pow(2,m);
            }
            m+=1;

        }
        System.out.println(total);
    }
}
