import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatumTest {
    @Nested
    class TestSchaltjahr {
        @Test
        void testSchaltjahr_2000() {
            assertTrue(Datum.istSchaltjahr(2000));
        }

        @Test
        void testSchaltjahr_2001() {
            assertFalse(Datum.istSchaltjahr(2001));
        }

        @Test
        void testSchaltjahr_1900() {
            assertFalse(Datum.istSchaltjahr(1900));
        }

        @Test
        void testSchaltjahr_2004() {
            assertTrue(Datum.istSchaltjahr(2004));
        }

        @Test
        void testSchaltjahr_2010() {
            assertFalse(Datum.istSchaltjahr(2010));
        }
    }
    @Nested
    class TestDatumGueltig {
        @Test
        void datumKorrekt_1() {
            assertTrue(Datum.istDatumGueltig(23, 3, 2021));
        }
        @Test
        void datumKorrekt_2() {
            assertTrue(Datum.istDatumGueltig(14, 12, 2010));
        }
        @Test
        void datumKorrekt_3() {
            assertTrue(Datum.istDatumGueltig(31, 8, 2022));
        }
        @Test
        void tagZuHoch_1() {
            assertFalse(Datum.istDatumGueltig(32, 5, 2016));
        }
        @Test
        void tagZuHoch_2() {
            assertFalse(Datum.istDatumGueltig(31, 4, 2017));
        }
        @Test
        void monatZuHoch() {
            assertFalse(Datum.istDatumGueltig(23, 17, 2015));
        }
        @Test
        void monatNegativ() {
            assertFalse(Datum.istDatumGueltig(23, -2, 2018));
        }
    }
}
