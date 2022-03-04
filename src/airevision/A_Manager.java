package airevision;

import jade.core.Agent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class A_Manager extends Agent {

    @Override
    protected void setup() {

        String[] groupA = new String[]{"Ahly", "FCMasr", "Ceramica", "Degla", "Enbi", "Farco", "Future", "Gish"};
        String[] groupB = new String[]{"Ismaily", "Itihad", "Mahalla", "Masry", "Pyramids", "Smouha", "Tersana", "Zamalek"};
        
        String[] Staduim = new String[]{" AT Cairo ", " AT Borg-Alarab ", " AT Petro-sport ", " AT Ahly-We-Alsalam ",
            " AT Esmailya ", " AT Alswais ", " AT Defaa-Algaye ", " AT port-said "};
        
        String[] Referare = new String[]{"By AL-Bana", "By IbrahimNoor","By mohamedMaarouf", "By mohamedAdel",
            "By AminOmer", "By MahmoudAshor","By AlHanafy","By TarekSamy"};
        // Round1
        Random r = new Random();
        ArrayList teams = new ArrayList();
        ArrayList<String> teams2 = new ArrayList();

        // Round2
        ArrayList teams3 = new ArrayList();
        ArrayList<String> teams4 = new ArrayList();

        String semi1[] = new String[4];
        String semi2[] = new String[4];
        // Round3
        ArrayList<String> teams5 = new ArrayList();
        ArrayList teams6 = new ArrayList();
        String semi3[] = new String[2];
        String semi4[] = new String[2];

        // Round4
        ArrayList<String> teams7 = new ArrayList();
        ArrayList teams8 = new ArrayList();
        String semi5[] = new String[1];
        String semi6[] = new String[1];

        for (int i = 0; i < 8;) {
            int counter = 0;
            int value;
            while (counter < 8) {
                value = r.nextInt(8);

                if (teams.contains(value) != true) {
                    int left = r.nextInt(6);
                    int right = r.nextInt(6);

                    if (left != right) {

                        /*
                        
                        groupA[i] + " " + left
                                + " VS " + groupB[value] + " " + right + " \t \t " + Staduim[value]
                        */
                        
                        
                        System.out.println(
                                groupA[i]+"  "+left+" VS "+groupB[value]+" "+
                               right+Staduim[value]+" "+Referare[value]);

                        if (left < right) {
                            if (groupA[i].equals("Ahly")) {
                                AgentMainClass.ahly = 0;
                            } else if (groupA[i].equals("Ceramica")) {
                                AgentMainClass.ceramica = 0;
                            } else if (groupA[i].equals("Degla")) {
                                AgentMainClass.degla = 0;
                            } else if (groupA[i].equals("Enbi")) {
                                AgentMainClass.enbi = 0;
                            } else if (groupA[i].equals("FCMasr")) {
                                AgentMainClass.fcmasr = 0;
                            } else if (groupA[i].equals("Farco")) {
                                AgentMainClass.farco = 0;
                            } else if (groupA[i].equals("Future")) {
                                AgentMainClass.future = 0;
                            } else if (groupA[i].equals("Gish")) {
                                AgentMainClass.gish = 0;
                            }

                        } else if (right < left) {

                            if (groupB[value].equals("Ismaily")) {
                                AgentMainClass.ismaily = 0;
                            } else if (groupB[value].equals("Itihad")) {
                                AgentMainClass.itihad = 0;
                            } else if (groupB[value].equals("Mahalla")) {
                                AgentMainClass.mahalla = 0;
                            } else if (groupB[value].equals("Masry")) {
                                AgentMainClass.masry = 0;
                            } else if (groupB[value].equals("Pyramids")) {
                                AgentMainClass.pyramids = 0;
                            } else if (groupB[value].equals("Smouha")) {
                                AgentMainClass.smouha = 0;
                            } else if (groupB[value].equals("Tersana")) {
                                AgentMainClass.tersana = 0;
                            } else if (groupB[value].equals("Zamalek")) {
                                AgentMainClass.zamalek = 0;
                            }

                        }
                        teams.add(value);
                        counter++;
                        i++;

                    }

                }

            }
        }

        //  printing();
        if (AgentMainClass.ahly == 1) {
            teams2.add("Ahly");
        }
        if (AgentMainClass.ceramica == 1) {
            teams2.add("Ceramica");
        }
        if (AgentMainClass.degla == 1) {
            teams2.add("Degla");
        }
        if (AgentMainClass.enbi == 1) {
            teams2.add("Enbi");
        }
        if (AgentMainClass.fcmasr == 1) {
            teams2.add("FCMasr");
        }
        if (AgentMainClass.farco == 1) {
            teams2.add("Farco");
        }
        if (AgentMainClass.future == 1) {
            teams2.add("Future");
        }
        if (AgentMainClass.gish == 1) {
            teams2.add("Gish");
        }
        if (AgentMainClass.ismaily == 1) {
            teams2.add("Ismaily");
        }
        if (AgentMainClass.itihad == 1) {
            teams2.add("Itihad");
        }
        if (AgentMainClass.mahalla == 1) {
            teams2.add("Mahalla");
        }
        if (AgentMainClass.masry == 1) {
            teams2.add("Masry");
        }
        if (AgentMainClass.pyramids == 1) {
            teams2.add("Pyramids");
        }
        if (AgentMainClass.smouha == 1) {
            teams2.add("Smouha");
        }
        if (AgentMainClass.tersana == 1) {
            teams2.add("Tersana");
        }
        if (AgentMainClass.zamalek == 1) {
            teams2.add("Zamalek");
        }
        System.out.println("******************************************************");
        System.out.println(teams2);
        System.out.println("******************************************************");

      
        
      
        for (int i = 0; i < 4; i++) {
            semi1[i] = teams2.get(i);

        }
        for (int i = 0; i < 4; i++) {

            semi2[i] = teams2.get((i + 4));

        }

        for (int i = 0; i < 4;) {
            int counter = 0;
            int value;
            while (counter < 4) {
                value = r.nextInt(4);

                if (teams3.contains(value) != true) {
                    int left = r.nextInt(6);
                    int right = r.nextInt(6);

                    if (left != right) {

                        System.out.println(
                                semi1[i]+"  "+left+" VS "+semi2[value]+" "+
                               right+Staduim[value]+" "+Referare[value]);

                        if (left < right) {
                            if (semi1[i].equals("Ahly")) {
                                AgentMainClass.ahly = 0;
                            } else if (semi1[i].equals("Ceramica")) {
                                AgentMainClass.ceramica = 0;
                            } else if (semi1[i].equals("Degla")) {
                                AgentMainClass.degla = 0;
                            } else if (semi1[i].equals("Enbi")) {
                                AgentMainClass.enbi = 0;
                            } else if (semi1[i].equals("FCMasr")) {
                                AgentMainClass.fcmasr = 0;
                            } else if (semi1[i].equals("Farco")) {
                                AgentMainClass.farco = 0;
                            } else if (semi1[i].equals("Future")) {
                                AgentMainClass.future = 0;
                            } else if (semi1[i].equals("Gish")) {
                                AgentMainClass.gish = 0;
                            } else if (semi1[i].equals("Ismaily")) {
                                AgentMainClass.ismaily = 0;
                            } else if (semi1[i].equals("Itihad")) {
                                AgentMainClass.itihad = 0;
                            } else if (semi1[i].equals("Mahalla")) {
                                AgentMainClass.mahalla = 0;
                            } else if (semi1[i].equals("Masry")) {
                                AgentMainClass.masry = 0;
                            } else if (semi1[i].equals("Pyramids")) {
                                AgentMainClass.pyramids = 0;
                            } else if (semi1[i].equals("Smouha")) {
                                AgentMainClass.smouha = 0;
                            } else if (semi1[i].equals("Tersana")) {
                                AgentMainClass.tersana = 0;
                            } else if (semi1[i].equals("Zamalek")) {
                                AgentMainClass.zamalek = 0;
                            }

                        } else if (right < left) {
                            if (semi2[value].equals("Ahly")) {
                                AgentMainClass.ahly = 0;
                            } else if (semi2[value].equals("Ceramica")) {
                                AgentMainClass.ceramica = 0;
                            } else if (semi2[value].equals("Degla")) {
                                AgentMainClass.degla = 0;
                            } else if (semi2[value].equals("Enbi")) {
                                AgentMainClass.enbi = 0;
                            } else if (semi2[value].equals("FCMasr")) {
                                AgentMainClass.fcmasr = 0;
                            } else if (semi2[value].equals("Farco")) {
                                AgentMainClass.farco = 0;
                            } else if (semi2[value].equals("Future")) {
                                AgentMainClass.future = 0;
                            } else if (semi2[value].equals("Gish")) {
                                AgentMainClass.gish = 0;
                            } else if (semi2[value].equals("Ismaily")) {
                                AgentMainClass.ismaily = 0;
                            } else if (semi2[value].equals("Itihad")) {
                                AgentMainClass.itihad = 0;
                            } else if (semi2[value].equals("Mahalla")) {
                                AgentMainClass.mahalla = 0;
                            } else if (semi2[value].equals("Masry")) {
                                AgentMainClass.masry = 0;
                            } else if (semi2[value].equals("Pyramids")) {
                                AgentMainClass.pyramids = 0;
                            } else if (semi2[value].equals("Smouha")) {
                                AgentMainClass.smouha = 0;
                            } else if (semi2[value].equals("Tersana")) {
                                AgentMainClass.tersana = 0;
                            } else if (semi2[value].equals("Zamalek")) {
                                AgentMainClass.zamalek = 0;
                            }

                        }
                        teams3.add(value);
                        counter++;
                        i++;

                    }

                }

            }
        }

        if (AgentMainClass.ahly == 1) {
            teams4.add("Ahly");
        }
        if (AgentMainClass.ceramica == 1) {
            teams4.add("Ceramica");
        }
        if (AgentMainClass.degla == 1) {
            teams4.add("Degla");
        }
        if (AgentMainClass.enbi == 1) {
            teams4.add("Enbi");
        }
        if (AgentMainClass.fcmasr == 1) {
            teams4.add("FCMasr");
        }
        if (AgentMainClass.farco == 1) {
            teams4.add("Farco");
        }
        if (AgentMainClass.future == 1) {
            teams4.add("Future");
        }
        if (AgentMainClass.gish == 1) {
            teams4.add("Gish");
        }
        if (AgentMainClass.ismaily == 1) {
            teams4.add("Ismaily");
        }
        if (AgentMainClass.itihad == 1) {
            teams4.add("Itihad");
        }
        if (AgentMainClass.mahalla == 1) {
            teams4.add("Mahalla");
        }
        if (AgentMainClass.masry == 1) {
            teams4.add("Masry");
        }
        if (AgentMainClass.pyramids == 1) {
            teams4.add("Pyramids");
        }
        if (AgentMainClass.smouha == 1) {
            teams4.add("Smouha");
        }
        if (AgentMainClass.tersana == 1) {
            teams4.add("Tersana");
        }
        if (AgentMainClass.zamalek == 1) {
            teams4.add("Zamalek");
        }
        System.out.println("******************************************************");
        System.out.println(teams4);
        System.out.println("******************************************************");
        
       ///////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////////////
       
         
        for (int i = 0; i < 2; i++) {
            semi3[i] = teams4.get(i);

        }
        for (int i = 0; i < 2; i++) {

            semi4[i] = teams4.get((i + 2));

        }

        for (int i = 0; i < 2;) {
            int counter = 0;
            int value;
            while (counter < 2) {
                value = r.nextInt(2);

                if (teams6.contains(value) != true) {
                    int left = r.nextInt(6);
                    int right = r.nextInt(6);

                    if (left != right) {

                        System.out.println(
                                semi3[i]+"  "+left+" VS "+semi4[value]+" "+
                               right+Staduim[value]+" "+Referare[value]);

                        if (left < right) {
                            if (semi3[i].equals("Ahly")) {
                                AgentMainClass.ahly = 0;
                            } else if (semi3[i].equals("Ceramica")) {
                                AgentMainClass.ceramica = 0;
                            } else if (semi3[i].equals("Degla")) {
                                AgentMainClass.degla = 0;
                            } else if (semi3[i].equals("Enbi")) {
                                AgentMainClass.enbi = 0;
                            } else if (semi3[i].equals("FCMasr")) {
                                AgentMainClass.fcmasr = 0;
                            } else if (semi3[i].equals("Farco")) {
                                AgentMainClass.farco = 0;
                            } else if (semi3[i].equals("Future")) {
                                AgentMainClass.future = 0;
                            } else if (semi3[i].equals("Gish")) {
                                AgentMainClass.gish = 0;
                            } else if (semi3[i].equals("Ismaily")) {
                                AgentMainClass.ismaily = 0;
                            } else if (semi3[i].equals("Itihad")) {
                                AgentMainClass.itihad = 0;
                            } else if (semi3[i].equals("Mahalla")) {
                                AgentMainClass.mahalla = 0;
                            } else if (semi3[i].equals("Masry")) {
                                AgentMainClass.masry = 0;
                            } else if (semi3[i].equals("Pyramids")) {
                                AgentMainClass.pyramids = 0;
                            } else if (semi3[i].equals("Smouha")) {
                                AgentMainClass.smouha = 0;
                            } else if (semi3[i].equals("Tersana")) {
                                AgentMainClass.tersana = 0;
                            } else if (semi3[i].equals("Zamalek")) {
                                AgentMainClass.zamalek = 0;
                            }

                        } else if (right < left) {
                            if (semi4[value].equals("Ahly")) {
                                AgentMainClass.ahly = 0;
                            } else if (semi4[value].equals("Ceramica")) {
                                AgentMainClass.ceramica = 0;
                            } else if (semi4[value].equals("Degla")) {
                                AgentMainClass.degla = 0;
                            } else if (semi4[value].equals("Enbi")) {
                                AgentMainClass.enbi = 0;
                            } else if (semi4[value].equals("FCMasr")) {
                                AgentMainClass.fcmasr = 0;
                            } else if (semi4[value].equals("Farco")) {
                                AgentMainClass.farco = 0;
                            } else if (semi4[value].equals("Future")) {
                                AgentMainClass.future = 0;
                            } else if (semi4[value].equals("Gish")) {
                                AgentMainClass.gish = 0;
                            } else if (semi4[value].equals("Ismaily")) {
                                AgentMainClass.ismaily = 0;
                            } else if (semi4[value].equals("Itihad")) {
                                AgentMainClass.itihad = 0;
                            } else if (semi4[value].equals("Mahalla")) {
                                AgentMainClass.mahalla = 0;
                            } else if (semi4[value].equals("Masry")) {
                                AgentMainClass.masry = 0;
                            } else if (semi4[value].equals("Pyramids")) {
                                AgentMainClass.pyramids = 0;
                            } else if (semi4[value].equals("Smouha")) {
                                AgentMainClass.smouha = 0;
                            } else if (semi4[value].equals("Tersana")) {
                                AgentMainClass.tersana = 0;
                            } else if (semi4[value].equals("Zamalek")) {
                                AgentMainClass.zamalek = 0;
                            }

                        }
                        teams6.add(value);
                        counter++;
                        i++;

                    }

                }

            }
        }

        if (AgentMainClass.ahly == 1) {
            teams5.add("Ahly");
        }
        if (AgentMainClass.ceramica == 1) {
            teams5.add("Ceramica");
        }
        if (AgentMainClass.degla == 1) {
            teams5.add("Degla");
        }
        if (AgentMainClass.enbi == 1) {
            teams5.add("Enbi");
        }
        if (AgentMainClass.fcmasr == 1) {
            teams5.add("FCMasr");
        }
        if (AgentMainClass.farco == 1) {
            teams5.add("Farco");
        }
        if (AgentMainClass.future == 1) {
            teams5.add("Future");
        }
        if (AgentMainClass.gish == 1) {
            teams5.add("Gish");
        }
        if (AgentMainClass.ismaily == 1) {
            teams5.add("Ismaily");
        }
        if (AgentMainClass.itihad == 1) {
            teams5.add("Itihad");
        }
        if (AgentMainClass.mahalla == 1) {
            teams5.add("Mahalla");
        }
        if (AgentMainClass.masry == 1) {
            teams5.add("Masry");
        }
        if (AgentMainClass.pyramids == 1) {
            teams5.add("Pyramids");
        }
        if (AgentMainClass.smouha == 1) {
            teams5.add("Smouha");
        }
        if (AgentMainClass.tersana == 1) {
            teams5.add("Tersana");
        }
        if (AgentMainClass.zamalek == 1) {
            teams5.add("Zamalek");
        }
        System.out.println("******************************************************");
        System.out.println(teams5);
        System.out.println("******************************************************");
        
       
        ///////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////
        
        
            for (int i = 0; i < 1; i++) {
            semi5[i] = teams5.get(i);

        }
        for (int i = 0; i < 1; i++) {

            semi6[i] = teams5.get((i + 1));

        }

        for (int i = 0; i < 1;) {
            int counter = 0;
            int value;
            while (counter < 1) {
                value = r.nextInt(1);

                if (teams8.contains(value) != true) {
                    int left = r.nextInt(6);
                    int right = r.nextInt(6);

                    if (left != right) {

                       System.out.println(
                                semi5[i]+"  "+left+" VS "+semi6[value]+" "+
                               right+Staduim[value]+" "+Referare[value]);

                        if (left < right) {
                            if (semi5[i].equals("Ahly")) {
                                AgentMainClass.ahly = 0;
                            } else if (semi5[i].equals("Ceramica")) {
                                AgentMainClass.ceramica = 0;
                            } else if (semi5[i].equals("Degla")) {
                                AgentMainClass.degla = 0;
                            } else if (semi5[i].equals("Enbi")) {
                                AgentMainClass.enbi = 0;
                            } else if (semi5[i].equals("FCMasr")) {
                                AgentMainClass.fcmasr = 0;
                            } else if (semi5[i].equals("Farco")) {
                                AgentMainClass.farco = 0;
                            } else if (semi5[i].equals("Future")) {
                                AgentMainClass.future = 0;
                            } else if (semi5[i].equals("Gish")) {
                                AgentMainClass.gish = 0;
                            } else if (semi5[i].equals("Ismaily")) {
                                AgentMainClass.ismaily = 0;
                            } else if (semi5[i].equals("Itihad")) {
                                AgentMainClass.itihad = 0;
                            } else if (semi5[i].equals("Mahalla")) {
                                AgentMainClass.mahalla = 0;
                            } else if (semi5[i].equals("Masry")) {
                                AgentMainClass.masry = 0;
                            } else if (semi5[i].equals("Pyramids")) {
                                AgentMainClass.pyramids = 0;
                            } else if (semi5[i].equals("Smouha")) {
                                AgentMainClass.smouha = 0;
                            } else if (semi5[i].equals("Tersana")) {
                                AgentMainClass.tersana = 0;
                            } else if (semi5[i].equals("Zamalek")) {
                                AgentMainClass.zamalek = 0;
                            }

                        } else if (right < left) {
                            if (semi6[value].equals("Ahly")) {
                                AgentMainClass.ahly = 0;
                            } else if (semi6[value].equals("Ceramica")) {
                                AgentMainClass.ceramica = 0;
                            } else if (semi6[value].equals("Degla")) {
                                AgentMainClass.degla = 0;
                            } else if (semi6[value].equals("Enbi")) {
                                AgentMainClass.enbi = 0;
                            } else if (semi6[value].equals("FCMasr")) {
                                AgentMainClass.fcmasr = 0;
                            } else if (semi6[value].equals("Farco")) {
                                AgentMainClass.farco = 0;
                            } else if (semi6[value].equals("Future")) {
                                AgentMainClass.future = 0;
                            } else if (semi6[value].equals("Gish")) {
                                AgentMainClass.gish = 0;
                            } else if (semi6[value].equals("Ismaily")) {
                                AgentMainClass.ismaily = 0;
                            } else if (semi6[value].equals("Itihad")) {
                                AgentMainClass.itihad = 0;
                            } else if (semi6[value].equals("Mahalla")) {
                                AgentMainClass.mahalla = 0;
                            } else if (semi6[value].equals("Masry")) {
                                AgentMainClass.masry = 0;
                            } else if (semi6[value].equals("Pyramids")) {
                                AgentMainClass.pyramids = 0;
                            } else if (semi6[value].equals("Smouha")) {
                                AgentMainClass.smouha = 0;
                            } else if (semi6[value].equals("Tersana")) {
                                AgentMainClass.tersana = 0;
                            } else if (semi6[value].equals("Zamalek")) {
                                AgentMainClass.zamalek = 0;
                            }

                        }
                        teams8.add(value);
                        counter++;
                        i++;

                    }

                }

            }
        }

        if (AgentMainClass.ahly == 1) {
            teams7.add("Ahly");
        }
        if (AgentMainClass.ceramica == 1) {
            teams7.add("Ceramica");
        }
        if (AgentMainClass.degla == 1) {
            teams7.add("Degla");
        }
        if (AgentMainClass.enbi == 1) {
            teams7.add("Enbi");
        }
        if (AgentMainClass.fcmasr == 1) {
            teams7.add("FCMasr");
        }
        if (AgentMainClass.farco == 1) {
            teams7.add("Farco");
        }
        if (AgentMainClass.future == 1) {
            teams7.add("Future");
        }
        if (AgentMainClass.gish == 1) {
            teams7.add("Gish");
        }
        if (AgentMainClass.ismaily == 1) {
            teams7.add("Ismaily");
        }
        if (AgentMainClass.itihad == 1) {
            teams7.add("Itihad");
        }
        if (AgentMainClass.mahalla == 1) {
            teams7.add("Mahalla");
        }
        if (AgentMainClass.masry == 1) {
            teams7.add("Masry");
        }
        if (AgentMainClass.pyramids == 1) {
            teams7.add("Pyramids");
        }
        if (AgentMainClass.smouha == 1) {
            teams7.add("Smouha");
        }
        if (AgentMainClass.tersana == 1) {
            teams7.add("Tersana");
        }
        if (AgentMainClass.zamalek == 1) {
            teams7.add("Zamalek");
        }
        
        System.out.println("******************************************************");
        System.out.println(teams7);
   
        JOptionPane.showMessageDialog(null, " 16th stage \n " + teams2 +"\n"+ " 8th stage \n" + teams4 +
                "\n" + " 4th stage \n" + teams5 +"\n"+ " Final stage \n" 
                + teams7 + "\n" + " \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t  " 
                        + " ***** The champion team " + teams7.get(0) + " ***** ");

        System.out.println("******************************************************");
        
         
    }
            
            

}
