package lesson_20;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
    static ArrayList<String> abc(String... a) {
        ArrayList<String> abc = new ArrayList<>();
        for (String str : a) {
            abc.add(str);
        }
        for(int j = 0; j< abc.size();j++){
            for(int i = 0; i< abc.size();i++){
                if(i==j)continue;
                if(abc.get(i).equals(abc.get(j))){
                    abc.remove(i);
                }
            }
        }
        Collections.sort(abc);
        for(String str : abc){
            System.out.println(str);
        }
        return abc;
    }

    public static void main(String[] args) {
        ArrayList<String> s1 = abc("qwe", "qwe", "asd", "zxc", "qwe", "zxc");
    }
}