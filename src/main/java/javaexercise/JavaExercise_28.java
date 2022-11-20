package javaexercise;

class MyMath3{
    int x,y; // 인스턴스 변수

    int add(){ // 인스턴스 메서드
        return x+y;
    }
    static int add(int x,int y){ // static 메서드 , 클래스 메서드 (인스턴스 변수를 사용하지 않을때 static을 붙이면 된다.)
        return x+y;
    }
}

public class JavaExercise_28 { // 인스턴스 메서드, static 메서드
    public static void main(String[] args) {
        System.out.println(MyMath3.add(3,5)); // static 메서드 , 클래스 메서드 호출해서 출력 (객체 생성 없이 호출 가능)
        MyMath3 myMath3 = new MyMath3(); // 인스턴스,객체 생성
        myMath3.x = 3;
        myMath3.y = 5;
        System.out.println(myMath3.add()); // 인스턴스 메서드 호출해서 출력

    }
}
