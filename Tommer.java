
//Leser lengde i tommer, begregner og skriver ut lengden i meter

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class Tommer {

  public static void main(String[] args) {


    //deklarer konstant
    final double CM_I_TOMME = 2.54;

    // leser inn lengden fra brukeren
    String talltekst = showInputDialog("Gi tall tommer:");
    int antallTommer = parseInt(talltekst);

    //beregner lengde i cm
    double lengdeCm = antallTommer*CM_I_TOMME;
    double lengdeM = lengdeCm/100; 

    //avrunder meterlengden til 2 desimaler s.57
    //lengdeM = (double)round(lengdeM*100)/100;
    lengdeM = (int)(lengdeM*100 + 0.5)/100.0;

    //utskrift
    String utTekst = "Antall tommer: " + antallTommer + "\n"
                  + "Lengde i cm: " + lengdeCm + "\n"
                  + "Lengde i m: " + lengdeM;
    showMessageDialog(null, utTekst);



  }

}