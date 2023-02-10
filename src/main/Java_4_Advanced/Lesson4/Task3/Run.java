package main.Java_4_Advanced.Lesson4.Task3;

import java.util.ArrayList;

public class Run implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread daemon is starts");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
