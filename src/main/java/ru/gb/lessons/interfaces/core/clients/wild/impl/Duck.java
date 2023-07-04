package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.Interfaces.Flyable;
import ru.gb.lessons.interfaces.Interfaces.Inheritors.FlySlow;
import ru.gb.lessons.interfaces.Interfaces.Inheritors.RunSlow;
import ru.gb.lessons.interfaces.Interfaces.Inheritors.SwimSlow;
import ru.gb.lessons.interfaces.Interfaces.Runnable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class Duck extends WildAnimal implements FlySlow, RunSlow, SwimSlow {
    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public void run() {
        System.out.println(CLASS_NAME + "can run with " + RunSlow.speed);
    }

    @Override
    public void fly() {
        System.out.println(CLASS_NAME + "can fly with " + FlySlow.speed);
    }

    @Override
    public void swim() {
        System.out.println(CLASS_NAME + "can swim with " + SwimSlow.speed);
    }
}