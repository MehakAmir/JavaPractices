package inheritance;
class Person {
    void introduce() {
        System.out.println("I am a person.");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher is teaching.");
    }
    void study1() {
    	System.out.println("amina study math");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying.");
    }
}

public class HierarchicalInheritance{
    public static void main(String[] args) {
//    	Person p=new Teacher();
//    	Teacher t1=(Teacher)p;
//    	t1.study1();
        Teacher teacher = new Teacher();
        teacher.introduce();  
        teacher.teach();     
        Student student = new Student();
        student.introduce();  
        student.study();      
    }
}


