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
        ColorAction redAction = new ColorAction("Red",Color.RED);
        ColorAction blueAction = new ColorAction("Blue",Color.BLUE);
        JButton button1 = new JButton(redAction);
        JButton button2 = new JButton(blueAction);
        panel = new MyPanel();
        panel.add(button1);
        panel.add(button2);
        add(panel);
        
        
        //Связывание клавиш с ключами действий
        InputMap imap = panel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke("ctrl B"), "blue");
        imap.put(KeyStroke.getKeyStroke("ctrl R"), "red");
        
        //Связывание ключей с действиями
        ActionMap amap = panel.getActionMap();
        amap.put("blue", blueAction);
        amap.put("red", redAction);
    }
    
    class ColorAction extends AbstractAction{
        public ColorAction(String name, Color c){
            this.putValue(NAME, name);
            this.putValue("color", c);
            this.putValue(Action.SHORT_DESCRIPTION, "Set panel color to " + name.toLowerCase());
            

        }
        public void actionPerformed(ActionEvent event)
        {
            Color c = (Color) getValue("color");
            panel.setBackground(c);
        }
    
    }
    
    private MyPanel panel;
}




class MyPanel extends JPanel{
    public MyPanel(){}
    /*@Override
    public void paintComponent(Graphics g)
    {
        g.drawString("Hello, World!", 75, 100);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        Rectangle2D rect = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rect);
        g2.setColor(Color.blue);
        g2.fill(rect);
    }*/
}

