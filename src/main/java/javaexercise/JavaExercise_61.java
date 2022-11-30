package javaexercise;

import java.util.Calendar;

class JavaExercise_61 {
    public static void main(String[] args) { // Calendar 클래스
        Calendar c = Calendar.getInstance();
        System.out.println("올해는 몇 년도인가? "+c.get(Calendar.YEAR));
        System.out.println("지금은 몇 월인가(반환값의 +1해야 현재 월 이다.) "+c.get(Calendar.MONTH));
        System.out.println("요번주는 올해의 몇번째 주인가? "+c.get(Calendar.WEEK_OF_YEAR));

    }
}

