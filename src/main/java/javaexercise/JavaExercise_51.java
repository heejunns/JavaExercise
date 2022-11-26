package javaexercise;

import java.io.File;

class JavaExercise_51 {
    public static void main(String[] args) { // 파일을 입력 받아 main 메서드에서 호출한 메서드에서 예외를 선언하고 예외 처리를 하지 않고 main 메서드에 예외를 넘겨주어 main 메서드에서 예외를 처리하는 경우
        try {
            File f = createFile("exercise.txt"); // createFile 메서드가 static 같은 클래스 안에 클래스 멤버이기 때문에 객체 생성 없이 호출
            System.out.println(f.getName()+" 파일이 성공적으로 생성되었습니다.");
        } catch (Exception e){
            System.out.println(e.getMessage()+"다시 입력해 주세요.");
        }
     }
     static File createFile(String filename) throws Exception { // 예외 처리를 하지 않고 main 메서드에 예외를 넘겨줌
        if (filename == null | filename.equals("")){
            throw new Exception("잘못된 이름의 파일 입니다."); // 예외 선언
        }
        File f = new File(filename);
        f.createNewFile(); // 예외를 main 메서드에 넘겨주기 때문에 따로 예외처리를 해주지 않아도 된다.
         return f;
     }
    }

