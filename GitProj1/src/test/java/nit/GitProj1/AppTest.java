package nit.GitProj1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void positive() {
    	int x=10;
    	int y=20;
    	int expected=30;
      int actual=x+y;
      assertEquals(expected, actual);
    }
}
