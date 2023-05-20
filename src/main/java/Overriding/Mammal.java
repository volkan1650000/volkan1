package Overriding;

public class Mammal extends Animal{

    public void feed(){
        System.out.println("Animals feed their babies with milk");
    }

    @Override
    public Mammal create(){
        return new Mammal();
    }
}
