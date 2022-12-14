package javaexercise;

import javax.swing.*;

class Exercise12Thread implements Runnable {
    volatile boolean suspended = false; // 선언문 앞에 volatile을 붙이기
    volatile boolean stopped = false; // 선언문 앞에 volatile을 붙이기

   Thread th;

    Exercise12Thread(String name){
        th = new Thread(this, name);
    }
    public void run(){
        while(!stopped){
            if(!suspended){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){

                }
            }
        }
        System.out.println(Thread.currentThread().getName()+"- stopped");
    }
    public void suspend(){
        suspended = true;
    }
    public void stop(){
        stopped = true;
    }
    public void resume(){
        stopped = false;
    }
}

class JavaExercise_97 {

    public static void main(String[] args) { // suspend(), resume(), stop() 메서드의 기능을 구현해보고 객체지향적인 코드로 만들어보기
        Exercise12Thread ex1 = new Exercise12Thread("*");
        Exercise12Thread ex2 = new Exercise12Thread("**");
        Exercise12Thread ex3 = new Exercise12Thread("**");
//        Thread th1 = new Thread(ex1,"*");
//        Thread th2 = new Thread(ex2,"**");
//        Thread th3 = new Thread(ex3,"***");
        // 각각의 쓰레드가 서로 다른 실행상태를 가질수 있도록 각각의 객체를 생성

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


