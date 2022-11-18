package javaexercise;
import java.util.Scanner;

public class JavaExercise_18 { // 2차원 배열 실습, 2차원 배열의 모든 원소의 합 구하기
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                sum+= arr[i][j];
            }
        }
        System.out.println("총 합: "+sum);
    }
}
