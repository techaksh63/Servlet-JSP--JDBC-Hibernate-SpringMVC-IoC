package main;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Doctor")
@Table(name = "Doctor")
public class Data {
    @Id
    @Column(name = "DoctorID")
    int DoctorID;

    @Column(name = "name")
    String name;

    @Column(name = "department")
    String department;

    public Data() {
    }

    public Data(String name, String department) {

        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Data {" +
                "DoctorID=" + DoctorID +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
