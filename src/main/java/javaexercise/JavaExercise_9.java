package javaexercise;

public class JavaExercise_9 {
    public static void main(String[] args) { // 배열 실습
        int[] i = new int[10];

        i[3] = 500;
        System.out.println(i[0]); // 0 인덱스에 아무 값도 저장하지 않았기 때문에 0 출력
        System.out.println(i[3]); // 3 인덱스에 500을 저장하였기 때문에 500 출력

    }
}
