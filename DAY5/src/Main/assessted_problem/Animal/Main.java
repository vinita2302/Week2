package Main.assessted_problem.Animal;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}