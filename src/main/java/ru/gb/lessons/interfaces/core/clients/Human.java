package ru.gb.lessons.interfaces.core.clients;

import ru.gb.lessons.interfaces.core.clients.home.Pet;

/**
 Абстракция человека
 */
public class Human extends Animal { // todo на семинаре, в учебных целях, сделать extends Animal
    private final String fullName;

    public Human(String fullName) {
        this.fullName = fullName;
    }

    public Human(){
        this.fullName = null;
    }

    public String getFullName() {
        return fullName;
    }
}
