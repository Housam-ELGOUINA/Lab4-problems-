package Instructor;

public class Subject {
    private static int  nextID = 1 ;
    private int id ;
    private String code ;
    private String title ;


    public Subject() {
        this.id  = nextID ++ ;
    }

    public Subject(String code , String title ) {
        this.id  =  nextID++ ;
        this.code  =  code ;
        this.title  = title ;
    }

    public int getId() {return this.id ; }
    public String getCode() {return this.code ;}
    public String getTitle() {return this.title ;}


    public void setCode(String code) { this.code = code; }
    public void setTitle(String title) { this.title = title; }


    public String normalizedCode() {
        if (this.code  == null) {
            return null ;
        }

        return this.code.trim().toUpperCase() ;
    }

    public String properTitle()  {
        if ( this.title == null) {
            return null ;
        }

        String[] words  = this.title.split(" ") ;
        StringBuilder sb =  new StringBuilder() ;
        for ( int i =0 ; i < words.length  ;  i++) {
            String w  = words[i] ;
            if ( w.length() != 0) {
                sb.append(w.substring(0 , 1).toUpperCase()) ;
                sb.append(w.substring(1)) ;
            }

            if (i < words.length -1) {
                sb.append(" ") ;
            }
        }
        return sb.toString() ;
    }


    public boolean isIntoCourse() {
        boolean title_matching = this.title != null && this.title.toLowerCase().contains("intro") ;

        boolean Code_matching = this.code  != null && this.normalizedCode().startsWith("INTRO-") ;

        return title_matching || Code_matching ;
    }


    public String syllabusLine(Instructor instructor) {
        StringBuilder sb  =  new StringBuilder() ;
        sb.append(this.code).append(" - ").append(this.title) ;
        sb.append("(Instructor: ").append(instructor.getLastName()).append(instructor.getFirstName()).append(")") ;

        return sb.toString() ;
    }

    @Override
    public String toString() {
        return "Susbject{id=" + id + ", code='"+ code + '\'' +", title='" +title+ '\'' + '}' ;
    }







}
