package student;

public class Test {
    public static void main(String[] args) {
        Major cs = new Major("CS", "Computer Science");
        Major math = new Major("MATH", "Mathematics");

        // b. Create some students associated with these majors
        Student s1 = new Student("SAFI", "Amal", "1", "amal.safi@mail.com", "1111");
        Student s2 = new Student("ALAMI", "Samir", "2", "samir.alami@mail.com", "2222");
        Student s3 = new Student("x", "Yassine", "3", "yassine.benani@mail.com", "3333");
        Student s4 = new Student("y", "Salma", "4", "salma.idrissi@mail.com", "4444");

        // Display computer science students


        cs.addStudent(s1);
        cs.addStudent(s2);
        math.addStudent(s3);
        math.addStudent(s4);

        System.out.println("the students that are in Computer science major : ") ;

        Student[] s  =  cs.getStudents() ;

        for ( int i =0 ; i < s.length ; i++ ) {
            System.out.println((i+1) + ". " + s[i].getCne() + " " + s[i].getFirstName() + "  " + s[i].getSecondName());


        }


        System.out.println("Formatted name : " + s1.getFullNameFormatted());
        System.out.println("Uknown CNE: " + cs.findStudentbyCNE("000000")) ;

        System.out.println("Students in CS : " + cs.getStudentCount()) ;

        cs.getOccupancyRate();

        System.out.println("Remove student "  + cs.removeStudent("1111")) ;

        System.out.println("Students in CS now " + cs.getStudentCount()) ;

        System.out.println("Mathematics students:") ;
        System.out.println(math.getStudentListAsString()) ;
        System.out.println("Computer Science studens after removal: ") ;
        System.out.println(cs.getStudentListAsString());
    }
}

