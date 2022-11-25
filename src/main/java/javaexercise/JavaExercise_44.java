package javaexercise;
public class JavaExercise_44 { // 예외 처리
    public static void main(String[] args){
        System.out.println(1);
        try {
            System.out.println(0/0); // 예외 발생, 0으로 나눌 수 없다.
            System.out.println(2);
        } catch(ArithmeticException a){
            System.out.println(3);
        }
        System.out.println(4);
        System.out.println(5);

    }
}
