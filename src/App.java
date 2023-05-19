package src;
import src.classes.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) { // idk where to start (gab got sick today) ~gus 27/04
        User user = new User("John", "Doe", 25, "john@example.com", "123456789", true, false, 70.0, 180.0, "Type 1");
        printPersonDetails(user); // Polymorphism in action

    }

    public static void printPersonDetails(Person person) {
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Age: " + person.getAge());
    }
}
