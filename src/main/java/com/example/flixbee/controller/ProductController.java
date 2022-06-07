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
public class ProductController {

    @RequestMapping(value = "/productList",method= RequestMethod.GET)
    public final ModelAndView getProductList(HttpServletRequest request, Locale locale, Model model) {

        ModelAndView mav = new ModelAndView();

        mav.addObject("title", "Nos produits");

        return mav;

    }

    @RequestMapping(value = "/product",method= RequestMethod.GET)
    public final ModelAndView getProduct(HttpServletRequest request, Locale locale, Model model) {

        ModelAndView mav = new ModelAndView();

        mav.addObject("title", "ProductName");

        return mav;

    }

    @RequestMapping(value = "/product",method = RequestMethod.POST)
    public void postProduct(HttpServletRequest request, @ModelAttribute("userForm") User userForm){

        String nameVerify = userForm.getName();
        System.out.println(nameVerify);

        /*Verification des données du formulaire ?*/

    }

}
