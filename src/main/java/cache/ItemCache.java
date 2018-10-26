package cache;

import entity.Item;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ItemCache {
    public static final Map<Integer, Item> items = new ConcurrentHashMap<>();
}
