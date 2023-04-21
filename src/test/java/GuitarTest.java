import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void Setup(){
        guitar = new Guitar("Mahogany", "Midnight Blue", InstrumentType.GUITAR, 380, 450, 6);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Midnight Blue", guitar.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(380, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(450, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Amazing guitar riff!", guitar.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(70, guitar.getMarkup(), 0.01);
    }


}

