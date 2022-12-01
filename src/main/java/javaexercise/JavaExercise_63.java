package javaexercise;

import java.util.ArrayList;

class JavaExercise_63 {
    public static void main(String[] args) { // ArrayList 메서드 2, 문자열 자르기
        final int limit = 10; // 문자열을 몇개의 문자를 기준으로 자를지 정하기
        String str = "sjdkdofdkfofodfmdkvdcjvdosjfidjfefjdofkdasidfj123sdjs32122";
        int strLen = str.length();
        ArrayList list = new ArrayList(strLen/limit +10);
        // 위와 같이 ArrayList를 생성할때 strLen/limit +10 이렇게 예상 요소의 개수보다 여유롭게 생성하는게 좋다. 그 이유는 생성한 크기보다 더 많은 객체를 저장할 수 있지만 그 과정에서 처리시간이 많이 소요되기 때문이다.

        for (int i = 0; i < strLen; i+=limit){
            if (i+limit < strLen){ // i+limit가 문자열의 길이보다 작으면 문자 10개의 문자열을 자를수 있기 때문에 실행
                list.add(str.substring(i,i+limit));
            } else{ // i+limit가 문자열의 길이보다 크게되거나 같게 되면 i부터 나머지 문자열을 모두 list 요소에 추가
                list.add(str.substring(i));
            }
        }
        for (int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}

