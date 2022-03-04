
package airevision;


import jade.core.Agent;


public class Masry extends Agent{
   
    @Override
     protected void setup()
    {
        
        if(AgentMainClass.masry != 1)
        {
            doDelete();
        }
      
     
    }
     @Override
    protected void takeDown()
    {
        
    }
   
}
