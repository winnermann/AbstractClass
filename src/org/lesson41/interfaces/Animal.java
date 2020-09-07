package org.lesson41.interfaces;

//Интерфейс это то, что класс умеет делать, а Абстрактный класс это то чем класс является
public abstract class Animal {
    public void eat(){
        System.out.println("I am eating...");
    }

    //это абстрактный метод, он может быть создан только в абстрактном классе
    //все животные (Cat, Dog) будут издавать разные звуки, поэтому мы не можем создать объект Animal
    //реализация абстрактного метода makeSound() находится в классах наследниках (Cat)
    public abstract void makeSound();
}
