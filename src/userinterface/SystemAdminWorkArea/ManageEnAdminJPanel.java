/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Emply;
import Business.Enterprise.*;
import Business.Network.Network;
import Business.Role.EnAdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAD;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author bhuvana
 */
public class ManageEnAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Emply employee;
    private UserAD userAccountDirectory;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        unmJTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        entpwdJPwdField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        rePwdJPwdField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        nmJTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populatentTbl();
        popNtwrkComboBox();
    }

    private void populatentTbl() {
        DefaultTableModel model = (DefaultTableModel) entJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworks()) {
            for (En enterprise : network.getEntDir().getEntList()) {
                for (UserAccount userAccount : enterprise.getUsrAccDir().getUsrAccList()) {
                    Object[] row = new Object[4];
                    row[0] = enterprise.getName();
                    row[1] = network.getNetwrkNm();
                    row[2] = userAccount.getUname();
                    row[3] = enterprise.getEntType().getValue();

                    model.addRow(row);
                }
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        entJTable.setRowSorter(sorter);
            }
        }
         TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        entJTable.setRowSorter(sorter);
    }

    private void popNtwrkComboBox() {
        netwrkJCmboBox.removeAllItems();

        for (Network network : system.getNetworks()) {
            netwrkJCmboBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        entJCmboBox.removeAllItems();

        for (En enterprise : network.getEntDir().getEntList()) {
            entJCmboBox.addItem(enterprise);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        entJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        netwrkJCmboBox = new javax.swing.JComboBox();
        usernameJLabel = new javax.swing.JLabel();
        unmJTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entJCmboBox = new javax.swing.JComboBox();
        submitJBtn = new javax.swing.JButton();
        passwordJLabel = new javax.swing.JLabel();
        nmJTxtField = new javax.swing.JTextField();
        nameJLabel = new javax.swing.JLabel();
        entpwdJPwdField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        rePwdJPwdField = new javax.swing.JPasswordField();
        rePasswordJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(null);

        entJTable.setBackground(new java.awt.Color(204, 204, 204));
        entJTable.setFont(new java.awt.Font("Telugu MN", 1, 14)); // NOI18N
        entJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(entJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(240, 60, 671, 88);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Network");
        add(jLabel1);
        jLabel1.setBounds(310, 170, 52, 17);

        netwrkJCmboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        netwrkJCmboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netwrkJCmboBoxActionPerformed(evt);
            }
        });
        add(netwrkJCmboBox);
        netwrkJCmboBox.setBounds(390, 160, 136, 23);

        usernameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        usernameJLabel.setText("Username");
        add(usernameJLabel);
        usernameJLabel.setBounds(300, 230, 70, 17);

        unmJTxtField.setBackground(new java.awt.Color(204, 204, 204));
        add(unmJTxtField);
        unmJTxtField.setBounds(390, 220, 136, 25);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Enterprise");
        add(jLabel3);
        jLabel3.setBounds(300, 200, 70, 17);

        entJCmboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(entJCmboBox);
        entJCmboBox.setBounds(390, 190, 136, 23);

        submitJBtn.setBackground(new java.awt.Color(204, 204, 204));
        submitJBtn.setText("Submit");
        submitJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJBtnActionPerformed(evt);
            }
        });
        add(submitJBtn);
        submitJBtn.setBounds(340, 390, 80, 23);

        passwordJLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passwordJLabel.setText("Password");
        add(passwordJLabel);
        passwordJLabel.setBounds(300, 260, 57, 17);

        nmJTxtField.setBackground(new java.awt.Color(204, 204, 204));
        nmJTxtField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(nmJTxtField);
        nmJTxtField.setBounds(390, 340, 136, 28);

        nameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nameJLabel.setText("Name");
        add(nameJLabel);
        nameJLabel.setBounds(320, 350, 50, 17);

        entpwdJPwdField.setBackground(new java.awt.Color(204, 204, 204));
        add(entpwdJPwdField);
        entpwdJPwdField.setBounds(390, 260, 136, 25);

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(10, 11, 90, 23);

        rePwdJPwdField.setBackground(new java.awt.Color(204, 204, 204));
        rePwdJPwdField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(rePwdJPwdField);
        rePwdJPwdField.setBounds(390, 300, 136, 29);

        rePasswordJLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rePasswordJLabel.setText("re-enter Password");
        add(rePasswordJLabel);
        rePasswordJLabel.setBounds(250, 300, 109, 17);

        jLabel2.setFont(new java.awt.Font("Telugu MN", 1, 24)); // NOI18N
        jLabel2.setText("Manage Enterprise Admin");
        add(jLabel2);
        jLabel2.setBounds(410, 20, 305, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void netwrkJCmboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netwrkJCmboBoxActionPerformed

        Network network = (Network) netwrkJCmboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }


    }//GEN-LAST:event_netwrkJCmboBoxActionPerformed

    private void submitJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJBtnActionPerformed

        En enterprise = (En) entJCmboBox.getSelectedItem();

        String username = unmJTxtField.getText();
        Role role = null;
        String password = String.valueOf(entpwdJPwdField.getPassword());
        String rePassword = String.valueOf(rePwdJPwdField.getPassword());
        String name = nmJTxtField.getText();

        if (username == null || username.equals("")) {
            unmJTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            usernameJLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Username 't  ");
            return;
        }
        if (password == null || password.equals("")) {
            unmJTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            usernameJLabel.setForeground(Color.BLACK);
            entpwdJPwdField.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordJLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, " Please enter Password ");
            return;
        }

        if (!passwordPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Password should be at least 6 Characters "
                    + "digits and a combination of number , uppercase letter, "
                    + "lowercase letter and Special characters are not allowed other than $, +, _");
            entpwdJPwdField.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordJLabel.setForeground(Color.RED);
            return;
        }

        if (!password.equals(rePassword)) {
            JOptionPane.showMessageDialog(null, "Passwords doesn't match");
            entpwdJPwdField.setBorder(BorderFactory.createLineBorder(Color.RED));
            rePwdJPwdField.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordJLabel.setForeground(Color.RED);
            rePasswordJLabel.setForeground(Color.RED);
            return;
        }

        if (name == null || name.equals("")) {
            entpwdJPwdField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            rePwdJPwdField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            passwordJLabel.setForeground(Color.BLACK);
            rePasswordJLabel.setForeground(Color.BLACK);
            nmJTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            nameJLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Name");
            return;
        } else {
            List<UserAccount> userAccountList = enterprise.getUsrAccDir().getUsrAccList();
            for (UserAccount userAccount : userAccountList) {
                if (userAccount.getUname().equals(username)) {
                    JOptionPane.showMessageDialog(null, "username is already taken!");
                    unmJTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
                    return;
                }
            }
            
            Emply employee = enterprise.getEmpDir().createEmployee(name);
            UserAccount userAccount = enterprise.getUsrAccDir().createUserAccount(username, password, employee, new EnAdminRole());
            populatentTbl();

            passwordJLabel.setForeground(Color.BLACK);
            rePasswordJLabel.setForeground(Color.BLACK);
            nameJLabel.setForeground(Color.BLACK);
            nmJTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            entpwdJPwdField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            rePwdJPwdField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            nmJTxtField.setText("");
            entpwdJPwdField.setText("");
            rePwdJPwdField.setText("");
            unmJTxtField.setText("");
        }

    }//GEN-LAST:event_submitJBtnActionPerformed

    private boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$+_])(?=\\S+$).{6,}$");
        Matcher m = p.matcher(String.valueOf(entpwdJPwdField.getPassword()));
        boolean b = m.matches();
        return b;
    }


    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SysAdminWAJPanel sysAdminwjp = (SysAdminWAJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox entJCmboBox;
    private javax.swing.JTable entJTable;
    private javax.swing.JPasswordField entpwdJPwdField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JComboBox netwrkJCmboBox;
    private javax.swing.JTextField nmJTxtField;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JLabel rePasswordJLabel;
    private javax.swing.JPasswordField rePwdJPwdField;
    private javax.swing.JButton submitJBtn;
    private javax.swing.JTextField unmJTxtField;
    private javax.swing.JLabel usernameJLabel;
    // End of variables declaration//GEN-END:variables
}
