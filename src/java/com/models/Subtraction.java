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
public class Subtraction implements ICalculator {

    @Override
    public double Calculate(int[] args) {
        int result = args[0];
        for (int i = args.length - 1; 0 < i; i--) {
            result -= args[i];
        }
        return result;
    }

}
