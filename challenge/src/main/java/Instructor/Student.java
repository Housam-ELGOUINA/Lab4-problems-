package Instructor;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student() {
        super();
    }

    public Student(String lastName, String firstName, String phone, String email, String cne, Major major) {
        super(lastName, firstName, phone, email);
        this.cne = cne;
        this.major = major;
    }

    public Student(String lastName, String firstName, String phone, String email, String cne) {
        super(lastName, firstName, phone, email);

        this.cne = cne;
    }

    public String getCne() { return this.cne; }

    public Major getMajor() { return this.major; }

    public void setCne(String cne) {
        this.cne = cne; }

    public void setMajor(Major m) { this.major = m; }

    public String getFullNameFormatted() {
        String last = this.lastName.toUpperCase();
        String first = this.firstName.substring(0, 1).toUpperCase()
                + this.firstName.substring(1).toLowerCase();
        return String.format("%s, %s", last, first);
    }

    public String getFullNameFormattedSB() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.lastName.toUpperCase()).append(", ");

        sb.append(this.firstName.substring(0, 1).toUpperCase());
        sb.append(this.firstName.substring(1).toLowerCase());
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Student{id=" + id
                + " , lastName='" + lastName +'\''
                + " , firstName='" + firstName  + '\''
                + ",  phone='" + phone +  '\''
                + ",  email='" + email  + '\''
                + ", cne='" + cne +  '\''
                + ", major=" + (major != null ? major.getName() : "none") + '}' ;
    }
}