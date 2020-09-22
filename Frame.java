import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class Frame //implements ActionListener
{
    private boolean ready;
    JFrame frame = new JFrame();
    Screen screen = new Screen();
    //JButton button = new JButton("Click to start");

    public Frame()
    {
        //if (ready = true)
        //{
            //frame.add(button);
            frame.add(screen);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Snake");
            frame.setResizable(false);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            //initializeComponents();
        //}

    }

    //public void initializeComponents()
    //{
    //    ready = false;
    //    if (ready = true)
    //    {
    //        frame.add(screen);
    //    }
        //frame.add(screen);
    //}

    /**
    //Add an action listener
    button.addActionListener(new Listener());

    private class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //What to do when button is pressed
        }
    }
    **/
    public static void main(String[] args)
    {
        Frame newFrame = new Frame();
    }

    /**
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button)
        {
            try
            {
                ready = true;
                new Frame();
            }
            catch (Exception e1)
            {
                System.out.println("Error.");

            }

        }

    }
    **/
}