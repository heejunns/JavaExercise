package javaexercise;
import java.util.Objects;

class Card{

    String kind;
    int num;

    Card(){
        this("SPADE",10);

    }
    Card(String kind, int num){
        this.kind = kind;
        this.num = num;

    }
    @Override
    public String toString(){
        return "kind : "+kind+" , num : "+num;
    }
    @Override
    public boolean equals(Object obj){ // 오버라이딩은 선언부가 일치해야 함,
        if (!(obj instanceof Card)){
            return false;
        }
        Card c = (Card)obj;
        return this.kind.equals(c.kind) && this.num == c.num;
    }
    @Override
     public int hashCode(){ // equals() 를 오버라이딩 해줬기 때문에 hashCode()도 오버라이딩 해줘야 합니다.
         return Objects.hash(kind,num); // Objects클래스는 객체와 관련된 융용한 메서드를 제공한다.
    }


}

class JavaExercise_53 {
    public static void main(String[] args) { // Object 클래스의 toString() 메서드 오버라이딩 , equals(), hashCode() 오버라이딩
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));

    }
}

