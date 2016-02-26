package ru.kpfu.itis.repository;


import org.testng.annotations.Test;
import ru.kpfu.itis.model.User;

import static org.testng.Assert.assertNull;


/**
 * Created by etovladislav on 23.02.16.
 */
public class RegistrationUserRepositoryTest {
    private RegistrationUserRepository registrationUserRepository = new RegistrationUserRepository();
    private UserRepository userRepository = new UserRepository();

    @Test
    public void testRegistrationUser() throws Exception {
        User user = new User();
        user.setFirstName("admin");
        user.setLastName("admin");
        user.setAboutUser("Bla bla bla");
        user.setEmail("etovladislav@yandex.ru");
        user.setLogin("admin");
        user.setPassword("qwertyqwerty");
        registrationUserRepository.registrationUser(user);
        assertNull(userRepository.searchUsers("admin"));
    }
}