package lesson_22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;
StringBuilder getName(){
    return name;
}
StringBuilder setName(String s){
    if(s.length()>2){
        name = new StringBuilder(s);
        return name;
    }
    else return name;
}
int getCourse(){
    return course;
}
int setCourse(int c){
    if(c>0 && c<4){
        course = c;
    }
    return course;
}
    int getGrade(){
        return grade;
    }
    int setGrade(int g){
        if(g>0 && g<11){
            grade= g;
        }
        return grade;
    }
    void showInfo(){
        System.out.println("Name " + getName());
        System.out.println("Course " + getCourse());
        System.out.println("Grade " + getGrade());
    }
}
class TestStudent {
    public static void main(String[] args) {


        Student s1 = new Student();
        s1.setGrade(5);
        s1.setCourse(3);
        s1.setName("aboba");
        s1.showInfo();
    }
}
