package Limitservicemicroservice.Limitmicroservice.Entiry;

public class Limit {

    private int minnimum;
    private int maximum;

    public Limit(int minnimum, int maximum) {
        this.minnimum = minnimum;
        this.maximum = maximum;
    }

    public int getMinnimum() {
        return minnimum;
    }

    public void setMinnimum(int minnimum) {
        this.minnimum = minnimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
