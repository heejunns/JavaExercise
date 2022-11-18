package javaexercise;
import java.util.Scanner;
public class JavaExercise_17 { // 가위 바위 보 게임 프로그램 만들기 (입력 받기)
    public static void main(String[] args) {
        String[] strArr = {"가위", "바위", "보"};
        Scanner sc = new Scanner(System.in);
        System.out.println("무엇을 낼지 입력해주세요 :");
        String str = sc.nextLine();
        int k = (int)(Math.random() * strArr.length);
        if (strArr[k].equals(str)) { // 비기는 상황
            System.out.println("비겼습니다.");
        } else if (strArr[k].equals("가위")) { // 컴퓨터가 가위를 낼 때 상황
            if (str.equals("바위")) {
                System.out.println("컴퓨터: "+strArr[k] + ", 나: " + str + " / 결과: 이겼습니다.");
            } else if (str.equals("보")) {
                System.out.println("컴퓨터: "+strArr[k] + ", 나: " + str + " / 결과: 졌습니다.");
            }
        } else if (strArr[k].equals("바위")) { // 컴퓨터가 바위를 낼 때 상황
            if (str.equals("가위")) {
                System.out.println("컴퓨터: "+strArr[k] + ", 나 : " + str + " / 결과: 졌습니다.");
            } else if (str.equals("보")) {
                System.out.println("컴퓨터: "+strArr[k] + ", 나 : " + str + " / 결과: 이겼습니다.");
            }
        } else if (strArr[k].equals("보")) { // 컴퓨터가 보를 낼 때 상황
            if (str.equals("가위")) {
                System.out.println("컴퓨터: "+strArr[k] + ", 나 : " + str + " / 결과: 이겼습니다.");
            } else if (str.equals("바위")) {
                System.out.println("컴퓨터: "+strArr[k] + ", 나 : " + str + " / 결과: 졌습니다.");
            }
        }
    }
}
