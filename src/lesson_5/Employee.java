package lesson_5;

public class Employee {
    int id;
    public String surname;
    int age;
    private int salary;
    String departament;
    int udvoenie(){
        int result = salary*2;
        return result;
    }
    public Employee(int id1,String surname1, int age1, int salary1, String departament1){
        id=id1;
        surname1=surname;
        age=age1;
        salary=salary1;
        departament1=departament;
        System.out.println(id+" "+surname+" "+age+" "+salary+" "+departament);
    }
    Employee(int id2,String surname2, int age2, int salary2){
        this(id2,surname2,age2,salary2,null);
    }
    private Employee(int id3,String surname3, int age3){
        this(id3,surname3,age3,0,null);
    }
}
class EmployeeTest{
    public static void main(String[] args) {


        Employee e1 = new Employee(5, "Petr", 16, 550, "kassir");
        int result = e1.udvoenie();
        System.out.println(result);
    }
}
