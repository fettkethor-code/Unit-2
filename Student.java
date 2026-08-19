public class Student {

    // non-static variables belongs to each object
    String firstName; // null
    String lastName; // null
    int studentID; // 0
    double gpa; // 0.0
    boolean graduate; // either false or null 

    // static variables belongs to the class
    public static int numStudents = 0;
    public static String school = "Granite Bay High";

    public Student() {
        firstName = "No Name";
        lastName = "No Name";
        studentID = 000000;
        gpa = 0.0;
        graduate = false;
    }

    public Student(String fName, String lName, int ID, double GPA, boolean isGraduate) {
        firstName = fName;
        lastName = lName;
        studentID = ID;
        gpa = GPA;
        graduate = isGraduate;
    }

    public Student(String firstName, String lName, int ID, double GPA) {
        this.firstName = firstName;
        lastName = lName;
        studentID = ID;
        gpa = GPA;
        graduate = false;
    }

    public void toString(Student studentInput){

        System.out.println("The students name is " + studentInput.);
    }

    public static void main(String[] args){

        Student student1 = new Student();
        
        Student student2 = new Student("Asad", "Shehadah", 123456, 2.1);

        Student student3 = new Student("Thor", "Fettke", 690420, 4.2, false);




    }
}