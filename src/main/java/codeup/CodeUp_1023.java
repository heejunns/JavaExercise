package codeup;
import java.util.Scanner;

public class CodeUp_1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] num = new int[2];
        String s = "";
        int n = 0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)!='.'){
                s+=str.charAt(i);
            }else {
                num[n] = Integer.parseInt(s);
                ++n;
                s = "";
            }
        }
        num[n] = Integer.parseInt(s);

        System.out.printf("%d\n",num[0]);
        System.out.printf("%d",num[1]);

    }
}
