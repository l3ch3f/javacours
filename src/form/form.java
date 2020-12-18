package form;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class form extends JFrame
{
        // nodig om de frame te maken.
        public static void main(String[] args) {
            JFrame frame = new form();
            frame.setSize(800, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Voorbeeld");
            JPanel paneel = new Paneel();
            frame.setContentPane(paneel);
            frame.setVisible(true);
        }


        // inhoud van de panel
        static class Paneel extends JPanel
        {
            private JTextField invoerVak, uitvoerVak;
            private JLabel invoerLabel, uitvoerLabel;
            private JButton knop;

            public Paneel()
            {
                // Maak de tekstvakken
                invoerVak = new JTextField(10);
                uitvoerVak = new JTextField(10);
                // Maak de labels
                invoerLabel = new JLabel("Maandsalaris");
                uitvoerLabel = new JLabel("Jaarsalaris");

                // Maak de knop
                knop = new JButton("Bereken");
                knop.addActionListener(new KnopHandler());

                // Voeg de componenten toe aan het paneel
                add(invoerLabel);
                add(invoerVak);
                add(uitvoerLabel);
                add(uitvoerVak);
                add(knop);

            }
            // variables aanmaken
            private int jaarsalaris;
            private int maandsalaris;

            // actionhandler
            class KnopHandler implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    // ik wil invoer pakken
                    String maandsalarisinvoer = invoerVak.getText();
                    // ik wil dat de invoer naar getal word
                    maandsalaris = parseInt(maandsalarisinvoer);
                    // ik wil dat de jaarsalaris word berekend op basis van invoer.
                    jaarsalaris = 12 * maandsalaris;
                    // uitprinten van de resultaat.
                    uitvoerVak.setText(Integer.toString(jaarsalaris) + ",00");
                }
            }
        }



}
