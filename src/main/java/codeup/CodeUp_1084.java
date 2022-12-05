package codeup;import java.util.Scanner;

public class CodeUp_1084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            for(int l=0; l<n2; l++){
                for(int k=0; k<n3; k++){
                    System.out.printf("%d %d %d\n",i,l,k);
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}



