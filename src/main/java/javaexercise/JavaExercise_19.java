package javaexercise;

public class JavaExercise_19 { // 2차원 배열 실습,성적표 만들기(총점과 평균 포함)
    public static void main(String[] args) {
        int[][] arr = {
                {100,100,100},
                {40,32,69},
                {90,100,23},
                {54,39,20}
        };
        System.out.println("번호  국어  수학    영어   총점      평균");
        System.out.println("========================================");

        for (int i=0; i< arr.length; i++){
            int sum = 0;
            System.out.print((i+1)+" ");
            for (int j=0; j<arr[i].length; j++){
                System.out.printf("%5d ",arr[i][j]);
                sum+= arr[i][j];
            }
            System.out.printf("%5d    %f\n",sum,sum/(float)arr[i].length);
        }
        System.out.println("========================================");
    }
}
