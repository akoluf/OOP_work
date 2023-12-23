package Seminar1.ex2;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Animal {
    protected String name; // кличка
    protected String color; // окрас
    protected LocalDate birthDate; // дата рождения
    protected List<String> vaccinations; // список прививок
    protected List<String> illnesses; // список болезней
    protected String ownerName; // имя владельца

    public Animal(String name, String color, LocalDate birthDate, List<String> vaccinations, List<String> illnesses, String ownerName) {
        this.name = name;
        this.color = color;
        // this.legs = legs; // количество лап
        this.birthDate = birthDate;
        this.vaccinations = vaccinations != null ? vaccinations : new ArrayList<>();
        this.illnesses = illnesses != null ? illnesses : new ArrayList<>();
        this.ownerName = ownerName;
    }

    public Animal(String name, String color, LocalDate birthDate, List<String> vaccinations) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void addVaccination(String vaccination) {
        this.vaccinations.add(vaccination);
    }

    public List<String> getIllnesses() {
        return illnesses;
    }

    public void addIllness(String illness) {
        this.illnesses.add(illness);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBirthDateAsString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return birthDate.format(formatter);
    }

    public void toGo() {
        System.out.println(getName() + " Не летает, может ходить и если очень нужно - плавать.");
    }

    public void fly() {
        System.out.println(getName() + " летает.");
    }

    public void swim() {
        System.out.println(getName() + " плавает.");
    }
}