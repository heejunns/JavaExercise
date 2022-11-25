package javaexercise;

class Outer {
    class InstanceInner { // 내부 인스턴스 클래스 , 외부 클래스의 인스턴스,스태틱 멤버 모두 접근 가능, 같은 클래스 안에 있기 때문에 private 멤버도 접근 가능
        int iv = 100;
    }

    static class StaticInner { // 내부 스태틱 클래스 , 외부 클래스의 인스턴스 멤버에 접근 불가
        int iv = 200;
        static int cv = 300;
    }
    void method(){
        class LocalInner{ // 내부 로컬 클래스 , 내부 로컬 클래스를 감싸고 있는 메서드의 상수만 사용 가능 지역 변수라도 값이 바뀌지 않는다면 final이 붙으면서 상수 취급
            int iv = 400;  // 외부 클래스의 인스턴스, static 멤버 접근 가능 , 내부 로컬 클래스의 객체가 메서드가 종료되어도 살아 남아있을 수 있다.
                           // 근데 메서드가 종료되면 지역 변수는 소멸 되기 때문에 값이 바뀌는 지역 변수라면 내부 로컬 클래스에서 사용할 수 없다.
        }
    }
}


public class JavaExercise_42 { // 내부 클래스
    public static void main(String[] args){
        Outer oc = new Outer(); // 외부 클래스의 인스턴스를 먼저 생성해야 인스턴스 클래스의 인스턴스를 생성 가능
        Outer.InstanceInner ii = oc.new InstanceInner(); // 내부 인스턴스 클래스의 객체 생성

        System.out.println("ii.iv : "+ii.iv);
        System.out.println("Outer.StaticInner.cv : "+Outer.StaticInner.cv); // 외부 클래스의 객체 생성 없이 사용 가능

        Outer.StaticInner si = new Outer.StaticInner(); // static 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
        System.out.println("si.iv : "+si.iv);


    }
}
