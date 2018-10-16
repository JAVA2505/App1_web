package dao;

import entity.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao extends Dao {

    public User getByLogin(String login) {
        User out = null;
        try (Connection c = getConnection(); Statement st = c.createStatement()) {
            ResultSet rs = st.executeQuery("SELECT * FROM AAAuser WHERE login='" + login + "'");
            rs.next();
            out = new User(rs.getInt("id"),
                    rs.getString("login"),
                    rs.getString("pass"),
                    rs.getString("phone"),
                    rs.getString("city"),
                    rs.getString("items"));
        } catch (SQLException ex) {
            System.out.println("====Result set is empty");
        }
        return out;
    }

    public void add(User u) {
        try (Connection c = getConnection();
             Statement st = c.createStatement()) {
            st.executeUpdate("INSERT INTO AAAuser VALUES(" + u.getId() + ", '" + u.getLogin() + "', '" + u.getPass() + "', '" + u.getPhone() + "', '" + u.getCity() + "', '" + u.getItems() + "')");
        } catch (SQLException ex) {
            System.out.println("====User not added");
        }
    }

    public void update(User u) {
        try (Connection c = getConnection();
             Statement st = c.createStatement()) {
            st.executeUpdate("UPDATE AAAuser SET items='" + u.getItems() + "' WHERE id=" + u.getId());
        } catch (SQLException ex) {
            System.out.println("====User not updated");
        }
    }
}
