package com.example.flixbee.baseModule.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/")
public class menuController {


    @RequestMapping(method= RequestMethod.GET)
    public final ModelAndView getRequest(HttpServletRequest request, Locale locale, Model model) {

        ModelAndView mav = new ModelAndView();

        return mav;

    }

}
