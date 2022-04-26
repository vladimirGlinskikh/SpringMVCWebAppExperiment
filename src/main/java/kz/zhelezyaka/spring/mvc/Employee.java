package kz.zhelezyaka.spring.mvc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name must be minimum 2 symbols")
    private String name;
    @NotEmpty(message = "Surname is required field")
    @NotBlank(message = "Surname is required field")
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String workVersion;
    private Map<String, String> workVersions;
    private String[] languages;
    private Map<String, String> languageList;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales Management");

        workVersions = new HashMap<>();
        workVersions.put("Office", "Office");
        workVersions.put("Remote", "Remote");
        workVersions.put("Mixed", "Remote/Office");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("French", "FR");
        languageList.put("Spanish", "SP");
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

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", salary=" + salary + ", department='" + department + '\'' + '}';
    }
}
