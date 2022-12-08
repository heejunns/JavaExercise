package javaexercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Student {
    String name = "";
    int classNumber;
    int studentNumber;


    public Student(String name, int classNumber, int studentNumber) {
        this.name = name;
        this.classNumber = classNumber;
        this.studentNumber = studentNumber;
    }
}


class JavaExercise_80 {
    public static void main(String[] args) { // 지네릭스 사용해보기 (Iterator 지네릭스)
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕",1,10));
        list.add(new Student("파이썬왕",1,11));
        list.add(new Student("코틀린왕",1,12));

        Iterator<Student> i = list.iterator();
      //   Iterator i = list.iterator(); 지네릭스로 타입 대입을 해주지 않은 Iterator
        while (i.hasNext()){
            Student s = i.next(); // 지네릭스로 타입 대입을 해줬기 때문에 next()메서드의 반환타입이 Student이다. 형변환이 필요없다.
          //  Student s2 = i.next(); next() 메서드의 반환타입이 Object이기 떄문에 형변환 없이 Student타입 변수에 담을 수 없음
            System.out.println(s.name);

        }


    }
}





