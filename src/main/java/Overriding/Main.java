package Overriding;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        myCat.drink();
        myCat.eat();
        myCat.feed();

        System.out.println(myCat.sum(15,2));
    }
}
