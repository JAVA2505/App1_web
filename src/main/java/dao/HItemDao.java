package dao;

import entity.Item;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class HItemDao implements IDaoInt {
    public List<Item> get() {
        List<Item> out;
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        out = s.createCriteria(Item.class).list();
        s.close();
        return out;
    }

    public Item getById(String id) {
        Item i;
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        i = (Item) s.createQuery("FROM Item WHERE id=" + id).uniqueResult();
        s.close();
        return i;
    }
}
