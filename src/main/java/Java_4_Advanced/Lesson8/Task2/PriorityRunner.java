package Java_4_Advanced.Lesson8.Task2;

public class PriorityRunner {
    public static void main(String[] args) {
        PriorityThread priorityThread = new PriorityThread();
        Thread t1 = new Thread(priorityThread);
        Thread t2 = new Thread(priorityThread);
        Thread t3 = new Thread(priorityThread);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.setName("First");
        t2.setName("Second");
        t3.setName("Third");

        t1.start();
        t2.start();
        t3.start();
    }
}
