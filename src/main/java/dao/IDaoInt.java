package dao;

import entity.Item;

import java.util.List;

public interface IDaoInt {
    List<Item> get();

    Item getById(String id);
}
