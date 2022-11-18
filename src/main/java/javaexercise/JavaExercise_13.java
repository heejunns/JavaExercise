package javaexercise;

public class JavaExercise_13 { // 배열 요소들중에 최대값과 최소값 찾는 프로그램
    public static void main(String[] args) { // 배열 실습3 (배열의 값 출력)
        int[] arr = {1,2,3,4,5,10,23,120,1,3,1023};
        int max = arr[0], min = arr[0];
        for(int i = 1; i<arr.length; i++){
           if (max < arr[i]){
               max = arr[i];
           }else if( min > arr[i]) {
               min = arr[i];
           }
        }

        System.out.println("배열의 최대값: "+max);
        System.out.println("배열의 최소값: "+min);
    }
}
