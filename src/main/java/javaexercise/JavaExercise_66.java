package javaexercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
// queue 객체를 queue인터페이스를 구현한 LinkedList 클래스를 이용해 만들어야 함.
// queue에 몇개까지의 기록을 저장할지 그리고 그 이상의 입력이 들어오면 초반에 입력했던 기록들이 삭제가 될지
// 어떤 입력을 주면 현재의 입력 기록을 볼수 있는지

class JavaExercise_66 {
    static Queue queue = new LinkedList(); // LinkedList 클래스를 이용해 queue객체 생성
    static final int maxSize = 6; // 저장 가능한 입력의 개수를 상수로 지정
    public static void main(String[] args) { // queue를 이용해 입력을 기억하는 기능 만들기
   while(true) {
       System.out.println("압력하세요 ");
       try {
           Scanner sc = new Scanner(System.in);
           String str = sc.nextLine().trim(); // 문자열을 입력받음, 공백이 있다면 trim() 메서드를 사용해서 삭제
           // str이 공백이면 continue로 무시
           if ("".equals(str)) {
               continue;
           }
           // str이 공백이 아니라면  save(str) 메서드를 사용해서 queue에 저장
           // exit를 입력하면 프로그램 종료
           if (str.equalsIgnoreCase("exit")) {
               System.exit(0);
           } else if (str.equalsIgnoreCase("help")) { // help를 입력하면 조작법을 알려줌
               System.out.println("대소문자와 상곤없이 exit를 입력하면 프로그램이 종료 됩니다.");
               System.out.println("대소문자와 상관없이 help를 입력하면 프로그램 조작 설명이 출력 됩니다.");
               System.out.println("history를 입력하면 입력한것까지 포함하여 현재까지의 입력 기록을 출력 합니다.");
               System.out.println("공백이 아닌 문자열을 입력하면 입력이 기록 됩니다.");
           }else if (str.equals("history")) { // history 라고 입력하면 현재 입력한 기록들을 보여줌 이거는 list를 이용해서 출력
               save(str);

               LinkedList list = (LinkedList) queue;
               for (int i = 0; i < list.size(); ++i) {
                   System.out.println(i + 1 + ". " + list.get(i));
               }
           } else if (!(str.equals(""))) {// str이 공백이 아니라면  save(str) 메서드를 사용해서 queue에 저장
               System.out.printf("입력하신 %s 문자열이 기록 되었습니다.", str);
               save(str);
           }
       }
       catch (Exception e){
           System.out.println("오류 발생!");
       }
   }

    }

    public static void save(String str){
        if (!("".equals(str))){
            queue.offer(str);
        }
        if (queue.size()>maxSize){
            queue.poll();
        }
    }
}

