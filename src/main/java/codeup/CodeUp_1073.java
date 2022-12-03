package codeup;
import java.util.ArrayList;
import java.util.Scanner;

public class CodeUp_1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            list.add(n);
        }
        for (int i:list){
            System.out.println(i);
        }
    }
}

