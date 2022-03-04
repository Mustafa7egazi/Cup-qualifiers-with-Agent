package airevision;

import jade.core.Agent;

public class Zamalek extends Agent {


    @Override
    protected void setup() {
        
        if(AgentMainClass.zamalek != 1)
        {
            doDelete();
        }
       
       
    }
    @Override
    protected void takeDown()
    {
        
    }

}
