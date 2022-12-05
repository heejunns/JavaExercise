package javaexercise;

import java.util.*;

class Tv1{

}
class radio{

}
class JavaExercise_78 {
    public static void main(String[] args) { // 지네릭스 사용해보기
        ArrayList<Tv1> list = new ArrayList<Tv1>();
        list.add(new Tv1());
//        list.add(new radio()); 지네릭스의 타입을 Tv1으로 하면 타입이 맞지 않아 저장할수 없다.
        Tv1 t = list.get(0);  // 지네릭스에 타입을 Tv1으로 지정해주지 않았으면 get() 메서드의 반환 타입은 Object일 것 이다. 그럼 t에 저장을 하려면 타입 불일치니  (Tv1)을 사용해서 형변환을 해줬어야 한다.
        System.out.println(t);
    }
}





