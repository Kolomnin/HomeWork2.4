package hw1andhw2;

public class Bus extends Transport {

    public Bus(String brand, String model, Integer productionYear, String productionCountry, Integer maxSpeed, String fuel) {
        super(brand, model, productionYear, productionCountry, maxSpeed, fuel);

    }

    @Override
    public void refill() {
        System.out.println("Вид топлива: " + getFuel());
        System.out.println();
    }
}
