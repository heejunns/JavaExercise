package javaexercise;

class Exercise6Thread extends Thread{
    public void run(){
        for (int i=0; i<300; ++i){
            System.out.print("-");
            //for (int l=0; l<10000000; ++l);
        }

    }
}
class Exercise7Thread extends Thread{
    public void run(){
        for(int i=0; i<300; ++i){
            System.out.print("|");
            //for(int l=0; l<10000000; ++l);
        }
    }
}


class JavaExercise_92 {
        public static void main(String[] args) { // 쓰레드 우선 순위 변경해보기
            Exercise6Thread exercise6Thread = new Exercise6Thread();
            Exercise7Thread exercise7Thread = new Exercise7Thread();
            System.out.println("Exercise6Thread의 우선순위는 : "+exercise6Thread.getPriority());
            System.out.println("Exercise7Thread의 우선순위는 : "+exercise7Thread.getPriority());
            // 위의 Exercise6Thread,Exercise7Thread 의 우선순위는 main 메서드에서 생성한 쓰레드이기 때문에 상속받아 우선순위는 5이다.
            exercise7Thread.setPriority(7);
            // setPriority() 메서드를 이용해 쓰레드의 우선순위를 변경한다.
            System.out.println("Exercise7Thread의 우선순위는 : "+exercise7Thread.getPriority());

            exercise6Thread.start();
            exercise7Thread.start();
            // 꼭 exercise7Thread가 작업을 먼저 끝내는건 아니다. 하지만 exercise7Thread가 exercise6Thread보다 작업을 먼저 끝낼 확률은 높다.


        }
    }







