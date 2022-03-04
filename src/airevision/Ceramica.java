package airevision;


import jade.core.Agent;

public class Ceramica extends Agent {

  

    @Override
    protected void setup() {
        
        if(AgentMainClass.ceramica != 1)
        {
            doDelete();
        }
        
    
    }

    @Override
    protected void takeDown() {
        
    }
}
