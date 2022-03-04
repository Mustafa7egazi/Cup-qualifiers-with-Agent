
package airevision;


import jade.core.Agent;


public class Future extends Agent {

    @Override
     protected void setup()
    {
        
        
        if(AgentMainClass.future != 1)
        {
            doDelete();
        }
      
      
    }
     @Override
    protected void takeDown()
    {
       
    }
  
}
