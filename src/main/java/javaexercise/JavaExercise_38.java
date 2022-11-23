package javaexercise;

abstract class Player{ // Player 추상 클래스
    abstract void play(int pos); //  play 추상 메서드
    abstract void stop(); // stop 추상 메서드
}

class AudioPlayer extends Player{
    void play(int pos){ // play 추상 메서드 구현
        System.out.println(pos+" 위치에서 재생 시작합니다.");
    }
    void stop(){ // stop 추상 메서드 구현
        System.out.println("재생을 일시정지 합니다.");
    }
}

public class JavaExercise_38 { // 추상 클래스, 추상 메서드 ( 추상 클래스 Player를 상속 받아 추상 메서드를 구현하고 AudioPlayer 클래스를 만들기)
    public static void main(String[] args) {
       // AudioPlayer audioPlayer = new AudioPlayer();
        Player audioPlayer = new AudioPlayer(); // AudioPlayer 클래스가 Player 클래스를 상속 받았기 때문에 다형성을 활용해 Player 타입의
        audioPlayer.play(50);              // audioPlayer 참조변수로도 AudioPlayer 클래스의 멤버 사용 가능
        audioPlayer.stop();
    }
}
