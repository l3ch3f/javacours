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
            private JTextField invoerVak, uitvoerVak, uitvoerVak2;
            private JLabel invoerLabel, uitvoerLabel, uitvoerLabel2;
            private JButton knop;

            public Paneel()
            {
                // Schakel lay-outmanager uit
                setLayout(null);

                // Maak de tekstvakken
                invoerVak = new JTextField(10);
                invoerVak.setHorizontalAlignment(JTextField.RIGHT);

                uitvoerVak = new JTextField(10);
                uitvoerVak.setHorizontalAlignment(JTextField.RIGHT);
                uitvoerVak.setBackground(Color.YELLOW);

                uitvoerVak2 = new JTextField(10);
                uitvoerVak2.setHorizontalAlignment(JTextField.RIGHT);
                uitvoerVak2.setBackground(Color.ORANGE);

                // Maak de labels
                invoerLabel = new JLabel("Maandsalaris");
                uitvoerLabel = new JLabel("Jaarsalaris");
                uitvoerLabel2 = new JLabel("Na 10 jaar");

                // Maak de knop
                knop = new JButton("Bereken");
                knop.addActionListener(new KnopHandler());

                // Voeg de componenten toe aan het paneel
                add(invoerLabel);
                add(invoerVak);
                add(uitvoerLabel);
                add(uitvoerVak);
                add(knop);
                add(uitvoerLabel2);
                add(uitvoerVak2);

                // Bepaal van alle componenten de plaats en afmeting
                invoerLabel.setBounds(80,50,120,20);
                invoerVak.setBounds(200,50,90,20);
                uitvoerVak.setBounds(200,80,90,20);
                uitvoerLabel.setBounds(80,80,120,20);
                knop.setBounds(300,50,100,20);
                uitvoerLabel2.setBounds(80,110,120,20);
                uitvoerVak2.setBounds(200,110,90,20);

            }
            // variables aanmaken
            private int jaarsalaris;
            private int maandsalaris;
            private int maal10;

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
                    maal10 = jaarsalaris * 10;
                    uitvoerVak2.setText(Integer.toString(maal10) + ",00");
                }
            }
        }



}
