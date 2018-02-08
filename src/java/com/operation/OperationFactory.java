/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operation;

import com.cinterface.ICalculator;
import com.models.*;
import static java.lang.System.out;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author oguzhan.yerlikaya
 */
public class OperationFactory {

    private Map<String, ICalculator> Dict = new HashMap<String, ICalculator>();

    public OperationFactory() {
        Dict.put("+", new Addition());
        Dict.put("*", new Multiplication());
        Dict.put("-", new Subtraction());
        Dict.put("/", new Division());
    }

    public ICalculator FindOperator(String operation) throws Exception {
        ICalculator op = Dict.get(operation);
        if (op != null) {
            return op;
        }
        throw new Exception("Not Supported operation");
    }
}
