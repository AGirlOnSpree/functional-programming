package functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(sup.get());
    }

    static Supplier<String> sup = () -> "Hello There";
}
