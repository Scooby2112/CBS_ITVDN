package Java_4_Advanced.Lesson4.Task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Run());
        thread.setDaemon(true);
        thread.start();
        System.out.println("Name - " + thread.getName());
        System.out.println("Is it thread daemon? - " + thread.isDaemon());
        System.out.println("Status - " + thread.getState());
        System.out.println("Is it still active? - " + thread.isAlive());
        System.out.println("Is it virtual? - " + thread.isAlive());
        System.out.println("Priority - " + thread.getPriority());
    }
}
