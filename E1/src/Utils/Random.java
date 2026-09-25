package Utils;

public class Random {

    private int min;
    private int max;

    public Random(int min, int max) {
        setMin(min);
        setMax(max);
    }

    // setters

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    // Methods

    public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static double getRandom(double min, double max) {
        return (double) (Math.random() * (max - min) + min);
    }
    
}
