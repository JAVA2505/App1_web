package cache;

import dao.ItemDao;
import entity.Item;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ItemCacheService {
    private static final Thread timer;
    private static final ItemDao idao = new ItemDao();

    static {
        timer = new Thread(() -> {
            AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("ItemCacheContext");
            ItemCache ic = (ItemCache)context.getBean("cacheItem");
            while (true) {
                List<Item> items = idao.get();
                for (Item i : items) {
                    ic.items.put(i.getId(), i);
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
