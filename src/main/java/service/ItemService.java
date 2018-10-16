package service;

import dao.ItemDao;
import entity.Item;

import java.util.List;

public class ItemService {
    private final ItemDao idao = new ItemDao();

    public List<Item> get() {
        return idao.get();
    }

    public Item getById(String id) {
        return idao.getById(id);
    }
}
