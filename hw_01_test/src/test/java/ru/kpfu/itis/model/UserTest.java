package ru.kpfu.itis.model;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by etovladislav on 26.02.16.
 */
public class UserTest {
    private static final User user = new User();

    @BeforeClass
    public static void setUpUser() {
        user.setFirstName("Vladislav");
        user.setLogin("etovladislav");
        user.setEmail("etovladislav@yandex.ru");
        user.setAboutUser("I'm man");
        user.setLastName("Ulyanov");
    }

    @Test
    public void testSetName() {
        String name = user.getFirstName();
        assertEquals(name,"Vladislav");
    }

    @Test
    public void testSetLogin() {
        String login = user.getLogin();
        assertEquals(login,"Vladislav");
    }

    @Test
    public void testSetEmail() {
        String email = user.getEmail();
        assertEquals(email,"etovladislav@yandex.ru");
    }

    @Test
    public void testSetAboutUser() {
        String about = user.getAboutUser();
        assertEquals(about,"I'm man");
    }

    @Test
    public void testSetLastName() {
        String lastName = user.getLastName();
        assertEquals(lastName,"Ulyanov");
    }
}