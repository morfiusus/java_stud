package lesson_14_15;

public class Clock {

    static void clock(){
        int i=0;
        CHAS:
        while (i<6){
            int q=-1;
            MINUTA:
            do{
                q++;
                int w= -0;
                SECUNDA:
                while (w<60){
                    System.out.println(i +":" + q +":"+ w);
                    w++;
                }
            }while (q<59);
            i++;
        }



    }

    public static void main(String[] args) {
        clock();
    }
}
 //if(i>1&&q%10==0){break CHAS;}

        //if(w*i>q){continue MINUTA;}