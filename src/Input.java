
import com.toedter.calendar.JTextFieldDateEditor;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.util.Calendar;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
public class Input extends javax.swing.JFrame  {

    /**
     * Creates new form Input
     */
    String source;
    String dest;
    String cls;
    Calendar date;
    Integer seats;
    String s;
    DisplayManager disp;
    public Input(DisplayManager disp) {
        this.disp = disp; 
        initComponents();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) jDateChooser1.getDateEditor();
        editor.setEditable(false);
        seats = 0;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelbutton1 = new javax.swing.JLabel();
        jLabelbutton2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        bglabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spartans - Input Screen");
        setBackground(new java.awt.Color(102, 204, 255));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jLabelbutton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelbutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelbutton1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelbutton1);
        jLabelbutton1.setBounds(365, 544, 120, 30);

        jLabelbutton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelbutton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelbutton2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelbutton2);
        jLabelbutton2.setBounds(545, 546, 75, 28);

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SOURCE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 220, 150, 20);

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DESTINATION");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(590, 220, 200, 20);

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DEPARTURE DATE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 320, 260, 29);

        jTextField1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(565, 446, 55, 28);

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CLASS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(610, 320, 140, 29);

        jComboBox2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business" }));
        jComboBox2.setBorder(null);
        jComboBox2.setOpaque(false);
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(610, 360, 140, 28);

        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        jDateChooser1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jDateChooser1.setOpaque(false);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(220, 360, 200, 30);

        jComboBox1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi (DEL)", "Mumbai (BOM)", "Pune (PNQ)" }));
        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(240, 254, 140, 28);

        jComboBox3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Singapore (SIN)" }));
        jComboBox3.setBorder(null);
        jComboBox3.setOpaque(false);
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(587, 254, 190, 28);

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel7.setText("NUMBER OF SEATS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 440, 270, 29);

        bglabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screen 1.jpg"))); // NOI18N
        getContentPane().add(bglabel);
        bglabel.setBounds(0, -20, 1000, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    /**
     * 
     * @param evt 
     */
    private void jLabelbutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbutton1MouseClicked
        source = (String) jComboBox1.getSelectedItem();
        dest = (String) jComboBox3.getSelectedItem();
        cls = (String) jComboBox2.getSelectedItem();
        
        s = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        String t = jTextField1.getText();    
        if(s.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please, Type a date of travel!", "Warning!", JOptionPane.ERROR_MESSAGE);
        } else if(jTextField1.getText().isEmpty()){ 
            JOptionPane.showMessageDialog(null, "Input the number of seats!", "Warning!", JOptionPane.ERROR_MESSAGE);
        }else if(jTextField1.getText().matches("[0-9]+")==false){ 
            JOptionPane.showMessageDialog(null, "Input numbers only in seats field!", "Warning!", JOptionPane.ERROR_MESSAGE);
        }
        else {
            seats = Integer.parseInt(jTextField1.getText());
            date = jDateChooser1.getCalendar();
            date.set(Calendar.HOUR_OF_DAY, date.getActualMinimum(Calendar.HOUR_OF_DAY));
            date.set(Calendar.MINUTE, date.getActualMinimum(Calendar.MINUTE));
            date.set(Calendar.SECOND, date.getActualMinimum(Calendar.SECOND));
            date.set(Calendar.MILLISECOND, date.getActualMinimum(Calendar.MILLISECOND));
             
            Calendar cal1 = Calendar.getInstance();
            cal1.clear();
            cal1.set(2016, 9, 1);
            Calendar cal2 = Calendar.getInstance();
            cal2.clear();
            cal2.set(2016, 10, 13, 23, 59);
            if(seats>=1&&seats<=10 && date.compareTo(cal1)>=0 && date.compareTo(cal2)<=0) {
                disp.frs.FlightSegment = disp.frs.searchManager.SearchFlights(source, seats, date);
       
                disp.results.jLabel4.setText(disp.Inp.source.toUpperCase());
                disp.results.jLabel5.setText(disp.Inp.dest.toUpperCase());
        
                DefaultTableModel model= (DefaultTableModel)disp.results.jTable1.getModel();
                Object rowData[]= new Object[13];
                for(int i=0;i<disp.frs.searchManager.FlightSegment.size();i++){
                    rowData[0]=i+1;
                    rowData[1]=s;
                    rowData[2]=disp.frs.searchManager.FlightSegment.get(i).spiceFlight.flightID;
                    rowData[3]=disp.frs.searchManager.FlightSegment.get(i).spiceFlight.source;
                    rowData[4]=disp.frs.searchManager.FlightSegment.get(i).spiceFlight.destination;
                    rowData[5]=(disp.frs.searchManager.FlightSegment.get(i).spiceFlight.depTime/60)+":"+(disp.frs.searchManager.FlightSegment.get(i).spiceFlight.depTime%60);
                    rowData[6]=(disp.frs.searchManager.FlightSegment.get(i).spiceFlight.arrTime/60)+":"+(disp.frs.searchManager.FlightSegment.get(i).spiceFlight.arrTime%60);
                    rowData[7]=disp.frs.searchManager.FlightSegment.get(i).silkFlight.flightID;
                    rowData[8]=disp.frs.searchManager.FlightSegment.get(i).silkFlight.destination;
                    rowData[9]=(disp.frs.searchManager.FlightSegment.get(i).silkFlight.depTime/60)+":"+(disp.frs.searchManager.FlightSegment.get(i).silkFlight.depTime%60);
                    rowData[10]=(disp.frs.searchManager.FlightSegment.get(i).silkFlight.arrTime/60)+":"+(disp.frs.searchManager.FlightSegment.get(i).silkFlight.arrTime%60);
                    rowData[11]=(disp.frs.searchManager.FlightSegment.get(i).transitTime/60)+"hr"+(disp.frs.searchManager.FlightSegment.get(i).transitTime%60)+"min";
                    rowData[12]=(disp.frs.searchManager.FlightSegment.get(i).totalTime/60)+"hr"+(disp.frs.searchManager.FlightSegment.get(i).totalTime%60)+"min";
                    model.addRow(rowData);    
                }
                disp.showSearchResultScreen();
            } else if(seats<1 || seats>10){
                JOptionPane.showMessageDialog(null, "You can book upto 10 tickects at a time");
            } else {
                JOptionPane.showMessageDialog(null, "You can book from 01-OCT-2016 to 13-NOV-2016");
            }
        }
    }//GEN-LAST:event_jLabelbutton1MouseClicked

    private void jLabelbutton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbutton2MouseClicked
    System.exit(0);
    }//GEN-LAST:event_jLabelbutton2MouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bglabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelbutton1;
    private javax.swing.JLabel jLabelbutton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
}
