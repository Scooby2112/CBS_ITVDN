package Java_JDBC_Hibernate.Lesson4.Task1;

import Java_JDBC_Hibernate.Lesson4.Task1.Entity.Book;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookHelper bk = new BookHelper();
        String[] bookName = {"The Tragedy of Hamlet", "Romeo and Juliet"};

//        for (String name : bookName){
//            Book book = new Book();
//            book.setName(name);
//            bk.addBook(book);
//        }

//        Book book = bk.getBookByID(2);
//        System.out.println(book.getName());

        List<Book> bookList = bk.getBookList();

        for (Book book : bookList){
            System.out.println(book.getId() + " " + book.getName());
        }
    }
}
