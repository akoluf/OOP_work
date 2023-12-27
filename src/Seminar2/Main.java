package Seminar2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс main, содержащий основную точку входа программы.
 *
 * @author [Ваше имя]
 * @version 1.0
 */
public class Main {
    /**
     * Метод main, выполняемый при запуске программы.
     *
     * @param args массив аргументов командной строки (не используется в данной программе)
     */
    public static void main(String[] args) {
        /**
         * Создание объекта кота Барсика и вывод его информации.
         */
        Cat barsik = new Cat("Барсик", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Чумка", "Босс", 4);
        System.out.println(barsik);

        /**
         * Вывод количества ног у Барсика.
         */
        System.out.println("Количество ног у Барсика: " + barsik.getLegsCount());

        /**
         * Создание объекта птицы (орлицы) Кеша и вывод ее информации.
         */
        Animal eagle = new Eagle("Кеша", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Чумка", "Босс");

        /**
         * Создание списка животных и добавление в него Барсика и Кеши.
         */
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);

        /**
         * Создание объектов других животных: утки, птицы и рыбы.
         */
        Duck duck = new Duck("Дональд", LocalDate.of(1934, 5, 3), new ArrayList<>(), "Грипп", "Вальтер");
        Penguin penguin = new Penguin("Лоло", LocalDate.of(1987, 6, 26), new ArrayList<>(), "Грипп", "Геннадий");
        Fish fish = new Fish("Пепе", LocalDate.of(1997, 2, 6), new ArrayList<>(), "Грипп", "Харри");

        /**
         * Создание объекта ветеринарной клиники и добавление животных-пациентов.
         */
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(barsik, eagle, penguin, duck, fish);

        /**
         * Вывод информации о животных-пациентах ветеринарной клиники.
         */
        System.out.println("Животные-пациенты ветеринарной клиники: " + clinic.getPatients());

        /**
         * Вывод информации о животных, которым нужно обращаться на прием.
         */
        System.out.println("Животные, которым нужно обращаться на прием: " + clinic.getGoables());
    }
}