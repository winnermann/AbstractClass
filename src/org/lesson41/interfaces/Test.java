package org.lesson41.interfaces;


public class Test {
    public static void main(String[] args) {
        //Эти объкты (Cat, Dog) мы можем видеть в реальной жизни
        //Это сущности которые реально существуют
        Cat cat = new Cat();
        Dog dog = new Dog();

        //Создание объекта класса Animal не имеет смысла
        //Animal - это животное - концепция (мы не знаем как оно будет выглядеть)
        //Класс Animal не является сущьностью, он является концепцией
        //Словом abstract мы запрещаем создавать объекты класса Animal
        //Animal animal = new Animal();

        //метод makeSound() берется из class Animal
        cat.makeSound();

        //метод eat() берется из class Animal
        cat.eat();

        //метод makeSound() берется из interface AbleToMakeSound
        dog.makeSound();
        //dog.eat();
    }
}
