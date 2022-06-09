package Class_Animal_Interface;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Gào Gào";
    }

    @Override
    public String howtoEat() {
        return "Eat meat";
    }
}
