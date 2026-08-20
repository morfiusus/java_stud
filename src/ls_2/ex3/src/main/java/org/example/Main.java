package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = readSize(sc);
        List<Animal> animalList = getAnimalToList(sc, size);
        readAnimalList(animalList);
    }
    public static int readSize(Scanner sc) {
        System.out.println("Enter count number:");
        while (true) {
            try {
                int num = sc.nextInt();
                sc.nextLine();
                if (num <= 0) {
                    System.out.println("Input error. Size <= 0");
                }
                return num;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Could not parse a number. Please, try again");
                sc.nextLine();
            }
        }
    }

    public static int parseAnimal(Scanner sc) {
        String animal = sc.nextLine();
        return switch (animal) {
            case "cat" -> 1;
            case "dog" -> 2;
            case "guinea" -> 3;
            case "hamster" -> 4;
            default -> {
                System.out.println("Incorrect input. Unsupported pet type");
                yield 0;
            }
        };
    }

    public static int getAgeAnimal(Scanner sc) {
        while (true) {
            try {
                int num = sc.nextInt();
                sc.nextLine();
                if (num <= 0) {
                    System.out.println("Incorrect input. Age <= 0");
                }
                return num;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Could not parse a number. Please, try again");
                sc.nextLine();
            }
        }
    }


    public static List<Animal> getAnimalToList(Scanner sc, int size) {
        int what_animal;
        List<Animal> animalList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            what_animal = parseAnimal(sc);
            if(what_animal!=0) {
                String name = sc.nextLine();
                int age = getAgeAnimal(sc);
                if(age <= 0){
                    continue;
                }
                if (what_animal == 1) {
                    Cat kitty = new Cat(name, age);
                    animalList.add(kitty);
                } else if (what_animal == 2) {
                    Dog rex = new Dog(name, age);
                    animalList.add(rex);
                }else if (what_animal == 3) {
                    GuineaPig piggy = new GuineaPig(name, age);
                    animalList.add(piggy);
                }else if (what_animal == 4) {
                    Hamster wave = new Hamster(name, age);
                    animalList.add(wave);
                }
            }
        }
        return animalList;
    }

    public static void readAnimalList(List<Animal> animalList) {
        for (Animal animal : animalList) {
            if (animal instanceof Herbivore) {
                System.out.println(animal);
            }
        }

        for (Animal animal : animalList) {
            if (animal instanceof Omnivore) {
                System.out.println(animal);
            }
        }
    }
}
