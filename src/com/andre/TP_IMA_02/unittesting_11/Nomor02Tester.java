package com.andre.TP_IMA_02.unittesting_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Nomor02Tester {
    @Test

    public void changeSentenceCase() {
        assertEquals(Nomor02.changeCase("iMA"), "a");
    }
}
