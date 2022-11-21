package javaexercise;

class Point3{
    int x;
    int y;
    String getLocation(){
        return "x : "+x+", y : "+y;
    }

    public String toString(){ // object 클래스의 toString()을 오버라이딩
        return "hi";
    }
}
class Point3D extends Point3{
    int z;
    @Override
    String getLocation() { // 오버라이딩
        return "x : "+x+", y : "+y+", z : "+z;
    }
}

public class JavaExercise_32 { // 오버라이딩 실습
    public static void main(String[] args) {
        Point3D p = new Point3D();
        p.x = 3;
        p.y = 5;
        p.z = 2;
        System.out.println(p.getLocation());
        System.out.println(p.toString());

    }
}
