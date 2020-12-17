package jpanel;

// Hier maken we onze eerste panel.
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jpanel extends JFrame
{
    public static void main(String[] args)
    {
    JFrame frame = new jpanel();
    frame.setSize( 300, 200 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
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
            knop = new JButton("Klik");
            tekstvak = new JTextField(10);

            knop.addActionListener(new KnopKlikken());

            add(knop);
            add(tekstvak);
        }
//        klik function
        class KnopKlikken implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                tekstvak.setText("Ik heb geklikt!");
            }
        }
    }



}

