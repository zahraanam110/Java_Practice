public class InstanceMethod {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name="Anam";
        stu1.grade(3.7);
    }
}

class Student{
    String name;

    public void grade(double grade){
        System.out.println(name+" grade is: " + grade);
    }

}

