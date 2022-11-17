package javaexercise;

public class JavaExercise_5 {
    public static void main(String[] args) { // 0부터 값을 1씩 증가하여 모두 더할때 100이 넘는 순간의 총합 sum과 증가하여 더하는 값 i를 알아내는 프로그램
       int sum = 0;
       int i = 0;

       while (true){ // 무한 반복문에서 for문은 for(;;) {} 로 사용.
           if (sum>100){
               break;
           }
           i++;
           sum+=i;
       }

        System.out.printf("sum이 100이 넘을때 i는 %d 이고 sum은 %d 입니다.",i,sum);

    }
}
