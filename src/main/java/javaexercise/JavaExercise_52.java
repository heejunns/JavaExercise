package javaexercise;

class JavaExercise_52 {
    public static void main(String[] args) { // 예외 되던지기, 예외를 처리한 후 다시 예외를 발생시켜 호출한 메서드로 예외 넘겨주기
        try {
            method();
        } catch (Exception e){
            System.out.println("main 함수에서 예외를 처리 하였습니다.");
        }
    }
    static void method() throws Exception{
        try {
            throw new Exception();
        } catch (Exception e){
            System.out.println("method() 내에서 예외를 처리 하였습니다.");
            throw e;
        }
    }
}

