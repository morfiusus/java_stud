package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = readSize(sc);
        List<Animal> animalList= getAnimalToList(sc,size);
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
        int cat_or_dog;
        List<Animal> animalList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            cat_or_dog = parseAnimal(sc);
            if (cat_or_dog == 1) {
                Cat kitty = new Cat(sc.nextLine(),getAgeAnimal(sc));
                if(kitty.getAge()<=0){
                    continue;
                }
                animalList.add(kitty);
            } else if (cat_or_dog == 2) {
                Dog rex = new Dog(sc.nextLine(),getAgeAnimal(sc));
                if(rex.getAge()<=0){
                    continue;
                }
                animalList.add(rex);
            }
        }
        return animalList;
    }

    public static void readAnimalList(List<Animal> animalList){
        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }
}

