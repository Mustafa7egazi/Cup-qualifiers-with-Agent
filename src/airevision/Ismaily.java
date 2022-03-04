package airevision;


import jade.core.Agent;

public class Ismaily extends Agent {

    @Override
    protected void setup() {
        
        if(AgentMainClass.ismaily != 1)
        {
            doDelete();
        }
      
       

     
    }
    @Override
    protected void takeDown()
    {
       
    }
 
}
