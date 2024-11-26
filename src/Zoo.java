public class Zoo {
    public static void main(String[] args) {

        Animal myBird = new Bird();
        Animal myMammal = new Mammal();
        Animal myDog = new Dog();

        myBird.makeSound();
        myMammal.makeSound();
        myDog.makeSound();
    }
}