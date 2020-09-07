package org.lesson41.abstractclass;

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

        cat.makeSound();
        cat.eat();
        dog.makeSound();
        dog.eat();
    }
}
