package Seminar2;

public class Nurse extends VeterinaryClinic implements AnimalFeeding, AnimalCleaning, AnimalBandageChanging {
    private String name;
    private String specialization;

    public Nurse(String name, String specialization) {
        super();
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public void feedAnimal(Animal animal) {
        System.out.println(name + " кормит животное " + animal.getName());
    }

    @Override
    public void cleanAnimal(Animal animal) {
        System.out.println(name + " очищает животное " + animal.getName());
    }

    @Override
    public void changeBandage(Animal animal) {
        System.out.println(name + " меняет повязку у животного " + animal.getName());
    }
}