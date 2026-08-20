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

    public void setName(String newFirstName, String lastName) {
        firstName = newFirstName;
        this.lastName = lastName;
    }

    public void printToString() {

        System.out.print("The students name is " + firstName + " " + lastName + ", their ID number is " + studentID + ", and their GPA is " + gpa + ".");
        if(graduate == true) {
            System.out.println(" They have graduated.");
        } else {
            System.out.println(" They have not graduated.");
        }
    }

    public static void main(String[] args){

        Student student1 = new Student();
        
        Student student2 = new Student("Asad", "Shehadah", 123456, 2.1);

        Student student3 = new Student("Thor", "Fettke", 690420, 4.2, false);

        student1.printToString();
        student1.setName("John", "Doe");
        student1.printToString();
        student2.printToString();
        student3.printToString();


    }
}