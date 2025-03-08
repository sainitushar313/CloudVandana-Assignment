import java.util.*;

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id,String name,double salary){
        this.id=id;
        this.name= name;
        this.salary =salary;
    }

    public void displayDetails(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
        System.out.println();
    }
}

// main class
public class EmployeeManagement {
    public static void main(String[] args) {
      Employee emp1=new Employee(101,"Ram",50000);
        Employee emp2=new Employee(102,"Shyam",70000);
        Employee emp3=new Employee(103,"Amit",60000);

        List<Employee> empList=new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        System.out.println("Employee Details:");
        System.out.println("-----------------");
        for(Employee emp:empList){
            emp.displayDetails();
        }
    }
}
