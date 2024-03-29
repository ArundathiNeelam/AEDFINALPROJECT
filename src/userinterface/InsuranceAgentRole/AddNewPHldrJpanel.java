/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceAgentRole;

import Business.Enterprise.En;
import Business.Enterprise.InsurancecmpnyEN;
import Business.Insurance.Insurance;
import Business.InsuranceCustomer.InsuranceCust;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author arundathi
 */

public class AddNewPHldrJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewUserJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount usrAcnt;
    private InsurancecmpnyEN insrCmnEntr;
    private String plcyNum;

    public AddNewPHldrJpanel(JPanel userProcessContainer, UserAccount userAccount, En enterprise, String policyNumber) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.insrCmnEntr = (InsurancecmpnyEN) enterprise;
        this.usrAcnt = userAccount;
        this.plcyNum = policyNumber;
        populateFields();
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
        jLabel2 = new javax.swing.JLabel();
        plcyNumTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        frstNmTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lstNmTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ssnTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        adrsTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        insrNmCmb = new javax.swing.JComboBox();
        addCustBtn = new javax.swing.JButton();
        dobJDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phnTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        insrCvgTxt = new javax.swing.JTextField();
        gndrCmb = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        custJTable = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Telugu MN", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Add New Customer");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Policy Number ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("SSN");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Date of birth");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Address");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("Insurance Policy Name");

        insrNmCmb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                insrNmCmbFocusGained(evt);
            }
        });
        insrNmCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insrNmCmbActionPerformed(evt);
            }
        });

        addCustBtn.setBackground(new java.awt.Color(204, 204, 204));
        addCustBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addCustBtn.setText("Add Customer");
        addCustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustBtnActionPerformed(evt);
            }
        });

        dobJDateChooser.setMaxSelectableDate(Calendar.getInstance().getTime());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("Personal Information");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 51));
        jLabel12.setText("Insurance  Information");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Phone");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 51));
        jLabel15.setText("Insurance Coverage %");

        gndrCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male", "Other" }));

        custJTable.setBackground(new java.awt.Color(204, 204, 204));
        custJTable.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        custJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name", "Policy Number", "Policy Name", "Coverage %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(custJTable);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("All Customers");

        backBtn.setBackground(new java.awt.Color(204, 204, 204));
        backBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(plcyNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ssnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(dobJDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(frstNmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(28, 28, 28)
                                            .addComponent(jLabel4))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lstNmTxt)
                                    .addComponent(phnTxt)
                                    .addComponent(gndrCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(adrsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(insrNmCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(insrCvgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(addCustBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 550, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plcyNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lstNmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(frstNmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gndrCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(dobJDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(phnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(adrsTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insrNmCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insrCvgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(addCustBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel16)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(702, 702, 702))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustBtnActionPerformed

        if (frstNmTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter  first name");
            return;
        }

        if (lstNmTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter  last name");
            return;
        }

        if (dobJDateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Enter  DOB");
            return;
        }

        if (gndrCmb.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Enter  Gender");
            return;
        }

        if (gndrCmb.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Enter  Gender");
            return;
        }

        if (ssnTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter  SSN");
            return;
        }

        if (phnTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter  Phone");
            return;
        }

        if (adrsTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter  Address");
            return;
        }

        if (insrCvgTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Insurance Coverage");
            return;
        } else {

            String firstName = frstNmTxt.getText().trim();
            String lastName = lstNmTxt.getText().trim();
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
            String dateOfBirth = "";
            try {
                dateOfBirth = sdf.format(dobJDateChooser.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please select customer's dob");
            }
            String gender = gndrCmb.getSelectedItem().toString();

            String ssn = ssnTxt.getText().trim();
            if (!ssnPatternCheck()) {
                JOptionPane.showMessageDialog(null, "/* United States Social Security numbers are nine-digit numbers in the format AAA-GG-SSSS with following rules. */             \n"
                        + "              \"The first three digits called the area number. The area number cannot be 000, 666, or between 900 and 999\",\n"
                        + "                \" Digits four and five are called the group number and range from 01 to 99\",\n"
                        + "              \"The last four digits are serial numbers from 0001 to 9999.\"");
                ssnTxt.setBorder(BorderFactory.createLineBorder(Color.RED));

                return;
            }

            if (ssnPatternCheck()) {
                ssnTxt.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            }

            String address = adrsTxt.getText().trim();

            String phone = phnTxt.getText().trim();

            if (!phnPtrnCheck()) {
                JOptionPane.showMessageDialog(null, "/* Following are valid phone number examples */             \n"
                        + "              \"1234567890\", \"123-456-7890\", \"(123)4567890\", \"(123)456-7890\",\n"
                        + "              /* Following are invalid phone numbers */ \n"
                        + "              \"(1234567890)\",\"123)4567890\", \"12345678901\", \"(1)234567890\",");
                phnTxt.setBorder(BorderFactory.createLineBorder(Color.RED));

                return;
            }

            if (phnPtrnCheck()) {
                phnTxt.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            }

            String policyNumber = plcyNumTxt.getText().trim();
            String insurancePolicyName = insrNmCmb.getSelectedItem().toString();

            double coverage = Double.parseDouble(insrCvgTxt.getText().trim());

            try {
                Double.parseDouble(insrCvgTxt.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please provide integer values in coverage textfield");
                return;
            }

            Insurance insurance = new Insurance(insurancePolicyName, insrCmnEntr.getName(), coverage);

            InsuranceCust insrCust = new InsuranceCust(insurance, policyNumber);

            insrCust.setCustFrstNm(firstName);
            insrCust.setCustLstNme(lastName);
            insrCust.setDob(dateOfBirth);
            insrCust.setGender(gender);
            insrCust.setSsn(ssn);
            insrCust.setPhNo(phone);
            insrCust.setAddress(address);

            insrCust.setIns(insurance);

            insrCmnEntr.getInsCustDir().getInsCust().add(insrCust);

            insrCmnEntr.getInsCustDir().getInsCust();

            pplTbl();
            refr();
            JOptionPane.showMessageDialog(null, "Customer is added");

        }

    }//GEN-LAST:event_addCustBtnActionPerformed

    private void insrNmCmbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_insrNmCmbFocusGained
        System.out.println("Gained");
    }//GEN-LAST:event_insrNmCmbFocusGained

    private void insrNmCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insrNmCmbActionPerformed

        Insurance selectedPolicy = (Insurance) insrNmCmb.getSelectedItem();
        insrCvgTxt.setText(String.valueOf(selectedPolicy.getCvrg()));
    }//GEN-LAST:event_insrNmCmbActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustBtn;
    private javax.swing.JTextField adrsTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable custJTable;
    private com.toedter.calendar.JDateChooser dobJDateChooser;
    private javax.swing.JTextField frstNmTxt;
    private javax.swing.JComboBox gndrCmb;
    private javax.swing.JTextField insrCvgTxt;
    private javax.swing.JComboBox insrNmCmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lstNmTxt;
    private javax.swing.JTextField phnTxt;
    private javax.swing.JTextField plcyNumTxt;
    private javax.swing.JTextField ssnTxt;
    // End of variables declaration//GEN-END:variables

    private boolean phnPtrnCheck() {

        Pattern pattern = Pattern.compile("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
        Matcher matcher = pattern.matcher(phnTxt.getText());

        boolean b = false;

        if (matcher.matches()) {
            b = true;
        } else {
            b = false;
        }

        return b;
    }

    private boolean ssnPatternCheck() {

        Pattern pattern = Pattern.compile("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$");
        Matcher matcher = pattern.matcher(ssnTxt.getText());

        boolean b = false;

        if (matcher.matches()) {
            b = true;
        } else {
            b = false;
        }

        return b;
    }

    private void refr() {

        plcyNumTxt.setText(UUID.randomUUID().toString().substring(0, 7));
        frstNmTxt.setText("");
        lstNmTxt.setText("");
        phnTxt.setText("");
        ssnTxt.setText("");
        dobJDateChooser.setDate(null);
        adrsTxt.setText("");

    }

    private void populateFields() {
        plcyNumTxt.setText(plcyNum);
        List<Insurance> policies = insrCmnEntr.getInsPlcyDir().getPolicies();

        for (Insurance policy : policies) {
            insrNmCmb.addItem(policy);
        }

        Insurance selectedPolicy = (Insurance) insrNmCmb.getSelectedItem();
        
        if(selectedPolicy != null)
        {
        insrCvgTxt.setText(String.valueOf(selectedPolicy.getCvrg()));
        }
        else{
            JOptionPane.showMessageDialog(null , "No Existing policy!");
            return;
        }

    }

    private void pplTbl() {
        DefaultTableModel dtm = (DefaultTableModel) custJTable.getModel();

        dtm.setRowCount(0);
        List<InsuranceCust> customers = insrCmnEntr.getInsCustDir().getInsCust();
        for (InsuranceCust customer : customers) {
            Object[] row = new Object[4];
            row[0] = customer.getCustFrstNm() + " " + customer.getCustLstNme();
            row[1] = customer;
            row[2] = customer.getIns().getPlcyNm();
            row[3] = customer.getIns().getCvrg();

            dtm.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dtm);
        custJTable.setRowSorter(sorter);
    }
}
