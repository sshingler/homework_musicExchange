package Instruments;

public class Piano extends Instrument{

    private String size;

    public Piano (String material, String colour, InstrumentType type, double buyPrice, double sellPrice, String size){
        super(material, colour, type, buyPrice, sellPrice);
        this.size = size;
    }

    @Override
    public String play() {
        return "Relaxing piano melody";
    }

    public String getSize() {
        return size;
    }
}
