package Instructor;

public class Instructor extends Person {
    private String employeeNumber;

    public Instructor() {
        super();
    }

    public Instructor(String lastName, String firstName, String phone, String email, String employeeNumber) {
        super(lastName, firstName, phone, email);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() { return this.employeeNumber; }
    public void setEmployeeNumber(String employeeNumber) { this.employeeNumber = employeeNumber; }

    public String cleanEmployeeNumber() {
        if (this.employeeNumber == null) {
            return null;
        }
        return this.employeeNumber.trim().replace(" ", "");
    }

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                this.employeeNumber, this.lastName, this.firstName);
    }

    public String toCard() {
        StringBuilder sb = new StringBuilder();

        sb.append(" Instructor\n");
        sb.append("----------\n");
        sb.append("Employee #: ").append(this.employeeNumber).append("\n");
        sb.append("Name : ").append(this.lastName).append(", ").append(this.firstName).append("\n");
        sb.append("Email : ").append(this.email).append("\n");
        sb.append("Phone : ").append(this.phone);
        return sb.toString();
    }

    public String displayName() {
        StringBuilder sb = new StringBuilder();
        if (this.lastName != null) {
            sb.append(this.lastName);
        }
        if (this.firstName != null) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(this.firstName);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Instructor{id=" + id
                + " , lastName='" + lastName + '\''
                + ", firstName='" + firstName + '\''
                + " , phone='" + phone + '\''
                + ", email='" + email + '\''
                + ",  employeeNumber='" + employeeNumber + '\'' + '}';
    }
}