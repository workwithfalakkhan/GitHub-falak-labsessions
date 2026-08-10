package com.practice.scalerlabsession.collection.InventoryManagement;

import com.practice.scalerlabsession.collection.Item;

import java.util.Collection;
import java.util.HashMap;

public class Inventory<T extends Item>  {

    HashMap<String,T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void addItem(T item){
        if(item.getQuantity() < 0){
            throw new IllegalArgumentException("Invalid quantity");
        }
        if(items.containsKey(item.getId())){
            throw new IllegalArgumentException("Item already exists");
        }
        items.put(item.getId(),item);
    }

    public void removeItem(String id){

        items.remove(id);
    }

    public T getItem(String id){
        return items.get(id);
    }

    public Collection<T> getAllItems(){
         return items.values();
    }
}
