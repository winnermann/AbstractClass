package org.lesson41.interfaces;

//class Cat унаследован от abstract class Animal и наследует метод eat()
public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("meow...");
    }
}
