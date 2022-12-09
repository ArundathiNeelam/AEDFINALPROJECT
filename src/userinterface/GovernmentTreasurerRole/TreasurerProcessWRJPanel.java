/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentTreasurerRole;

import Business.WorkQueue.GovtFundRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bhuvana
 */
public class TreasurerProcessWRJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private GovtFundRequest govtFndRequest;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public TreasurerProcessWRJPanel(JPanel jPanel, GovtFundRequest fundRequest) {
        initComponents();
        this.jPanel = jPanel;
        this.govtFndRequest = fundRequest;
        amntTxt.setText(String.valueOf(govtFndRequest.getReqAmt()));
        locTxt.setText(govtFndRequest.getLocation());
        popuTxt.setText(String.valueOf(govtFndRequest.getPop()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sbmtJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        rejBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        msgTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        locTxt = new javax.swing.JTextField();
        popuTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        amntTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        sbmtJButton.setBackground(new java.awt.Color(204, 204, 204));
        sbmtJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sbmtJButton.setText("Disburse Amount");
        sbmtJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmtJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        rejBtn.setBackground(new java.awt.Color(204, 204, 204));
        rejBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rejBtn.setText("Reject");
        rejBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Message");

        msgTxt.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Location");

        locTxt.setBackground(new java.awt.Color(204, 204, 204));
        locTxt.setEnabled(false);

        popuTxt.setBackground(new java.awt.Color(204, 204, 204));
        popuTxt.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Population");

        amntTxt.setBackground(new java.awt.Color(204, 204, 204));
        amntTxt.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Amount");

        jLabel1.setFont(new java.awt.Font("Telugu MN", 1, 24)); // NOI18N
        jLabel1.setText("Treasurer Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(sbmtJButton)
                        .addGap(18, 18, 18)
                        .addComponent(rejBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(popuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amntTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap(698, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(locTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amntTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(popuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sbmtJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sbmtJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmtJButtonActionPerformed
        sbmtJButton.setEnabled(true);
        String message = msgTxt.getText();
        
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is required to proceed");
            return;
        }
        else
        {
        govtFndRequest.setWrMsg(message);
         int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
         if (dialogResult == JOptionPane.YES_OPTION) {
        govtFndRequest.setStatus("Accepted");
        JOptionPane.showMessageDialog(null, "Funds Disbursed Successfully!!!");
        sbmtJButton.setEnabled(false);
        msgTxt.setText("");
        rejBtn.setEnabled(false);
        }
         msgTxt.setText("");
        }

    }//GEN-LAST:event_sbmtJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TreasurerWorkAreaJPanel dwjp = (TreasurerWorkAreaJPanel) component;
        dwjp.pplTbl();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void rejBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejBtnActionPerformed
        String message = msgTxt.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is required to continue");
            return;
        } else {
        govtFndRequest.setWrMsg(message);
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you wish to continue?");
            
            
            if (dialogResult == JOptionPane.YES_OPTION) {
        govtFndRequest.setStatus("Rejected");
         msgTxt.setText("");
            rejBtn.setEnabled(false);
            sbmtJButton.setEnabled(false);
        }
         msgTxt.setText("");   
        }
    }//GEN-LAST:event_rejBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amntTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField locTxt;
    private javax.swing.JTextField msgTxt;
    private javax.swing.JTextField popuTxt;
    private javax.swing.JButton rejBtn;
    private javax.swing.JButton sbmtJButton;
    // End of variables declaration//GEN-END:variables
}
