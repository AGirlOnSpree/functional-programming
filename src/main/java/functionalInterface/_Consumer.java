package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer vinita = new Customer("Vinita", "9021427711");

        //Normal functions
        greetCustomer(vinita);

        //Consumer Functional interface
        greetCustomerConsumer.accept(vinita);

        assignActivityToConsumer.accept(vinita, new Activity("Badminton", "1 hour"));
    }

    //Consumer Function
    static Consumer<Customer> greetCustomerConsumer = customer -> {
        System.out.println("Welcome " + customer.name + " thanks for registering with phone num : " + customer.phNum);
    };

    //BiConsumer Function
    static BiConsumer<Customer, Activity> assignActivityToConsumer = (customer, activity) -> {
        System.out.println("Hi " + customer.name + " you have been assigned activity : " + activity.nameOfActivity);
    };


    static void greetCustomer(Customer customer) {
        System.out.println("Welcome " + customer.name + " thanks for registering with phone num : " + customer.phNum);
    }

    static class Customer {
        private final String name;
        private final String phNum;

        public Customer(String name, String phNum) {
            this.name = name;
            this.phNum = phNum;
        }
    }

    static class Activity {
        private final String nameOfActivity;
        private final String duration;

        public Activity(String nameOfActivity, String duration) {
            this.nameOfActivity = nameOfActivity;
            this.duration = duration;
        }
    }
}
