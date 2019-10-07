/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.basic.multiton.v8002382;

import java.util.HashMap;
import java.util.regex.Pattern;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

/**
 *
 * @author v8002382
 */
public class Share {
    private double price;
    private static HashMap<String, Share> instances = new HashMap<>();
    private Share()
    {
        
    }
    public static Share getInstance(String companyName)
    {
        if(companyName == null)
            return null;
        Pattern pattern = Pattern.compile("[A-Z][A-Z][A-Z]");
        if(!pattern.matcher(companyName).matches())
            return null;
        Share instance = instances.get(companyName);
        if(instance == null)
        {
            instance = new Share();
            instance.price = 1.00;
            instances.put(companyName, instance);
        }
        return instance;
    }
    public double getValue()
    {
        return price;
    }
    public void setValue(double price)
    {
        this.price = price;
    }
}
