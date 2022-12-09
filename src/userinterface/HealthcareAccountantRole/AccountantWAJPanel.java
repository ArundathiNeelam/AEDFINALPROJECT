/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareAccountantRole;

import Business.EcoSystem;
import Business.Enterprise.En;
import Business.Enterprise.HealthcenterEN;
import Business.Organization.AccountantOrgnz;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


/**
 *
 * @author bhuvana
 */
public class AccountantWAJPanel extends javax.swing.JPanel {

    private JPanel JPanel;
    private UserAccount usrAcnt;
    private AccountantOrgnz acntOrg;
    private En entrpz;
    private EcoSystem ecoSystem;

    /**
     * Creates new form AccountantWorkAreaJPanel
     */
    public AccountantWAJPanel(JPanel userProcessContainer, UserAccount account, AccountantOrgnz accountantOrganization, En enterprise, EcoSystem ecosystem) {
        initComponents();
        this.JPanel = userProcessContainer;
        this.acntOrg = accountantOrganization;
        this.usrAcnt = account;
        this.entrpz = enterprise;
        this.ecoSystem = ecosystem;

        pplAllPtntsTbl();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAppmnt = new javax.swing.JButton();
        prcsMedclBillingsBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        allPntsTbl = new javax.swing.JTable();
        reportBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        createAppmnt.setBackground(new java.awt.Color(204, 204, 204));
        createAppmnt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        createAppmnt.setText("Create Appointment");
        createAppmnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAppmntActionPerformed(evt);
            }
        });

        prcsMedclBillingsBtn.setBackground(new java.awt.Color(204, 204, 204));
        prcsMedclBillingsBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prcsMedclBillingsBtn.setText("Process Medical Billings");
        prcsMedclBillingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prcsMedclBillingsBtnActionPerformed(evt);
            }
        });

        allPntsTbl.setBackground(new java.awt.Color(204, 204, 204));
        allPntsTbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        allPntsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "Patient Name", "Phone Number", "Address", "Treatment Status", "Appointment Date", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(allPntsTbl);

        reportBtn.setBackground(new java.awt.Color(204, 204, 204));
        reportBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reportBtn.setText("Show Patient Report");
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Telugu MN", 1, 24)); // NOI18N
        jLabel3.setText("Receptionist Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reportBtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(createAppmnt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prcsMedclBillingsBtn)))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prcsMedclBillingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAppmnt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124)
                .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createAppmntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAppmntActionPerformed

        String patientId = UUID.randomUUID().toString().substring(0, 7);
        CardLayout layout = (CardLayout) JPanel.getLayout();
        JPanel.add("CreateAppointmentJPanel", new CreateApmntJPanel(JPanel, usrAcnt, entrpz, ecoSystem, patientId));
        layout.next(JPanel);
    }//GEN-LAST:event_createAppmntActionPerformed

    private void prcsMedclBillingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prcsMedclBillingsBtnActionPerformed
        CardLayout layout = (CardLayout) JPanel.getLayout();
        JPanel.add("ProcessMedicalBillingsJPanel", new ProcessMBJPanel(JPanel, usrAcnt, entrpz, acntOrg, ecoSystem));
        layout.next(JPanel);
    }//GEN-LAST:event_prcsMedclBillingsBtnActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
        List<Patient> underTreatmentPatients = new ArrayList<>();
        List<Patient> treatedPatients = new ArrayList<>();
        DefaultPieDataset defaultPieDataset = new DefaultPieDataset();
        List<Patient> patients = ((HealthcenterEN) entrpz).getPatientDir().getPatients();
        for (Patient patient : patients) {
            if (patient.isIsTrtmntdone()) {
                treatedPatients.add(patient);
            } else {
                underTreatmentPatients.add(patient);
            }
        }
        defaultPieDataset.setValue("Patient still under treatment", underTreatmentPatients.size());
        defaultPieDataset.setValue("Patient Treated Successfully", treatedPatients.size());
        JFreeChart chart = ChartFactory.createPieChart("Patient Status Pie Chart", defaultPieDataset, true, true, true);
        PiePlot piePlot =(PiePlot) chart.getPlot();
        ChartFrame frame = new ChartFrame("Patient Status Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(500,500);
    }//GEN-LAST:event_reportBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allPntsTbl;
    private javax.swing.JButton createAppmnt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prcsMedclBillingsBtn;
    private javax.swing.JButton reportBtn;
    // End of variables declaration//GEN-END:variables

    public void pplAllPtntsTbl() {
        List<Patient> patients = ((HealthcenterEN) entrpz).getPatientDir().getPatients();
        DefaultTableModel dtm = (DefaultTableModel) allPntsTbl.getModel();
        dtm.setRowCount(0);
        for (Patient ptnt : patients) {
            Object[] row = new Object[7];

            row[0] = ptnt;
            row[1] = ptnt.getPatFrstNm() + " " + ptnt.getPatLstNm();
            row[2] = ptnt.getCntctNo();
            row[3] = ptnt.getAddress();
            row[4] = ptnt.isIsTrtmntdone() ? "Treatment Complete" : "Treatment In Progress";
            row[5] = ptnt.getAptDt();
            row[6] = ptnt.getDocType();
            dtm.addRow(row);
        }
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dtm);
        allPntsTbl.setRowSorter(sorter);
    }
}
