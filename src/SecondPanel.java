
import java.awt.FlowLayout;


public class SecondPanel extends javax.swing.JPanel {

    /**
     * Creates new form SecondPanel
     */
    public SecondPanel() {
        initComponents();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        radioButton1.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nextButton = new javax.swing.JButton();
        mainLabel = new javax.swing.JLabel();
        radioButton1 = new javax.swing.JRadioButton();
        radioButton2 = new javax.swing.JRadioButton();

        nextButton.setText("Далее");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        mainLabel.setText("Выберите способ введения матрицы");

        radioButton1.setText("Из файла");
        radioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton1ActionPerformed(evt);
            }
        });

        radioButton2.setText("С клавиатуры");
        radioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(nextButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioButton2)
                            .addComponent(radioButton1))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(radioButton1)
                .addGap(51, 51, 51)
                .addComponent(radioButton2)
                .addGap(105, 105, 105)
                .addComponent(nextButton)
                .addGap(123, 123, 123))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButton1ActionPerformed

    private void radioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_radioButton2ActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        if (radioButton2.isSelected())
        {
            this.removeAll();
            this.updateUI();
            MatrixPanel mpanel = new MatrixPanel();
            this.setLayout(new FlowLayout());
            this.add(mpanel);
        }
        
    }//GEN-LAST:event_nextButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton radioButton1;
    private javax.swing.JRadioButton radioButton2;
    // End of variables declaration//GEN-END:variables

}
