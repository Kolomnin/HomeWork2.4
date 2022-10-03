package hw3;

public class Flightless extends Bird{
    public Flightless(String nameAnimal, int age, String livingEnvironment, String moveType) {
        super(nameAnimal, age, livingEnvironment, moveType);
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " я ем рыбу или хлеб");
    }

    @Override
    public void go() {
        System.out.println(getNameAnimal() + " я передвигаюсь по земле иил по воде");
    }

    public void walk() {
        System.out.println(getNameAnimal() + " я гуляю");
    }

    @Override
    public String toString() {
        return  "Птица: " + getNameAnimal() +
                ",\n возраст: " + getAge() +
                ",\n среда обитания: " + getLivingEnvironment() +
                ",\n тип перемещения: " + getMoveType();
    }

}
