package javaexercise;

class Parent {
    int x = 10; // super.x
}
class Child extends Parent{
    int x = 20; // this.x

    void method(){
        System.out.println("x = "+x);
        System.out.println("this.x = "+this.x);
        System.out.println("super.x = "+super.x);
    }
}
public class JavaExercise_33 { // 참조변수 super 실습 (부모,자식 클래스에 중복되는 변수가 있을 때)
    public static void main(String[] args) {
        Child child = new Child();
        child.method();

    }
}
