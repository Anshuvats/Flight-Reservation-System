
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
public class SearchResults extends javax.swing.JFrame {
    /**
     * Creates new form SearchResults
     */
     DisplayManager disp;
     int Index;
     
     public SearchResults(DisplayManager disp) {
        this.disp = disp; 
        initComponents();
    }
    public SearchResults() {
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

        jlabelbutton1 = new javax.swing.JLabel();
        jlabelbutton2 = new javax.swing.JLabel();
        jlabelbutton3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spartans - Search Results Screen");
        setPreferredSize(new java.awt.Dimension(1050, 650));
        getContentPane().setLayout(null);

        jlabelbutton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabelbutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelbutton1MouseClicked(evt);
            }
        });
        getContentPane().add(jlabelbutton1);
        jlabelbutton1.setBounds(304, 404, 70, 30);

        jlabelbutton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabelbutton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelbutton2MouseClicked(evt);
            }
        });
        getContentPane().add(jlabelbutton2);
        jlabelbutton2.setBounds(482, 404, 80, 30);

        jlabelbutton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabelbutton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelbutton3MouseClicked(evt);
            }
        });
        getContentPane().add(jlabelbutton3);
        jlabelbutton3.setBounds(670, 404, 70, 30);

        jScrollPane1.setFont(new java.awt.Font("Gabriola", 1, 11)); // NOI18N

        jTable1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL.NO", "TRAVEL DATE", "FLIGHT NUMBER", "SOURCE", "DESTINATION", "DEPARTURE", "ARRIVAL", "CONNECTING FLIGHT", "FINAL DESTINATION", "DEPARTURE", "ARRIVAL", "TRANSIT TIME", "TOTAL FLIGHT TIME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 51, 102));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(90);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(8, 210, 1020, 180);

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("SOURCE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 113, 130, 40);

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("DESTINATION");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(550, 120, 190, 30);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 113, 210, 40);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(738, 120, 220, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screen 2.jpg"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1036, 610);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlabelbutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelbutton1MouseClicked
      disp.results.setVisible(false);
        disp.frs.initializeOthers(disp.frs);        // TODO add your handling code here:
    }//GEN-LAST:event_jlabelbutton1MouseClicked

    private void jlabelbutton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelbutton2MouseClicked
       Index = jTable1.getSelectedRow();
        if(Index>=0){
            this.disp.booking.jLabel15.setText(this.disp.Inp.seats.toString());
            TableModel model2 = jTable1.getModel();
            String a1 = model2.getValueAt(Index, 2).toString();
            String a2 = model2.getValueAt(Index, 3).toString();
            String a3 = model2.getValueAt(Index, 8).toString();
            String a4 = model2.getValueAt(Index, 5).toString();
            String a5 = model2.getValueAt(Index, 9).toString();
            String a6 = model2.getValueAt(Index, 7).toString();
            String a7 = model2.getValueAt(Index, 4).toString();
            String a8 = model2.getValueAt(Index, 11).toString();
            String a9 = model2.getValueAt(Index, 12).toString();

            this.disp.booking.jLabel2.setText(a1);
            this.disp.booking.jLabel17.setText(a2);
            this.disp.booking.jLabel18.setText(a3);
            this.disp.booking.jLabel19.setText(a4);
            this.disp.booking.jLabel20.setText(a5);
            this.disp.booking.jLabel21.setText(a6);
            this.disp.booking.jLabel22.setText(a7);
            this.disp.booking.jLabel23.setText(a8);
            this.disp.booking.jLabel24.setText(a9);

            this.disp.showBookingScreen();
        } else {
            JOptionPane.showMessageDialog(null, "Select a Flight to book!", "Warning!", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jlabelbutton2MouseClicked

    private void jlabelbutton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelbutton3MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jlabelbutton3MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JLabel jlabelbutton1;
    private javax.swing.JLabel jlabelbutton2;
    private javax.swing.JLabel jlabelbutton3;
    // End of variables declaration//GEN-END:variables
}