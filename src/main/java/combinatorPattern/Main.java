package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.CustomerRegistrationValidator.*;
import static combinatorPattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Vinita",
                "vinijain94gmail.com",
                "89021111111",
                LocalDate.of(2019, 05, 11));

//        System.out.println(new CustomerValidatorService().isValid(customer));

        //Using Combinator Pattern

        ValidationResult result = isEmailValid()
                .and(isAdult())
                .and(isPhNumValid())
                .apply(customer);

        System.out.println(result);

        if (result != SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
