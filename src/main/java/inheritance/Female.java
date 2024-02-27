package inheritance;

import java.util.Objects;

public class Female extends Human {
    private int amountOfDresses;
    public Female(int height, int weight) {
        super(height, weight);
    }

    public Female(int height, int weight, int amountOfDresses) {
        super(height, weight);
        this.amountOfDresses = amountOfDresses;
    }

    @Override
    public String toString() {
        return "Female{" +
                "amountOfDresses=" + amountOfDresses +
                " height=" + getHeight() + " weight=" + getWeight() +
                '}';
    }
}
