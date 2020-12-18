package tekenen;
// Hier maken we onze eerste panel.
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tekenen extends JFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new tekenen();
        frame.setSize(800, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Voorbeeld");
        JPanel paneel = new Paneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
    }
        static class Paneel extends JPanel
        {
            // tekenen in java
            public void paintComponent(Graphics g)
            {
                // altijd een super oproepen met paintComponent
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(170,50,60,160);
                g.fillRect(195,210,10,120);

                g.setColor(Color.RED);
                g.fillOval(180,60,40,40);

                g.setColor(Color.ORANGE);
                g.fillOval(180,110,40,40);

                g.setColor(Color.GREEN);
                g.fillOval(180,160,40,40);
            }
        }


}
