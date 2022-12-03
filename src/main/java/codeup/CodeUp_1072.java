package codeup;
import java.util.Scanner;

public class CodeUp_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] arr = new int[i];
        for(int l=0; l<i; ++l){
            int k = sc.nextInt();
            arr[l] = k;
        }
        for (int k : arr){
            System.out.println(k);
        }
    }
}

