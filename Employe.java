 class Employee {
    private String name;
    private int age;
    private double salary;

  
    public Employee() {
        this.name = "Unknown";
        this.age = 0;
        this.salary = 0.0;
    }

     
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

     
    public Employee(Employee employee) {
        this.name = employee.name;
        this.age = employee.age;
        this.salary = employee.salary;
    }

     
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
         
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Supriya",27, 50000.0);
        Employee employee3 = new Employee(employee2);

         
        System.out.println("Employee 1:");
        employee1.displayDetails();

        System.out.println("\nEmployee 2:");
        employee2.displayDetails();

        System.out.println("\nEmployee 3:");
        employee3.displayDetails();
    }
}

OUTPUT:

Employee 1:
Name: Unknown
Age: 0
Salary: 0.0

Employee 2:
Name: Supriya
Age: 27
Salary: 50000.0

Employee 3:
Name: Supriya
Age: 27
Salary: 50000.0
