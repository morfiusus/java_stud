package lesson_16;

public class email {
   static void emailcheck(String q){

       if(q.endsWith("@mail.ru;")) {
               System.out.println("@mail.ru");
       }
       if(q.endsWith("@yahoo.com")) {
              System.out.println("@yahoo.com");
       }
       if(q.endsWith("@gmail.com")){
               System.out.println("@gmail.com");
       }
       else System.out.println("Ne bernay pochta");
       }

    public static void main(String[] args) {
        emailcheck("123123@gmail.com");
    }

   }

//ya@yahoo.com; on@mail.ru; ona@gmail.com;
//contains();