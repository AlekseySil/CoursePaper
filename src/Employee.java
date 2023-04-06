public class Employee {
    private String name;
    private Id id;
    private int department;
    private int salary;

    public Employee(String name, Id id, int department, int salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }


    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Ф.И.О: " + name +
                ", id: " + id +
                ", отдел: " + department +
                ", зарплата: " + salary ;
    }
}
