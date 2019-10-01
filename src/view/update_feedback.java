package view;


import model.TableModel;
import model.feedback;
import service.feedbacksql;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.regex. *;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SRI
 */
public class update_feedback extends javax.swing.JFrame {

    int x,feedbackId=-1,rating;
    JFrame frame;
    String option,category;
    
    /**
     * Creates new form update_feedback
     */
    public update_feedback() {
        initComponents();
         this.setLocationRelativeTo(null);
         prathapiphnTxt.setText("");
    }
    
    public void displayFeedbackTable(int phone){
    
        feedbacksql feed = new feedbacksql();
        ArrayList<feedback> feedList = feed.feedbackList(phone);
        
        String[] colNames = {"Feedback ID","Category","Feedback","Rating"};
        Object[][]rows= new Object[feedList.size()][4];
        
        for(int i=0;i<feedList.size();i++){
            
            rows[i][0] = feedList.get(i).getId();
            rows[i][1] = feedList.get(i).getCategory();
            rows[i][2] = feedList.get(i).getOption();
            rows[i][3] = feedList.get(i).getRating();
            
        }
        
        TableModel tbm= new TableModel(rows,colNames);
        feedbackTb.setModel(tbm);
        
        feedbackTb.setShowGrid(true);
        feedbackTb.setGridColor(Color.black);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prathapijLabel1 = new javax.swing.JLabel();
        prathapijLabel2 = new javax.swing.JLabel();
        prathapiphnTxt = new javax.swing.JTextField();
        prathapijButton1 = new javax.swing.JButton();
        prathapijScrollPane1 = new javax.swing.JScrollPane();
        feedbackTb = new javax.swing.JTable();
        prathapijButton2 = new javax.swing.JButton();
        prathapijButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        prathapijLabel1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        prathapijLabel1.setText(" UPDATE FEEDBACK");

        prathapijLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        prathapijLabel2.setText(" Customer ID :");

        prathapiphnTxt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        prathapiphnTxt.setText(" ");
        prathapiphnTxt.setPreferredSize(new java.awt.Dimension(6, 30));
        prathapiphnTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                prathapiphnTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                prathapiphnTxtFocusLost(evt);
            }
        });
        prathapiphnTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prathapiphnTxtActionPerformed(evt);
            }
        });
        prathapiphnTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prathapiphnTxtKeyReleased(evt);
            }
        });

        prathapijButton1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        prathapijButton1.setForeground(new java.awt.Color(160, 31, 38));
        prathapijButton1.setText(" SEARCH");
        prathapijButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prathapijButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prathapijButton1ActionPerformed(evt);
            }
        });

        feedbackTb.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        feedbackTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Feedback ID", "Category", "Feedback", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        feedbackTb.setToolTipText("");
        feedbackTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedbackTbMouseClicked(evt);
            }
        });
        prathapijScrollPane1.setViewportView(feedbackTb);
        if (feedbackTb.getColumnModel().getColumnCount() > 0) {
            feedbackTb.getColumnModel().getColumn(0).setMinWidth(30);
            feedbackTb.getColumnModel().getColumn(0).setPreferredWidth(150);
            feedbackTb.getColumnModel().getColumn(0).setMaxWidth(150);
            feedbackTb.getColumnModel().getColumn(1).setPreferredWidth(150);
            feedbackTb.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        prathapijButton2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        prathapijButton2.setText(" MAIN MENU");
        prathapijButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prathapijButton2MouseClicked(evt);
            }
        });

        prathapijButton3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        prathapijButton3.setForeground(new java.awt.Color(28, 47, 123));
        prathapijButton3.setText("Edit");
        prathapijButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prathapijButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(prathapijLabel1)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prathapijScrollPane1)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(prathapijLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(prathapiphnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prathapijButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(prathapijButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(prathapijButton2)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(prathapijLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prathapijLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prathapiphnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prathapijButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(prathapijScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(prathapijButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(prathapijButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prathapiphnTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prathapiphnTxtFocusGained
prathapiphnTxt.setText("0");       
        //String PhNumber;
        //PhNumber = String.valueOf(jTextField1.getText());
        
        //if(PhNumber.trim().toLowerCase().equals("*** *******"))
         //{
             //jTextField1.setText("");
             //jTextField1.setForeground(Color.black);
         //}
    }//GEN-LAST:event_prathapiphnTxtFocusGained

    private void prathapiphnTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prathapiphnTxtFocusLost
        
        //String PhNumber;
        //PhNumber = String.valueOf(jTextField1.getText());
        
        //if(PhNumber.trim().equals("")||
                // PhNumber.trim().toLowerCase().equals("*** *******"));
         //{
             //jTextField1.setText("*** *******");
            // jTextField1.setForeground(new Color(153,153,153));
        // }
    }//GEN-LAST:event_prathapiphnTxtFocusLost

    private void prathapijButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prathapijButton1ActionPerformed
        if(prathapiphnTxt.getText().toString().equals("")){
            JOptionPane.showMessageDialog(frame, "Please Enter Your Phone Number!");
        
        }
        else{
            displayFeedbackTable(Integer.parseInt(prathapiphnTxt.getText().toString()));
        }
        
    }//GEN-LAST:event_prathapijButton1ActionPerformed

    private void prathapijButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prathapijButton2MouseClicked
         main_page mp = new main_page();
         mp.setVisible(true);
         mp.pack();
         mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_prathapijButton2MouseClicked

    private void prathapiphnTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prathapiphnTxtKeyReleased
        try {
            x = Integer.parseInt(prathapiphnTxt.getText());
        } catch (NumberFormatException nfe) {
            prathapiphnTxt.setText("");
        }
    }//GEN-LAST:event_prathapiphnTxtKeyReleased

    private void prathapijButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prathapijButton3ActionPerformed
        if(feedbackId== -1){
            JOptionPane.showMessageDialog(frame, "Please Select Your Feedback!");
        }else{
            JFrame frame = new update_feedback_new(feedbackId,category,option,rating);
            
            frame.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_prathapijButton3ActionPerformed

    private void feedbackTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackTbMouseClicked
        int rowIndex = feedbackTb.getSelectedRow();
        
        feedbackId = Integer.parseInt(feedbackTb.getValueAt(rowIndex, 0).toString());
        category = feedbackTb.getValueAt(rowIndex, 1).toString();
        option = feedbackTb.getValueAt(rowIndex, 2).toString();
        rating = Integer.parseInt(feedbackTb.getValueAt(rowIndex, 3).toString());
    }//GEN-LAST:event_feedbackTbMouseClicked

    private void prathapiphnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prathapiphnTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prathapiphnTxtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(update_feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable feedbackTb;
    private javax.swing.JButton prathapijButton1;
    private javax.swing.JButton prathapijButton2;
    private javax.swing.JButton prathapijButton3;
    private javax.swing.JLabel prathapijLabel1;
    private javax.swing.JLabel prathapijLabel2;
    private javax.swing.JScrollPane prathapijScrollPane1;
    private javax.swing.JTextField prathapiphnTxt;
    // End of variables declaration//GEN-END:variables
}
