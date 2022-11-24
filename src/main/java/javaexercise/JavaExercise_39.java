package javaexercise;

abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("정지 합니다.");
    }
}
interface Fightable{
    void move(int x, int y); // public abstract 생략
    void attack(Fightable f); // public abstract 생략
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y){ // 접근 제어자 public을 붙여야 한다.
        System.out.println("x는 "+x+" y는 "+y+" 이동 합니다.");
    }
    public void attack(Fightable f){ // 접근 제어자 public을 붙여야 한다.
        System.out.println(f+"를 공격 합니다.");

    }

    Fightable getFightable(){ // 싸울 수 있는 상대 불러오기
        Fighter f = new Fighter();
        return f;

    }
}


public class JavaExercise_39 { // 추상 클래스, 추상 메서드, 인터페이스 다형성 이용
    public static void main(String[] args) {
        //Fighter fighter = new Fighter();
       // Unit fighter = new Fighter(); Unit에는 attack이 없어서 호출 불가능
        Fightable fighter = new Fighter(); // Fightable 인터페이스 자료형 가능
        fighter.move(100,200);
        fighter.attack(new Fighter());
        Fighter fighter1 = new Fighter();
        Fightable f = fighter1.getFightable();
        System.out.println(f);
        // fighter.stop(); Fightable에는 stop이 없어서 호출 불가능

    }
}
