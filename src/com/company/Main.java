package com.company;

public class Main {
/**Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food,
 * location и методы makeNoise, eat, sleep. Метод makeNoise, например, может выводить на консоль “Такое-то животное спит“.
 * Dog, Cat, Horse переопределяют методы makeNoise, eat. Добавьте переменные в классы Dog, Cat, Horse, характеризующие только
 * этих животных.
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
 * Пусть этот метод распечатывает food и location пришедшего на прием животного. В методе main создайте массив типа Animal,
 * в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.*/
    public static void main(String[] args) {



        Anymal[] animals = new Anymal[3];
        animals[0] = new Dog("Мясо","On out","Dog ");
        animals[1] = new Cat("Fish","Home","Cat ");
        animals[2]= new Horse("apple","In Saray","Hors ");

        Veterinar veterinar = new Veterinar();

        for (Anymal anymal: animals ) {
            anymal.makeNoise();
            veterinar.treatAnymal(anymal);

            anymal.sleep();
            anymal.eat();
            System.out.println();
        }


    }
}
