import Instruments.Guitar;
import Instruments.Piano;
import Instruments.InstrumentType;
import Miscellaneous.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    GuitarStrings guitarStrings;


    @Before
    public void Setup(){
        shop = new Shop("CodeClan Music Shop", 1000);
        guitar = new Guitar("Mahogany", "Midnight Blue", InstrumentType.GUITAR, 380, 450, 6);
        piano = new Piano("Maple", "Polished maple", InstrumentType.PIANO, 600, 720, "Grand Piano");
        guitarStrings = new GuitarStrings(2.50, 5.50, "Earnie Balls", "Regular Slinky");
    }

    @Test
    public void canGetName(){
        assertEquals("CodeClan Music Shop", shop.getName());
    }

    @Test
    public void canGetTill(){
        assertEquals(1000, shop.getTill(), 0.01);
    }

    @Test
    public void stockListStartsEmpty(){
        assertEquals(0, shop.getStock());
    }

    @Test
    public void shopCanAddStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.getStock());
        assertEquals(620, shop.getTill(), 0.01);
    }

    @Test
    public void shopCanSellStock(){
        shop.addStock(piano);
        shop.addStock(guitar);
        shop.addStock(guitarStrings);
        shop.sellStock(piano);
        shop.sellStock(guitar);
        shop.sellStock(guitarStrings);
        assertEquals(0, shop.getStock());
        assertEquals(1193, shop.getTill(), 0.01);

    }

    @Test
    public void canGetTotalPotentialProfit(){
        shop.addStock(piano);
        shop.addStock(guitar);
        shop.addStock(guitarStrings);
        assertEquals(193, shop.getPotentialProfit(), 0.01);
    }
}
