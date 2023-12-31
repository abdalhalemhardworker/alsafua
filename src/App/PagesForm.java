/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package App;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.Color;
/**
 *
 * @author C.m™ Lap
 */
public class PagesForm extends javax.swing.JPanel {

    /**
     * Creates new form PagesForm
     */
    public PagesForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pageWeightTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pageProductCB = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        importersTable = new javax.swing.JTable();

        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setResizeWeight(1.0);

        jPanel3.setPreferredSize(new java.awt.Dimension(617, 200));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("الوزن");

        pageWeightTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pageWeightTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageWeightTFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("الصنف");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("حفظ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pageProductCB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pageWeightTF, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                            .addComponent(pageProductCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pageWeightTF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(pageProductCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        importersTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        importersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الوزن", "الصنف"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        importersTable.setShowGrid(true);
        importersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                importersTableMousePressed(evt);
            }
        });
        importersTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                importersTableKeyPressed(evt);
            }
        });
        importersTable.getTableHeader().setFont(importersTable.getFont());
        importersTable.setRowHeight(importersTable.getFont().getSize());
        importersTable.setSelectionBackground(Color.GRAY);
        jScrollPane1.setViewportView(importersTable);

        jPanel4.add(jScrollPane1);

        jSplitPane1.setRightComponent(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pageWeightTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageWeightTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pageWeightTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pageWeight = pageWeightTF.getText();
        Object pageProductIndex = pageProductCB.getSelectedItem();
        if ( pageWeight.isEmpty()){
            JOptionPane.showMessageDialog(this, "ادخل اسم الدوله واسم الشركه");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) importersTable.getModel();
        if (selectedRow == -1){
            model.addRow(new Object[]{pageWeight, pageProductIndex});
            pageWeightTF.setText("");
            pageProductCB.setSelectedIndex(0);
        }else{
            model.setValueAt(pageWeight, selectedRow, 0);
            model.setValueAt(pageProductIndex, selectedRow, 1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void importersTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importersTableMousePressed
        if (selectedRow == importersTable.getSelectedRow()){
            importersTable.getSelectionModel().clearSelection();
            pageWeightTF.setText("");
            pageProductCB.setSelectedIndex(0);
            selectedRow = -1;
            return;
        }
        selectedRow = importersTable.getSelectedRow();
        pageWeightTF.setText((String)importersTable.getModel().getValueAt(selectedRow, 0));
        Object obj = importersTable.getModel().getValueAt(selectedRow, 1);
        Object[] objs = (Object[]) obj;
        int index =  (int)objs[0];
//        int selectdIndex = (int) (Object[])(importersTable.getModel().getValueAt(selectedRow, 1))[0];
        pageProductCB.setSelectedIndex(index);
    }//GEN-LAST:event_importersTableMousePressed

    private void importersTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_importersTableKeyPressed
        if (selectedRow == -1)
            return;

        if (evt.getKeyCode() == KeyEvent.VK_DELETE){
            DefaultTableModel model = (DefaultTableModel) importersTable.getModel();
            model.removeRow(selectedRow);
            selectedRow = -1;
            importersTable.getSelectionModel().clearSelection();
        }
    }//GEN-LAST:event_importersTableKeyPressed

    private int selectedRow = -1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable importersTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JComboBox<String> pageProductCB;
    private javax.swing.JTextField pageWeightTF;
    // End of variables declaration//GEN-END:variables
}
