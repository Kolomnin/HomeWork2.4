package hw1andhw2;

/*
Создайте класс поезд (train), который будет расширять класс transport.

        При этом класс train содержит в себе собственные параметры:

        Цена поездки
        Время поездки
        Название станции отбытия
        Конечная остановка
        Количество вагонов
        Создайте геттеры и сеттеры для необходимых полей, создайте конструкторы. Настройте проверки данных.

        Создайте два объекта:

        Поезд Ласточка, модель B-901, 2011 год выпуска в России, скорость передвижения – 301 км/ч, отходит от
        Белорусского вокзала и следует до станции Минск-Пассажирский. Цена поездки - 3500 рублей, в поезде 11 вагонов

        Поезд Ленинград, модель D-125, 2019 год выпуска в России, скорость передвижения – 270 км/ч, отходит от
        Ленинградского вокзала и следует до станции Ленинград-Пассажирский. Цена поездки - 1700 рублей, в поезде 8 вагонов.
        Для каждого объекта выведите информацию в консоль.
*/

public class Train extends Transport {

    private Double priceOfTrip;
    private Double timeOfTrip;
    private String startStation;
    private String endStation;
    private Integer numberOfWagons;

    public Train(String brand, String model, Integer productionYear, String productionCountry, Integer maxSpeed,
                 String startStation, String endStation, Double priceOfTrip, Integer numberOfWagons, Double timeOfTrip, String fuel) {
        super(brand, model, productionYear, productionCountry, maxSpeed, fuel);

        setStartStation(startStation);
        setEndStation(endStation);
        setPriceOfTrip(priceOfTrip);
        setNumberOfWagons(numberOfWagons);
        setTimeOfTrip(timeOfTrip);

    }

    public Double getPriceOfTrip() {
            return priceOfTrip;
        }

        public void setPriceOfTrip(Double priceOfTrip) {
            if (priceOfTrip == null || priceOfTrip <=0.0) {
                this.priceOfTrip = 5000.0;
            } else {
                this.priceOfTrip = priceOfTrip;
            }
        }

        public Double getTimeOfTrip() {
            return timeOfTrip;
        }

        public void setTimeOfTrip(Double timeOfTrip) {
            if (timeOfTrip == null || timeOfTrip <=0.0) {
                this.timeOfTrip = 2.30;
            } else {
                this.timeOfTrip = timeOfTrip;
            }
        }

        public String getStartStation() {
            return startStation;
        }

        public void setStartStation(String startStation) {
            if (Car.isNullOfEmpty(startStation)) {
                this.startStation = "Информации нет";
            } else {
                this.startStation = startStation;
            }
        }

        public String getEndStation() {
            return endStation;
        }

        public void setEndStation(String endStation) {
            if (Car.isNullOfEmpty(endStation)) {
                this.endStation = "Информации нет";
            } else {
                this.endStation = endStation;
            }
        }

        public Integer getNumberOfWagons() {
            return numberOfWagons;
        }

        public void setNumberOfWagons(Integer numberOfWagons) {
            if (numberOfWagons == null || numberOfWagons <=0) {
                this.numberOfWagons = 10;
            } else {
                this.numberOfWagons = numberOfWagons;
            }
        }

    @Override
    public void refill() {
        System.out.println("Вид топлива: " + getFuel());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Поезд: " +
                "марка: " + getBrand() +
                ";\nмодель: " + getModel() +
                ";\nгод выпуска: " + getProductionYear() +
                ";\nпроисводство: " + getProductionCountry() +
                ";\nстоимось билета: " + priceOfTrip +
                " руб;\nстанция отбытия: " + startStation +
                ";\nстанция прибытия: " + endStation +
                ";\nколичество вагонов: " + numberOfWagons +
                " шт;\nвремя в пути: " + timeOfTrip + " чч/мм.";
    }
}

