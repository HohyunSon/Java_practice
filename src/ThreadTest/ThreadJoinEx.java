package ThreadTest;

class ThreadJoinEx {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("첫 번째 스레드: " + i);
                    try {
                        Thread.sleep(1000); // 1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 첫 번째 스레드의 실행이 완료될 때까지 기다림
                    thread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 1; i <= 5; i++) {
                    System.out.println("두 번째 스레드: " + i);
                }
            }
        });

        thread1.start(); // 첫 번째 스레드 시작
        thread2.start(); // 두 번째 스레드 시작
    }
}
