package Class_Animal_Interface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "chíp chíp";
    }

    @Override
    public String howtoEat() {
        return "Ăn thóc";
    }
}
