package mockExample.dao;

import mockExample.model.User;

import java.util.List;

public interface UserDAO {

    User getUserByUsername(String username) throws Exception;

    List<User> findAllUsers();
}