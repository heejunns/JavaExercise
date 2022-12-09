package javaexercise;

class Sample2 extends Thread {
    int seq;

    public Sample2(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + " thread start.");  // 쓰레드 시작
        try {
            Thread.sleep(1000);  // 1초 대기한다.
        } catch (Exception e) {
        }
        System.out.println(this.seq + " thread end.");  // 쓰레드 종료
    }
}


    class JavaExercise_85 {
        public static void main(String[] args) { // 여러개의 Thread 실행
            for (int i = 0; i < 10; i++) {  // 총 10개의 쓰레드를 생성하여 실행한다.
                Thread t = new Sample2(i);
                t.start();
            }
            System.out.println("main end.");  // main 메서드 종료
        }
    }







