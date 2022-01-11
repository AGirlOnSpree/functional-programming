package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        //Predicate calling
        System.out.println(isValidNum.test("07000094567"));

        //Combining 2 predicates
        System.out.println(isValidNum.and(containsNum3).test("07000094567"));

        //Calling a BiPredicate
        System.out.println(justComparing.test("vinita", "vinita"));
    }

    static Predicate<String> isValidNum = phNum -> phNum.startsWith("07") && phNum.length() == 11;

    static Predicate<String> containsNum3 = phNum -> phNum.contains("3");

    static BiPredicate<String, String> justComparing = String::equals;
}
