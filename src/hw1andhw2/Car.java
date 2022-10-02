package hw1andhw2;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private Integer numberOfSeats;
    private String summerOrWinterTires;

    public Car(String brand, String model, Integer productionYear, String productionCountry, String color,
               double engineVolume, String transmission, String bodyType, String registrationNumber,
               Integer numberOfSeats, String summerOrWinterTires, Integer maxSpeed, String fuel) {
        super(brand, model, productionYear, productionCountry, maxSpeed, fuel);
        setEngineVolume(engineVolume);
        setTransmission(transmission);

        this.transmission = transmission;
        if (!(isNullOfEmpty(transmission))) {
            this.transmission = transmission;

        } else {
            this.transmission = "manual";
        }

        this.bodyType = bodyType;
        if (!(isNullOfEmpty(bodyType))) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "седан";
        }

        this.registrationNumber = registrationNumber;
        if (!(registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty())) {
            Matcher m = Pattern.compile("[А-Я]\\d\\d\\d[А-Я][А-Я]\\d\\d\\d").matcher(registrationNumber);
            if (m.find()) {
                this.registrationNumber = registrationNumber;
            } else {
                this.registrationNumber = "некорректный номер";
            }
        }

        if (!(numberOfSeats <= 0)) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats = 5;
        }
        this.summerOrWinterTires = summerOrWinterTires;
        if (!(isNullOfEmpty(summerOrWinterTires))) {
            this.summerOrWinterTires = summerOrWinterTires;
        } else {
            this.summerOrWinterTires = "инфомация не указана";
        }

        if (!(engineVolume <= 0)) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (!(engineVolume <= 0)) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
        if (!(isNullOfEmpty(transmission))) {
            this.transmission = transmission;
        } else {
            this.transmission = "manual";
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {

        this.registrationNumber = registrationNumber;
        if (!(registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty())) {
            Matcher m = Pattern.compile("[А-Я]\\\\d{3}[А-Я][А-Я]\\d{3}\\d{2}").matcher(registrationNumber);
            if (m.find()) {
                this.registrationNumber = registrationNumber;
            } else {
                this.registrationNumber = "некорректный номер";
            }
        }
    }

    public String getSummerOrWinterTires() {
        return summerOrWinterTires;
    }

    public void setSummerOrWinterTires(String summerOrWinterTires) {
        this.summerOrWinterTires = summerOrWinterTires;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats = numberOfSeats <= 0 ? 5 : numberOfSeats;
    }

    public void infoCar() {
        System.out.println("Автомобиль: " +
                "марка: " + getBrand() +
                ";\nмодель: " + getModel() +
                ";\nгод выпуска: " + getProductionYear() +
                ";\nсборка: " + getProductionCountry() +
                ";\nцвет: " + getColor() +
                ";\nобъем двигателя: " + engineVolume + " литра." +
                ";\nтип коробки передач: " + transmission +
                ";\nвид кузова: " + bodyType +
                ";\nгос.номер: " + registrationNumber +
                ";\nкол-во седений: " + numberOfSeats +
                ";\nвид резины: " + summerOrWinterTires +
                ";\nмаксимальная скорость в км/ч: " + getMaxSpeed() +";");
    }

    public LocalDate timeOfYear() {
        LocalDate localDate = LocalDate.now();
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        if (month == 0 || month == 1 || month == 11)
            System.out.println("Время года - зима, установить зимнюю резину \n");
        else if (month == 2 || month == 3 || month == 4)
            System.out.println("Время года - весна, продолжаем ездить на зимней резине \n");
        else if (month == 5 || month == 6 || month == 7)
            System.out.println("Время года - лето, установить летнюю резину \n");
        else
            System.out.println("Время года - осень, продолжаем ездить на летней резине \n");
        return localDate;
    }

    @Override
    public void refill() {
        System.out.println("Вид топлива: " + getFuel());
    }

    public static class Key {
        private String remoteEngineStart;
        private String keyFreeAccess;

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public String getKeyFreeAccess() {
            return keyFreeAccess;
        }

        public void setKeyFreeAccess(String keyFreeAccess) {
            this.keyFreeAccess = keyFreeAccess;
        }

        public Key(String remoteEngineStart, String keyFreeAccess) {
            this.remoteEngineStart = remoteEngineStart;
            if (!(isNullOfEmpty(remoteEngineStart))) {
                this.remoteEngineStart = remoteEngineStart;
            } else {
                this.remoteEngineStart = "no remote Engine Start";
            }

            this.keyFreeAccess = keyFreeAccess;
            if (!(isNullOfEmpty(keyFreeAccess))) {
                this.keyFreeAccess = keyFreeAccess;
            } else {
                this.keyFreeAccess = "no keyFreeAccess";
            }
        }

        @Override
        public String toString() {
            return "Дополнительные опции:" +
                   "\nУдаленный запуск ДВС: " + remoteEngineStart +
                   ",\nБезключевой достеп:" + keyFreeAccess;
        }
    }
    public static class Insurance {
        private Double duration;
        private Integer cost;
        private String number;

        public Insurance(Double duration, Integer cost, String number) {
            if (duration == null || duration <= 0) {
                this.duration = 0.0;
            } else {
                this.duration = duration;
            }
            this.cost = cost <= 0 ? 12000 : cost;

            if (number.matches("[A-Z]{3}\\d{6}")) {
                this.number = number;
            } else {
                this.number = "Номер указан неверно";
            }
        }

        public Double getDuration() {
            return duration;
        }

        public void setDuration(Double duration) {
            if (duration == null || duration <= 0) {
                this.duration = 0.0;
            } else {
                this.duration = duration;
            }
        }

        public double getCost() {
            return cost;
        }

        public void setCost(Integer cost) {
            this.cost = cost <= 0 ? 12000 : cost;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            if (number.matches("[A-Z]{3}\\d{6}")) {
                this.number = number;
            } else {
                this.number = "Номер указан неверно";
            }
        }

        public void checkDuration() {
            if (duration == 0) {
                System.out.println("Вам необходимо оформить страховку!");
            }
        }

        @Override
        public String toString() {
            return "Срок действия страховки: " + duration +
                   " год(а). Стоимость: " + cost +
                   " рублей. Номер страховки: " + number + ".";
        }
    }
    public static boolean isNullOfEmpty(String value) {
        return value == null || value.isEmpty() || value.isBlank();
    }
}


