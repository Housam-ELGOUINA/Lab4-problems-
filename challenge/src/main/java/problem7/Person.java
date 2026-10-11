package problem7;

public abstract class Person {

    protected String name ;


    public Person(String name) {
        this.name  = name ;
    }


    public String getName() {return this.name ; }

    public void setName(String name ) {this.name = name ; }


    public abstract String getJob()  ;

    public void display() {System.out.println("I am "+ this.name + " the " + getJob());}
}
