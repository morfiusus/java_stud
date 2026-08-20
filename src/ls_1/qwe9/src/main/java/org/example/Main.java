package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = readSize(sc);
        List<String> rows = createList(sc, size);
        String pattern = takeRow(sc);
        List<String> result = containsList(rows, pattern);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
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

    public static String takeRow(Scanner sc){
        while (true) {
            try {
               return sc.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Could not parse a row. Please, try again");
            }
        }
    }

    public static List<String> createList(Scanner sc, int size){
        List<String> rows = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            rows.add(takeRow(sc));
        }
        return rows;
    }

    public static List<String> containsList(List<String> rows, String pattern){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < rows.size(); i++) {
            String row = rows.get(i);
            if (row.contains(pattern)){
                result.add(row);
            }
        }
        return result;
    }
}