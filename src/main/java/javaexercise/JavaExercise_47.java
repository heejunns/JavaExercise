package javaexercise;

class JavaExercise_47{
    public static void main(String[] args) throws Exception { // main 메서드에서도 예외를 처리하지 않고 JVM에게 넘겨줌 비정상적으로 프로그램 종료
        method1(); //  같은 클래스내의 static 멤버이므로 객체 생성 없이 method1() 메서드 호출
    }
        static void method1() throws Exception{ // method1() 도 예외 처리를 하지 않고 본인을 호출한 main 메서드에 예외를 넘겨줌
            method2();
        }
        static void method2() throws Exception { // method2()를 호출한 method1() 으로 예외를 넘겨줌
            throw new Exception(); // Exception() 예외 선언,발생

        }

    }

