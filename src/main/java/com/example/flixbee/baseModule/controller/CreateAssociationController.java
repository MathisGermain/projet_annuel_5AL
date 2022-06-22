package com.example.flixbee.baseModule.controller;


import com.example.flixbee.baseModule.domain.association.AssociationForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/createAssociation")
public class CreateAssociationController {

    @RequestMapping(method= RequestMethod.GET)
    public final ModelAndView getRequest(HttpServletRequest request, Locale locale,Model model) {

        ModelAndView mav = new ModelAndView();
        AssociationForm associationForm = new AssociationForm();

        //model.addAttribute("associationForm",new AssociationForm());
        mav.addObject("associationForm",new AssociationForm());
        mav.addObject("title", "Creation de votre espace association");

        return mav;

    }

    @RequestMapping(method = RequestMethod.POST)
    public void postAssociationForm(HttpServletRequest request, @ModelAttribute("associationForm") AssociationForm associationForm){

        String nameVerify = associationForm.getName();
        System.out.println(nameVerify);

        /*Verification des données du formulaire ?*/

    }


}
