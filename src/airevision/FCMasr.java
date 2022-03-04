/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airevision;


import jade.core.Agent;

/**
 *
 * @author Mustafa R. Hegazy
 */
public class FCMasr extends Agent {
    
     @Override
    protected void setup() {
        
        
        if(AgentMainClass.fcmasr != 1 )
        {
            doDelete();
        }


    }
    @Override
    protected void takeDown()
    {
       
    }
    
}
