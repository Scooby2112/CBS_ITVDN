package Java_4_Advanced.Lesson3.Task2;

public class Main {
    public static void main(String[] args) {
        String sentences = "Импала, также называемая Деткой — автомобиль Дина торговой марки Chevrolet Impala, переданный ему его отцом Джоном.";

        String firstPart = sentences.substring(0, sentences.length() / 2 + 1);
        String secondPart = sentences.substring(sentences.length() / 2 + 1);
        System.out.println(firstPart);
        System.out.println(secondPart);


    }
}
