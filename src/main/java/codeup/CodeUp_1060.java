package codeup;
import java.util.Scanner;

public class CodeUp_1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String str1 = Integer.toBinaryString(n1);
        String str2 = Integer.toBinaryString(n2);
        if (str1.length() > str2.length()){
            str1 = str1.substring(str1.length()-str2.length());
        } else if (str1.length() < str2.length()){
            str2 = str2.substring(str2.length()-str1.length());
        }
        int total = 0;
        int m = 0;
        for (int i = str1.length()-1; i>=0; --i){
            if (str1.charAt(i) == '1' && str2.charAt(i) == '1'){
                total+=(int)Math.pow(2,m);
            }
            m+=1;

        }
        System.out.println(total);
    }
}
