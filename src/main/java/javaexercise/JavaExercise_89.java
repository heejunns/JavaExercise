package javaexercise;

class Exercise4Thread extends Thread {
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

class JavaExercise_89 {
        public static void main(String[] args) { // 쓰레드에서 예외를 발생시키고 결과를 확인하기 (run() 호출)
         Exercise4Thread exercise4Thread = new Exercise4Thread();
         exercise4Thread.run();
         // start() 를 호출해 새로운 쓰레드를 생성한것과 다르게 run() 을 호출하면 새로운 쓰레드를 만들지 않고 main 쓰레드 호출 스택에서 run()을 호출한다.
            // printStack() 메서드를 호출하면 에러가 발생하는 시점의 호출 스택을 확인 할 수 있다.
        }
    }







