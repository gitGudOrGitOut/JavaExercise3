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
public abstract class MalfunctionHandler {
    public File file = new File("log-cor2.txt");
    protected Severity severity;
    MalfunctionHandler next;
    final public void processMalfunction(Malfunction malfunction)
    {
        System.out.println(malfunction.severity);
            System.out.println(severity);
        if(malfunction.getSeverity().compareTo(severity) <= 0)
        {
            System.out.println("ill do it");
            
            System.out.println();
            handleProblem(malfunction);
        }
        else
        {
            System.out.println("next handle pls");
            System.out.println();
            next.processMalfunction(malfunction);
        }
    }
    public void setNextHandler(MalfunctionHandler next)
    {
        this.next = next;
    }
    protected abstract void handleProblem(Malfunction malfunction);
}
