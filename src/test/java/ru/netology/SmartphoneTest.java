package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    private Smartphone iPhone = new Smartphone(1, "IphoneXR", 200, "China");

    @Test
    public void shouldGetTrueSearchByName() {
        String Smartphone = "IphoneXR";
        boolean actual = iPhone.matches(Smartphone);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldGetFalseSearchByName() {
        String Smartphone = null;
        boolean actual = iPhone.matches(Smartphone);
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldGetTrueSearchByManufacturer() {
        String Smartphone = "China";
        boolean actual = iPhone.matches(Smartphone);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldGetFalseSearchByManufacturer() {
        String Smartphone = null;
        boolean actual = iPhone.matches(Smartphone);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}