package javaexercise;

class Data2{
    int x;
}

public class JavaExercise_26 { // 객체지향 실습, 참조형 매개변수는 변수의 값을 읽고 변경할 수 있다. 참조형 매개변수는 변수의 값을 읽고 변경할 수 있다. main 메서드에서 data2 가 가리키는 x와 change 메서드에서 data2가 가리키는 x가
    public static void main(String[] args) { // 같다. 그 이유는 change 메서드의 입력 매개변수에 참조형 변수를 전달하면서
       Data2 data2 = new Data2();            // 참조형 변수를 change 메서드에서 카피하여 같은 x를 가리키기 때문이다.
       data2.x = 10;
       System.out.println("main 메서드에서 data2가 가리키는 x는 "+data2.x);
       change(data2);
       System.out.println("main 메서드에서 data2가 가리키는 x는 "+data2.x);

    }

    static void change(Data2 data2){
        data2.x = 1000;
        System.out.println("change 메서드의 x는 "+data2.x);
    }
}
