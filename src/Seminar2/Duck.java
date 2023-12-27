package Seminar2;

import Seminar2.Animal;
import Seminar2.Flyble;
import Seminar2.Goable;
import Seminar2.Swimble;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Goable, Flyble, Swimble {
    public Duck(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        super(name, birthDate, vaccination, illness, ownerName);
    }


    @Override
    public double fly() {
        System.out.printf("%s flying", type);
        return 10.0;
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 5.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);
        return 10.0;
    }
}
