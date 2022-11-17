package javaexercise;

public class JavaExercise_6 {
    public static void main(String[] args) { // 0부터 100까지 3의 배수는 제외하고 출력하는 프로그램

        for(int i = 0; i <=100; i++){
            if (i%3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
