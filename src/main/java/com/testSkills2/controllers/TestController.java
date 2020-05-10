package com.testSkills2.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.testSkills2.model.Customers;
import com.testSkills2.model.UserDetails;
import com.testSkills2.services.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller

public class TestController {

    @Autowired
    private CustomerService customerservice;

    @RequestMapping(value="/customers",method = RequestMethod.POST)
            public String getFirstPage(UserDetails userdetails, ModelMap modelmap)
            {
                String userName="Admin";
                String password="mugenya";
                System.out.println("name is "+userdetails.getUser());
                System.out.println("password is "+userdetails.getPassword());
                if(userdetails.getPassword().equals(password) && userdetails.getUser().equalsIgnoreCase(userName))
                {
                    return "customers";
                }
                else
                {
                    modelmap.addAttribute("error","Invalid Login credentials");

                    return "login";
                }

            }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/getCustomers", method = RequestMethod.GET)
    @ResponseBody
    public String getCustomers() throws JsonProcessingException {

       Iterable<Customers> customers = customerservice.getCustomers();

       ObjectMapper mapper= new ObjectMapper();

        String jsonString = mapper.writeValueAsString(customers);

        System.out.println(jsonString);


        return jsonString;
    }
//
//    @RequestMapping(value="/getCustomers",method = RequestMethod.GET)
//    @ResponseBody
//    public ModelAndView getCustomers() throws JsonProcessingException {
//        Long custid = Long.valueOf(2);
//        ModelAndView customerModel = new ModelAndView("customers");
////        List<Customers> customers= customerservice.getCustomers();
//        Customers customers = new Customers();
//        Customers customers = customerservice.getCustomer(custid);
//       // customerModel.addObject(customers );
//
//        ObjectMapper mapper = new JacksonMapper();
//
//        Jackson2DatatypeHelper.configureObjectMapper(objectMapper);
//
//
//        //Converting the Object to JSONString
//        String jsonString = mapper.writeValueAsString(customers);
//        System.out.println(jsonString);
//
//        customerModel.addObject(jsonString );
//
//        return  customerModel;
//    }


}
;