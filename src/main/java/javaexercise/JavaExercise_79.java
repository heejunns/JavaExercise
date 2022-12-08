package javaexercise;

import java.util.ArrayList;
import java.util.List;

class Sport{

}
class Soccer extends Sport{

}
class Baseball extends Sport{

}

class JavaExercise_79 {
    public static void main(String[] args) { // 지네릭스 사용해보기 (지네릭스 다형성)
        List<Sport> list = new ArrayList<Sport>();
        List<Soccer> listSoccer = new ArrayList<Soccer>();
        list.add(new Sport());
        list.add(new Soccer());
        list.add(new Baseball());

        Sport s = list.get(0);
        Soccer s2 = (Soccer) list.get(1); // 반환타입이 Sport 이기 때문에 Soccer 타입 변수에 저장할려면 형변환을 해줘야함
        Baseball b = (Baseball) list.get(2); // 반환타입이 Sport 이기 때문에 Baseball 타입 변수에 저장할려면 형변환을 해줘야함

        JavaExercise_79 j = new JavaExercise_79();
        j.printAll(list);
        //   j.printAll(listSoccer); 컴파일 에러가 발생한다. printAll() 메서드의 입력 매개변수의 타입이 Sport 이기 때문이다.
    }
    public void printAll(List<Sport> l){
        for(Sport s : l){
            System.out.println(s);
        }
    }
}





