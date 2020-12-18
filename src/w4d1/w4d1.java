package w4d1;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class w4d1 extends JFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new w4d1();
        frame.setSize( 300, 200 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Voorbeeld");
        JPanel paneel = new Paneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
    }
    static class Paneel extends JPanel
    {
        private int leeftijd;

        public  Paneel()
        {
            leeftijd = 14;
        }
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            // zet de waarden op het scherm:
            if (leeftijd > 18) {
                g.drawString("Je mag een biertje of wijntje drinken!", 40, 40);
            }
            else {
                g.drawString("Je bent niet oud genoeg", 40, 40);
            }
        }
    }
}


