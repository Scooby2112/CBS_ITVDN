package Java_JDBC_Hibernate.Lesson4.Task2;

public class Main {
    public static void main(String[] args) {
        AnimalRepository ar = new AnimalRepository();
        Animal animal = new Animal();

        animal.setAge(10);
        animal.setName("Nik");
        animal.setTail(true);

        ar.add(animal);
    }
}
