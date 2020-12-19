package w5d2;

import w4d1.w4d1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class w5d2 extends JFrame{
    public static void main(String[] args)
    {
        int temperatuur = 15;

            while(temperatuur < 24)
            {
               System.out.println("De temperatuur = "+temperatuur);
               temperatuur++;
            }
            while (temperatuur <= 30)
            {
                System.out.println("Het word best heet De temperatuur = "+temperatuur);
                temperatuur++;
            }

    }
}
