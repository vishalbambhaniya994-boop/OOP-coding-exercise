class Employee {
    protected String name;
    protected String department;

    
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}


class Manager extends Employee {
    private int teamSize;
    private String projectName;

    
    public Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    
    @Override
    public void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}


public class Main {
    public static void main(String[] args) {

        
        Employee emp = new Employee("Dharmik", "IT");

        
        Employee mgr = new Manager("Rahul", "HR", 10, "Recruitment System");

        
        System.out.println("Employee Details:");
        emp.displayDetails();

        System.out.println("\nManager Details:");
        mgr.displayDetails();  
    }
}
