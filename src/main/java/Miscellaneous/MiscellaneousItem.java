package Miscellaneous;
import Behaviours.ISell;

public abstract class MiscellaneousItem implements ISell{

    private double buyPrice;
    private double sellPrice;
    private String description;

    public MiscellaneousItem(double buyPrice, double sellPrice, String description) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getMarkup(){
        return sellPrice - buyPrice;
    }
}
