package javaexercise;

import javax.swing.*;

class Exercise10Thread extends Thread {
    public void run() {
        int i = 10;
        while (i!=0 && !isInterrupted()){
            System.out.println(i--);
            for(long x=0; x<2500000000L; ++x);
        }
        System.out.println("isInterrupted() : "+this.isInterrupted()); // true
        System.out.println("interrupted() : "+Thread.interrupted()); // exercise10Thread 쓰레드의 현재 상태를 반환하고 false로 초기화
        System.out.println("isInterrupted() : "+this.isInterrupted()); // false
        System.out.println("interrupted() : "+Thread.interrupted()); //  false
        System.out.println("카운트가 종료되었습니다.");
    }
}

class JavaExercise_95 {

    public static void main(String[] args) { // interrupt() 메서드 사용해보기, 인터럽트 발생해 쓰레드 종료 시키기
        Exercise10Thread exercise10Thread = new Exercise10Thread();
        exercise10Thread.start();
        System.out.println("isInterrupted() : "+exercise10Thread.isInterrupted()); // false
        String input = JOptionPane.showInputDialog(" 아무 값이나 입력 하세요.");
        System.out.println("입력하신 값은 "+input+" 입니다.");
        exercise10Thread.interrupt();
//        System.out.println("isInterrupted() : "+exercise10Thread.isInterrupted()); // true
//        System.out.println("isInterrupted() : "+exercise10Thread.isInterrupted()); // true
//        System.out.println("interrupted() : "+Thread.interrupted()); //  false 얘는 메인 쓰레드의 인터럽트 되었는지 확인함
//        System.out.println("isInterrupted() : "+exercise10Thread.isInterrupted()); // true
//        // isInterrupted()는 현재 상태변수를 반환하지만 interrupted()는 현재 상태를 반환하고 false로 초기화
    }

}


