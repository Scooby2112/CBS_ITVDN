package Java_4_Advanced.Lesson8.Task3;

public class Main {
    public static void main(String[] args) {
        Synchronize s = new Synchronize();
        FirstClass firstClass = new FirstClass(s, 5);
        SecondClass secondClass = new SecondClass(s, 5);

        firstClass.setName("First");
        secondClass.setName("Second");

        firstClass.start();
        secondClass.start();
    }
}
