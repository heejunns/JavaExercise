package javaexercise;

class JavaExercise_57 {
    public static void main(String[] args) { // String 클래스의 join() 메서드
        String str = "hello,hi,bye";
        String[] strArr = str.split(",");
        String strResult = String.join("~",strArr);

        System.out.println(strResult);

    }
}

