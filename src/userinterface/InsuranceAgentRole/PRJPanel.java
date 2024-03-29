/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceAgentRole;

import Business.Enterprise.En;
import Business.Organization.Org;
import Business.Organization.IFOrganization;
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

public class PRJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private En enterprise;
    private InsuranceWR insuranceWorkRequest;

    /**
     * Creates new form ProcessRequestJPanel
     */
    public PRJPanel(JPanel userProcessContainer, UserAccount userAccount, En enterprise, InsuranceWR insuranceWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.insuranceWorkRequest = insuranceWorkRequest;
        this.account = userAccount;
        populateFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtPolicyNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtClaimAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBillAmount = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Policy Number");
        add(jLabel2);
        jLabel2.setBounds(203, 98, 88, 15);

        txtPolicyNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPolicyNumber.setEnabled(false);
        add(txtPolicyNumber);
        txtPolicyNumber.setBounds(307, 96, 145, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Claim Amount");
        add(jLabel3);
        jLabel3.setBounds(204, 212, 85, 15);

        txtClaimAmount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtClaimAmount.setEnabled(false);
        add(txtClaimAmount);
        txtClaimAmount.setBounds(308, 210, 144, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Message");
        add(jLabel4);
        jLabel4.setBounds(239, 250, 52, 15);

        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });
        add(txtMessage);
        txtMessage.setBounds(309, 248, 265, 23);

        btnAccept.setBackground(new java.awt.Color(204, 204, 204));
        btnAccept.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAccept.setText("Accept and Send Request To Finance Department");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept);
        btnAccept.setBounds(121, 286, 308, 34);

        btnReject.setBackground(new java.awt.Color(204, 204, 204));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReject.setText("Reject Request");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(455, 286, 117, 34);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Customer Name");
        add(jLabel5);
        jLabel5.setBounds(192, 136, 95, 15);

        txtCustomerName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCustomerName.setEnabled(false);
        add(txtCustomerName);
        txtCustomerName.setBounds(306, 134, 146, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total Bill Amount");
        add(jLabel6);
        jLabel6.setBounds(185, 174, 105, 15);

        txtBillAmount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtBillAmount.setEnabled(false);
        add(txtBillAmount);
        txtBillAmount.setBounds(308, 172, 144, 20);

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(10, 11, 79, 25);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed

        String message = txtMessage.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is required to continue");
            return;
        } else {
            insuranceWorkRequest.setWrMsg(message);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you wish to continue?");

            if (dialogResult == JOptionPane.YES_OPTION) {
                Org org = null;
                for (Org organization : enterprise.getOrgDir().getOrganizations()) {
                    if (organization instanceof IFOrganization) {
                        org = organization;
                        break;
                    }
                }

                if (org != null) {
                    org.getWrkQ().getWorkRequests().add(insuranceWorkRequest);
                    account.getWrkQ().getWorkRequests().add(insuranceWorkRequest);
                }

                JOptionPane.showMessageDialog(null, "Request Approved and Sent To Finance Department");
                insuranceWorkRequest.setStatus("Sent To Finance Department");
                insuranceWorkRequest.setAgent(account.getEmp().getEmpName());
                insuranceWorkRequest.setReceiver(null);

                txtMessage.setText("");
                btnReject.setEnabled(false);
                btnAccept.setEnabled(false);

            }
            txtMessage.setText("");
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AllInsuranceRequestsJPanel allInsuranceRequestsJPanel = (AllInsuranceRequestsJPanel) component;
        allInsuranceRequestsJPanel.pplTbl();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);


    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed

        String message = txtMessage.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is required to!");
            return;
        } else {
            insuranceWorkRequest.setWrMsg(message);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {

                insuranceWorkRequest.setStatus("Rejected");
                insuranceWorkRequest.setWrMsg(txtMessage.getText().trim());
                insuranceWorkRequest.setAgent(account.getEmp().getEmpName());
                txtMessage.setText("");
                btnReject.setEnabled(false);
                btnAccept.setEnabled(false);
            }
            txtMessage.setText("");
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtBillAmount;
    private javax.swing.JTextField txtClaimAmount;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtPolicyNumber;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {

        txtPolicyNumber.setText(insuranceWorkRequest.getPlcyNo());
        txtCustomerName.setText(insuranceWorkRequest.getInsCust().getCustFrstNm() + " " + insuranceWorkRequest.getInsCust().getCustLstNme());
        txtBillAmount.setText(String.valueOf(insuranceWorkRequest.getBillAmt()));
        txtClaimAmount.setText(String.valueOf(insuranceWorkRequest.getClaimAmt()));

    }
}
