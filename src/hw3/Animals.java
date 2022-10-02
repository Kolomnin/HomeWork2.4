package hw3;

import java.util.Objects;

public abstract class Animals {
    String nameAnimal;
    int age;
    private String livingEnvironment;

    public Animals(String nameAnimal, int age, String livingEnvironment) {
        this.nameAnimal = nameAnimal;
        this.age = age;
        setLivingEnvironment(livingEnvironment);
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public int getAge() {
        return age;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
        if (isNullOfEmpty(livingEnvironment)) {
            this.livingEnvironment = "no livingEnvironment";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public static boolean isNullOfEmpty(String value) {
        return value == null || value.isEmpty() || value.isBlank();
    }

    public abstract void eat();

    public void sleep() {
        System.out.println(getNameAnimal() + " - я сплю");
    }
    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(nameAnimal, animals.nameAnimal) && Objects.equals(livingEnvironment, animals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAnimal, age, livingEnvironment);
    }
}
