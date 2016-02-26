package ru.kpfu.itis.repository;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;

/**
 * Created by etovladislav on 23.02.16.
 */
public class CheckUserRepositoryTest {

    private CheckUserRepository checkUserRepository = new CheckUserRepository();

    @Test
    public void testCheckUserExists() throws Exception {
        assertFalse(checkUserRepository.checkUserExists("admin"));
    }
}