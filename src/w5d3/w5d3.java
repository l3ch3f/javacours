package w5d3;

import form.form;

import javax.swing.*;
import java.awt.*;

public class w5d3 extends JFrame
{
    public static void main(String[]args)
    {
        // nodig om de frame te maken.
        JFrame frame = new JFrame();
        frame.setSize(800, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Voorbeeld");
        JPanel paneel = new Paneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
    }

    static class Paneel extends JPanel
    {
        int i = 0;
        int hoogte = 40;
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            for (i=0;i<=10;i++)
            {
                repaint();
                g.drawString(i+"x 7 = "+i*7,40,hoogte+=20);
            }
        }
    }


}
