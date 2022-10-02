package hw3;

public class Herbivores extends Mammals{
    public Herbivores(String nameAnimal, int age, String livingEnvironment, Integer speed, String typeOfFood) {
        super(nameAnimal, age, livingEnvironment, speed, typeOfFood);
    }

    @Override
    public void go() {
        System.out.println(getNameAnimal() + " я гуляю по открытой местности");
    }
    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " я ем траву");
    }

    public void graze() {
        System.out.println(getNameAnimal() + " я пасусь на траве");
    }
    @Override
    public String toString() {
        return "Травоядное животное: " + getNameAnimal() +
               ",\n возраст: " + getAge() +
               ",\n среда обитания: " + getLivingEnvironment() +
               ",\n скорость в км/ч: " + getSpeed() +
               ",\n тип пищи: " + getTypeOfFood();
    }



}
