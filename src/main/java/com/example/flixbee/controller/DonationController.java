package com.example.flixbee.controller;

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
@RequestMapping("/donation")
public class DonationController {



        @RequestMapping(method= RequestMethod.GET)
        public final ModelAndView getRequest(HttpServletRequest request, Locale locale, Model model) {

            ModelAndView mav = new ModelAndView();

            //model.addAttribute("associationForm",new AssociationForm());
            mav.addObject("userForm",new User());
            mav.addObject("title", "Dons");

            return mav;

        }

        @RequestMapping(method = RequestMethod.POST)
        public void postAssociationForm(HttpServletRequest request, @ModelAttribute("userForm") User userForm){

            String nameVerify = userForm.getName();
            System.out.println(nameVerify);

            /*Verification des données du formulaire ?*/

        }



}
