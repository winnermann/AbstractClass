package org.lesson41.interfaces;

//class Dog не унаследован от abstract class Animal и не наследует метод eat(),
public class Dog implements AbleToMakeSound {
    @Override
    public void makeSound() {
        System.out.println("bark...");
    }
}
