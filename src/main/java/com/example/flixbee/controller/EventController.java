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
public class EventController {

    @RequestMapping(value = "/eventList",method= RequestMethod.GET)
    public final ModelAndView getEventList(HttpServletRequest request, Locale locale, Model model) {

        ModelAndView mav = new ModelAndView();

        mav.addObject("title", "Nos évennements");

        return mav;

    }

    @RequestMapping(value = "/event",method= RequestMethod.GET)
    public final ModelAndView getEvent(HttpServletRequest request, Locale locale, Model model) {

        ModelAndView mav = new ModelAndView();

        mav.addObject("title", "ProductName");

        return mav;

    }

    @RequestMapping(value = "/event",method = RequestMethod.POST)
    public void postEvent(HttpServletRequest request, @ModelAttribute("userForm") User userForm){

        String nameVerify = userForm.getName();
        System.out.println(nameVerify);

        /*Verification des données du formulaire ?*/

    }



}
