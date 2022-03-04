
package airevision;


import jade.core.Agent;

public class Gish extends Agent {

    @Override
     protected void setup()
    {
        
        if(AgentMainClass.gish != 1)
        {
            doDelete();
        }
      

    }
     @Override
    protected void takeDown()
    {
        
    }
}
