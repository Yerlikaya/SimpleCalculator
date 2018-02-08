/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import com.cinterface.ICalculator;


/**
 *
 * @author oguzhan.yerlikaya
 */
public class Multiplication implements ICalculator{

    @Override
    public double Calculate(int[] args) {
        int result =1;
        for(int num :args){
            result*=num;
        }
        return result;
    }
    
}
