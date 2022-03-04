package airevision;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AgentMainClass extends Application {

    public static int ahly = 1, ceramica = 1, degla = 1, enbi = 1, fcmasr = 1, farco = 1, future = 1, gish = 1, ismaily = 1, itihad = 1, mahalla = 1, masry = 1, pyramids = 1,
            smouha = 1, tersana = 1, zamalek = 1;

    public static int z;
    public static ArrayList<String> teams1 = new ArrayList<String>();

    public static jade.core.Runtime r = jade.core.Runtime.instance();
    public static Profile p = new ProfileImpl("localhost", 1000, "MyCustomizedPlat");

    public static ContainerController mainContainer = r.createMainContainer(p);

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b = new Button("Play");
        b.setOnAction((event) -> {

            try {
                AgentController manager;
                manager = mainContainer.createNewAgent("Manager", "airevision.A_Manager", null);
                manager.start();
                AgentController ahly
                        = mainContainer.createNewAgent("Ahly", "airevision.Ahly", null);
                ahly.start();

                AgentController fcmasr
                        = mainContainer.createNewAgent("FCMasr", "airevision.FCMasr", null);
                fcmasr.start();

                AgentController ceramica
                        = mainContainer.createNewAgent("Ceramica", "airevision.Ceramica", null);
                ceramica.start();

                AgentController degla
                        = mainContainer.createNewAgent("Degla", "airevision.Degla", null);
                degla.start();

                AgentController enbi
                        = mainContainer.createNewAgent("Enbi", "airevision.Enbi", null);
                enbi.start();

                AgentController farco
                        = mainContainer.createNewAgent("Farco", "airevision.Farco", null);
                farco.start();

                AgentController future
                        = mainContainer.createNewAgent("Future", "airevision.Future", null);
                future.start();

                AgentController gish
                        = mainContainer.createNewAgent("Gish", "airevision.Gish", null);
                gish.start();

                AgentController ismaily
                        = mainContainer.createNewAgent("Ismaily", "airevision.Ismaily", null);
                ismaily.start();

                AgentController itihad
                        = mainContainer.createNewAgent("Itihad", "airevision.Itihad", null);
                itihad.start();

                AgentController mahalla
                        = mainContainer.createNewAgent("Mahalla", "airevision.Mahalla", null);
                mahalla.start();

                AgentController masry
                        = mainContainer.createNewAgent("Masry", "airevision.Masry", null);
                masry.start();

                AgentController pyramids
                        = mainContainer.createNewAgent("Pyramids", "airevision.Pyramids", null);
                pyramids.start();

                AgentController smouha
                        = mainContainer.createNewAgent("Smouha", "airevision.Smouha", null);
                smouha.start();

                AgentController tersana
                        = mainContainer.createNewAgent("Tersana", "airevision.Tersana", null);
                tersana.start();

                AgentController zamalek
                        = mainContainer.createNewAgent("Zamalek", "airevision.Zamalek", null);
                zamalek.start();

                AgentController rma
                        = mainContainer.createNewAgent("rma", "jade.tools.rma.rma", null);
                rma.start();

            } catch (StaleProxyException ex) {
                Logger.getLogger(AgentMainClass.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

        BorderPane p = new BorderPane();

        Label l = new Label("Press play to finalize the cup");

        StackPane st = new StackPane(l);

        p.setTop(st);
        p.setCenter(b);

        Scene s = new Scene(p, 500, 400);

        primaryStage.setScene(s);
        primaryStage.setTitle("Football cup");
        primaryStage.show();
    }

    public static void main(String[] args) throws StaleProxyException {

        launch(args);

    }

}
