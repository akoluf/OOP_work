package Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class PharmacyMain {
    public static void main(String[] args) {
        Component penicillin = new Component("Penicillin", "10mg", 100);
        Component aspirin = new Component("Aspirin", "20mg", 80);
        Component solt = new Component("Solt", "20mg", 10);
        Component sugar = new Component("Sugar", "87gr", 80);
        Component ibuprofen = new Component("Ibuprofen", "200mg", 150);
        Component paracetamol = new Component("Paracetamol", "500mg", 100);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(solt, penicillin);

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponents(sugar, penicillin);

        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponents(sugar, penicillin);

        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponents(aspirin);

        Pharmacy pharmacy5 = new Pharmacy();
        pharmacy5.addComponents(sugar, ibuprofen);

        Pharmacy pharmacy6 = new Pharmacy();
        pharmacy6.addComponents(sugar, ibuprofen);

        Pharmacy pharmacy7 = new Pharmacy();
        pharmacy7.addComponents(solt, paracetamol);

        Pharmacy pharmacy8 = new Pharmacy();
        pharmacy8.addComponents(aspirin, sugar);

        // Создаем множество уникальных объектов Pharmacy
        Set<Pharmacy> result = new HashSet<Pharmacy>(Arrays.asList(pharmacy1, pharmacy2, pharmacy3, pharmacy4, pharmacy5, pharmacy6, pharmacy7, pharmacy8));
        System.out.println("Количество уникальных экземпляров Pharmacy: " + result.size());

        // Отсортировать список компонентов в каждом Pharmacy по мощи
        List<Component> list = new ArrayList<>();
        list.add(penicillin);
        list.add(solt);
        list.add(sugar);
        list.add(aspirin);
        list.add(ibuprofen);
        list.add(paracetamol);

        Collections.sort(list);
        System.out.println("Отсортированный список компонентов: " + list);
    }
}