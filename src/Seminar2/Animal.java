package Seminar2;

/**
 * Абстрактный класс Animal представляет животное с определенными атрибутами и методами.
 *
 * @author [Akoluf]
 * @version 1.0
 */

import java.time.LocalDate;
import java.util.List;

/**
 * Абстрактный класс Animal представляет животное с определенными атрибутами и методами.
 *
 * @author [Ваше имя]
 * @version 1.0
 */
public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccination;
    protected String illness;
    protected String ownerName;
    protected String type;

    /**
     * Конструктор класса Animal.
     *
     * @param name          имя животного
     * @param birthDate     дата рождения животного
     * @param vaccination   список вакцин, которыми животное было привито
     * @param illness       информация о болезни (если есть)
     * @param ownerName     имя владельца животного
     */
    public Animal(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccination = vaccination;
        this.illness = illness;
        this.ownerName = ownerName;
        this.type = getClass().getSimpleName();
    }

    /**
     * Методы getter для получения значений атрибутов животного.
     */
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccination() {
        return vaccination;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Частные методы, описывающие поведение животного (пробуждаться, есть, играть, спать).
     */
    private void wakeUp() {
        System.out.println("Животное просыпается");
    }

    private void wakeUp(int time) {
        System.out.println("Животное просыпается в " + time);
    }

    private void eat() {
        System.out.println("Животное ест");
    }

    private void play() {
        System.out.println("Животное играет");
    }

    private void sleep() {
        System.out.println("Животное спит");
    }

    /**
     * Абстрактный метод lifeCircle.
     */
    // public abstract void lifeCircle();

    /**
     * Метод toString для получения строкового представления объекта Animal.
     *
     * @return строковое представление объекта Animal
     */
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccination=" + vaccination +
                ", illness='" + illness + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}