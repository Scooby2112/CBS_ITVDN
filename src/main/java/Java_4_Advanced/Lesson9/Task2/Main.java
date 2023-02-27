package Java_4_Advanced.Lesson9.Task2;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Hajime Isayama", "Attack on Titan", 2009);
        Interface interface1 = new Interface() {
            @Override
            public void show() {
                System.out.println("Anon class: \n" + book);
            }
        };
        interface1.show();

        Interface interface2 = () -> System.out.println("Lambda: \n" + book);
        interface2.show();
    }
}
