package OOPJvHW1;

public class Product {
    protected static String name;
    protected static double cost;
    protected static int volume;

    /**
     * @param name
     * @param cost
     * @param volume
     */
    public Product(String name, double cost, int volume) {
        Product.name = name;
        Product.cost = cost;
        Product.volume = volume;
    }

    public double getCost(double cost) {
        return cost;
    }

    public String getName(String name) {
        return name;
    }

    public int getVolume(int volume) {
        return volume;
    }

    @Override
    public String toString() {
        return "{Product " +
                "name = '" + name + '\'' +
                ", cost = " + cost + '\'' +
                ", volume = " + volume +
                '}';
    }


}

