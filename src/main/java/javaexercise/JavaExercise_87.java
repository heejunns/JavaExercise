package javaexercise;

class ExerciseThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; ++i) {
            System.out.println(getName());
        }
    }
}
class Exercise2Thread implements Runnable{
    public void run(){
        for(int i=0; i<5; ++i){
//            Thread t = Thread.currentThread();  현재 진행중인 쓰레드의 참조변수를 불러오기 위해서 Thread 클래스의 currentThread() 메서드를 사용 (static 메서드)
//            String name = t.getName();
//            System.out.println(name);
            // Thread 클래스를 상속받으면 클래스의 메서드들을 사용할 수 있지만 Runnable을 구현하면  currentThread() 메서드를 호출하여 현재 진행중인 쓰레드의 참조 변수를 가져와서 메서드 호출을 해야한다.
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class JavaExercise_87 {
        public static void main(String[] args) { // 쓰레드를 구현하는 방법 두가지 사용해보기 (Thread 클래스의 run() 메서드 오버라이딩, Runnable 인터페이스의 run() 메서드 구현)
            ExerciseThread exerciseThread = new ExerciseThread();
            Exercise2Thread exercise2Thread = new Exercise2Thread();
            Thread thread = new Thread(exercise2Thread);
            // 위와 같이 run() 메서드를 구현한 Runnable 인터페이스의 참조변수를 Thread 클래스의 생성자에서 매개변수로 받으면 Thread 클래스에서 run() 메서드를 호출하면 매개변수로 받은 인터페이스의 참조변수로 구현한 run() 메서드를 호출해 오버라이딩 하지 않고도 사용이 가능하다.
            exerciseThread.start();
            thread.start();


        }
    }







