package Java_JDBC_Hibernate.Lesson1.Task2;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sample sample = new Sample();

//                                            FIRST
//                                              |
//                                              v
        List<ContactDetails> contactDetails = sample.getContactDetails();
        for (ContactDetails contactDetails1 : contactDetails){
            System.out.println(contactDetails1.lastName() + " " + contactDetails1.firstName() +
                    " " + contactDetails1.phone() + " " + contactDetails1.location());
        }

//                                            SECOND
//                                              |
//                                              v
        contactDetails = sample.getContactDetails2();
        for (ContactDetails contactDetails1 : contactDetails){
            System.out.println(contactDetails1.lastName() + " " + contactDetails1.firstName() +
                    " " + contactDetails1.phone() + " " + contactDetails1.date());
        }

//                                            THIRD
//                                              |
//                                              v
        contactDetails = sample.getContactDetails3();
        for (ContactDetails contactDetails1 : contactDetails){
            System.out.println(contactDetails1.lastName() + " " + contactDetails1.firstName() +
                    " " + contactDetails1.phone() + " " + contactDetails1.date());
        }
    }
}
