package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    private Book first = new Book(1, "morning", 100, "Elrod");

    @Test
    public void shouldGetTrueSearchByName() {
        String book = "morning";
        boolean actual = first.matches(book);
        assertTrue(actual);
    }

    @Test
    public void shouldGetFalseSearchByName() {
        String book = null;
        boolean actual = first.matches(book);
        assertFalse(actual);
    }

    @Test
    public void shouldGetTrueSearchByAuthor() {
        String book = "Elrod";
        boolean actual = first.matches(book);
        assertTrue(actual);
    }

    @Test
    public void shouldGetFalseSearchByAuthor() {
        String book = null;
        boolean actual = first.matches(book);
        assertFalse(actual);
    }
}





