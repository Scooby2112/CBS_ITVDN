package Java_4_Advanced.Lesson8.Task4;

public class SecondThread extends Thread{
    Thread t1;

    public SecondThread() {
        System.out.println("Thread 2 create");
    }

    public void run() {
        System.out.println("Second thread was started");
        try {
            System.out.println("Second thread interrupt First thread finish…");
            t1.join();

        } catch (Exception e) {
        }
        try {
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Second thread was finished");
    }

    public void setThread1(Thread t) {
        this.t1 = t;
    }
}
