package service;

import cache.ItemCache;
import dao.ItemDao;
import entity.Item;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class ItemService {
    private final ItemDao idao = new ItemDao();
    private static final AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("ItemCacheContext");
    private static final ItemCache ic = (ItemCache)context.getBean("cacheItem");
    public List<Item> get() {return new ArrayList<>(ic.items.values());
    }

    public Item getById(String id) {return ic.items.get(Integer.valueOf(id));
    }
}
