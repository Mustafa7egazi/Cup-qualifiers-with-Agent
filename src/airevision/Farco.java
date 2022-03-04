
package airevision;


import jade.core.Agent;


public class Farco extends Agent {
    
    @Override
     protected void setup()
    {
        
        if(AgentMainClass.farco != 1)
        {
            doDelete();
        }
       
     
    }
     @Override
    protected void takeDown()
    {
        
    }
 
}
