package codeup;
import java.util.Scanner;

public class CodeUp_1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        for(int i=0; i<str.length(); ++i){
            if (strArr[i].equals("q")){
                System.out.println(strArr[i]);
                break;
            }
            System.out.println(strArr[i]);
        }

    }
}


