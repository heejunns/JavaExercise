package javaexercise;

class JavaExercise_56 {
    public static void main(String[] args) { // String 클래스의 compareTo() 메서드
        Integer x = 3;
        Integer y = 10;
        System.out.println(x.compareTo(y));
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(2));
        Float f = 1.5f;
        System.out.println(f.compareTo(0.6f));
        int a = 3;
        int b = 10;
        System.out.println(Integer.compare(a,b));


    }
}

