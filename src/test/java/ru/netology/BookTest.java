package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    private Book first = new Book(1, "morning", 100, "Elrod");

    @Test
    public void shouldGetTrueSearchByName() {
        String Book = "morning";
        boolean actual = first.matches(Book);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetFalseSearchByName() {
        String Book = null;
        boolean actual = first.matches(Book);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetTrueSearchByAuthor() {
        String Book = "Elrod";
        boolean actual = first.matches(Book);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldGetFalseSearchByAuthor() {
        String Book = null;
        boolean actual = first.matches(Book);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}





