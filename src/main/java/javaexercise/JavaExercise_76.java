package javaexercise;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;


class JavaExercise_76 {
    public static void main(String[] args) { // HashMap을 이용해 로그인하는 프로그램 만들기
        HashMap hashMap = new HashMap<>();
        hashMap.put("myid","1234");
        hashMap.put("hello","0000");
        hashMap.put("myname","4321");
        hashMap.put("myname","1234"); // value값 변경
        hashMap.replace("myname","1234","0303"); // value 값 변경

        System.out.println(hashMap);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("아이디를 입력하세요 : ");
            String id = sc.nextLine().trim(); // trim()으로 공백 제거해주기
            if(!(hashMap.containsKey(id))){
                System.out.println("아이디가 존재하지 않습니다. 다시 입력 해주세요.");
                continue;
            }

            System.out.println("비밀번호를 입력하세요 : ");
            String password = sc.nextLine().trim();

            if(!(hashMap.get(id).equals(password))){
                System.out.println("비밀번호가 맞지 않습니다. 다시 로그인 해주세요.");
            } else{
                System.out.println("로그인에 성공하셨습니다.");
                break;
            }
        }

     }
}



