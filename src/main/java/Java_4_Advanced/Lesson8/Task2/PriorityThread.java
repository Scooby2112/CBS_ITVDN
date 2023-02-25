package Java_4_Advanced.Lesson8.Task2;

public class PriorityThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " was started");

        for (int i = 1; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
        System.out.println(Thread.currentThread().getName() + " was stopped");
    }
}
