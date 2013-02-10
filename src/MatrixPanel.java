
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;


/**
 *
 * @author goodspeed
 */
public class MatrixPanel extends javax.swing.JPanel {

    public MatrixPanel(JFrame frame, int countVert, int countKrit) {
        
        this.countVert = countVert;
        this.countKrit = countKrit;
        this.frame = frame;
        
        initComponents();
        jTable1.getColumnModel().getColumn(0).setHeaderValue((""));
        TableColumn column = jTable1.getColumnModel().getColumn(0);
        column.setPreferredWidth(20);
        TableModel model = jTable1.getModel();
        
        //Заполнение названий столбцов
        for (int j = 1; j<=countVert; j++){
            jTable1.getColumnModel().getColumn(j).setHeaderValue((j));
            column = jTable1.getColumnModel().getColumn(j);
            column.setPreferredWidth(20);
        }
        //Заполнение матрицы
        for (int i = 0; i<countVert; i++)
        {
            for (int j = 1; j<=countVert; j++)
            {
                model.setValueAt(0, i, j);
            }
        }
        //Заполнение названий строк
        for (int i = 0; i<countVert; i++){
            model.setValueAt(i+1, i, 0);
        }
        frame.setSize(600, 500);
        frame.setResizable(false);
        jTable1.getTableHeader().resizeAndRepaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(countVert,countVert+1);
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTable1);
        //jScrollPane1 = new JScrollPane(jTable1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        jLabel1.setText("<html><strong>Проставьте единицы там где нужно</strong>");

        jButton1.setText("Далее");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(262, 262, 262))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        KritPanel kpanel = new KritPanel(frame, countVert, countKrit);
        //SecondSecondPanel sspanel = new SecondSecondPanel(frame);
        this.removeAll();
        this.updateUI();
        //this.updateUI();
        frame.remove(this);
        revalidate();
        repaint();
        frame.add(kpanel);   
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private int countVert;
    private int countKrit;
    private JFrame frame;
}



