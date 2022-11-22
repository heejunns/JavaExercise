package codeup;
import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = new String[3];
        String str1 = "";
        int n = 0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)!='.'){
                str1+=str.charAt(i);
            } else{
                s[n] = str1;
                ++n;
                str1 = "";
            }
        }
        s[n] = str1;
        System.out.printf("%04d.%02d.%02d",Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));

    }
}
