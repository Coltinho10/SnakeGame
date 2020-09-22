import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class Frame 
{
    private boolean ready;
    JFrame frame = new JFrame();
    Screen screen = new Screen();


    public Frame()
    {

            frame.add(screen);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Snake");
            frame.setResizable(false);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        //}

    }
  
    **/
    public static void main(String[] args)
    {
        Frame newFrame = new Frame();
    }

}
