package ru.gb.lessons.interfaces.core.personal;

import ru.gb.lessons.interfaces.core.VetClinic;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Human;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Doctor extends Human {

    public void cure(Animals patient) {
      if(patient instanceof Pet){
          System.out.println("Doctor checked health of " + patient.getCLASS_NAME());
       }
      else System.out.println("I can`t cure "  + patient.getCLASS_NAME());
    }
}
