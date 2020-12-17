package jpanelvar;

// Hier maken we onze eerste panel.
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jpanelvar extends JFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new jpanelvar();
        frame.setSize( 800, 300 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Voorbeeld");
        JPanel paneel = new Paneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
    }

    static class Paneel extends JPanel
    {
        private int leeftijd;
        private String naam;
        private int geboortedag;
        private int geboortemaand;
        private int geboortejaar;
        private String geboortedatum;
        private int resultaat;

        public Paneel()
        {
            leeftijd = 10;
            naam = "Mc Fergus";
            geboortedag = 26;
            geboortemaand = 3;
            geboortejaar = 1987;
            geboortedatum = geboortedag + "-" + geboortemaand + "-" + geboortejaar;
            resultaat = geboortedag + geboortemaand;
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
//                Zet de waarden op het scherm
            g.drawString("Ik ben " + naam + " en ben " + leeftijd + " jaar oud en geboren op " + geboortedatum, 100, 40);
            g.drawString("De volgende zin laat zien dat mijn geboortedag en geboortemaand bij elkaar word opgeteld",100,70);
            g.drawString(Integer.toString(geboortedag) + "+" + Integer.toString(geboortemaand) + "=" + Integer.toString(resultaat),100,100);
        }
    }



}
