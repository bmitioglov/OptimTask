
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;
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
        frame.pack();
        frame.setResizable(false);
        jTable1.getTableHeader().resizeAndRepaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(countVert,countVert+1);

        jScrollPane1.setViewportView(jTable1);
        //jScrollPane1 = new JScrollPane(jTable1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private int countVert;
    private int countKrit;
    private JFrame frame;
}



