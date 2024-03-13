package main;

public class Data {
    private String EName;
    private String Email;
    private String Department;
    private String Salary;

    public Data(String EName, String email, String department, String salary) {
        this.EName = EName;
        Email = email;
        Department = department;
        Salary = salary;
    }

    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return  "EName='" + EName + '\'' +
                ", Email='" + Email + '\'' +
                ", Department='" + Department + '\'' +
                ", Salary='" + Salary + '\'' ;
    }
}
