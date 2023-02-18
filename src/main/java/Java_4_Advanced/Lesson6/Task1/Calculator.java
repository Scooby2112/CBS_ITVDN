package Java_4_Advanced.Lesson6.Task1;

/**
 * @author Volodymyr Plemennyk
 */

public class Calculator {
    /**
     * Field firstNum
     */
    public int firstNum;
    /**
     * Field secondNum
     */
    public int secondNum;

    /**
     * Constructor
     *
     * @param firstNum  перший параметр
     * @param secondNum другий параметр
     */
    public Calculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    /**
     * Method addition
     *
     * @param fistNum   перший аргумент
     * @param secondNum другий аргумент
     * @return повертає суму двох аргументів
     */
    @CalculateAnno(fistNum = 10, secondNum = 20)
    public int add(int fistNum, int secondNum) {
        return fistNum + secondNum;
    }

    /**
     * Method subtraction
     *
     * @param firstNum  перший аргумент
     * @param secondNum другий аргумент
     * @return повертає різницю двох аргументів
     */

    @CalculateAnno(fistNum = 10, secondNum = 20)
    public int sub(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    /**
     * Method multiplication
     *
     * @param firstNum  пергий аргумент
     * @param secondNum другий аргумент
     * @return повертає добуток двох аргументів
     */
    @CalculateAnno(fistNum = 10, secondNum = 20)
    public int mul(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    /**
     * Method division
     *
     * @param firstNum  перший аргумент
     * @param secondNum другий аргумент
     * @return повертає частку двох аргументів
     */
    @CalculateAnno(fistNum = 10, secondNum = 20)
    public int div(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
}
