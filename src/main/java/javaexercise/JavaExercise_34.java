package javaexercise;

class Parent2 {
    int x = 10; // super.x , this.x 둘다 가능, x가 하나없기 때문
}
class Child2 extends Parent{
    void method(){
        System.out.println("x = "+x);
        System.out.println("this.x = "+this.x);
        System.out.println("super.x = "+super.x);
    }
}
public class JavaExercise_34 { // 참조변수 super 실습2 (부모,자식 클래스에 중복되는 변수가 없을때)
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.method();

    }
}
