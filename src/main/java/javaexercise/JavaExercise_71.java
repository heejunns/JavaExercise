package javaexercise;

import java.util.*;
// equals()와 hashCode()를 오버라이딩 하지 않으면 set에 객체를 넣을때 같은 객체라도 같은 객체로 인식해 각각의 객체를 저장한다.
class Hello{
    String str;
    int n;
    Hello(String str, int n){
        this.str = str;
        this.n = n;
    }

    public String toString(){
        return "*"+str+","+n+"*";
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Hello)) return true;
        Hello hello = (Hello) o;
        return this.n == hello.n && this.str == hello.str;
    }

    @Override
    public int hashCode() {
        return Objects.hash(str, n); // int hash()의 매배변수는 가변인자이다.

    }
}

class JavaExercise_71 {
    public static void main(String[] args) { // HashSet 클래스 3
        HashSet set = new HashSet();

        set.add("a");
        set.add("a");
        set.add("b");
        set.add(new Hello("hi",10));
        set.add(new Hello("hi",10));

        System.out.println(set);
    }

}


