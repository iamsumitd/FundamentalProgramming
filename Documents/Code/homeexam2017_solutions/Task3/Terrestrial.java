package task3;

public class Terrestrial extends Animal {
    private int numberOfLegs;

    public Terrestrial(String name, int numberOfLegs) {
        super(name);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return super.toString() + "Terrestrial{" + "numberOfLegs=" + numberOfLegs + '}';
    }
}
