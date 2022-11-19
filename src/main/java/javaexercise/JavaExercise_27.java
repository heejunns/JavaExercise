package javaexercise;

class Data3{
    int x;
}

public class JavaExercise_27 { // 객체지향 실습, 참조형 반환타입
    public static void main(String[] args) {
       Data3 data3 = new Data3();
       data3.x = 10;
       System.out.println("main 메서드에서 data3가 가리키는 x는 "+data3.x);

       Data3 d2 = copy(data3); // t 참조변수를 d2에 저장
       System.out.println("data3 = "+data3.x);
       System.out.println("d2 = "+d2.x); // t와 d2는 같은 참조변수를 가지기 때문에 d2가 가리키는 x의 값은 data3.x의 값이 복사된 t.x의 값과 같은 값을 가리킨다.

    }

    static Data3 copy(Data3 data3){ // Data3 타입으로 반환
       Data3 t = new Data3(); // 새로운 객체 t를 생성
       t.x = data3.x; // t.x에 data3.x의 값을 복사
       return t; // 참조 변수를 반환
    }
}
