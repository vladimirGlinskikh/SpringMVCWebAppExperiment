package kz.zhelezyaka.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String workVersion;
    private Map<String, String> workVersions;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales Management");

        workVersions = new HashMap<>();
        workVersions.put("Office", "Office");
        workVersions.put("Remote", "Remote");
        workVersions.put("Mixed", "Remote/Office");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Map<String, String> getWorkVersions() {
        return workVersions;
    }

    public void setWorkVersions(Map<String, String> workVersions) {
        this.workVersions = workVersions;
    }

    public String getWorkVersion() {
        return workVersion;
    }

    public void setWorkVersion(String workVersion) {
        this.workVersion = workVersion;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
