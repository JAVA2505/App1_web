package cache;

import dao.ItemDao;
import entity.Item;
import spring.SpringContextHolder;

import java.util.List;

public class ItemCacheService {
    private static final Thread timer;
    private static final ItemDao idao = (ItemDao) SpringContextHolder.getContext().getBean("idao");

    static {
        timer = new Thread(() -> {
            while (true) {
                List<Item> items = idao.get();
                for (Item i : items) {
                    ItemCache.items.put(i.getId(), i);
                }
                System.out.println("Items updated");
                try {
                    Thread.sleep(300000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        timer.start();
    }

    public static boolean isTimerStarted() {
        return timer != null;
    }
}
