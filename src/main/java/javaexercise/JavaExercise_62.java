package javaexercise;

import java.util.ArrayList;
import java.util.Calendar;

class JavaExercise_62 {
    public static void main(String[] args) { // ArrayList 메서드

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);

        ArrayList list2 = new ArrayList(list.subList(0,6));
        System.out.println(list);
        System.out.println(list2);

        System.out.println("list2가 list에 포함되는지? "+list.contains(list2)); // false를 반환,  list2는 object 상속이 아님, contains는 object 상속인 매개변수가 입력되어야 한다.
        System.out.println("lust2의 요소인 10이 list에 포함되는지? "+list.contains(list2.get(0))); // get 메서드로 객체를 불러와 입력 매개변수로 입력해주면 true반환
        System.out.println("list2가 list에 포함되는지? "+list.containsAll(list2)); // true를 반환  list2는 collection 상속이기 때문에 containsAll에 입력 매개변수로 사용

        System.out.println(list2.add("a")); // true를 반환, ArryList 마지막에 객체를 추가하고 성공하면 true를 반환
        list2.add("b");
        list2.add("c");

        System.out.println("list : "+list);
        System.out.println("list2 : "+list2);

        System.out.println("list에서 list2와 겹치는부분만 남기고 삭제 : "+list.retainAll(list2)); // true 반환
        System.out.println(list);
        //System.out.println("list2 에서 list1와 겹치는 부분을 삭제 : "+list2.removeAll(list));  // true 반환
        // 위의 removeAll 메서드와 같은 기능을 for문으로 만들어보기
        //for (int i = 0; i < list2.size(); ++i){ i를 0부터 시작하면 list2의 요소를 삭제하면서 list2의 요소들이 빈공간을 채우기 위해 위치가 움직여서 우리가 원하는 결과를 얻을 수 없음
        for (int i = list2.size()-1; i>=0; --i){ // 가장 오른쪽부터 for 문을 수행에 list2의 요소들을 삭제하면 요소를 삭제하더라도 list2의 요소들의 위치가 움직이지 않기 때문에 원하는 결과를 얻을 수 있음
            if (list.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        System.out.println(list2);

    }
}

