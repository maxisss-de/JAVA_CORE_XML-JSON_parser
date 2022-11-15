import java.util.List;

public class Staff {

    private List<Employee> employee;

    public List<Employee> getEmployees() {
        return employee;
    }

    public void setEmployee(List employee) {
        this.employee = employee;
    }

    public String toString() {
        return "Person{" +
                ", employee=" + employee +
                '}';
    }
}

