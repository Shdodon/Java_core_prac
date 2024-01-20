package lesson1;

import lesson1.other_pack.Decorator;
import lesson1.other_pack.MathMethods;

/**
 * Hello WORLD!!!
 */
public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int result = MathMethods.sum(4,2);
        System.out.println(Decorator.decorate(result));

       result = MathMethods.subtrac(4,2);
        System.out.println(Decorator.decorate(result));

        result = MathMethods.div(4,2);
        System.out.println(Decorator.decorate(result));

        result = MathMethods.mult(4,2);
        System.out.println(Decorator.decorate(result));

    }
}
