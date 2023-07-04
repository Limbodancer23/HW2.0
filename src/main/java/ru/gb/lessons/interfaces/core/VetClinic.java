package ru.gb.lessons.interfaces.core;

import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Human;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.home.impl.Dog;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Duck;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Eagle;
import ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat;
import ru.gb.lessons.interfaces.core.personal.Doctor;
import ru.gb.lessons.interfaces.core.personal.Nurse;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private static List<Animals> animals = new ArrayList<>();

    public static void main(String[] args) {
        Nurse nurse = new Nurse();
        Doctor doc = new Doctor();
        Human human = new Human("Igor");
        Eagle eagle = new Eagle();
        Dog dog = new Dog();
        WildCat wCat = new WildCat();
        animals.add(wCat);
        animals.add(dog);
        animals.add(eagle);
        Cat cat = new Cat();
        animals.add(cat);
        for (Animals el : animals){
//            heal(el);
            check(el, nurse, doc);
        }
    }

    public static void check(Animals patient, Nurse nurse, Doctor doc){
        nurse.prepare(doc);
        doc.cure(patient);
        nurse.feed(patient);
    }

}
