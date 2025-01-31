class Employee{
    int id ;
    int salary ;
    String name ;

    public void printDetails() {
        System.out.println("My ID is : " + id);
        System.out.println("My name is : " + name);
       
    }
    public int getSalary() {
        return salary ;
    }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class.");

        Employee sachin = new Employee() ; // instantiating a new employee object.
        Employee john = new Employee() ; // instantiating a new employee object.

        // Setting Attributes for sachin.
        sachin.id = 1 ;
        sachin.salary = 20000 ;
        sachin.name = "TheCodingGarage" ;

        // Setting Attributes for john.
        john.id = 11 ;
        john.salary = 15000 ;
        john.name = "TheCodingGarage123" ;

        // Printing the Attributes.
        sachin.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        // System.out.println(sachin.id);
        // System.out.println(sachin.name);

    }
}
