package javaexercise;




class JavaExercise_93 implements Runnable{
    static boolean autoSave = false;
        public static void main(String[] args) { // 데몬 쓰레드 사용 해보기
            Thread t = new Thread(new JavaExercise_93());
            t.setDaemon(true); //  만약 데몬 쓰레드로 변경하지 않는다면 일반 쓰레드이기 때문에 무한 루프로 인해서 main 쓰레드가 종료되어도 생성된 쓰레드는 무한루프 떄문에 종료되지 않고 계속 반복한다.
            t.start();
            for (int i = 1; i <= 10; ++i) { // main 쓰레드 작업
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                System.out.println(i);
                if (i == 5) { // 5초가 되면 데몬 쓰레드의 autosave 가 true가 되면서 autoSave() 메서드 호출
                    autoSave = true;
                }
            }
                System.out.println("프로그램을 종료합니다."); // 일반 쓰레드가 종료되면 무한루프라도 데몬 쓰레드도 종료된다.
            }
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(3 * 1000); // 무한 반복하면서3초마다 autoSave() 메서드 호출
                    } catch (InterruptedException e) {

                    }
                    if (autoSave) {
                        autoSave();
                    }
                }
            }


    public void autoSave(){
        System.out.println("작업파일이 자동저장되었습니다.");
    }
        }






