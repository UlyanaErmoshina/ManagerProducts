package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    private Book First = new Book(1, "morning", 100, "Elrod");

    @Test

    public void ShouldGetTrueSearchByName() {
        String Book = "morning";
        boolean actual = First.matches(Book);
        boolean expected = true;
        assertEquals(expected, actual);

    }
    @Test

    public void ShouldGetFalseSearchByName() {
        String Book = null;
        boolean actual = First.matches(Book);
        boolean expected = false;
        assertEquals(expected, actual);

    }

    }





