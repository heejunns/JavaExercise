package codeup;
import java.util.Scanner;

public class CodeUp_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i=1; i<=n; ++i){
            for(int j=1; j<=n2; ++j){
                System.out.printf("%d %d\n",i,j);
            }
        }
    }
}



