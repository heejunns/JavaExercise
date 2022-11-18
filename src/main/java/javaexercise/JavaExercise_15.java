package javaexercise;

import java.util.Arrays;

public class JavaExercise_15 { // 배열 요소들을 섞어 로또 번호 만들기
    public static void main(String[] args) {
        int[] lotto = new int[45];
        for (int i=0; i<lotto.length; i++){
            lotto[i] = i+1;
        }
        System.out.println(Arrays.toString(lotto));
        for(int i = 0; i<lotto.length; i++){
           int k = (int)(Math.random()*lotto.length);
           int tmp = lotto[i];
           lotto[i] = lotto[k];
           lotto[k] = tmp;
        }
        System.out.println(Arrays.toString(lotto));
        for (int l=0; l<6; l++){ // 0 인덱스부터 5 인덱스까지 임의의 로또 번호 6개 출력
            System.out.printf("%d번째 로또번호: %d\n",l+1,lotto[l]);

        }
    }
}
