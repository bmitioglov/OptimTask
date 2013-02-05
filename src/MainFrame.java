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
        button = new JButton("RED");
        panel = new MyPanel();
        this.setSize(300, 200);
        //this.setBackground(SystemColor.desktop);
        panel.add(button);
        add(panel);
        ColorAction redAction = new ColorAction(Color.RED);
        button.addActionListener(redAction);
    }
    
    class ColorAction implements ActionListener{
        public ColorAction(Color c){
            background = c;
        }
        
        public void actionPerformed(ActionEvent event)
        {
            panel.setBackground(background);
        }
        private Color background;
    }
    
    
    private MyPanel panel;
    private JButton button;
}




class MyPanel extends JPanel{
    public MyPanel(){
        JButton redButton = new JButton("RED");
        this.add(redButton);
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

