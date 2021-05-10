package com.harry.demo.film;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilmTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldShowSimpleAssertion() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void testGetTitle() {
        Film film = new Film("Epic Film","Epic description",2021L,120L);
        Assertions.assertTrue(film.getTitle() == "Epic Film");
    }

    @Test
    public void testSetTitle() {
        Film film = new Film();
        film.setTitle("Epic Film");
        Assertions.assertTrue(film.getTitle() == "Epic Film");
    }

    @Test
    public void testGetDescription() {
        Film film = new Film("Epic Film","Epic description",2021L,120L);
        Assertions.assertTrue(film.getDescription() == "Epic description");
    }

    @Test
    public void testSetDescription() {
        Film film = new Film();
        film.setDescription("Epic description");
        Assertions.assertTrue(film.getDescription() == "Epic description");
    }

    @Test
    public void testGetReleaseYear() {
        Film film = new Film("Epic Film","Epic description",2021L,120L);
        Assertions.assertTrue(film.getReleaseYear() == 2021L);
    }

    @Test
    public void testSetReleaseYear() {
        Film film = new Film();
        film.setReleaseYear(2021L);
        Assertions.assertTrue(film.getReleaseYear() == 2021L);
    }

    @Test
    public void testGetLength() {
        Film film = new Film("Epic Film","Epic description",2021L,120L);
        Assertions.assertTrue(film.getLength() == 120L);
    }

    @Test
    public void testSetLength() {
        Film film = new Film();
        film.setLength(120L);
        Assertions.assertTrue(film.getLength() == 120L);
    }

    @Test
    public void testGetAndSetId() {
        Film film = new Film("Epic Film","Epic description",2021L,120L);
        film.setFilm_id(5L);
        Assertions.assertTrue(film.getFilm_id() == 5L);
    }




}
