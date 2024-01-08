package Seminar4;

import Seminar4.list.MyArrayList;
import Seminar4.list.MyLinkedList;
import Seminar4.list.MyList;

public class Main {
    public static void main(String[] args) {
        // MyArrayList
        MyList<String> list1 = new MyArrayList<>();
        list1.add("20");
        list1.add("30");
        list1.add("50");
        list1.add("60");
        list1.add("85");
        list1.add("85");
        list1.add("BAbushKa");

        System.out.println("Initial list1: " + list1);
        list1.addFirst("200");
        list1.addLast("900");
        System.out.println("After adding First and Last elements: " + list1);
        list1.delete("85");
        System.out.println("After removing an element: " + list1);
        list1.delete("50");
        System.out.println("After removing another element: " + list1);
        System.out.println("Last element: " + list1.get(list1.size() - 1));
        list1.delete(list1.size() - 1);
        System.out.println("List after removing the last element: " + list1);

        // MyLinkedList
        MyList<String> list2 = new MyLinkedList<>();
        list2.add("Еще ты дремлешь, друг прелестный —");
        list2.add("Пора, красавица, проснись:");
        list2.add("Открой сомкнуты негой взоры");
        list2.add("Навстречу северной Авроры,");

        System.out.println("Первоначальный: " + list2);
        list2.addFirst("Мороз и солнце, День чудесный");
        list2.addLast("Звездою севера явись!");
        System.out.println("С добавлением: " + list2);
        System.out.println(list2.get(3));
        list2.delete(0);
        System.out.println(list2);
    }
}