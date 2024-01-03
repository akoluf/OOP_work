package Seminar3;

// Component.java
public class Component implements Comparable<Component>{
    private String name;
    private String weight;
    private int power;
    private int index;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                ", index=" + index +
                '}';
    }

    @Override
    public int compareTo(Component o) {
        return Integer.compare(this.power, o.power);
//        if (this.power > o.power) return -1;
//        if (this.power < o.power) return 1;
//        return 0;
    }
}
