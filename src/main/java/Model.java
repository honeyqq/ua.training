import java.util.ArrayList;
import java.util.List;

public class Model {
    // Data
    private int minBarrier;
    private int maxBarrier;

    private int secretValue;

    private List<Integer> yourAttempts = new ArrayList<>();

    // [1-99]
    public void setSecretValue() {
        secretValue = (int) Math.ceil(Math.random() *
                (maxBarrier - minBarrier - 1) + minBarrier);
    }

    public boolean checkValue(int value) {
        yourAttempts.add(value);
        if (value == secretValue) {
            return false;
        } else if (value > secretValue) {
            maxBarrier = value;
        } else {
            minBarrier = value;
        }
        return true;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public void setMaxBarrier(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }

    public int getSecretValue() {
        return secretValue;
    }

    public List<Integer> getYourAttempts() {
        return yourAttempts;
    }
}
