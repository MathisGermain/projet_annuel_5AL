package com.example.flixbee.controller;

import com.example.flixbee.model.LoginForm;
import com.example.flixbee.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method= RequestMethod.GET)
    public final ModelAndView getRequest(HttpServletRequest request, Locale locale, Model model) {

        ModelAndView mav = new ModelAndView();

        mav.addObject("loginForm",new LoginForm());
        mav.addObject("title", "Vous connecter");

        return mav;

    }

    @RequestMapping(method = RequestMethod.POST)
    public void postAssociationForm(HttpServletRequest request, @ModelAttribute("userForm") LoginForm loginForm){

        String email = loginForm.getEmail();
        String password = loginForm.getPassword();
        System.out.println(email);

        /*Verification des données du formulaire ?*/

    }



}
