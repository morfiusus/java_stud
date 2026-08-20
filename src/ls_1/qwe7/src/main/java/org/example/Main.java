package org.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File fl = new File(getFileName(sc));
        if (fl.exists()) {
            double[] array = getArrayOnFile(fl);
            if (array != null) {
                System.out.println(array.length);
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
                saveResult(array);
            }
        } else {
            System.out.println("Input error. File doesn't exist");
        }
    }

    public static String getFileName(Scanner sc) {
        return sc.nextLine();

    }

    public static double[] getArrayOnFile(File file) {
        try {
            Scanner fl = new Scanner(file);
            int size = fl.nextInt();
            int count = 0;
            if (size <= 0) {
                System.out.println("Input error. Size <= 0");
                return null;
            } else {
                double[] array = new double[size];
                while (fl.hasNext() && count < size) {
                    if (fl.hasNextDouble()) {
                        array[count] = fl.nextDouble();
                        count++;
                    } else {
                        fl.next();
                    }
                }
                if (count < size) {
                    System.out.println("Input error. Insufficient number of elements");
                    return null;
                } else {
                    return array;
                }
            }
        } catch (IOException e) {
            System.out.println("Input error. File doesn't exist");
            return null;
        }
    }

    public static double minArray(double[] array) {
        double min=array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static double maxArray(double[] array) {
        double max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static void saveResult(double[] arr) {
        try{
            PrintWriter pw = new PrintWriter("result.txt");
            pw.println(minArray(arr)+ " " + maxArray(arr));
            System.out.println("Saving min and max values in file");
            pw.close();
        } catch (java.io.IOException e){
            System.out.println("Error: " + e);
        }
    }
}

