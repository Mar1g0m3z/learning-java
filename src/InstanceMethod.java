//    methods that are called after instantiation of class or object creation
//    most common method type
class Student {
//     this instance method will get the name of student
    public void name_of_student(String name){
        System.out.println(String.format("Student name is: %s", name ));
//       String.format it formats how its printed out so it has its own line!
    }
//    this instance method gets the student grade
    public void grade(double grade){
        System.out.println(String.format("Student grade is:  %.2f ", grade));
    }
//    static method
    public static void className(String name){
        System.out.println(String.format("Object name is: %s", name));
//        static method values change
//        you dont have to create an object  for static methods
//        the disadvantage is that the value is overwritten
//
    }
}
//I wanted to customize my student names!
public class InstanceMethod {
    public static void main(String[] args){
//       call the instance methods
//        student1
//        Student student1 = new Student();
//        student1.name_of_student("Stacy");
//        student1.grade(4.25);
        Student.className("student1");
//        first value of static
//       Student 2
//        Student student2 = new Student();
//        student2.name_of_student("BillyBob");
//        student2.grade(2.86);
        Student.className("student2");
//        the static method then changes value to student2
//        Student 3
        Student student3 = new Student();
        student3.name_of_student("Marisela");
        student3.grade(5.02);
        Student.className("student3");

    }

}
