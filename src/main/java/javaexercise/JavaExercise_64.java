package javaexercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class JavaExercise_64 {
    public static void main(String[] args) { // stack, queue 실습 해보기
        Stack s = new Stack();
        Queue q = new LinkedList();

        s.push(3);
        s.push(5);
        s.push(20);

        q.offer(3);
        q.offer(5);
        q.offer(10);

        System.out.println("stack 출력 ");
        while(!s.empty()){
            System.out.println(s.pop());
        }

        System.out.println("queue 출력");
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }

    }
}

