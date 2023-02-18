package Java_4_Advanced.Lesson6.Task1;

/**
 * @author Volodymyr Plemennyk
*/

public @interface CalculateAnno {
    /**
     * FirstNum
     * @return повертає перший аргумент
     */
    int fistNum() default 0;

    /**
     * SecondNum
     * @return повертає другий аргумент
     */
    int secondNum() default 0;
}
