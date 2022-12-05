package javaexercise;

import javax.sound.midi.Soundbank;
import java.util.*;


class JavaExercise_77 {
    public static void main(String[] args) { // HashMap을 이용해 성적확인 프로그램 만들기

        HashMap hashMap = new HashMap<>();
        hashMap.put("김자바",96);
        hashMap.put("박자바",87);
        hashMap.put("정자바",85);
        hashMap.put("최자바",28);
        hashMap.put("이자바",49);

        System.out.println(hashMap);
        System.out.println(hashMap.get("김자바"));

        Set set = hashMap.entrySet(); // entrySet()으로 set형태로 반환
        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry e = (Map.Entry) i.next(); // Map 내부 인터페이스 Entry
            System.out.println("이름 : "+e.getKey() + ", " +"점수 : "+e.getValue());
        }
        System.out.println("참가자 명단 : "+hashMap.keySet());

        int total = 0;
        Collection values = hashMap.values();
        Iterator it = values.iterator();
        System.out.println(values);
        while (it.hasNext()) {
            Integer l = (Integer) it.next();
            total += l.intValue();
        }
        System.out.println("촘점 : "+total);
        System.out.println("평균점수 : "+total/(float)hashMap.size());
        System.out.println("최고점수 : "+Collections.max(values)); // comparable을 구현한 객체만 들어올 수 있음
        System.out.println("최저점수 : "+Collections.min(values)); // comparable을 구현한 객체만 들어올 수 있음

    }
}





