import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;


public class MainFrame {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 500);
                frame.setLocation(300, 100);
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Image img = toolkit.getImage("logo.png");
                frame.setVisible(true);
                frame.setResizable(false);
            }
        });
    }
}


class SimpleFrame extends JFrame{
    public SimpleFrame()
    {
        this.setSize(300, 200);
        this.setBackground(SystemColor.desktop);
        MyPanel panel = new MyPanel();
        add(panel);
    }    
}

class MyPanel extends JPanel{
    public MyPanel(){
        
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
         try {
                    Image img1 = ImageIO.read(new URL("http://i.hh.ru/css/ambient/blocks/head/logo.png"));
                    g.drawImage(img1, 400, 200, null);
                } catch (IOException ex) {
                    g.drawString("url not found", 20, 20);
                }
        g.drawString("Hello, World!", 75, 100);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        Rectangle2D rect = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rect);
        g2.setColor(Color.blue);
        g2.fill(rect);
        
        
    }
}