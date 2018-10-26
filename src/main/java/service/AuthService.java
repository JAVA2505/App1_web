package service;

import cart.CartItems;
import com.google.gson.Gson;
import dao.HUserDao;
import dao.UDaoInt;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.SpringContextHolder;

import java.util.Random;

@Service
public class AuthService {
    @Autowired
    private UDaoInt udao = new HUserDao();

    public boolean checkCredentials(String login, String pass1, String pass2, String phone, String city) {
        if (login.length() == 0 || pass1.length() == 0 || phone.length() == 0 || city.length() == 0) {
            return false;
        }
        if (!pass1.equals(pass2)) {
            return false;
        }
        return udao.getByLogin(login) == null;
    }

    public void addNewUser(String login, String pass, String phone, String city) {
        User u = (User) SpringContextHolder.getContext().getBean("user");
        u.setId(new Random().nextInt());
        u.setLogin(login);
        u.setPass(pass);
        u.setPhone(phone);
        u.setCity(city);
        u.setItems(((Gson) SpringContextHolder.getContext().getBean("gson")).toJson(new CartItems()));
        udao.add(u);
    }

    public User isUserRegistered(String login, String pass) {
        User out = udao.getByLogin(login);
        if (out == null) {
            return null;
        }
        if (!out.getPass().equals(pass)) {
            return null;
        }
        return out;
    }

    public void updateUser(User u) {
        udao.update(u);
    }


}
