package Java_4_Advanced.Lesson8.Task4;

public class FirstThread extends Thread{
    Thread t2;

    public FirstThread() {
        System.out.println("Thread 1 create");
    }

    @Override
    public void run() {
        System.out.println("First thread was started");
        try {
            sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            System.out.println("First thread interrupt Second thread finish...");
            t2.join();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("First thread was finished");
    }

    public void setThread2(Thread t) {
        this.t2 = t;
    }
}
