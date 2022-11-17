package javaexercise;

import java.util.Scanner;

public class JavaExercise_8 {
    public static void main(String[] args) { // 이름붙은 반복문 실습

        loop : for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
                if(j==6)
                    break loop;
                    //break;
                System.out.println(i+"*"+j+"="+ i*j);
            }
            System.out.println();
        }
    }
}
