package ru.gb.lessons.interfaces.Interfaces.Inheritors;
import ru.gb.lessons.interfaces.Interfaces.Soundable;

public interface WildSound extends Soundable {
    String sound = "with Sounds";

    @Override
    int sound();
}