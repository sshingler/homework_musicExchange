package Miscellaneous;

public class GuitarStrings extends MiscellaneousItem {

    private String weight;

    public GuitarStrings (double buyPrice, double sellPrice, String description, String weight){
        super(buyPrice, sellPrice, description);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }
}
