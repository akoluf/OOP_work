package Seminar2;

import Seminar2.Animal;
import Seminar2.Goable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    private Doctor doctor;
    private Nurse nurse;

    public VeterinaryClinic() {
        this.doctor = doctor;
        this.nurse = nurse;
    }

    public void addPatient(Animal animal){
        patients.add(animal);
    }
    public void addPatients(Animal ... animals){
        Collections.addAll(patients, animals);
    }
    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }
    // Получение списка летающих животных (реализуют интерфейс Flyable)
    public List<Flyble> getFlyables(){
        List<Flyble> result = new ArrayList<>();
        for (Animal animal:patients) {
            if(animal instanceof Flyble)
                result.add((Flyble) animal);
        }
        return result;
    }
    // Получение списка плавающих животных (реализуют интерфейс Swimable)
    public List<Swimble> getSwimables(){
        List<Swimble> result = new ArrayList<>();
        for (Animal animal:patients) {
            if(animal instanceof Swimble)
                result.add((Swimble) animal);
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }
    // Лечение животного врачом
    public void doctorTreatment(Animal animal) {
        doctor.treatAnimal(animal);
    }

    // Проведение операции у животного врачом
    public void doctorSurgery(Animal animal) {
        doctor.performSurgery(animal);
    }

    // Прививка животных врачом
    public void doctorVaccinate(List<Animal> animals) {
        doctor.vaccinateAnimals(animals);
    }

    // Питание животного медицинским работником (неврачом)
    public void nurseFeedAnimal(Animal animal) {
        nurse.feedAnimal(animal);
    }

    // Очистка животного медицинским работником (неврачом)
    public void nurseCleanAnimal(Animal animal) {
        nurse.cleanAnimal(animal);
    }

    // Замена повязки животным медицинским работником (неврачом)
    public void nurseChangeBandage(Animal animal) {
        nurse.changeBandage(animal);
    }
}
