package hw3;

import java.util.Objects;

public class Mammal extends Animal{

    private Integer speed;

    private final String typeOfFood;

    public Mammal(String nameAnimal, int age, String livingEnvironment, Integer speed, String typeOfFood) {
        super(nameAnimal, age, livingEnvironment);
        setLivingEnvironment(livingEnvironment);
        setSpeed(speed);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed <= 0 ? 1 : speed;
    }

    public Integer getSpeed() {
        return speed;
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " я ем " + getTypeOfFood());
    }

    @Override
    public void go() {
        System.out.println(getNameAnimal() + " я перемещаюсь");
    }

    public void walk() {
        System.out.println(getNameAnimal() + " я гуляю");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammals = (Mammal) o;
        return Objects.equals(speed, mammals.speed) && Objects.equals(typeOfFood, mammals.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, typeOfFood);
    }
}
