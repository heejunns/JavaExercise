package javaexercise;

class Exercise13Thread extends Thread {
    public void run(){
        for(int i=0; i<300; ++i){
            System.out.print(new String("-"));
        }
    }
}
class Exercise14Thread extends Thread {
    public void run() {
        for (int i = 0; i < 300; ++i) {
            System.out.print(new String("|"));
        }

    }
}

class JavaExercise_98 {
    static long startTime = 0;

    public static void main(String[] args) { // join() 사용해보기
        Exercise13Thread exercise13Thread = new Exercise13Thread();
        Exercise14Thread exercise14Thread = new Exercise14Thread();

        exercise13Thread.start();
        exercise14Thread.start();

        try {
            exercise13Thread.join();
            exercise14Thread.join();
        } catch (InterruptedException e){

        }
        System.out.println("main 쓰레드가 종료되었습니다.");



    }

}


