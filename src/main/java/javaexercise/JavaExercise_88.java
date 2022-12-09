package javaexercise;

class Exercise3Thread extends Thread {
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

class JavaExercise_88 {
        public static void main(String[] args) { // 쓰레드에서 예외를 발생시키고 결과를 확인하기 (start() 호출)
         Exercise3Thread exercise3Thread = new Exercise3Thread();
         exercise3Thread.start();
         // 하나의 쓰레드에서 예외가 발생하여도 다른 쓰레드에는 영향을 주지 않는다. printStack() 메서드를 사용해 에러가 발생한 시점의 호출 스택을 출력해보면
            // main 메서드는 없고 호출스택에 처음으로 호출된 메서드는 run() 메서드인것을 확인할 수 있다. start() 메서드를 호출하면 새로운 쓰레드를 생성하고 그 쓰레드가
            // 새로운 호출 스택을 생성해 run() 메서드를 호출한것을 알 수 있다. 그리고 main 메서드를 호출한 쓰레드는 에러가 발생한 쓰레드와 연관이 없기 때문에 main 메서드가 종료되면 호출 스택이 비워지면서 main 쓰레드는 종료된다.

        }
    }







