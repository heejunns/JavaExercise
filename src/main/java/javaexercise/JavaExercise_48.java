package javaexercise;
class JavaExercise_48 {
    public static void main(String[] args) { // main 메서드에서 호출한 메서드에서 예외를 처리하는 경우
        method1();
    }
     static void method1(){
        try {
            throw new Exception();
        } catch (Exception e){
            System.out.println("method1() 메서드에서 예외 처리가 되었습니다.");
            e.printStackTrace();
        }
     }
    }

