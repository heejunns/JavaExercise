package javaexercise;
class JavaExercise_49 {
    public static void main(String[] args) { // main 메서드에서 호출한 메서드에서 예외를 선언하고 예외 처리를 하지 않고 main 메서드에 예외를 넘겨주어 main 메서드에서 예외를 처리하는 경우
        try {
            method1(); // 메서드 호출
        } catch (Exception e){
            System.out.println("main 메서드에서 예외 처리!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
     static void method1() throws Exception { // 예외를 main 메서드에 넘겨줌
        throw new Exception("예외처리!"); // 예외 선언
     }
    }

