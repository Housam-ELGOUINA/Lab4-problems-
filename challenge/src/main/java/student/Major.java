package student;
//
public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    private static final int  MAX_STUDENTS = 50;

    public Major(String code, String name) {
        this.id  =  nextId ++ ;
        this.code =  code ;
        this.name  =  name ;

    }

    // Method to add a student
    public void addStudent(Student s) {
        if ( this.students != null) {
            if (this.students.length == MAX_STUDENTS) {
                System.out.println("Too many students already exist in this major !") ;
                return;
            }
        }

        Student[] updatedStudents  =  new Student[this.studentCount +1] ;
        for ( int i = 0 ; i < studentCount ; i++) {
            updatedStudents[i] =  this.students[i] ;

        }
        updatedStudents[this.studentCount] =  s ;
        this.studentCount  ++  ;


        this.students =  updatedStudents ;

        s.setMajor(this);
    }

    // Getters
    public  int getId() { return this.id; }

    public String getCode() { return this.code; }

    public String getName() { return this.name; }

    public int getStudentCount() { return this.studentCount; }
    public Student[] getStudents() {
        Student[] s = new Student[this.studentCount];
        for (int i = 0; i < this.studentCount; i++ ) {
            s[i] = this.students[i];
        }
        return s;
    }


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

    public Student findStudentbyCNE(String cne) {
        for ( int i = 0 ; i < this.studentCount ; i++) {
            if ( this.students[i].getCne() == cne) {
                return this.students[i] ;
            }
        }

        return null ;
    }

    public boolean removeStudent(String cne) {
        Student found =   findStudentbyCNE(cne) ;

        if ( found  == null) {
            return false ;

        }

        int indx  =  0 ;
        while ( this.students[indx] != found) {
            indx  ++ ;
        }

        for ( int i = indx ; i < this.studentCount -1 ; i++) {
            this.students[i]  =  this.students[i+1] ;
        }

        this.students[this.studentCount -1] = null ;
        this.studentCount -- ;
        found.setMajor(null);

        return true ;
    }


    public void getOccupancyRate() {
        System.out.println(this.getName() + "capacity : 50 students");
        System.out.println("Current Enrollement  : " + this.studentCount) ;
        System.out.println("Occupancy Rate  : " +  (this.studentCount* 100.0)/50) ;
    }

    public String getStudentListAsString() {
            StringBuilder sb  =  new StringBuilder() ;

            for ( int i =0 ; i < this.studentCount ;  i++) {
                Student s  =  this.students[i] ;
                sb.append(i+1) ;
                sb.append(".");
                sb.append(s.getCne()) ;
                sb.append(" ").append(s.getFullNameFormatted()) ;
                if ( i < this.studentCount -1) {
                    sb.append("\n") ;
                }
            }

            return sb.toString() ;


    }

    @Override
    public String toString() {
        return "Major{id : " + this.id + '\'' +
                 "  , " + this.name + '\'' +
                "  , " + this.code + '\'' +
                "  , " + this.studentCount +  " }" ;


    }


}
