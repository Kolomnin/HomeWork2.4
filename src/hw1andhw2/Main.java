package hw1andhw2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Grande", 2015, "Russia", "Yellow",
                1.7, "manual", "sedan", "Е777КХ777", 5, "летняя резина", 180, "Gas");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Germany", "Black",
                3.0, "automatic", "hardtop coupe", "О111ОО190", 4, "летняя резина", 250, "Diesel");
        Car car3 = new Car("BMW", "Z8", 2021, "Germany", "Black",
                3.0, "automatic", "sedan", "А555МР777", 5, "летняя резина", 250, "Electro");
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2018, "South Korea", "Red",
                2.4, "manual", "Hatchback", "А090КК777", 5, "летняя резина", 200, "Gas");
        Car car5 = new Car("Hyundai", "Avante", 2016, "South Korea", "Orange",
                1.6, "manual", "wagon", "Т654ТТ799", 5, "летняя резина", 200, "Gas");

        car1.infoCar();
        car1.refill();
        Car.Insurance insurance1 = new Car.Insurance(1.0, 12000, "QWE798798" );
        System.out.println(insurance1);
        Car.Key key1 = new Car.Key(" ", " ");
        System.out.println(key1);
        car1.timeOfYear();

        car2.infoCar();
        car2.refill();
        Car.Insurance insurance2  = new Car.Insurance(1.5, 15000, "QWE798798" );
        System.out.println(insurance2);
        Car.Key key2 = new Car.Key("Yas", "Yas");
        System.out.println(key2);
        car2.timeOfYear();

        car3.infoCar();
        car3.refill();
        Car.Insurance insurance3  = new Car.Insurance(1.9, 15000, "QWE798798" );
        System.out.println(insurance3);
        Car.Key key3 = new Car.Key("Yas", "Yas");
        System.out.println(key3);
        car3.timeOfYear();

        car4.infoCar();
        car4.refill();
        Car.Insurance insurance4  = new Car.Insurance(1.4, 15000, "QWE798798" );
        System.out.println(insurance4);
        Car.Key key4 = new Car.Key("Yas", " ");
        System.out.println(key4);
        car4.timeOfYear();

        car5.infoCar();
        car5.refill();
        Car.Insurance insurance5  = new Car.Insurance(1.3, 15000, "QWE798798" );
        System.out.println(insurance5);
        Car.Key key5 = new Car.Key(" ", "Yas");
        System.out.println(key5);
        car5.timeOfYear();

        Train train1 = new Train("Ласточка", "B-901", 2011, "Россия", 301,
                       "Белорусский вокзал", "Минск-Пассажирский", 3500.0, 11, 10.32, "Electro");
        Train train2 = new Train("Ленинград","D-125",2019, "Россия", 270,
                       "Ленинградский вокзал", "Ленинград-Пассажирский", 1700.00, 8, 10.35, "Coal");

        System.out.println(train1);
        train1.refill();
        System.out.println(train2);
        train2.refill();

        Bus bus1 = new Bus("Mercedes", "Sprinter", 2015, "Germany", 220, "Diesel");
        Bus bus2 = new Bus("Volkswagen", "Transporter", 2022, "Germany", 200, "Gas");
        Bus bus3 = new Bus("Паз", "Д11-310У", 2005, "Россия", 80, "Diesel");

        System.out.println(bus1);
        bus1.refill();
        System.out.println(bus2);
        bus2.refill();
        System.out.println(bus3);
        bus3.refill();
    }
}