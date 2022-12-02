package javaexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


class JavaExercise_68 {

    public static void main(String[] args) { // Arrays 클래스
       int[] arr = {1,2,3};
       int[][] arr2D = {{1,2,3},{4,5,6}};

        System.out.println("arr 배열을 문자열로 변경 후 반환 : "+ Arrays.toString(arr));
        System.out.println("arr2D 2차원 배열을 문자열로 변경 후 반환 : "+Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr,3); // [1,2,3] 출력
        int[] arr3 = Arrays.copyOf(arr,2); // [1,2] 출력
        int[] arr4 = Arrays.copyOf(arr,10); // [1,2,3,0,0,0,0,0,0,0] 출력
        int[] arr5 = Arrays.copyOfRange(arr,0,3); // [1,2,3] 출력
        int[] arr6 = Arrays.copyOfRange(arr,0,2); // [1,2] 출력
        int[] arr7 = Arrays.copyOfRange(arr,0,10); // [1,2,3,0,0,0,0,0,0,0] 출력
        // 확인 해보면

        System.out.println("arr2 배열을 문자열로 변경 후 반환 : "+ Arrays.toString(arr2));
        System.out.println("arr3 배열을 문자열로 변경 후 반환 : "+ Arrays.toString(arr3));
        System.out.println("arr4 배열을 문자열로 변경 후 반환 : "+ Arrays.toString(arr4));
        System.out.println("arr5 배열을 문자열로 변경 후 반환 : "+ Arrays.toString(arr5));
        System.out.println("arr6 배열을 문자열로 변경 후 반환 : "+ Arrays.toString(arr6));
        System.out.println("arr7 배열을 문자열로 변경 후 반환 : "+ Arrays.toString(arr7));

        int[] arr8 = new int[10];
        Arrays.fill(arr8, 10);
        System.out.println("arr8 배열을 문자열로 변경 후 반환 : "+Arrays.toString(arr8));

        int[] arr9 = {1,3,2,10,5,20};

        for (int i : arr9){
         char[] ch = new char[i];
         Arrays.fill(ch,'#');
         System.out.println(new String(ch)+i);
        }

        int[][] arr2D2 = {{1,2,3},{4,5,6}};
        int[][] arr2D3 = {{1,2,3},{4,5,6}};
        int[] arr10 = {1,2,3};
        int[] arr11 = {1,2,3};

     System.out.println("arr2D2와 arr2D3의 내용이 같은지 확인 : "+Arrays.deepEquals(arr2D2,arr2D3));
     System.out.println("arr2D2와 arr2D3의 내용이 같은지 확인 : "+Arrays.equals(arr2D2,arr2D3)); // equals() 메서드는 1차원 배열에서 비교 가능 2차원 배열에서는 false가 반환 된다.
     System.out.println("arr10과 arr11의 내용이 같은지 확인 : "+Arrays.equals(arr10,arr11));
        int[] arr12 = {1,6,5,4,3,2};
     System.out.println(Arrays.binarySearch(arr12,3)); // 작은 순서대로 위치가 맞지 않는 값은 잘못된 인덱스 값으로 반환
     Arrays.sort(arr12);
     System.out.println(Arrays.toString(arr12));
     System.out.println(Arrays.binarySearch(arr12,3));





    }
}

