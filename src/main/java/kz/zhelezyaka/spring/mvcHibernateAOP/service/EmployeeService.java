package kz.zhelezyaka.spring.mvcHibernateAOP.service;

import kz.zhelezyaka.spring.mvcHibernateAOP.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
}