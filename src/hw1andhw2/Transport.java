package hw1andhw2;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final Integer productionYear;
    private final String productionCountry;
    private String color;
    private Integer maxSpeed;
    protected String fuel;

    public Transport(String brand, String model, Integer productionYear, String productionCountry, Integer maxSpeed, String color, String fuel) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setColor(color);
        setMaxSpeed(maxSpeed);
        this.fuel = fuel;
    }

    public Transport(String brand, String model, Integer productionYear, String productionCountry, Integer maxSpeed, String fuel) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setMaxSpeed(maxSpeed);
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        if (maxSpeed == null || maxSpeed <= 0) {
            this.maxSpeed = 180;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "марка: " + getBrand() +
                ";\nмодель: " + getModel() +
                ";\nгод выпуска: " + getProductionYear() +
                ";\nсборка: " + getProductionCountry() +
                ";\nмаксимальная скорость в км/ч: " + getMaxSpeed();
    }

    public abstract void refill();

}
