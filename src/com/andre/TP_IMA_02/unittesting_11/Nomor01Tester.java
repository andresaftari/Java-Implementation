package com.andre.TP_IMA_02.unittesting_11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Nomor01Tester {
    //KITA LAKUKAN TESTING SEPERTI INI...

    @Test

    public void checkFibonacci() {
        assertEquals(Nomor01.isFibonacci(7 - 1), 8);
        //assertEquals MERAH, INI KARENA DIA BUTUH LIBRARY, UNTUK ITU... KITA GUNAKAN ALT ENTER (ATAU KLIK LAMPU MERAHNYA)
        //isFibonacci ADALAH METHOD YANG DIGUNAKAN DI Nomor01, LALU TULIS INPUT n - 1 DENGAN HASIL = 8
    }
}
