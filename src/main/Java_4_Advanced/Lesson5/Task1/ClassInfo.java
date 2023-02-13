package main.Java_4_Advanced.Lesson5.Task1;

import java.lang.reflect.Member;
import java.util.Scanner;

public class ClassInfo {
    public static void main(String[] args) {
        System.out.println("Enter class name:");
        try {
            Class<?> cl = Class.forName(new Scanner(System.in).nextLine());
            System.out.println(cl);
            classInfo(cl.getFields());
            classInfo(cl.getConstructors());
            classInfo(cl.getMethods());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Unknown class! Please try again :)");
        }
    }
    private static void classInfo(Member[] members){
        for (int i = 0; i < members.length; i++) {
            if (members[i].getDeclaringClass() == Object.class)
                continue;
            String declaring = members[i].toString();
            System.out.println("    ");
            System.out.println(declaring);
        }
    }
}
