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

        if (this.students.length == 50) {
            System.out.println("Too many students already exist in this major !") ;
            return;
        }
        Student[] updatedStudents  =  new Student[this.students.length +1] ;
        for ( int i = 0 ; i < updatedStudents.length  ; i++) {
            updatedStudents[i] =  this.students[i] ;

        }
        updatedStudents[updatedStudents.length - 1] =  s ;
        this.studentCount  ++  ;
    }

    // Getters
    public  int getId() { return this.id; }

    public String getCode() { return this.code; }

    public String getName() { return this.name; }

    public int getStudentCount() { return this.studentCount; }


    // Setters :

    public void setId(int id ) {this.id  = id ; }
    public void setCode(String code) {this.code  =  code ;}
    public void setName(String name ) {this.name  = name  ; }



    // Display all students in the major
    public void displayStudents() {
        for (int i = 0; i < this.studentCount; i++) {
            System.out.println(this.students[i]); // uses Student.toString()
        }


    }

    @Override
    public String toString() {
        return "Major{id : " + this.id + '\'' +
                 "  , " + this.name + '\'' +
                "  , " + this.code + '\'' +
                "  , " + this.studentCount +  " }" ;


    }


}
