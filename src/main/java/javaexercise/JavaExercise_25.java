package javaexercise;

class Data1{
    int x;
}

public class JavaExercise_25 { // 객체지향 실습, 기본형 매개변수는 변수의 값을 읽기만 가능하다. change 메서드의 x는 main 메서드에서
    public static void main(String[] args) { // 다루는 data1이 가리키는 x의 값이 아니다.
       Data1 data1 = new Data1();
       data1.x = 10;
       System.out.println("main 메서드에서 data1가 가리키는 x의 값은 "+data1.x);
       change(data1.x);
       System.out.println("main 메서드에서 data1가 가리키는 x의 값은 "+data1.x);

    }

    static void change(int x){
        x = 1000;
        System.out.println("change 메서드의 x는 "+x);
    }
}
