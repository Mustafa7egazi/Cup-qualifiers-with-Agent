package airevision;


import jade.core.Agent;

public class Itihad extends Agent {

    @Override
    protected void setup() {
        
        if(AgentMainClass.itihad != 1)
        {
            doDelete();
        }
      
        
           
    }   
    @Override
    protected void takeDown()
    {
        
    }
}
