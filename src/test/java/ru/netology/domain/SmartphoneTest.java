package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    private Smartphone IPhone = new Smartphone(1, "IphoneXR", 200, "China");

    @Test

    public void ShouldGetTrueSearchByName() {
        String Smartphone = "IphoneXR";
        boolean actual = IPhone.matches(Smartphone);
        boolean expected = true;
        assertEquals(expected, actual);

    }
    public void ShouldGetFalseSearchByName() {
        String Smartphone = null;
        boolean actual = IPhone.matches(Smartphone);
        boolean expected = false;
        assertEquals(expected, actual);

    }





}