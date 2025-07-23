package lesson_18;

public class ShowArray {
    static void showarray(String [][] array){
        System.out.print("{");
        for(int i = 0;i< array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print("{"+array[i][j]+"}");
            }
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        String [][] array={{"qwe"},{"asd"},{"zxc"}};
        showarray(array);
    }
}
