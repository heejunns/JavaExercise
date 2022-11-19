package javaexercise;

import java.util.Arrays;

class Tv {
    String color;
    boolean onOff;
    int channel;

    void onOff(){ // tv를 끄고 키는 메서드
        onOff = !onOff;
    }
    void channelUp(){ // 채널을 올리는 메서드
        ++channel;
    }
    void channelDown(){ // 채널을 내리는 메서드
        --channel;
    }

}

public class JavaExercise_22 { // 객체지향 실습, tv 클래스 만들기.
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 10;
        System.out.println("현재 채널은 "+t.channel+"번 입니다.");
        t.channelUp();
        System.out.println("현재 채널은 "+t.channel+"번 입니다.");
        System.out.println("현재 tv는 "+t.onOff+" 입니다.");
        t.onOff();
        System.out.println("현재 tv는 "+t.onOff+" 입니다.");

    }
}
