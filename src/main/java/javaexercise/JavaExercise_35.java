package javaexercise;

class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (0<=hour && hour<=24){
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (0<=minute && minute<=60){
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (0<=second && second<=60){
            this.second = second;
        }

    }
}
public class JavaExercise_35 { // 제어자,캡술화
    public static void main(String[] args) {
       Time time = new Time();
       /* time.hour = 25;
       time.minute = 35;
       time.second = 10; */  //  인스턴스 변수에 private 제어자를 적었기 때문에 바로 접근은 불가능하다.
        time.setHour(25);
        time.setMinute(35);
        time.setSecond(10);
       System.out.println("현재 시간은 "+time.getHour()+"시 입니다."); // 여기서 set 메서드 입력 매개변수에 25를 입력했기 때문에 time의 기본 초기화 값 0 이 출력된다.
       System.out.println("현재 분은 "+time.getMinute()+"분 입니다.");
       System.out.println("현재 초는 "+time.getSecond()+"초 입니다.");


    }
}
