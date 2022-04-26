package kz.zhelezyaka.spring.mvcHibernateAOP.controller;

import kz.zhelezyaka.spring.mvcHibernateAOP.dao.EmployeeDAO;
import kz.zhelezyaka.spring.mvcHibernateAOP.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        final List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "allEmployees";
    }
}
