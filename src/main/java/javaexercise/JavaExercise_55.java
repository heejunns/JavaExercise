package javaexercise;

class JavaExercise_55 {
    public static void main(String[] args) { // String 클래스의 다양한 메서드 실습1
        String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1==s2); // true 같은 값을 가지는 문자열 리터럴은 컴파일 시에 클래스 파일에 한번만 저장된다. s1과 s2는 같은 인스턴스를 가리킨다.
        System.out.println(s1.equals(s2)); // true s1과 s2의 문자열 내용은 같다.

        System.out.println(s3==s4); // false new 키워드를 사용하면 메모리할당이 이루어지기 때문에 new 키워드가 있을때마다 새로운 객체가 생성된다. 따라서 s3와 s4는 서로 다른 객체를 가리킨다.
        System.out.println(s3.equals(s4)); // true s3와 s4의 문자열 내용은 같다.

         char[] chArr = new char[0]; // 길이가 0인 char형 인스턴스 생성
        String s = ""; // 빈 문자열
        // char c = '';  문자는 빈 문자를 표현 불가능하다.
        String str = new String(chArr); // new String("");와 같다.
        System.out.println("chArr의 길이는 : "+chArr.length);
        System.out.println("s의 길이는 : "+s.length());




    }
}

