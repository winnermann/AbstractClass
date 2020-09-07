package org.lesson41.abstractclass;

//Словом abstract мы запрещаем создавать объекты класса Animal
//Создание объекта класса Animal не имеет смысла
//Animal - это животное - концепция (мы не знаем как оно будет выглядеть)
//Класс Animal не является сущьностью, он является концепцией
public abstract class Animal {
    public void eat(){
        System.out.println("I am eating...");
    }

    //это абстрактный метод, он может быть создан только в абстрактном классе
    //все животные (Cat, Dog) будут издавать разные звуки, поэтому мы не можем создать объект Animal
    //реализация абстрактного метода makeSound() находится в классах наследниках (Cat, Dog)
    public abstract void makeSound();
}
