package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты первой вершины");
        double x1 = getNextDouble(sc,"введите х1");
        double y1 = getNextDouble(sc,"введите у1");
        System.out.println("Введите координаты второй вершины");
        double x2 = getNextDouble(sc,"введите х2");
        double y2 = getNextDouble(sc,"введите у2");
        System.out.println("Введите координаты третьей вершины");
        double x3 = getNextDouble(sc,"введите х3");
        double y3 = getNextDouble(sc,"введите у3");
        if (S(x1,x2,x3,y1,y2,y3)==0) {
            System.out.println("It's not a triangle");
            sc.close();
        }else {
            double AB = point(x1,x2,y1,y2);
            double BC = point(x1,x3,y1,y3);
            double CA = point(x2,x3,y2,y3);

            double P = AB + BC + CA;
            sc.close();
            System.out.print("Perimeter:");
            System.out.printf("%.3f",P);
        }
    }
    public static double point (double x1, double x2, double y1, double y2) {
        double px1 = x2-x1;
        double py1 = y2-y1;
        return Math.sqrt(px1*px1+py1*py1);
    }
    public static double S (double x1, double x2, double x3, double y1, double y2, double y3){
    return Math.abs(x1*(y2-y3)+x2*(y3-y1)-x3*(y1-y2))*0.5;
    }
    public static double getNextDouble(Scanner sc, String text){
        while (true){
            try{
                System.out.println(text);
                double val = sc.nextDouble();
                sc.nextLine();
                return val;
            }catch(java.util.InputMismatchException e){
                System.out.println("Could not parse a number. Please, try again");
                sc.nextLine();
            }
        }
    }
}
