package employee.version4;

public class EmployeeRoster {
    private Employee empList[];
    private int max;
    private int count;

    public EmployeeRoster() {
        this.max = 10;
        this.empList = new Employee[max];
        this.count = 0;
    }

    public EmployeeRoster(int max) {
        this.max = max;
        this.empList = new Employee[max];
        this.count = 0;
    }

    public int countEmployees() {
        return count;
    }
    
    public void addEmployee(Employee emp) {
        if (count < max) {
            empList[count] = emp;
            count++;
        } else {
            System.out.println("Roster is full. Cannot add more employees.");
        }
    }
    
    public boolean removeEmployee(int empID) {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && empList[i].getEmpID() == empID) {
                empList[i] = empList[count - 1];
                empList[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public Employee findEmployee(int empID) {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && empList[i].getEmpID() == empID) {
                return empList[i];
            }
        }
        return null;
    }

    public void displayAllEmployees() {
        System.out.println("Employee Roster:");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            Employee emp = empList[i];
            System.out.println("Employee ID: " + emp.getEmpID());
            System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName());
            System.out.println("Date Hired: " + emp.getEmpDateHired());
            System.out.println("Date of Birth: " + emp.getEmpBirthDate());
            System.out.println("Salary: $" + emp.computeSalary());
            System.out.println("---------------------------------------------------------");
        }
    }
}
