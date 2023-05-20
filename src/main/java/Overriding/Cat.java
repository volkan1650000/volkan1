package Overriding;

public class Cat extends Mammal{

        public void meow() {
                System.out.println("Cats meow");
        }

        @Override
        public void eat() {
                System.out.println("Cats eat");
        }

        @Override
        public void drink() {
                System.out.println("Cats drink");
        }

        @Override
        public void feed() {
                System.out.println("Cats feed their babies with milk");
        }

        @Override
        public Mammal create() {
                return new Cat();
        }

        @Override
        public double sum(double a, int b) {
                return a+b;
        }
}
