package Java_4_Advanced.Lesson9.Task3;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Operation add = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        System.out.println("Enter first number");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Choice operation");
        String op = br.readLine();

        while (!op.equalsIgnoreCase("q")) {
            if (op.equals("+")) {
                int resultAdd = add.calculate(a, b);
                System.out.println(a + " + " + b + " = " + resultAdd);
                break;
            } else if (op.equals("-")) {
                int resultSub = sub.calculate(a, b);
                System.out.println(a + " - " + b + " = " + resultSub);
                break;
            } else if (op.equals("*")) {
                int resultMul = mul.calculate(a, b);
                System.out.println(a + " * " + b + " = " + resultMul);
                break;
            } else if (op.equals("/")) {
                try {
                    double resultDiv = div.calculate(a, b);
                    System.out.printf(a + " / " + b + " = " + resultDiv);
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("division by zero!");
                    break;
                }
            }else {
                System.out.println("Error! Select the correct operation or enter (q) to exit");
                op = br.readLine();
            }
        }
    }

}

@FunctionalInterface
interface Operation{
    int calculate(int a, int b);
}
