package org.counter;

public class RaceConditionDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
        
        // 멀티쓰레드 환경에서 하나의 객체를 공유하게 되면 원하지 않는 결과가 나올 수 있음
        // -> 동기화처리로 해결가능
    }
}
