/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.advanced.template.v8002382;

import java.io.File;

/**
 *
 * @author v8002382
 */
public abstract class Bot {
    String identifier;
    File f = new File("log-advanced.txt");

    public Bot(String identifier) {
        this.identifier = identifier;
    }
    public abstract boolean checkEnvironment();
    
    public void powerUp()
    {
        FileUtility.writeFile(f, identifier + ": Powering up.");
    }
    public void powerDown()
    {
        FileUtility.writeFile(f, identifier + ": Powering down.");
    }
    
    public abstract void doTask();
    
    final public void executeTask()
    {
        if(checkEnvironment())
        {
            powerUp();
            doTask();
            powerDown();
        }
    }
}
