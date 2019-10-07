/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.basic.observer1.v8002382;

/**
 *
 * @author v8002382
 */
public class BankManager extends ShareWatcher{

    public BankManager(double sell, double buy, int increment)
    {
        super();
    }
    @Override
    public void updatePrice(double price) {
        if(price < 1)
        {
            portfolio += 100;
        }
        else if(price > 4 && portfolio >= 100)
        {
            
            portfolio -= 100;
        }
    }
}
