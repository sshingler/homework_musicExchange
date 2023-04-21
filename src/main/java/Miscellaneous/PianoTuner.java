package Miscellaneous;

public class PianoTuner  extends MiscellaneousItem {

    private String material;

    public PianoTuner (double buyPrice, double sellPrice, String description, String material){
        super(buyPrice, sellPrice, description);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
