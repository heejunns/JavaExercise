package javaexercise;

class JavaExercise_58 {
    public static void main(String[] args) { // 문자열과 기본형 변환
        // 숫자 -> 문자열
        int i = 100;

        String str = i + "";
        String str2 = String.valueOf(i);

        System.out.println(str);
        System.out.println(str2);

        // 문자열 -> 숫자

        String str3 = "150";

        int i2 = Integer.parseInt(str3);
        int i3 = Integer.valueOf(str3);

        System.out.println(i2);
        System.out.println(i3);








    }
}

