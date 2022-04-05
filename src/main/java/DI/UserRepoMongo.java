package DI;

class User {

}

interface UserRepository {

    default User getUser() {
        return new User();
    };
}

class UserRepoMongo implements UserRepository {

    @Override
    public User getUser() {
        System.out.println("Mongo DB user get");
        return UserRepository.super.getUser();
    }
}

class UserRepoPostgres implements UserRepository {

    @Override
    public User getUser() {
        System.out.println("PostgreSQL DB user get");
        return UserRepository.super.getUser();
    }
}
class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void userFilter(int age) {
        User user = userRepository.getUser();
        System.out.println(user);
    }

}

class Demo {
    public static void main(String[] args) {
        UserService userService = new UserService(new UserRepoPostgres());
        userService.userFilter(16);

    }
}

