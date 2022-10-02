package hw3;

public class Flying extends Birds{
    public Flying(String nameAnimal, int age, String livingEnvironment, String moveType) {
        super(nameAnimal, age, livingEnvironment, moveType);
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " я ем рыбу и жуков");
    }

    @Override
    public void go() {
        System.out.println(getNameAnimal() + " я передвигаюсь по земле и по воздуху");
    }

    public void fly() {
        System.out.println(getNameAnimal() + " я умею летать");
    }

    @Override
    public String toString() {
        return  "Птица: " + getNameAnimal() +
                ",\n возраст: " + getAge() +
                ",\n среда обитания: " + getLivingEnvironment() +
                ",\n тип перемещения: " + getMoveType();
    }

}
