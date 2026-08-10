package com.practice.scalerlabsession.collection.InventoryManagement;

import com.practice.scalerlabsession.collection.Item;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {

    private LinkedList<Item> items;
    private Integer MAX_ITEMS = 10;

    public RecentlyViewedItems() {
        this.items = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item){
        if(items.size() >= MAX_ITEMS){
            items.removeLast();
        }
        items.addFirst(item);
    }

    public List<Item> getRecentlyViewedItems(){
        return new ArrayList<>(items);
    }
}
