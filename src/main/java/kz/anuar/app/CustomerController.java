package kz.anuar.app;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String showProcess(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult) {
        System.out.println("Last name |" + theCustomer.getLastName() + "|");
        System.out.println("theBindingResult - " + theBindingResult);
        String result = null;
        if (theBindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }
}