package kz.zhelezyaka.spring.mvcHibernateAOP.service;

import kz.zhelezyaka.spring.mvcHibernateAOP.dao.EmployeeDAO;
import kz.zhelezyaka.spring.mvcHibernateAOP.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
