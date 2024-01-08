package Seminar4.list;
import java.util.Iterator;
public interface MyList <T extends Comparable<T>> extends Iterable<T> {
    void add(T element);
    void delete(int index);
    void delete(T element);

    T get(int index);

    int size();
    Iterator<T> iterator();
    void addFirst(T element);
    void addLast(T element);

}
