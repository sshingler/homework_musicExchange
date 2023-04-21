import Behaviours.ISell;
import Instruments.Instrument;
import Instruments.Piano;
import Miscellaneous.MiscellaneousItem;

import java.util.ArrayList;

public class Shop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;

    public Shop(String name, double till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public int getStock() {
        return stock.size();
    }

    public void addStock(ISell item){
        this.stock.add(item);
        if (item instanceof Instrument){
            this.till -= ((Instrument)item).getBuyPrice();
        } else {
            this.till -=((MiscellaneousItem)item).getBuyPrice();
        }
    }

    public void sellStock(ISell item) {
        this.stock.remove(item);
        if (item instanceof Instrument){
            this.till += ((Instrument)item).getSellPrice();
        } else {
            this.till +=((MiscellaneousItem)item).getSellPrice();
        }

    }

    public double getPotentialProfit() {
        double totalPotentialProfit = 0;
        for (ISell item : this.stock){
            totalPotentialProfit += item.getMarkup();
        }
        return totalPotentialProfit;
    }
}
