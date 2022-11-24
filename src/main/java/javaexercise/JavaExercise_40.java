package javaexercise;

class A {
    public void method(B b){
        b.method();
    }
}
class B{
    public void method(){
        System.out.println("B 클래스 메서드 ");

    }
}


public class JavaExercise_40 { // 인터페이스 강한 결합 B 클래스의 내용이 변경되면 A 클래스의 method 참조형 매개변수의 타입이 변경 되어야 정상적으로 method를 사용할 수 있다.
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());


    }
}
