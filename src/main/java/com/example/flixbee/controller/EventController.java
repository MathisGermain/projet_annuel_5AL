package com.example.flixbee.controller;

import com.example.flixbee.model.event.DateEvent;
import com.example.flixbee.model.event.Event;
import com.example.flixbee.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Locale;

@Controller
public class EventController {

    @RequestMapping(value = "/eventList",method= RequestMethod.GET)
    public final ModelAndView getEventList(HttpServletRequest request, Locale locale, Model model) {

        ModelAndView mav = new ModelAndView();

        DateEvent dateEvent = new DateEvent("2022","11","30");
        Event event1 = new Event(dateEvent,"1","Event 1","Description de levent");
        Event event2 = new Event(dateEvent,"2","Event 2","Description de levent");

        ArrayList eventList = new ArrayList();
        eventList.add(event1);
        eventList.add(event2);

        mav.addObject("eventList",eventList);
        mav.addObject("title", "Nos évennements");

        return mav;

    }

    @RequestMapping(value = "/event",method= RequestMethod.GET)
    public final ModelAndView getEvent(HttpServletRequest request, Locale locale, Model model,@RequestParam("id") String eventId) {

        System.out.println(eventId);

        ModelAndView mav = new ModelAndView();


        DateEvent dateEvent = new DateEvent("2022","11","30");
        Event event1 = new Event(dateEvent,"1","Event 1","Description de levent");

        mav.addObject("event",event1);

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
