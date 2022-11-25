package javaexercise;
public class JavaExercise_46 { // 예외 처리3 , throw로 예외 발생 시키기
    public static void main(String[] args){
        try {
            Exception e = new Exception("예외 발생!");
            throw  e;
        } catch (Exception e) {
            System.out.println("에러 메시지 : "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
