package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhNumValid(String phNum) {
        return phNum.startsWith("9");
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() >= 18;
    }

    public boolean isValid(Customer customer) {
        return (isEmailValid(customer.getEmail()) && isPhNumValid(customer.getPhNum()) && isAdult(customer.getDob()));
    }
}
