package service;

import cache.ItemCache;
import dao.ItemDao;
import entity.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemService {
    private final ItemDao idao = new ItemDao();

    public List<Item> get() {
        return new ArrayList<>(ItemCache.items.values());
    }

    public Item getById(String id) {
        return ItemCache.items.get(Integer.valueOf(id));
    }
}
