package Principal;

import Abstract.Hero;

import java.util.HashSet;
import java.util.function.Consumer;

public class DotaBase {
    private HashSet<User> users = new HashSet<User>();

    public DotaBase() {
    }


    public User buscarUser(String mail,String pass) {
        for (User user:users) {
            if (mail.equals(user.getMail()) && pass.equals(user.getPassword()))
                return user;
        }
        return null;
    }
    public void registrarUsuario(User user ) {
        users.add(user);
    }

}
