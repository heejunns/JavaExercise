package javaexercise;

import javax.swing.*;

class JavaExercise_90 {
        public static void main(String[] args) { // 하나의 쓰레드 사용해서 입력을 받는 작업과 숫자를 출력하는 작업을 처리하기
       String input = JOptionPane.showInputDialog("아무 값이나 입력하세요 : ");
            System.out.println("입력하신 값은 "+input+" 입니다.");

            for (int i=10; i>0; --i){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e){

                }
            }
        }
    }







