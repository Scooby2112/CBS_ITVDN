package main.Java_4_Advanced.Lesson6.Task2;

public class HeadMain extends Main{
    public static void main(String[] args) {
        HeadMain headMain = new HeadMain();
        System.out.println("Name: " + headMain.getName());
        System.out.println("Ability: " + headMain.getAbility());
    }
    public String getName(){
        return HeadMain.class.getAnnotation(CartoonCharacter.class).name();
    }
    public String getAbility(){
        return HeadMain.class.getAnnotation(CartoonCharacter.class).ability();
    }
}
