package com.epam.training.student_anastasiia_chupina.twelfth.house;

import com.epam.training.student_anastasiia_chupina.twelfth.residents.cats.Cat;
import com.epam.training.student_anastasiia_chupina.twelfth.residents.cats.Kitten;
import com.epam.training.student_anastasiia_chupina.twelfth.residents.dogs.Dog;
import com.epam.training.student_anastasiia_chupina.twelfth.residents.dogs.Puppy;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("Rax");
        Puppy randy = new Puppy("Randy");
        Cat barbos = new Cat("Barbos");
        Kitten murzik = new Kitten("Murzik");

        House <Dog> dogHouse = new House <>();
        dogHouse.enter(rex);
        dogHouse.enter(randy);
        //dogHouse.enter(murzik); //This must fail on compilation stage if you parameterize the dogHouse. Delete the line when solution is ready
        System.out.println(dogHouse);

        House <Cat> catHouse = new House <>();
        catHouse.enter(barbos);
        catHouse.enter(murzik);
        //catHouse.enter(rex); //This must fail on compilation stage if you parameterize the catHouse. Delete the line when solution is ready
        System.out.println(catHouse);
    }
}
