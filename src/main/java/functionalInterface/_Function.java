package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(0));
        System.out.println(incrementByOneFunction.apply(1));
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(addBy1AndThenMultiplyBy10.apply(3));
        System.out.println(multiply2NumbersFunction.apply(2, 5));
    }

    static Function<Integer, Integer> incrementByOneFunction = num -> ++num;

    static Function<Integer, Integer> multiplyByTenFunction = num -> num * 10;

    static BiFunction<Integer, Integer, Integer> multiply2NumbersFunction = (num1, num2) -> num1 * num2;

    static int increment(int num) {
        return num + 1;
    }
}
