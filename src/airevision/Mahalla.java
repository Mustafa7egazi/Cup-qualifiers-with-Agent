
package airevision;


import jade.core.Agent;

public class Mahalla extends Agent{
    
    @Override
     protected void setup()
    {
        
        if(AgentMainClass.mahalla != 1)
        {
            doDelete();
        }
       
     
    }
     @Override
    protected void takeDown()
    {
        
    }
    
}
