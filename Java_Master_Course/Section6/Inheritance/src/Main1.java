public class Main1 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("Yorki", 8, 20, 2, 4,1,20, "Long silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
