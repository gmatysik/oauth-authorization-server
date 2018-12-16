package com.authorization.server;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name");
        return "greeting";
    }

    @GetMapping("/greeting2")
    public String greeting2(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name");
        return "greeting";
    }


    @GetMapping("/greeting3")
    public String greeting3(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name");
        return "greeting";
    }

    @RequestMapping(value = "/login-ui", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

        return "loginpage";
    }
}