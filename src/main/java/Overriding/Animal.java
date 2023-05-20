package Overriding;

public class Animal {

    public void eat(){
        System.out.println("Animals eat");
    }

    public void drink(){
        System.out.println("Animals drink");
    }

    public Animal create(){
        return new Animal();
    }

    public double sum(double a, int b){
        return a+b;
    }
}
