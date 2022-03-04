package airevision;


import jade.core.Agent;


public class Degla extends Agent {
   
    
    @Override
     protected void setup()
    { 
        
        if(AgentMainClass.degla != 1 )
        {
            doDelete();
        }
      
        

    }
     @Override
    protected void takeDown()
    {
        
    }
   
}
