package combinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Vinita",
                "vinijain94@gmail.com",
                "9021111111",
                LocalDate.of(1994, 05, 11));

        System.out.println(new CustomerValidatorService().isValid(customer));

    }
}
