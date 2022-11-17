package javaexercise;
// 1부터 더하기를 계속 진행 하였을 때 300을 넘지 않는 최대 값과 몇까지 더하였는지 알아내는 프로그램
public class JavaExercise_2 { // 0 부터 값을 1씩 증가하여 모두 더하였을때 300이 넘지 않는 최대 값과 증가한 값을 알아내는 프로그램
    public static void main(String[] args) {
        int i = 0;
        int sumTotal = 0;
        while (sumTotal <= 300){
            System.out.printf("현재 더한 값은 %d 입니다.이전에 더한 i값은 %d 입니다.\n",sumTotal,i);
            sumTotal+= ++i;
        }
        System.out.println();
        System.out.printf("1부터 값을 모두 더하였을때 300을 넘지 않는 최대 값은 %d이고 %d까지 더하였습니다.",sumTotal-i,i-1);

    }
}
