package Seminar1.ex2;

import java.util.List;
import java.awt.*;
import java.time.LocalDate;

public class Cat extends Animal {
    private String legsCount; // Изменили тип на String

    public Cat(String name, String color, LocalDate birthDate, List<String> vaccinations, List<String> illnesses, String ownerName, int legsCount) {
        super(name, color, birthDate, vaccinations, illnesses, ownerName);
        this.legsCount = String.valueOf(legsCount); // Передали строку в конструктор
    }

    public String getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = String.valueOf(legsCount);
    }

    public String getLegsCountAsString() {
        return legsCount;
    }

    @Override
    public void toGo() {
        System.out.println(getName() + " Не летает, только ходит и если очень нужно - плавает.");
    }
}
