package lesson_19;

public class Abc {
    static String [] abc(String [] ... array){
        int dl = 0;
        for(String [] str : array){
            dl += str.length;
        }
        String [] str = new String[dl];
        //System.out.println(str.length);
        int index = 0;
        for(String [] asd : array){
           for (int i = 0; i< asd.length;i++){


               str[index]=asd[i];
               index++;
           }
        }
        return str;
    }

    public static void main(String[] args) {

String[] s = {"qwe","qwe","asd"};
String[] s2 ={"rty","fgh","vbn"};
String[] s3 = abc(s,s2);

for (String e : args){
    for (int i =0; i< s3.length;i++){
        if(e.equals(s3[i])){
s3[i]=null;
        }
    }
}
        for (String w :s3){
            System.out.println(w);
        }
    }
}
