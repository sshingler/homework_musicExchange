import Miscellaneous.PianoTuner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PianoTunerTest {

    PianoTuner pianoTuner;

    @Before
    public void Setup(){
        pianoTuner = new PianoTuner(5.75, 12.75, "Metal tuning fork", "Aluminium");
    }
    @Test
    public void canGetBuyPrice(){
        assertEquals(5.75, pianoTuner.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(12.75, pianoTuner.getSellPrice(), 0.01);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Metal tuning fork", pianoTuner.getDescription());
    }

    @Test
    public void canGetWeight(){
        assertEquals("Aluminium", pianoTuner.getMaterial());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(7, pianoTuner.getMarkup(), 0.01);
    }
}
