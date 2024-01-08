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
        list2.add("Мороз и солнце; день чудесный!");
        list2.add("Еще ты дремлешь, друг прелестный —");
        list2.add("Пора, красавица, проснись:");
        list2.add("Открой сомкнуты негой взоры");
        list2.add("Навстречу северной Авроры,");
        list2.add("Звездою севера явись!");

        System.out.println("Initial list2: " + list2);
        list2.addFirst("Мороз и солнце");
        list2.addLast("Звездою севера явись!");
        System.out.println("After adding First and Last elements: " + list2);
        list2.delete(0);
        list2.delete(list2.size() - 1);
        System.out.println("List after removing the first and last elements: " + list2);
    }
}