package Web_Services.Lesson3.Task1;

import Web_Services.Lesson2.Task1.Beers;

import javax.xml.xpath.XPathExpressionException;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws XPathExpressionException, FileNotFoundException {
        MyXPath myXPath = new MyXPath();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть операцію (1, 2, 3): ");
        System.out.println("[1] = getAllV1 \n[2] = getAllV2 \n[3] = getAllV3");

        int choice = scanner.nextInt();

        switch (choice){
            case 1 :
                List<Beers> beersList = myXPath.getAll();
                for (Beers beers : beersList){
                    System.out.println(beers);
                }
                break;
            case 2:
                myXPath.getAllV2();
                break;
            case 3:
                myXPath.getAllV3();
                break;
        }
    }
}
