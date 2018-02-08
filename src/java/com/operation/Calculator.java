/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operation;

import com.cinterface.ICalculator;

/**
 *
 * @author oguzhan.yerlikaya
 */
public class Calculator {
     public double Calculate(ICalculator calculator,  int[] args)
        {            
            return calculator.Calculate(args);
        }
}
