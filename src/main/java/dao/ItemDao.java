package dao;

import entity.Item;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class ItemDao extends Dao {
    public List<Item> get() {
        List<Item> out = new LinkedList<>();
        try (Connection c = getConnection(); Statement st = c.createStatement()) {
            ResultSet rs = st.executeQuery("SELECT * FROM int_mag_items");
            while (rs.next()) {
                out.add(new Item(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("img"),
                        rs.getString("sImg"),
                        rs.getInt("price"),
                        rs.getString("cat"),
                        rs.getString("about")));
            }
        } catch (SQLException ex) {
            System.out.println("idao.get() problem");
        }
        return out;
    }

    public Item getById(String id) {

        Item i = null;
        try (Connection c = getConnection(); Statement st = c.createStatement()) {
            ResultSet rs = st.executeQuery("SELECT * FROM int_mag_items WHERE id = '" + id + "'");
            rs.next();
            i = new Item(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("img"),
                    rs.getString("sImg"),
                    rs.getInt("price"),
                    rs.getString("cat"),
                    rs.getString("about"));
        } catch (SQLException ex) {
            System.out.println("idao.get() problem");
        }

        return i;
    }
}
