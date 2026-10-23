import java.util.ArrayList;

public class Student {
    Integer M;
    String N;
    Student(String name,Integer Marks){
        this.N=name;
        this.M=Marks;
    }
    public String toString() { return N+"("+M+")";}
// }
//public class GradeManager{
    public static void main(String[] args) {
        ArrayList<Student> Students=new ArrayList<>(); 
        Students.add(new Student("Dinesh",95));
        Students.add(new Student("Sravs",99));
        Students.add(new Student("Shyam",96));
        Students.add(new Student("Kannaiah",89));
        int total=0;
        for(Student s:Students){
            System.out.println(s);
            total+=s.M;
        }
        int average=total/Students.size();
        System.out.println("Average marks of students is "+average);
        
    }
}

