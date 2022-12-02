package javaexercise;

import javax.swing.text.html.HTMLDocument;
import java.util.*;


class JavaExercise_67 {

    public static void main(String[] args) { // Iterator 사용
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Iterator i = list.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }





    }
}

