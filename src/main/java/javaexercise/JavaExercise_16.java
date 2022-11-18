package javaexercise;

import java.util.Arrays;

public class JavaExercise_16 { // 가위 바위 보 게임 프로그램 만들기 (random 함수로 생성)
    public static void main(String[] args) {
        String[] strArr = {"가위", "바위", "보"};
        for (int i = 0; i < 10; i++) {
            int k = (int) (Math.random() * strArr.length);
            int tmp = (int) (Math.random() * strArr.length);
            if (k == tmp) {
                System.out.println(strArr[k] + " " + strArr[tmp] + " 비겼습니다.");
            } else if (k < tmp ) {
                if(k==0 && tmp==1) {
                    System.out.println(strArr[k] + " " + strArr[tmp] + " tmp가 이겼습니다.");
                } else if (k==0 && tmp==2){
                    System.out.println(strArr[k] + " " + strArr[tmp] + " k가 이겼습니다.");
                } else if (k==1 && tmp==2) {
                    System.out.println(strArr[k] + " " + strArr[tmp] + " tmp가 이겼습니다.");
                }
            } else if (k>tmp) {
                if (k==1 && tmp==0) {
                    System.out.println(strArr[k] + " " + strArr[tmp] + " k가 이겼습니다.");
                } else if (k==2 && tmp==0) {
                    System.out.println(strArr[k] + " " + strArr[tmp] + " tmp가 이겼습니다.");
                } else if (k==2 && tmp==1){
                    System.out.println(strArr[k] + " " + strArr[tmp] + " k가 이겼습니다.");
                }
            }
        }
    }
}
