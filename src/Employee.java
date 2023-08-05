public class Employee {
    String name;
    String id;
    String department;
    String jobTitle;
    double salary;
    public Employee(String name, String id, double salary, String department, String jobTitle) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "{" +
                "\nName = " + name +
                "\nID = " + id +
                "\nSalary = " + salary +
                "\nDepartment = " + department +
                "\nJob Title = " + jobTitle +
                "\n}";
    }

}

