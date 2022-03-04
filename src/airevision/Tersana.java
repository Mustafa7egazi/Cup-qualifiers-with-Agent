
package airevision;


import jade.core.Agent;


public class Tersana extends Agent{
   
    @Override
     protected void setup()
    {
        
        if(AgentMainClass.tersana != 1)
        {
            doDelete();
        }

    }
     @Override
    protected void takeDown()
    {
        
    }

}
