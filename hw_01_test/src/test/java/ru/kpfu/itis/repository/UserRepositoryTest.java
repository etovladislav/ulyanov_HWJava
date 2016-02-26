package ru.kpfu.itis.repository;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by etovladislav on 19.02.16.
 */
public class UserRepositoryTest {

    private UserRepository userRepository = new UserRepository();

    @Test
    public void testFindUserByLogin() throws Exception {
        assertNull(userRepository.findUserByLogin("admin"));
    }

    @Test
    public void testGetAllUsers() throws Exception {
        assertNotEquals(userRepository.getAllUsers().size(),0);
    }


    @Test
    public void testSearchUsers() throws Exception {
        assertNull(userRepository.searchUsers("admin"));
    }

}