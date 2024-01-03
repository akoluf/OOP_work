package Seminar3;

// Pharmacy.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private int index;
    private List<Component> components;

    public Pharmacy() {
        index = 0;
        components = new ArrayList<>();
    }

    public void addComponents(Component... components) {
        if (components.length == 0) System.out.println("Вы ничего не добавили");
        else Collections.addAll(this.components, components);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }

    @Override
    public int compareTo(Pharmacy o) {
        if (this.components.size() < o.components.size()) return -1;
        if (this.components.size() > o.components.size()) return 1;

        for (int i = 0; i < this.components.size(); i++) {
            int result = this.components.get(i).compareTo(o.components.get(i));
            if (result != 0) return result;
        }

        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components);
    }
}

