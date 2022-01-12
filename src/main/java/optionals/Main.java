package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable("hello")
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Empty String")
                );
    }
}
