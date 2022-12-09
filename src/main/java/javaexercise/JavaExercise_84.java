package javaexercise;

import java.util.ArrayList;
class Sample extends Thread{
    public void run(){
        System.out.println("run 메서드 실행 ");
    }
}

class JavaExercise_84 {
    public static void main(String[] args) { // Thread를 상속받아 run() 메서드 구현하기
       Sample sample = new Sample();
       sample.start();
    }
}






