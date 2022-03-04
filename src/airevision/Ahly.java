package airevision;


import jade.core.Agent;

public class Ahly extends Agent {

    

    @Override
    protected void setup() {
        

        if(AgentMainClass.ahly != 1)
        {
            doDelete();
        }   
        
         

    }

            @Override
            protected void takeDown() {
                
            }
}
