public class Employee {
   private String name;
    private int age;
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary){
        this.salary=salary;
    }



    public void setAge(Integer age){
        this.age=age;
    }
    public int setAge() {
        return age;
    }


    public Double getsalary() {
        return this.salary;
    }
}
public class Test {
    public static void main(String[] args) {
        Firm firm=new Firm("TCS",1009);

        Employee employee=new Employee();
        employee.setName("cris");
        employee.setSalary(10000.0);
        employee.setAge(22);
        firm.addEmployee(employee);
        System.out.println(employee.getName()+" "+employee.getsalary());
        System.out.println(firm.getEmployees());
        Employee employee2 = new Employee();
        employee2.setName("cyril");
        employee2.setSalary(10000.0);
        employee.setAge(23);
        firm.addEmployee(employee2);
        System.out.println(firm.getEmployees());
        firm.removeEmployee("cyril");
        System.out.println(firm.getEmployees());




    }
}
import java.util.ArrayList;
import java.util.List;

public class Firm {


    private String name;
    private int id;
    private List<Employee>employees=new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public int getId() {
        return id;
    }
    public List<Employee>getEmployees() {
        return employees;
    }
    public Firm(String name,Integer Id){
        this.name=name;
        this.id=id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public  void addEmployee(Employee employee){
        this.employees.add(employee);
    }
    public void removeEmployee(String name ){
        employees.removeIf(employee -> employee.getName().equals(name));


    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}
