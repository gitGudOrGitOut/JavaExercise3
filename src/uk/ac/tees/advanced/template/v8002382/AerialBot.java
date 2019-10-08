/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.advanced.template.v8002382;

/**
 *
 * @author v8002382
 */
public class AerialBot extends Bot{

    public AerialBot(String identifier) {
        super(identifier);
    }

    @Override
    public void doTask() {
        FileUtility.writeFile(f, identifier + ": Flying through the thin Martian atmosphere.");
    }

    @Override
    public boolean checkEnvironment() {
        return !Environment.dustStorm;
    }
    
}
