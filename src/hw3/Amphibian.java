package hw3;

public class Amphibian extends Animal{


    public Amphibian(String name, Integer age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " я ем насекомых и безпозвоночных");
    }

    @Override
    public void go() {
        System.out.println(getNameAnimal() + " я передвигаюсь по суше и воде");
    }

    public void hunt() {
        System.out.println(getNameAnimal() + " я добываю еду на суше и воде");
    }

    @Override
    public String toString() {
        return "Название животное: " + getNameAnimal() +
               ", возраст: " + getAge() +
               ", среда обитания: " + getLivingEnvironment();
    }



}

