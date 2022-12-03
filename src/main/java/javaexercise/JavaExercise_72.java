package javaexercise;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;


class JavaExercise_72 {
    public static void main(String[] args) { // HashSet 클래스 4 (retainAll(), addAll(), remove() 교집합,합집합,차집합 구현해보기)
        HashSet set1 = new HashSet();
        HashSet set2 = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        // set1에 객체 저장
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);

        System.out.println("set1 : " + set1);

        // set2에 객체 저장
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);

        System.out.println("set2 : " + set2);

        // 교집합 구현
        Iterator i = set2.iterator();
        while (i.hasNext()) {
            Object o = i.next();
            if (set1.contains(o)) {
                setKyo.add(o);
            }
        }
        System.out.println(setKyo);
        // 합집합 구현
        Iterator i2 = set1.iterator();
        while (i2.hasNext()) {
            setHab.add(i2.next());
        }
        System.out.println(setHab);
        Iterator i3 = set2.iterator();
        while (i3.hasNext()) {
            setHab.add(i3.next());
        }
        System.out.println(setHab);

        // 차집합 구현
        Iterator i4 = set1.iterator();
        while (i4.hasNext()) {
            Object o = i4.next();
            if (!(set2.contains(o))) {
                setCha.add(o);
            }
        }
        System.out.println(setKyo);


        System.out.println("교집합 : " +setKyo);
        System.out.println("합집합 : " +setHab);
        System.out.println("차집합 : " +setCha);
        // System.out.println("교집합을 retainAll()으로 표현 : "+set1.retainAll(set2));
     //  System.out.println(set1);
      // System.out.println("합집합을 addAll()으로 표현 : "+set1.addAll(set2));
      //  System.out.println(set1);
        System.out.println("차집합을 removeAll()으로 표현 : "+set1.removeAll(set2));
        System.out.println(set1);


    }
}



