package javaexercise;

import java.util.*;


class JavaExercise_73 {
    public static void main(String[] args) { // TreeSet 클래스 ( Comparable 인터페이스의 compareTo() 또는 Comparator 인터페이스의 compare() 오버라이딩하기)
       Set set = new TreeSet(); // 만약 Treeset이 아니라 HashSet을 생성했다면 정렬이되어 나오지 않는다. Treeset은 정렬과 범위 검색에 유리하다.

       for (int i=0; set.size()<6; i++){
           int n = (int)(Math.random()*45)+1;
           set.add(n); // Integer는 Comparable이 구현되어 있기 때문에 저장이 가능한 것 이다.

       }
        System.out.println(set);
    }
}
class Test{ // 아니면 저장하는 객체의 클래스에서 Comparable 인터페이스의 compareTo() 메서드를 구현하는 방법도 있다. 이렇게 하면 TreeSet 생성자를 생성할때 comparator 인터페이스를 구현한 객체를 넣어주지 않아도 된다.

}
class TestComparator implements Comparator { // set에 그냥 객체를 넣을려고 한다면 예외가 발생한다. 그 이유는 비교기준이 없기 때문이다. compare()를 오버라이딩 해서 TreeSet 생성자를 생성할때 오버라이딩한 클래스의 객체를 입력으로 넣어줘 비교방식을 정해줘야 한다.

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}



