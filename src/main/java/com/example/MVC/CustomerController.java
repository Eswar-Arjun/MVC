package com.example.MVC;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
    @GetMapping("/home")
    public String home() {
        return "home";
    } 
    @PostMapping(value="/addCustomer")
    public String addCustomer(@RequestParam String FirstName,@RequestParam String LastName,@RequestParam String Email,Model model) {
    	model.addAttribute("FirstName",FirstName);
    	model.addAttribute("LastName",LastName);
    	model.addAttribute("Email",Email);
    	return "success";
    }
}