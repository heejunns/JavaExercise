package javaexercise;

import java.util.Arrays;

public class JavaExercise_11 { // 배열 실습3 (배열의 값 출력)
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr)); // 배열을 문자열로 변환하여 출력
    }
}
