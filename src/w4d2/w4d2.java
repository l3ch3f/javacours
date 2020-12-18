package w4d2;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class w4d2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize( 300, 200 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Voorbeeld");
        JPanel paneel = new Paneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
    }
    static class Paneel extends JPanel {
        private double cijfer;
        public Paneel(){
            cijfer = 5.6;
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            if (cijfer > 5.5)
            {
                g.drawString("Je hebt een voldoende!", 49,40);
            }
            else
            {
                g.drawString("Je hebt een onvoldoende maak het beter!",40,40);
            }
        }
    }
}
