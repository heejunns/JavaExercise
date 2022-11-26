package javaexercise;

import java.io.*;

class JavaExercise_50 {
    public static void main(String[] args) { // 파일을 입력 받아 main 메서드에서 호출한 메서드에서 예외를 처리하는 경우
        File f = createFile(""); // createFile 메서드가 static 같은 클래스 안에 클래스 멤버이기 때문에 객체 생성 없이 호출
        System.out.println(f.getName()+" 파일이 성공적으로 생성되었습니다.");
    }
     static File createFile(String filename){
        try {
            if(filename == null | filename.equals("")){ // filename이 null이거나 "" 와 내용이 같다면
                throw new Exception(); // 예외 발생
            }
        } catch (Exception e){ // 예외처리
            filename = "이름없음.txt"; // filename을 이름없음.txt로 저장
        } finally {
            File f = new File(filename);
            createNewFile(f);
            return f;
        }
     }
     static void createNewFile(File f){ // File 클래스의ㅣ createNewFile 메서드는 예외가 선언된 메서드 이므로 복잡해지니까 따로 빼서 예외 처리
        try {
            f.createNewFile();
        } catch (Exception e){

        }
     }
    }

