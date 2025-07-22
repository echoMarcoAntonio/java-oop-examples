package InterfaceJava;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();

        rabbit.flee();

        fish.hunt();
        fish.flee();
    }
}
