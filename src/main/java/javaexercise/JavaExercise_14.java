package javaexercise;

import java.util.Arrays;

public class JavaExercise_14 { // 배열 요소들을 섞는 프로그램
    public static void main(String[] args) { // 배열 실습3 (배열의 값 출력)
        int[] arr = {1,2,3,4,5,10,23,120,1,3,1023};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i<1000; i++){
           int k = (int)(Math.random()*arr.length);
           int tmp = arr[0];
           arr[0] = arr[k];
           arr[k] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
