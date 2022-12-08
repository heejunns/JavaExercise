package javaexercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Student2 {
    String name = "";
    int classNumber;
    int studentNumber;


    public Student2(String name, int classNumber, int studentNumber) {
        this.name = name;
        this.classNumber = classNumber;
        this.studentNumber = studentNumber;
    }
}


class JavaExercise_81 {
    public static void main(String[] args) { // 지네릭스 사용해보기 (HashMap 지네릭스)
        HashMap<String,Student2> map = new HashMap<String,Student2>();
        map.put("자바왕",new Student2("자바왕",1,10));
        map.put("파이썬왕",new Student2("파이썬왕",1,11));
        map.put("코틀린왕",new Student2("코틀린왕",1,12));

        System.out.println(map.get("자바왕").name);
        System.out.println(map.get("파이썬왕").name);
        System.out.println(map.get("코틀린왕").name);

    }
}





