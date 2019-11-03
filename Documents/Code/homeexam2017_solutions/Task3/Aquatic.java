package task3;

public class Aquatic extends Animal {
    private int numberOfFins;

    public Aquatic(String name, int numberOfFins) {
        super(name);
        this.numberOfFins = numberOfFins;
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }

    @Override
    public String toString() {
        // This is automatically called when we ask our program to simply print our object of type Aquatic.
        // This will first call super.toString(), which means the toString() method from the Animal class.
        // Then will simply append the rest of what we need it to print as shown in the code below.
        return super.toString() + "Aquatic{" + "numberOfFins=" + numberOfFins + '}';
    }
}
