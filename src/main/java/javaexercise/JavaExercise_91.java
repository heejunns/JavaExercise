package javaexercise;

import javax.swing.*;

class Exercise5Thread extends Thread{
    public void run(){
        for(int i=10; i>0; --i){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e){

            }
        }
    }

}

class JavaExercise_91 {
        public static void main(String[] args) { // 입력을 받는 작업과 숫자를 출력하는 작업을 각각의 쓰레드로 처리하기
            Exercise5Thread exercise5Thread = new Exercise5Thread();
            exercise5Thread.start();
       String input = JOptionPane.showInputDialog("아무 값이나 입력하세요 : ");
            System.out.println("입력하신 값은 "+input+" 입니다.");

//            Exercise5Thread exercise5Thread = new Exercise5Thread();
//            exercise5Thread.start();


        }
    }







