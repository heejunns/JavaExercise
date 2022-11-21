package javaexercise;

import java.util.concurrent.Callable;

class Point{
    int x;
    int y;
}

class Circle1 extends Point{ // 상속
    int r;
}

class Circle2{ // 포함
    Point p = new Point();
    int r;
}





public class JavaExercise_31 { // 상속,포함 실습
    public static void main(String[] args) {
         Circle1 c1 = new Circle1();
         c1.x = 3;
         c1.y = 5;
         c1.r = 2;
         System.out.println("c1.x = "+c1.x);
         System.out.println("c1.y = "+c1.y);
         System.out.println("c1.r = "+c1.r);
         Circle2 c2 = new Circle2();
         c2.p.x = 3;
         c2.p.y = 5;
         c2.r = 2;
         System.out.println("c2.p.x = "+c2.p.x);
         System.out.println("c2.p.y = "+c2.p.y);
         System.out.println("c2.r = "+c2.r);

    }
}
