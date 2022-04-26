package kz.zhelezyaka.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


@Controller
@RequestMapping({"/", "/employee"})
public class MyController {

    @RequestMapping("/")
    public String showView() {
        return "myView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "askEmployeeDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee emp,
                                      BindingResult bindingResult) {
        System.out.println("Surname length = " + emp.getSurname().length());
        if (bindingResult.hasErrors()) {
            return "askEmployeeDetailsView";
        } else {
            return "showEmployeeDetailsView";
        }
    }
}
