class Dog extends Mammal {

    public Dog() {
        this.species = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}
