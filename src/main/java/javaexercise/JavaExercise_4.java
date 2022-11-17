package javaexercise;
import java.util.Scanner;

public class JavaExercise_4 {
    public static void main(String[] args) { // 1~100까지 수중에 랜덤으로 정해진 수를 맞히는 프로그램
        int num = 0;
        int answer = (int)(Math.random()*100) + 1;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("숫자를 입력 하세요 : ");
            num = sc.nextInt();

            if (num > answer){
                System.out.println("정답은 더 작은 수 입니다. 다시 시도 하세요.");
            } else if (num < answer) {
                System.out.println("정답은 더 큰 수 입니다. 다시 시도 하세요.");
            }

        }while (num!=answer);

        System.out.printf("정답입니다! 정답은 %d 입니다.",answer);
    }
}
