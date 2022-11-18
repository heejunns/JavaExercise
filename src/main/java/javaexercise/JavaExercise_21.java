package javaexercise;

import java.util.Arrays;
import java.util.Scanner;

public class JavaExercise_21 { // 배열 실습, 다양한 Arrays 클래스의 메서드 사용해보기
    public static void main(String[] args) {
       int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
       int[][] arr2D_1 = {
               {1,2},
               {3,4},
               {5,6}
       };
        int[][] arr2D_2 = {
                {1,2},
                {3,4},
                {5,6}
        };
        System.out.println(Arrays.toString(arr1)); // 1차원 배열 문자열로 변환 후 출력
        System.out.println(Arrays.deepToString(arr2D_1)); // 2차원 배열(또는 다차원 배열) 문자열로 변환 후 출력

        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(arr1 == arr2); // == 는 참조변수 값을 비교하는 것 이다.
        System.out.println(Arrays.deepEquals(arr2D_1,arr2D_2));

        int[] arr3 = Arrays.copyOf(arr1,arr1.length);
        int[] arr4 = Arrays.copyOfRange(arr1,3,arr1.length);
        int[] arr5 = Arrays.copyOf(arr1,10);
        int[] arr6 = Arrays.copyOfRange(arr1,3,10);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));

        int[] arr7 = {3,21,5,2,1,23,5};
        Arrays.sort(arr7);
        System.out.println(Arrays.toString(arr7));

    }
}
