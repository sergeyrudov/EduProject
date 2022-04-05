package mockExample.dao;

import mockExample.model.User;

import java.util.Arrays;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    private List<User> users;

    public UserDAOImpl() {
        this.users = Arrays.asList(
                new User("olesya@gmail.com", "GUEST"),
                new User("kirill@gmail.com", "USER"),
                new User("remy@gmail.com", "ADMIN")
        );
    }

    @Override
    public User getUserByUsername(String username) throws Exception {
        return users.stream().filter(u -> u.getUsername().equals(username))
                .findAny().orElse(null);
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}