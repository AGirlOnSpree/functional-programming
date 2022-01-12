package combinatorPattern;

import java.time.LocalDate;

public class Customer {

    private final String name;
    private final String email;
    private final String phNum;
    private final LocalDate dob;

    public Customer(String name, String email, String phNum, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phNum = phNum;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhNum() {
        return phNum;
    }

    public LocalDate getDob() {
        return dob;
    }
}
