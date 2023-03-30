package Java_JDBC_Hibernate.Lesson4.Task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalRepository ar = new AnimalRepository();
        Animal animal = new Animal();

//        animal.setAge(15);
//        animal.setName("Tomas");
//        animal.setTail(false);
//
//        ar.add(animal);

//        List<Animal> animalList = ar.getAnimalList();
//
//        for (Animal animal1 : animalList){
//            System.out.println(animal1.getId() + " " + animal1.getName() + " " + animal1.getAge());
//    }

//        ar.remove(animal);

        ar.getByID(3);
    }
}
