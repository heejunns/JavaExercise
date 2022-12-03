package javaexercise;

import java.util.*;


class JavaExercise_70 {
    public static void main(String[] args) { // HashSet 클래스 2
        Set set = new HashSet();
//        for(int i=0; set.size() <6; i++){
//            int n = (int)(Math.random()*45)+1;
//            set.add(n);
//        }
        while(true){ // 위의 for문의 코드를 while문으로 만들어보기
            if (set.size()>5){
                break;
            }
            int n = (int)(Math.random()*45)+1;
            set.add(n);
        }
        System.out.println(set); // 정렬되어 있지 않음

        List list = new ArrayList(set);
        Collections.sort(list);
        System.out.println(list); // 정렬되어 출력

    }
}

