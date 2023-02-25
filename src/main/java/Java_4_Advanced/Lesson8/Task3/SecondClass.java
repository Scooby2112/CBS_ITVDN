package Java_4_Advanced.Lesson8.Task3;

public class SecondClass extends Thread{
    public Synchronize s;
    public int count;

    public SecondClass(Synchronize s, int count){
        this.s = s;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            s.setCounterSynchronized2();
        }
    }
}
