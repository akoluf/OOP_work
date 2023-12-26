package Seminar1.ex2;
import java.time.LocalDate;
import java.util.ArrayList;
public class Fish extends Animal {
    public Fish(String name, String color, LocalDate birthDate) {
        super(name, color, birthDate, new ArrayList<>(), new ArrayList<>(), null);
    }

    @Override
    public void swim() {
        super.swim();
    }

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Color: " + getColor());
        System.out.println("Birth Date: " + getBirthDateAsString());
    }
}
