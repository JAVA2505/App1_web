package service;

import cache.ItemCache;
import entity.Item;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ItemService {

    public ItemService() {
        System.out.println("iserv");
    }

    public List<Item> get() {
        return new ArrayList<>(ItemCache.items.values());
    }

    public Item getById(String id) {
        return ItemCache.items.get(Integer.valueOf(id));
    }

    public List<Item> getByWord(String q) {
        List<Item> out = new LinkedList<>();
        for (Item i : ItemCache.items.values()) {
            if (i.getName().toLowerCase().contains(q.toLowerCase()) || i.getAbout().toLowerCase().contains(q.toLowerCase())) {
                out.add(i);
            }
        }
        return out;
    }
}
