package com.campusdual.abstractclass;

public class Zoo {
    public static void main(String[] args) {

        //Animal a = new Animal("cat");

        Cat c = new Cat("car");
        Fox f = new Fox("Fox");
        AngoraCat a = new AngoraCat("Angoracat");

        c.sleep();
        f.sleep();
        a.sleep();

        c.wakeUp();
        f.wakeUp();
        a.wakeUp();

        c.makeSound();
        f.makeSound();
        a.makeSound();

        c.climbing();
        a.climbing();

    }
}
