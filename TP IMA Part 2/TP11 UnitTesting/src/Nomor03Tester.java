import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Nomor03Tester {
    @Test

    public void isKaprekar() {
        assertTrue(Nomor03.kaprekarCheck(55));
        assertFalse(Nomor03.kaprekarCheck(85));
    }
}
