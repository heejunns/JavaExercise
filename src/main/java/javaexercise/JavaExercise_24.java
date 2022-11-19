package javaexercise;

class Gugudan {

    void gugudan(int dan){
        if (!(2 <=dan && dan<=9)){
            return; // 메서드 종료
        }
        for(int i=1; i<10; i++){
            System.out.printf("%d * %d = %d %n",dan,i,dan*i);
        }
    }

}

public class JavaExercise_24 { // 객체지향 실습, 원하는 숫자를 입력하면 구구단 출력 해주는 프로그램(2~9단 이외의 숫자를 입력하면 출력해주지 않기).
    public static void main(String[] args) {
        Gugudan gu = new Gugudan();
        gu.gugudan(3);
    }
}
