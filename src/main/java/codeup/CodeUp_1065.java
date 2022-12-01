package codeup;
import java.util.Scanner;

public class CodeUp_1065 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int[] arr = {n1, n2, n3};
            for (int i = 0; i< arr.length; ++i){
                if (arr[i]%2 == 0 ){
                    System.out.println(arr[i]);
                }
            }
        }
    }

