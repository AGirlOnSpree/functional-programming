package finalSection;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        hello("Vinita", "Jain", null);
        hello("Anoop", null, name -> System.out.println("Last name not provided for " + name));
        hello2("Jasmine", "Lagashu", null);
        hello2("Anmol", null, () -> System.out.println("Last name not provided"));

    }

    static void hello(String firstName, String lastName, Consumer<String> callBack) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callBack.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callBack) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callBack.run();
        }
    }
}
