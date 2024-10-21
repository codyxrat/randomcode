import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class Automat {

  public static void main(String[] args) {
    // Skriv Java-setninger her
    // leser inn beløp fra brukeren
    String talltekst = showInputDialog("Gi beløp i hele kr:");
    int belop = parseInt(talltekst);

    //begrenging
    int ant20 = belop / 20;
    int rest = belop % 20;
    int ant10 = belop / 10;
    rest = rest % 10; 

    String utTekst = "Belop: " + belop + "kr" + "\n"
                  + "utbetales ved" + "\n"
                  + "Ant. 20-kr: " + ant20 + "\n"
                  + "Ant. 10-kr: " + ant10;
    showMessageDialog(null, utTekst);

  }

}