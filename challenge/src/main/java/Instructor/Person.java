package Instructor;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String lastName;
    protected String firstName;
    protected String phone;
    protected String email;

    // No-arguments constructor
    public Person() {
        this.id = nextId++;
    }

    // Initialization constructor
    public Person(String lastName, String firstName, String phone, String email) {
        this.id = nextId++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
    }

    // Getters
    public int getId() { return this.id; }
    public String getLastName() { return this.lastName; }
    public String getFirstName() { return this.firstName; }
    public String getPhone() { return this.phone; }
    public String getEmail() { return this.email; }

    // Setters (no setId: the id is auto-incremented)
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }

    // From the class diagram: +display() : void
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Person{id=" + id
                + ", lastName='" + lastName + '\''
                + ", firstName='" + firstName + '\''
                + ", phone='" + phone + '\''
                + ", email='" + email + '\'' + '}';
    }
}