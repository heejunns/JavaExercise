package javaexercise;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.TreeSet;


class JavaExercise_75 {
    public static void main(String[] args) { // TreeSet 클래스 ( TreeSet 클래스의 다양한 메서드 사용해보기)
       TreeSet set = new TreeSet(); // 만약 Treeset이 아니라 HashSet을 생성했다면 정렬이되어 나오지 않는다. Treeset은 정렬과 범위 검색에 유리하다.

        int[] arr = {10,20,30,90,13,20,320,120,1202,320,1102,34};

        for(int i=0; i< arr.length; ++i) {
            set.add(arr[i]);
        }
        System.out.println("set 출력 : "+set);
        System.out.println("celing 메서드 : "+set.ceiling(30)); // 입력되는 객체와 같은 객체가 있다면 그 객체를 반환하고 없다면 그 객체보다 바로 다음으로 큰 객체를 반환한다
        System.out.println("floor 메서드 : "+set.floor(30)); // 입력되는 객체와 같은 객체가 있다면 그 객체를 반환하고 없다면 그 객체보다 다음으로 작은 객체를 반환한다.
        System.out.println("higher 메서드 : "+set.higher(30)); // 입력되는 객체보다 그 다음으로 큰 객체를 반환한다.
        System.out.println("lower 메서드 : "+set.lower(30)); // 입력되는 객체보다 그 다음으로 작은 객체를 반환한다.
        System.out.println("headSet 메서드 : "+set.headSet(30)); // 입력되는 객체보다 작은 객체들을 모두 반환한다.
        System.out.println("talilSet 메서드 : "+set.tailSet(30)); // 입력되는 객체를 포함하여 객체보다 큰 객체들을 모두 반환한다.

     }
}



