package ThreadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPoolExample {
    public static void main(String[] args) {
        // 스레드 풀 생성 (여기서는 FixedThreadPool을 사용)
        ExecutorService executorService = Executors.newFixedThreadPool(3); // 최대 3개의 스레드

        // 작업 제출
        for (int i = 1; i <= 5; i++) {
            final int taskNumber = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("작업 " + taskNumber + " 시작");
                    try {
                        // 간단한 대기 시간을 가정
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("작업 " + taskNumber + " 종료");
                }
            });
        }

        // 스레드 풀 종료
        executorService.shutdown();
    }
}
