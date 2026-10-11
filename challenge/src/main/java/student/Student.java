package student;
//
public class Student extends Person {
    private String cne;
    private Major major;

      public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
                super(nom , prenom , telephone  , email);
                this.cne =  cne ;
                this.major =  major ;
     }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
          super(nom , prenom , telephone ,email) ;
          this.cne =  cne ;

    }

    // Getters
    public String getCne() {return this.cne ; }

    public Major getMajor() { return this.major ; }

    // Setters
    public void setCne(String cne) {this.cne =  cne ; }

    public void setMajor(Major m) {this.major =  m ; }


    public String getFullNameFormatted() {
          StringBuilder sb  =  new StringBuilder() ;
          sb.append(this.firstName.toUpperCase())
          .append(", ") ;
          sb.append(this.secondName.substring(0 ,1).toUpperCase())
          .append(this.secondName.substring(1).toLowerCase()) ;
          return sb.toString() ;
    }

    @Override
    public String toString() {

        return "Student{id=" + id
                + ", firstName='" + firstName + '\''
                + ", secondName='" + secondName + '\''
                + ", phone='" + phone + '\''
                + ", email='" + email + '\''
                + ", cne='" + cne + '\''
                + ", major=" + (major != null ? major.getName() : "none") + '}';
    }

}
//
