package kz.zhelezyaka.spring.mvcHibernateAOP.dao;

import kz.zhelezyaka.spring.mvcHibernateAOP.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);
}
