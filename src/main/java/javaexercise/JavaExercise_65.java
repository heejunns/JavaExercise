package javaexercise;

import java.util.Stack;

class JavaExercise_65 {

    public static void main(String[] args) { // 입력된 수식의 괄호가 올바르게 체크 되어 있는지 확인해주는 프로그램
        Stack stack = new Stack();

        String str = "2+3)*5";
try {


    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '(') {
            stack.push(i);
        } else if (str.charAt(i) == ')') {
            stack.pop(); // pop() 메서드를 사용했을때 만약 stack에 저장되어 있는 ( 가 없어 stack이 비어있다면
            // EmptyStackException가 발생한다. 예외가 발생해도 프로그램이 잘 작동하기 위해서 catch문으로 예외 처리를 해준다.
        }
    }
    if (stack.empty()) {
        System.out.println("괄호가 일치하게 문자열에 포함되어 있습니다.");
    } else {
        System.out.println("괄호가 열리가 닫히지 않았습니다.");
    }
} catch (Exception e){ //
    System.out.println("괄호가 열림이 없었습니다.");
}


    }
}

