import Instruments.Piano;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PianoTest {

    Piano piano;

    @Before
    public void Setup(){
        piano = new Piano("Maple", "Polished maple", InstrumentType.PIANO, 600, 720, "Grand Piano");
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Maple", piano.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Polished maple", piano.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentType.PIANO, piano.getType());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(600, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(720, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canGetSize(){
        assertEquals("Grand Piano", piano.getSize());
    }

    @Test
    public void canPlay(){
        assertEquals("Relaxing piano melody", piano.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(120, piano.getMarkup(), 0.01);
    }


}
