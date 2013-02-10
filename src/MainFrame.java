import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MainFrame {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 500);
                frame.setLocation(300, 100);
                frame.setVisible(true);
                frame.setResizable(false);
            }
        });
    }
}


class SimpleFrame extends JFrame{
    public SimpleFrame()
    {
        panel = new SecondPanel(this);
        add(panel);
        pack();
    }
    private SecondPanel panel;
}







