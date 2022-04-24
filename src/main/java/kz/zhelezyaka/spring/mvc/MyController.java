package kz.zhelezyaka.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showView() {
        return "myView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "askEmployeeDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails() {
        return "showEmployeeDetailsView";
    }
}
