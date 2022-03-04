
package airevision;


import jade.core.Agent;


public class Enbi extends Agent {
    
    
    @Override
     protected void setup()
    {
        
        if(AgentMainClass.enbi != 1)
        {
            doDelete();
        }
        
     

    
    }
     @Override
    protected void takeDown()
    {
        
    }
   
}
