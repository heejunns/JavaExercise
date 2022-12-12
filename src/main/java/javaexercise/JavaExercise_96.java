package javaexercise;

import javax.swing.*;

class Exercise11Thread extends Thread {
    public void run() {
        int i = 10;
        while (i!=0 && !isInterrupted()){
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                // 쓰레드가 멈춰있을때 인터럽트를 발생하면 에러가 발생하고 상태는 false가 된다. 그래서 카운트가 종료되지 않고 0까지 카운트하고 종료된다.
                // 입력되는 동시에 카운트가 종료되길 원한다면 catch 안에서 인터럽트를 한번 더 발생시키면 된다.
                this.interrupt();
            }
        }
        System.out.println("isInterrupted() : "+this.isInterrupted()); // 현재 상태가 false 인것을 확인할 수 있따. 인터럽트를 한번 더 발생시키면 true가 출력되는것을 확인할 수 있다.
        System.out.println("카운트가 종료되었습니다.");
    }
}

class JavaExercise_96 {

    public static void main(String[] args) { // interrupt() 메서드 사용해보기, 예외처리해서 종료되지 않게 한 후 다시 인터럽트 발생해 쓰레드 종료 시키기
        Exercise11Thread exercise11Thread = new Exercise11Thread();
        exercise11Thread.start();
        System.out.println("isInterrupted() : "+exercise11Thread.isInterrupted()); // false
        String input = JOptionPane.showInputDialog(" 아무 값이나 입력 하세요.");
        System.out.println("입력하신 값은 "+input+" 입니다.");
        exercise11Thread.interrupt();
        System.out.println("isInterrupted() : "+exercise11Thread.isInterrupted()); // 여기서는 true로 출력될수도 있다.


    }

}


