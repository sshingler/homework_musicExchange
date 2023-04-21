import Miscellaneous.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {
    GuitarStrings guitarStrings;

    @Before
    public void Setup() {
        guitarStrings = new GuitarStrings(2.50, 5.50, "Earnie Balls", "Regular Slinky");
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(2.50, guitarStrings.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(5.50, guitarStrings.getSellPrice(), 0.01);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Earnie Balls", guitarStrings.getDescription());
    }

    @Test
    public void canGetWeight(){
        assertEquals("Regular Slinky", guitarStrings.getWeight());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(3, guitarStrings.getMarkup(), 0.01);
    }
}
