package kz.zhelezyaka.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
    public String showEmployeeDetails(@ModelAttribute("employee") Employee emp) {
        return "showEmployeeDetailsView";
    }
}
