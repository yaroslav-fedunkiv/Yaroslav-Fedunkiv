package com.epam.spring.homework1.pet;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pet {
    private Animal animal;
    private List<Animal> animalList;

    public Pet(Animal animal, List<Animal> animalList) {
        this.animal = animal;
        this.animalList = animalList;
    }

    public void printAnimal(){
        animalList.stream()
                .map(s -> s.getClass().getSimpleName())
                .forEach(System.out::println);
    }
}
