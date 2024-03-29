/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceFinanceRole;

import Business.Enterprise.En;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InsuranceWR;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bhuvana
 */
public class InsuranceFPR extends javax.swing.JPanel {

    private JPanel jPanel;
    private En entrpz;
    private UserAccount usrAcnt;
    private InsuranceWR isnrWrReq;

    /**
     * Creates new form InsuranceFinanceProcessRequest
     */
    InsuranceFPR(JPanel userProcessContainer, UserAccount userAccount, InsuranceWR insuranceWorkRequest, En enterprise) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.entrpz = enterprise;
        this.usrAcnt = userAccount;
        this.isnrWrReq = insuranceWorkRequest;
        plcyNumTxt.setText(insuranceWorkRequest.getPlcyNo());
        ssnTxt.setText(insuranceWorkRequest.getSsn());
        plcyNmTxt.setText(insuranceWorkRequest.getPlcyNm());
        clmAmntTxt.setText(String.valueOf(insuranceWorkRequest.getClaimAmt()));
        billingAmntTxt.setText(String.valueOf(insuranceWorkRequest.getBillAmt()));
        cvgTxt.setText(String.valueOf(insuranceWorkRequest.getInsCust().getIns().getCvrg()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        disbrAmntBtn = new javax.swing.JButton();
        rejBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        plcyNumTxt = new javax.swing.JTextField();
        plcyNmTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        billingAmntTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        clmAmntTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ssnTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cvgTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(null);

        disbrAmntBtn.setBackground(new java.awt.Color(204, 204, 204));
        disbrAmntBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        disbrAmntBtn.setText("Disburse Amount");
        disbrAmntBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disbrAmntBtnActionPerformed(evt);
            }
        });
        add(disbrAmntBtn);
        disbrAmntBtn.setBounds(110, 340, 136, 32);

        rejBtn.setBackground(new java.awt.Color(204, 204, 204));
        rejBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rejBtn.setText("Reject Claim");
        rejBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejBtnActionPerformed(evt);
            }
        });
        add(rejBtn);
        rejBtn.setBounds(290, 340, 114, 32);

        jLabel3.setFont(new java.awt.Font("Telugu MN", 1, 24)); // NOI18N
        jLabel3.setText("Insurance Finance Request Process Area ");
        add(jLabel3);
        jLabel3.setBounds(130, 17, 480, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Policy Number");
        add(jLabel4);
        jLabel4.setBounds(150, 90, 91, 17);

        backBtn.setBackground(new java.awt.Color(204, 204, 204));
        backBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(10, 23, 72, 29);

        plcyNumTxt.setEditable(false);
        add(plcyNumTxt);
        plcyNumTxt.setBounds(278, 86, 116, 23);

        plcyNmTxt.setEditable(false);
        add(plcyNmTxt);
        plcyNmTxt.setBounds(278, 209, 116, 23);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Policy Name");
        add(jLabel1);
        jLabel1.setBounds(160, 210, 90, 17);

        billingAmntTxt.setEditable(false);
        billingAmntTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingAmntTxtActionPerformed(evt);
            }
        });
        add(billingAmntTxt);
        billingAmntTxt.setBounds(278, 247, 116, 23);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Billing Amount");
        add(jLabel6);
        jLabel6.setBounds(140, 250, 110, 17);

        clmAmntTxt.setEditable(false);
        clmAmntTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clmAmntTxtActionPerformed(evt);
            }
        });
        add(clmAmntTxt);
        clmAmntTxt.setBounds(278, 285, 116, 23);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Claim Amount");
        add(jLabel7);
        jLabel7.setBounds(140, 290, 100, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("SSN");
        add(jLabel8);
        jLabel8.setBounds(210, 130, 50, 17);

        ssnTxt.setEditable(false);
        add(ssnTxt);
        ssnTxt.setBounds(278, 124, 116, 23);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Coverage%");
        add(jLabel9);
        jLabel9.setBounds(170, 177, 70, 20);

        cvgTxt.setEditable(false);
        add(cvgTxt);
        cvgTxt.setBounds(278, 171, 116, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void disbrAmntBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disbrAmntBtnActionPerformed

        disbrAmntBtn.setEnabled(true);
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you wish to continue?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            isnrWrReq.setStatus("Insurance Claim Approved");
            JOptionPane.showMessageDialog(null, "Claim Approved");
            disbrAmntBtn.setEnabled(false);
            rejBtn.setEnabled(false);
        }
    }//GEN-LAST:event_disbrAmntBtnActionPerformed

    private void rejBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejBtnActionPerformed

        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you wish to continue?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            isnrWrReq.setStatus("Insurance Claim Rejected");
            rejBtn.setEnabled(false);
            disbrAmntBtn.setEnabled(false);
        }

    }//GEN-LAST:event_rejBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        InsuranceFWAJPanel iwjp = (InsuranceFWAJPanel) component;
        iwjp.pplTabl();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void clmAmntTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clmAmntTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clmAmntTxtActionPerformed

    private void billingAmntTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingAmntTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billingAmntTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField billingAmntTxt;
    private javax.swing.JTextField clmAmntTxt;
    private javax.swing.JTextField cvgTxt;
    private javax.swing.JButton disbrAmntBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField plcyNmTxt;
    private javax.swing.JTextField plcyNumTxt;
    private javax.swing.JButton rejBtn;
    private javax.swing.JTextField ssnTxt;
    // End of variables declaration//GEN-END:variables
}
