package ru.kpfu.itis.repository;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by etovladislav on 19.02.16.
 */
public class PostRepositoryTest {

   private PostRepository postRepository = new PostRepository();

    @Test
    public void testGetAllPosts() throws Exception {
        assertNull(postRepository.getAllPosts("etovladislav"));
    }
}