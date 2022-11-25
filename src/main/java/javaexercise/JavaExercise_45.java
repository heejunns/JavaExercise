package javaexercise;
public class JavaExercise_45 { // 예외 처리2
    public static void main(String[] args){
        System.out.println(1);
        try {
            System.out.println(2);
            // System.out.println(0/0); // ArithmeticException 예외 발생, 0으로 나눌 수 없다.
            System.out.println(args[0]); // ArrayIndexOutOfBoundsException 발생
            System.out.println(3);
        } catch(ArithmeticException a) {
            System.out.println("ArithmeticException 예외 발생!");
        } catch (ArrayIndexOutOfBoundsException aob){
            System.out.println("ArrayIndexOutOfBoundsException 발생!");
        } catch(Exception e){ // Exception은 모든 예외의 조상이니까 모든 예외 처리
            System.out.println("ArithmeticException을 제외한 모든 예외가 처리!");
        }
        System.out.println(4);
        System.out.println(5);

    }
}
