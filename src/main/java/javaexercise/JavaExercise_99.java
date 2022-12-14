package javaexercise;

class Exercise15Thread implements Runnable {
    volatile boolean suspended = false; // 선언문 앞에 volatile을 붙이기
    volatile boolean stopped = false; // 선언문 앞에 volatile을 붙이기

    Thread th;

    Exercise15Thread(String name){
        th = new Thread(this, name);
    }
    public void run(){
        while(!stopped){
            if(!suspended){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    System.out.println("인터럽트 발생 "+Thread.currentThread().getName()+"쓰레드 종료");
                }
            } else {
                Thread.yield(); // yield()를 사용해 suspended 가 true일때 의미없이 도는 시간을 while문에서 낭비하지 않을수 있다.
            }
        }
        System.out.println(Thread.currentThread().getName()+"- stopped");
    }
    public void suspend(){
        suspended = true;
        th.interrupt();
    }
    public void stop(){
        stopped = true;
        th.interrupt(); // interrupt() 를 발생시킨다. 그 이유는 stopped가 true가 되어도 만약 sleep()가 실행중이라면 바로 while문을 탈출하지 못하고 쓰레드가 정지될때까지 1초의 시간지연이 발생할 것이다.
   // 인터럽트를 발생시켜 예외가 발생하여 sleep() 가 실행중이라도 탈출하여 응답성이 좋아질수 있다.
    }
    public void resume(){
        stopped = false;
    }
}

class JavaExercise_99 {
    static long startTime = 0;

    public static void main(String[] args) { // yield() 사용 해보기
        Exercise15Thread ex1 = new Exercise15Thread("*");
        Exercise15Thread ex2 = new Exercise15Thread("**");
        Exercise15Thread ex3 = new Exercise15Thread("***");
        ex1.th.start();
        ex2.th.start();
        ex3.th.start();

        try{
            Thread.sleep(1000);
            ex1.suspend();
            Thread.sleep(1000);
            ex2.suspend();;
            Thread.sleep(1000);
            ex2.resume();
            Thread.sleep(1000);
            ex1.stop();
            ex2.stop();
            Thread.sleep(1000);
            ex3.stop();
        } catch (InterruptedException e){

        }


    }

}


