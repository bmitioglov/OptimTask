
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;


public class KritPanel extends javax.swing.JPanel {

    /**
     * Creates new form KritPanel
     */
    public KritPanel(JFrame frame, int countVert, int countKrit) {
        
        //this.countVert = countVert;
        //this.countKrit = countKrit;
        //this.frame = frame;
        /*this.setVisible(true);
        frame.setVisible(true);
        frame.setSize(600, 500);
        frame.setResizable(false);
        this.setLayout(new FlowLayout());*/
        
        initComponents();
        this.setVisible(true);
        /*jTable1.getColumnModel().getColumn(0).setHeaderValue((""));
        TableColumn column = jTable1.getColumnModel().getColumn(0);
        column.setPreferredWidth(20);
        TableModel model = jTable1.getModel();
        
        //Заполнение названий столбцов
        for (int j = 1; j<=countKrit; j++){
            jTable1.getColumnModel().getColumn(j).setHeaderValue((j));
            column = jTable1.getColumnModel().getColumn(j);
            column.setPreferredWidth(20);
        }
        
        //Заполнение названий строк
        for (int i = 0; i<countVert; i++){
            model.setValueAt(i+1, i, 0);
        }
        frame.setSize(600, 500);
        frame.setResizable(false);
        jTable1.getTableHeader().resizeAndRepaint();*/
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(142, 142, 142))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    //private int countVert;
    //private int countKrit;
    private JFrame frame;
}
