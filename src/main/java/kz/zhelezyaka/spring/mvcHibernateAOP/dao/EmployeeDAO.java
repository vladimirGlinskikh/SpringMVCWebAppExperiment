package kz.zhelezyaka.spring.mvcHibernateAOP.dao;

import kz.zhelezyaka.spring.mvcHibernateAOP.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
