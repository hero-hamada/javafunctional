package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
//        Function takes 1 arg
        int increment = incrementByOne(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);
        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println(addBy1AndThenMultiplyBy10.apply(1));
//        BiFunc
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 1000));
    }

    // <input, output>
    static Function<Integer, Integer> incrementByOneFunction = number -> number++;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> ++numberToIncrementByOne * numberToMultiplyBy;

    static int incrementByOne(int number) {
        return ++number;
    }
}
