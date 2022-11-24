package javaexercise;

interface I{ // B2, C 클래스의 선언과 구현을 분리, 인터페이스 선언부
    public abstract void method(); // public abstract 생략 가능

}
class A2 {
    public void method(I i){ // 여기서 입력 인터페이스 타입 참조형 매개변수로 작성하면 인터페이스를 구현한 인스턴스만 들어오라는 뜻이다.
        i.method();
    }
}
class B2 implements I{ // B2 클래스의 선언과 구현을 분리, 인터페이스 구현부
    public void method(){ // 인터페이스의 구현이기 때문에 public 꼭 붙이기, 인터페이스의 추상 메서드 구현에서 추상 메서드 정의 보다 작은 범위의 접근 제어자를 가질 수 없음.
        System.out.println("B2 클래스 메서드 ");

    }
}
class C implements I{ // C 클래스의 선언과 구현을 분리, 인터페이스 선언부
    public void method(){
        System.out.println("C 클래스 메서드");
    }
}


public class JavaExercise_41 { // 인터페이스 느슨한 결합 B2 클래스의 내용이 바뀌어도 A2 클래스에 method 참조형 매개변수의 타입을 바꾸지 않아도 됨. C 클래스를 만들어도 A 클래스의 코드는 변경 없어도 method 사용 가능
    public static void main(String[] args) {
       A2 a2 = new A2();
       a2.method(new B2());
       a2.method(new C()); // 겉에 껍데기는 인터페이스 그대로고 안에 알맹이를 클래스 C로 변경


    }
}
