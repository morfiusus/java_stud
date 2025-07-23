package lesson_18;




public class Sortirovka {
   /* static void sortirivka(int [] qwe){
        for(int i = 0; i< qwe.length;i++){
        System.out.println(qwe[i] + " ");
        }
        System.out.println();
        Arrays.sort(qwe);
    }*/
static void sortirivka(int [] qwe){
    for(int i=0;i< qwe.length-1;i++){
        for(int j = 0;j< qwe.length-i-1;j++){
            if(qwe[j]>qwe[j+1]){
                int temp = qwe[j];
                qwe[j]=qwe[j+1];
                qwe[j+1] = temp;
            }
        }
    }
}
    public static void main(String[] args) {
        int [] asd = {2, 5 ,6 ,7, 3, 1};
        sortirivka(asd);
        for(int i = 0; i< asd.length;i++){
            System.out.println(asd[i]);
        }

    }

}
