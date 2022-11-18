package javaexercise;

import java.util.Scanner;

public class JavaExercise_20 { // 2차원 배열 실습,영어단어의 뜻을 맞추는 프로그램
    public static void main(String[] args) {
        String[][] strArr = {
                {"chair","의자"},
                {"car","자동차"},
                {"computer","컴퓨터"}

        };

        for (int i=0; i< strArr.length; i++) {
            System.out.printf("Q%d. %s의 뜻은 무엇일까요?",i+1,strArr[i][0]);

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            if (str.equals(strArr[i][1])){
                System.out.println("정답 입니다!");
            } else{
                System.out.println("오답 입니다.");
            }

        }
    }
}
