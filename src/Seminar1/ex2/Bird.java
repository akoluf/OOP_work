package Seminar1.ex2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bird extends Animal {
    public Bird(String name, String color, LocalDate birthDate) {
        super(name, color, birthDate, new ArrayList<>(), new ArrayList<>(), null);
    }

    @Override
    public void fly() {
        super.fly();
    }

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Color: " + getColor());
        System.out.println("Birth Date: " + getBirthDateAsString());
    }
}
