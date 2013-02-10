
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goodspeed
 */

public class SecondSecondPanel extends JPanel{
        public SecondSecondPanel(JFrame frame){
            this.frame = frame;
            frame.setSize(600, 500);
            frame.setResizable(false);
            this.setLayout(new FlowLayout());
            setLayout(new GridLayout(4,1));
            
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panelMainLabel = new JPanel();
            
            sliderRows = new JSlider(0,99,0);
            sliderRows.setMajorTickSpacing(20);
            sliderRows.setMinorTickSpacing(1);
            sliderRows.setSnapToTicks(true);
            sliderRows.setPaintTicks(true);
            sliderRows.addChangeListener(new ChangeListener(){
                public void stateChanged(ChangeEvent event){
                    Integer value = (Integer) sliderRows.getValue();
                    countRows.setText(value.toString());
                }
            });
            
            sliderCols = new JSlider(0,5,0);
            sliderCols.setMajorTickSpacing(20);
            sliderCols.setMinorTickSpacing(1);
            sliderCols.setSnapToTicks(true);
            sliderCols.setPaintTicks(true);
            sliderCols.addChangeListener(new ChangeListener(){
                public void stateChanged(ChangeEvent event){
                    Integer value = (Integer) sliderCols.getValue();
                    countCols.setText(value.toString());
                }
            });
            
            JLabel mainLabel = new JLabel("Задайте параметры");
            JLabel rowLabel = new JLabel("Количество вершин в графе");
            JLabel colLabel = new JLabel("Количество критериев у вершины");
            countRows = new JLabel("0");
            countCols = new JLabel("0");
            
            //panel1.add(mainLabel,BorderLayout.NORTH);

            panel1.add(rowLabel,BorderLayout.NORTH);
            panel1.add(sliderRows,BorderLayout.SOUTH);
            panel1.add(countRows);
            
            panel2.add(colLabel,BorderLayout.NORTH);
            panel2.add(sliderCols,BorderLayout.SOUTH);
            panel2.add(countCols);
            
            panelMainLabel.add(mainLabel,BorderLayout.CENTER);
            
            add(panelMainLabel,BorderLayout.NORTH);
            add(panel1,BorderLayout.CENTER);
            add(panel2,BorderLayout.SOUTH);
            
            //добавляем кнопку Далее
            button = new JButton("Далее");
            ButtonListenerNext buttonlist1 = new ButtonListenerNext(this,frame,sliderRows,sliderCols);
            button.addActionListener(buttonlist1);
            
            JPanel buttonPanel = new JPanel();
            buttonPanel.add(button);
            add(buttonPanel);
            
        }
        JSlider sliderRows;
        JSlider sliderCols;
        JLabel countRows;
        JLabel countCols;
        JButton button;
        JFrame frame;
}


class ButtonListenerNext implements ActionListener{
    public ButtonListenerNext(JPanel panel, JFrame frame,JSlider sliderRows,JSlider sliderCols){
        this.panel = panel;
        this.frame = frame;
        this.sliderVert = sliderRows;
        this.sliderKrit = sliderCols;
    }
    public void actionPerformed(ActionEvent event){
        //добавить "запомнить размерность"
        countVert = sliderVert.getValue();
        countKrit = sliderKrit.getValue();
        MatrixPanel mpanel = new MatrixPanel(frame, countVert, countKrit);
        panel.removeAll();
        panel.updateUI();
        panel.setLayout(new FlowLayout());
        panel.add(mpanel);
    }
    private JFrame frame;
    private JPanel panel;
    private JSlider sliderVert;
    private JSlider sliderKrit;
    private int countVert;
    private int countKrit;
}