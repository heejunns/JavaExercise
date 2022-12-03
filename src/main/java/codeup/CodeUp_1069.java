package codeup;
import java.util.Scanner;

public class CodeUp_1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.equals("A")){
            System.out.println("best!!!");
        } else if (str.equals("B")){
            System.out.println("good!!");
        } else if (str.equals("C")) {
            System.out.println("run!");
        } else if (str.equals("D")) {
            System.out.println("slowly~");
        } else{
            System.out.println("what?");
        }

    }
}

