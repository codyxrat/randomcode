// Test av enkel Java-kode
// Leser navn fra brukeren og skriver ut 
// en personlig melding til denne.
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class SkrivMelding {

  public static void main(String[] args) {
    // Leser inn navn fra brukeren
    // showinputDialog er boks hvor man skriver inn input  
    String navn = showInputDialog("Gi navnet ditt");

    // Utskrift 
    out.println("Hei " + navn + "!");
  }

}