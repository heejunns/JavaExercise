package javaexercise;
class Exercise8Thread extends Thread {
    public void run() {
        for (int i = 0; i < 300; ++i) {
            System.out.print("-");
        }
        System.out.print("Exercise8Thread 쓰레드 종료");
    }
}
class Exercise9Thread extends Thread{
    public void run(){
        for (int i=0; i<300; ++i){
            System.out.print("|");
        }
        System.out.print("Exercise9Thread 쓰레드 종료");
    }



}
class JavaExercise_94 {
    static boolean autoSave = false;

    public static void main(String[] args) { // sleep() 메서드 사용해보기

        Exercise8Thread exercise8Thread = new Exercise8Thread();
        Exercise9Thread exercise9Thread = new Exercise9Thread();

        exercise8Thread.start();
        exercise9Thread.start();

        delay(3000);

        System.out.println("main문 종료");
    }

    //            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException i) {
//
//            }
// 위의 예외처리를 깔끔하게 하기 위해서 delay() 만들기
     static void delay(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException i) {

        }
    }

}


