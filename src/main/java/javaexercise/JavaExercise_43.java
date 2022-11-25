package javaexercise;

class Outer2 {
    int x = 100; // Outer2.this.x , 외부 클래스의 인스턴스 변수

    class Inner {
        int x = 200; // this.x , 내부 클래스의 인스턴스 변수

        void method(){
            int x = 300; // 로컬 변수

            System.out.println("x : "+x);
            System.out.println("this.x : "+this.x);
            System.out.println("Outer2.this.x : "+Outer2.this.x);
        }


    }

}
public class JavaExercise_43 { // 외부,내부 클래스에 같은 이름을 가진 인스턴스,로컬 변수의 접근
    public static void main(String[] args){
        Outer2 outer2 = new Outer2();
        Outer2.Inner ln = outer2.new Inner();
        ln.method();

    }
}
