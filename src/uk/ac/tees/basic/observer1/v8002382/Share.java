/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.basic.observer1.v8002382;

import java.util.ArrayList;

/**
 *
 * @author v8002382
 */
public class Share {
    private double price = 1.00;
    private ArrayList<ShareWatcher> observers = new ArrayList<>();
    public boolean addShareWatcher(ShareWatcher observer)
    {
        observers.add(observer);
        return true;
    }
    public boolean removeShareWatcher(ShareWatcher observer)
    {
        if(!observers.contains(observer))
            return false;
        observers.remove(observer);
        return true;
    }

    public void setPrice(double price) {
        this.price = price;
        for(ShareWatcher observer : observers)
            observer.updatePrice(price);
    }

    public double getPrice() {
        return price;
    }
    
}
