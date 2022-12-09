/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareAccountantRole;

import Business.WorkQueue.ABillingRequest;
import java.awt.CardLayout;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author arundathi
 */
public class EmailBillingInformationToPatient extends javax.swing.JPanel {

    JPanel jPanel;
    private ABillingRequest acntBillingReq;

    /**
     * Creates new form EmailBillingInformationToPatient
     */
//    public EmailBillingInformationToPatient() {
//        
//    }
    EmailBillingInformationToPatient(JPanel userProcessContainer, ABillingRequest accountBillingRequest) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.acntBillingReq = accountBillingRequest;
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
        emailTxtFiled = new javax.swing.JTextArea();
        btnSendEmail = new javax.swing.JButton();
        btnClearText = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Telugu MN", 1, 18)); // NOI18N
        jLabel1.setText("Email Billing Information to Patient");

        emailTxtFiled.setBackground(new java.awt.Color(204, 204, 204));
        emailTxtFiled.setColumns(20);
        emailTxtFiled.setRows(5);
        jScrollPane1.setViewportView(emailTxtFiled);

        btnSendEmail.setBackground(new java.awt.Color(204, 204, 204));
        btnSendEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSendEmail.setText("Send Email");
        btnSendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmailActionPerformed(evt);
            }
        });

        btnClearText.setBackground(new java.awt.Color(204, 204, 204));
        btnClearText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClearText.setText("Clear");
        btnClearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTextActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 348, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 376, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSendEmail)
                        .addGap(18, 18, 18)
                        .addComponent(btnClearText, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnClearText, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(253, 253, 253))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmailActionPerformed
        String text = emailTxtFiled.getText();
        if (emailTxtFiled.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(null, "please enter ");
            return;
        }
        try {
            SendMail(acntBillingReq.getPatient().getPatmail(), text);
        } catch (MessagingException ex) {
            Logger.getLogger(EmailBillingInformationToPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Billing information sent to " + acntBillingReq.getPatient().getPatFrstNm());
        acntBillingReq.setStatus("Patient Transaction Completed");
    }//GEN-LAST:event_btnSendEmailActionPerformed

    private void btnClearTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTextActionPerformed
        emailTxtFiled.setText("");
    }//GEN-LAST:event_btnClearTextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        jPanel.remove(this);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_btnBackActionPerformed
    private void SendMail(String toMail, String text) throws MessagingException {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        String to = toMail;
        final String from = "arundathineelam1122@gmail.com";
        final String password = "Neelam1122";
        
        // login using this email address
        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(from,password);
            
            }
        });
        
        Message message = prepareMessage(session, from, toMail,text);
        
        Transport.send(message);
        System.out.println("Message Sent Successfully");
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearText;
    private javax.swing.JButton btnSendEmail;
    private javax.swing.JTextArea emailTxtFiled;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient,String text) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail)); // from address
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient) );
            
            message.setSubject("Hospital Billing Statement");
            message.setText(text);
            
            return message;
        } catch (Exception ex) {
            ex.printStackTrace();
            //Logger.getLogger(JavaMailSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;// if some exception happens
    }
}



