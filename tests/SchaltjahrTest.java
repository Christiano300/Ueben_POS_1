import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SchaltjahrTest {
    @Test
    public void testSchaltjahr_2000() {
        assertTrue(Schaltjahr.istSchaltjahr(2000));
    }
    @Test
    public void testSchaltjahr_2001() {
        assertFalse(Schaltjahr.istSchaltjahr(2001));
    }
    @Test
    public void testSchaltjahr_1900() {
        assertFalse(Schaltjahr.istSchaltjahr(1900));
    }
    @Test
    public void testSchaltjahr_2004() {
        assertTrue(Schaltjahr.istSchaltjahr(2004));
    }
    @Test
    public void testSchaltjahr_2008() {
        assertTrue(Schaltjahr.istSchaltjahr(2008));
    }
    @Test
    public void testSchaltjahr_2010() {
        assertFalse(Schaltjahr.istSchaltjahr(2010));
    }
}
