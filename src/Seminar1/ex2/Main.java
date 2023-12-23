package Seminar1.ex2;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        List<String> vaccinations = new ArrayList<>();
        vaccinations.add("Бешенство");
        vaccinations.add("Кошачий лейкоз");

        List<String> illnesses = new ArrayList<>();
        illnesses.add("Инфекция верхних дыхательных путей");
        illnesses.add("Кошачья астма");

        Cat cat = new Cat("Mimi", "black and white", LocalDate.of(2014, 6, 15), vaccinations, illnesses, "John Doe", 4);

        System.out.println("Name: " + cat.getName());
        System.out.println("Color: " + cat.getColor());
        System.out.println("Birth Date: " + cat.getBirthDateAsString());
        System.out.println("Vaccinations: " + cat.getVaccinations());
        System.out.println("Illnesses: " + cat.getIllnesses());
        System.out.println("Owner Name: " + cat.getOwnerName());
        System.out.println("Legs Count: " + cat.getLegsCount());
        System.out.println("___________________________________");

        Bird bird = new Bird("Amy", "white", LocalDate.of(2021, 5, 1));
        bird.printInfo(); // bird будет печатать свою информацию и указывать, что летит

        System.out.println("___________________________________");

        Fish fish = new Fish("Nemo", "orange", LocalDate.of(2021, 6, 1));
        fish.printInfo();

        System.out.println("___________________________________");

        bird.fly(); // bird будет летать
        fish.swim(); // fish будет плавать

        cat.toGo();
    }
}