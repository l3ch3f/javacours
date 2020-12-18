package w4d3;

import jpanel.jpanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class w4d3 {
    public static void main(String[]args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Voorbeeld");
        JPanel paneel = new Paneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
    }

    static class Paneel extends JPanel
    {
        private JButton knop;
        private JTextField tekstvak;
        public  Paneel()
        {
            // layout
            knop = new JButton("Controleer");
            tekstvak = new JTextField(10);

            knop.addActionListener(new Paneel.KnopKlikken());

            add(knop);
            add(tekstvak);
        }


        //        klik function
        class KnopKlikken implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String kleur = tekstvak.getText();
                if (kleur == "blauw")
                {
                    getGraphics().drawString("De kleur = blauw", 40,40);
                }
                else if (kleur == "rood")
                {
                    getGraphics().drawString("De kleur = rood", 40,40);
                }
            }
        }

    }
}
