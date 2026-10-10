package student;
//
public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
        this.id  =  nextId ++ ;
        this.code =  code ;
        this.name  =  name ;

    }

    // Method to add a student
    public void addStudent(Student s) {
        Student[] updatedStudents  =  new Student[this.students.length +1] ;
        for ( int i = 0 ; i < updatedStudents.length  ; i++) {
            updatedStudents[i] =  this.students[i] ;

        }
        updatedStudents[updatedStudents.length - 1] =  s ;
        this.studentCount  ++  ;
    }

    // Getters


    // Display all students in the major
    public void displayStudents() {

    }


}
