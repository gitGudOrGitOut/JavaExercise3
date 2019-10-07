/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.standard.cor1.v8002382;

import java.io.File;

/**
 *
 * @author v8002382
 */
public class SpaceMonkey extends MalfunctionHandler{


    public SpaceMonkey(Severity severity) {
        super();
        this.severity = severity;
    }
    
    @Override
    public void handleProblem(Malfunction malfunction)
    {
            FileUtility.writeFile(file, malfunction.getDescription());
            FileUtility.writeFile(file, "---> Space monkey assigned to problem.\n\n");
    }
    
}
