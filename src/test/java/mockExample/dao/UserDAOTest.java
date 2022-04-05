package mockExample.dao;

import mockExample.model.User;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class UserDAOTest {

    private UserDAO dao;
    Math math;

    @BeforeEach
    public void setUp() throws Exception {
        this.dao = new UserDAOImpl();
        math = mock(Math.class);
    }

    @Test
    void getUserByUsernameTest() throws Exception {
        User checkUser = dao.getUserByUsername("olesya@gmail.com");
        assertThat(checkUser).isNotNull();
        assertThat(checkUser.getUsername()).isEqualTo("olesya@gmail.com");
    }
}