package javaexercise;

import java.util.Arrays;

public class JavaExercise_12 { // 배열 요소들의 총합과 평균 구하는 프로그램
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        float average = 0f;
        for(int i = 0; i<arr.length; i++){
            sum+= arr[i];
        }
        average = sum/(float)arr.length; // 정확한 값을 위해 float로 형변환 한다.

        System.out.println("배열의 총합: "+sum);
        System.out.println("배열의 평균: "+average);
    }
}
