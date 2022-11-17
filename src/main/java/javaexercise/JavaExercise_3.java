package javaexercise;
import java.util.Scanner;
public class JavaExercise_3 {
    public static void main(String[] args) { // 입력한 숫자의 각 자리의 수를 모두 더하여 출력하는 프로그램
        int num = 0;
        int sum = 0;
        System.out.println("숫자를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        num = Integer.parseInt(str);

        while (num!=0){
            sum += num%10;
            System.out.printf("sum = %d 이고 현재 num = %d 입니다.\n",sum,num);

            num /= 10;
        }

        System.out.printf("각 자리 수의 합은 %d 입니다.",sum);
    }
}
