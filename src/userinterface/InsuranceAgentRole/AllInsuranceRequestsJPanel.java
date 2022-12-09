/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceAgentRole;

import Business.Enterprise.En;

import Business.Organization.IAOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InsuranceWR;
import Business.WorkQueue.WR;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *

 * @author arundathi

 */

public class AllInsuranceRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AllInsuranceRequestsJPanel
     */
    private JPanel jPanel;
    private UserAccount usrAcnt;
    private En entrpz;
    private IAOrganization insrAgntOrg;

    public AllInsuranceRequestsJPanel(JPanel userProcessContainer, UserAccount userAccount, En enterprise, IAOrganization insuranceAgentOrganization) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.usrAcnt = userAccount;
        this.entrpz = enterprise;
        this.insrAgntOrg = insuranceAgentOrganization;
        pplTbl();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        insrWrReqJTable = new javax.swing.JTable();
        prcsBtn = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        asgnToMeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Telugu MN", 1, 24)); // NOI18N
        jLabel1.setText("Process Requests");

        insrWrReqJTable.setBackground(new java.awt.Color(204, 204, 204));
        insrWrReqJTable.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        insrWrReqJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PolicyNumber", "Patient Name", "Health Center", "Sender ", "Receiver Agent", "Billing Amount", "Claim Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(insrWrReqJTable);

        prcsBtn.setBackground(new java.awt.Color(204, 204, 204));
        prcsBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prcsBtn.setText("Process Request");
        prcsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prcsBtnActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        asgnToMeBtn.setBackground(new java.awt.Color(204, 204, 204));
        asgnToMeBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        asgnToMeBtn.setText("Assign To Me");
        asgnToMeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asgnToMeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(334, 334, 334)
                                .addComponent(asgnToMeBtn)
                                .addGap(61, 61, 61)
                                .addComponent(prcsBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack)
                                .addGap(265, 265, 265)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prcsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asgnToMeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prcsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prcsBtnActionPerformed
        int selRow = insrWrReqJTable.getSelectedRow();
        InsuranceWR isnrWrkReq;

        if (selRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            isnrWrkReq = (InsuranceWR) insrWrReqJTable.getValueAt(selRow, 0);

            if (isnrWrkReq.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (isnrWrkReq.getStatus().equalsIgnoreCase("Sent to Secretary")) {
                JOptionPane.showMessageDialog(null, "Request already processed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (isnrWrkReq.getStatus().equalsIgnoreCase("Sent")) {
                JOptionPane.showMessageDialog(null, "Assign the request first");
                return;
            }
            if (isnrWrkReq.getStatus().equalsIgnoreCase("Sent to Finance Department")) {
                JOptionPane.showMessageDialog(null, "Request already sent");
                return;
            }
            if (isnrWrkReq.getStatus().equalsIgnoreCase("Insurance Claim Approved")) {
                JOptionPane.showMessageDialog(null, "Insurance Claim is already Approved");
                return;
            }

            if (!usrAcnt.equals(isnrWrkReq.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            } else {

                CardLayout cardLayout = (CardLayout) jPanel.getLayout();
                jPanel.add("ProcessRequestJPanel", new PRJPanel(jPanel, usrAcnt, entrpz, isnrWrkReq));
                cardLayout.next(jPanel);
            }
        }

    }//GEN-LAST:event_prcsBtnActionPerformed

    private void asgnToMeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asgnToMeBtnActionPerformed
        int selRow = insrWrReqJTable.getSelectedRow();
        if (selRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        } else {
            InsuranceWR insrWrkReq = (InsuranceWR) insrWrReqJTable.getValueAt(selRow, 0);
            if (insrWrkReq.getStatus().equals("Sent")) {
                insrWrkReq.setReceiver(usrAcnt);
                insrWrkReq.setStatus("Pending on Agent: " + usrAcnt.getEmp().getEmpName());
                pplTbl();
                JOptionPane.showMessageDialog(null, "Success !! Request is assigned to you ");
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this request, as it is in " + insrWrkReq.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_asgnToMeBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        jPanel.remove(this);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asgnToMeBtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable insrWrReqJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prcsBtn;
    // End of variables declaration//GEN-END:variables

    public void pplTbl() {
        DefaultTableModel model = (DefaultTableModel) insrWrReqJTable.getModel();

        model.setRowCount(0);

        for (WR req : insrAgntOrg.getWrkQ().getWorkRequests()) {
            Object[] row = new Object[8];
            String status = req.getStatus();
            row[0] = ((InsuranceWR) req);
            row[1] = ((InsuranceWR) req).getInsCust().getCustFrstNm() + " " + ((InsuranceWR) req).getInsCust().getCustLstNme();
            row[2] = ((InsuranceWR) req).getHealthCtr();

            row[3] = req.getSender().getEmp().getEmpName();
            row[4] = req.getReceiver();

            row[5] = ((InsuranceWR) req).getBillAmt();

            row[6] = ((InsuranceWR) req).getClaimAmt();
            row[7] = req.getStatus();

            model.addRow(row);
        }
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        insrWrReqJTable.setRowSorter(sorter);
    }
}
