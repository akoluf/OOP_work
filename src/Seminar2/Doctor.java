package Seminar2;

import Seminar2.Animal;
import java.util.List;

public class Doctor implements AnimalTreatment, AnimalSurgery, AnimalVaccination, AnimalMonitoring {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        super();
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public void treatAnimal(Animal animal) {
        System.out.println(name + " лечит животное " + animal.getName());
    }

    @Override
    public void performSurgery(Animal animal) {
        System.out.println(name + " проводит операцию у животного " + animal.getName());
    }

    @Override
    public List<Animal> vaccinateAnimals(List<Animal> animals) {
        System.out.println(name + " прививает животных: " + animals);
        return animals;
    }

    @Override
    public void monitorPatient(Animal animal) {
        System.out.println(name + " наблюдает за пациентом " + animal.getName());
    }
}