package hw3;

public class Predator extends Mammal{
    public Predator(String nameAnimal, int age, String livingEnvironment, Integer speed, String typeOfFood) {
        super(nameAnimal, age, livingEnvironment, speed, typeOfFood);
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " я ем других животных и рыбу");
    }

    @Override
    public void go() {
        System.out.println(getNameAnimal() + " я передвигаюсь по земле");
    }

    public void hunt() {
        System.out.println(getNameAnimal() + " я добываю еду на земле и в воде");
    }

    @Override
    public String toString() {
        return  "Хищьное животное: " + getNameAnimal() +
                ",\n возраст: " + getAge() +
                ",\n среда обитания: " + getLivingEnvironment() +
                ",\n скорость в км/ч: " + getSpeed() +
                ",\n тип пищи: " + getTypeOfFood();
    }

}
