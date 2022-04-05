package mockExample.services;

import mockExample.dao.UserDAO;
import mockExample.model.User;

public class UserService {

    private UserDAO dao;

    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    public boolean checkUserPresence(User user) throws Exception {
        User u = dao.getUserByUsername(user.getUsername());

        return u != null;
    }

}
