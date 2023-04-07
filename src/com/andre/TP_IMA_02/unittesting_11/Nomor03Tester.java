package com.andre.TP_IMA_02.unittesting_11;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Nomor03Tester {
    @Test

    public void isKaprekar() {
        assertTrue(Nomor03.kaprekarCheck(55));
        assertFalse(Nomor03.kaprekarCheck(85));
    }
}
