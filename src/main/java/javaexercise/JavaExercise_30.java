package javaexercise;

class Tv2 {
    boolean power; // 전원의 상태
    int channel; // 채널

    void power(){ // 전원의 상태를 바꾸는 기능
        power = !power;
    }
    void channelUp(){ // 채널 올리는 기능
        ++channel;
    }
    void channelDown(){  // 채널 내리는 기능
        --channel;
    }

}

class smartTv extends Tv2{
    boolean caption; // 자막을 키고 끄는 상태
    void displayCaption(String text){ // caption이 true 일때만 자막을 보여줌
        if (caption){
            System.out.println(text);
        }
    }
}


public class JavaExercise_30 { // 상속 실습
    public static void main(String[] args) {
        smartTv tv = new smartTv();
        tv.channel = 10;
        tv.channelUp();
        System.out.println(tv.channel);
        tv.channelDown();
        System.out.println(tv.channel);
        tv.displayCaption("안녕하세요"); // caption이 false라서 안녕하세요가 출력되지 않음
        tv.caption = true;
        tv.displayCaption("안녕하세요"); // 출력 된다.



    }
}
