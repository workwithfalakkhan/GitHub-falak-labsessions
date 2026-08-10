package com.practice.scalerlabsession.collection;

import java.util.*;

public class TestProgram {

    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Book("1", "Book1", 10.0, 10, "Author1"));
        itemList.add(new Clothing("2", "Clothing1", 20.0, 20, "Size1"));
        itemList.add(new Electronics("3", "Electronics1", 30.0, 30, 12));

        System.out.println("Before Sorting:");

        for(Item item:itemList){

            System.out.println(item);

        }

        Collections.sort(itemList);

        System.out.println("After Sorting:");

        for(Item item:itemList){

            System.out.println(item);

        }

        itemList.sort(Comparator.comparing(Item::getName));
    }
}
