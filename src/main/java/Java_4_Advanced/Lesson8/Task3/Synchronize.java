package Java_4_Advanced.Lesson8.Task3;


import lombok.SneakyThrows;

public class Synchronize {
    public int counter;
    public boolean isTrue;

    @SneakyThrows
    synchronized void setCounterSynchronize1(){
        if (!isTrue) {
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + ": " + ++counter);
        isTrue = false;
        notify();
    }

    synchronized void setCounterSynchronized2(){
        if (isTrue){
            try {
                wait();
            }catch (InterruptedException e ){
                System.out.println(e);
            }
        }
        isTrue = true;
        System.out.println(Thread.currentThread().getName() + ": " + ++counter);
        notify();
    }
}
