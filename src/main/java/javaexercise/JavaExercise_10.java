package javaexercise;

public class JavaExercise_10 {
    public static void main(String[] args) { // 배열 실습2 (배열의 길이 length 사용)
        int[] i = new int[10];

        System.out.println("배열의 길이는 : "+i.length+" 입니다.");

        for(int l = 0; l < i.length; l++) { // i.length를 사용하면 혹시나 배열의 길이를 변경하고 for문의 조건식을 변경하지 못하였어도 arrayaoutofboundsexception 에러가 발생할 일이 없다.
            System.out.printf("i[%d] = %d\n", l, i[l]);
        }

    }
}
