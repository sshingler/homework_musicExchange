package Instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar (String material, String colour, InstrumentType type, double buyPrice, double sellPrice, int numberOfStrings) {
        super(material, colour, type, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }


    @Override
    public String play() {
        return "Amazing guitar riff!";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
