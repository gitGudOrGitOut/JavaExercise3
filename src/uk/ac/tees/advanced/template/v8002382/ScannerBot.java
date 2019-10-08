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
public class ScannerBot extends Bot{

    public ScannerBot(String identifier) {
        super(identifier);
    }

    @Override
    public void doTask() {
        FileUtility.writeFile(f, identifier + ": Scanning local terrain for water.");
    }

    @Override
    public boolean checkEnvironment() {
        if(Environment.radiationLevel.compareTo(RadiationLevel.MEDIUM) > 0)
            return false;
        return true;
    }
    
}
