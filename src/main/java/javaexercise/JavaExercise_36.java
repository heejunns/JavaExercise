package javaexercise;

class Car {
    String color;
    int door;

    void drive(){
        System.out.println("drive 기능");
    }
    void stop(){
        System.out.println("stop 기능");
    }
}
class SmartCar extends Car{
    void water(){
        System.out.println("water 기능");
    }
}
public class JavaExercise_36 { // 참조변수의 형변환
    public static void main(String[] args) {
       Car c = null;
       SmartCar smart = new SmartCar();
       SmartCar smart2 = null;

       smart.water();
       c = (Car)smart; // 자손에서 조상으로 형변환을 하니까 형변환 생략 가능.
       // c.water(); 에러 발생.사용 불가능.조상 타입인 Car가 사용 불가능한 멤버 변수이기 때문이다.
        smart2 = (SmartCar)c; // 자손에서 조상 타입으로 형변환을 하니까 형변환 생략 불가능.
        smart2.water();



    }
}
