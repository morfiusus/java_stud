package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = readSize(sc);
        List<User> list = getUsers(size, sc);
        String result = list.stream()
                .filter(user -> user.getAge() >= 18)
                .map(User::getName)
                .collect(Collectors.joining(", "));

        if (!result.isEmpty()) {
            System.out.println(result);
        }
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

    public static List<User> getUsers(int size, Scanner sc) {
        int i = 0;
        List<User> list = new ArrayList<>();
        while (i < size) {
            String name = sc.nextLine();
            int age = getAge(sc);
            if (age > 0) {
                User person = new User(name, age);
                list.add(person);
                i++;
            }
        }
        return list;
    }

    public static int getAge(Scanner sc) {
        while (true) {
            try {
                int num = sc.nextInt();
                sc.nextLine();
                if (num <= 0) {
                    System.out.println("Input error. Age <= 0");
                }
                return num;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Could not parse a number. Please, try again");
                sc.nextLine();
            }
        }
    }
}

