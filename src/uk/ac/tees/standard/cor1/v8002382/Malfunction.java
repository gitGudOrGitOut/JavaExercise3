/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.standard.cor1.v8002382;

/**
 *
 * @author v8002382
 */
public class Malfunction {
    Severity severity;
    String description;

    public Malfunction(Severity severity, String description) {
        this.severity = severity;
        if(description == null || description == "")
            this.description = "No description available. Probably serious.";
        else
            this.description = description;
    }

    public Severity getSeverity() {
        return severity;
    }

    public String getDescription() {
        return description;
    }
    
}
