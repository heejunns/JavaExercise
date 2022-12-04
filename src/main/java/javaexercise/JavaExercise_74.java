package javaexercise;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


class JavaExercise_74 {
    public static void main(String[] args) { // TreeSet 클래스 ( subSet() 사용해서 범위 검색 해보기)
       TreeSet set = new TreeSet(); // 만약 Treeset이 아니라 HashSet을 생성했다면 정렬이되어 나오지 않는다. Treeset은 정렬과 범위 검색에 유리하다.

        String from = "b";
        String to = "d";

        set.add("soccer"); set.add("baseball"); set.add("basketball");
        set.add("running"); set.add("tennis"); set.add("swim");
        set.add("computer"); set.add("tv"); set.add("radio");

        System.out.println(set);

        System.out.println("검색을 해보겠습니다.");
        System.out.println("b부터 d까지의 객체는? "+set.subSet(from,to)); // b부터 d전까지로 시작되는 단어가 출력
    }
}



