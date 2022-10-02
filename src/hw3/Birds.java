package hw3;

import java.util.Objects;

public class Birds extends Animals{

    private final String moveType;

    public Birds(String nameAnimal, int age, String livingEnvironment, String moveType) {
        super(nameAnimal, age, livingEnvironment);
        this.nameAnimal = nameAnimal;
        this.age = age;
        setLivingEnvironment(livingEnvironment);

        if (isNullOfEmpty(moveType)) {
            this.moveType = "параметр не определен";
        } else {
            this.moveType = moveType;
        }
    }

    public String getMoveType() {
        return moveType;
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " я ем насекомых и безпозвоночных");
    }

    @Override
    public void go() {
        System.out.println(getNameAnimal() + " я передвигаюсь по воздуху или земле");
    }

    public void hunt() {
        System.out.println(getNameAnimal() + " я добываю еду по воздуху или на земле");
    }

    @Override
    public String toString() {
        return "Название птицы: " + getNameAnimal() +
                ", возраст: " + getAge() +
                ", среда обитания: " + getLivingEnvironment();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(moveType, birds.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moveType);
    }
}
