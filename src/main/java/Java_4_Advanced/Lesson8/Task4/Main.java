package Java_4_Advanced.Lesson8.Task4;

public class Main {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();

        firstThread.setThread2(secondThread);
        secondThread.setThread1(firstThread);
        firstThread.start();
        secondThread.start();
    }
}
