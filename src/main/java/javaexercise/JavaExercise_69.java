package javaexercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


class JavaExercise_69 {

    public static void main(String[] args) { // HashSet 클래스 (HashSet 생성해보고 객체 저장 해보기 후에 iterator()로 다시 읽어오기)
     Object[] objectArr = {"10", new Integer(6),"1","2","2","2","5","6","3","5","20"};
     Set set = new HashSet();

     for(int i=0; i< objectArr.length; ++i) {
         set.add(objectArr[i]);
     }
        System.out.println(set);

     Iterator i = set.iterator();

     while(i.hasNext()){
         System.out.println(i.next());
     }








    }
}

