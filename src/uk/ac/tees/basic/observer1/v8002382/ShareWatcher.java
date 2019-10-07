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
public abstract class ShareWatcher {
    protected int portfolio;
    protected double balance;
    public abstract void updatePrice(double price);

    public ShareWatcher() {

    }
    
    public int getPortfolio()
    {
        return portfolio;
    }
    public void setPortfolio(int portfolio)
    {
        this.portfolio = portfolio;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
