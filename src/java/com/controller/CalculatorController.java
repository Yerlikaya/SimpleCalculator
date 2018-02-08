/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.operation.Calculator;
import com.operation.OperationFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author oguzhan.yerlikaya
 */
@Controller

public class CalculatorController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "calculate", method = RequestMethod.POST)
    public @ResponseBody
    String Calculate(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int value1 = Integer.parseInt(request.getParameter("value1"));
        int value2 = Integer.parseInt(request.getParameter("value2"));
        int arrValues[] ={value1, value2};
        String operation = request.getParameter("operation");
        Calculator calculator = new Calculator();
        OperationFactory operationFactory =new OperationFactory();
        Double result=calculator.Calculate(operationFactory.FindOperator(operation),arrValues );
        return result.toString();
    }
}
