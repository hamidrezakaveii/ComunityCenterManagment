/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Member;
import model.MemberList;
import persistence.FileManagement;

/**
 *
 * @author 1795928
 */
public class AddMember extends javax.swing.JFrame {

    /**
     * Creates new form AddMember
     */
    private MemberList ml;
    private Member member;
    private Member eM;
    
    public AddMember(MemberList ml) {
        initComponents();
        this.ml = ml;
    }
    
    //Constructor for when editing member from member list
     public AddMember(Member m, MemberList ml){
        this.eM=m;
        this.ml = ml;
        initComponents();
        jbtnAddMember.setText("Save");
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit member information"));
        this.jtxtFirstName.setText(m.getFistName());
        this.jtxtLastName.setText(m.getLastName());
        try {
            this.jBDate.setDate((new SimpleDateFormat("dd-MM-yyyy").parse(m.getBirthdate())));
        } catch (ParseException ex) {
            Logger.getLogger(AddMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jtxtAddress.setText(m.getAddress());
        this.jtxtCity.setText(m.getCity());
        this.jtxtPostalCode.setText(m.getPostalCode());
        this.jtxtTelephone.setText(m.getTelephone());
        this.jtxtEmail.setText(m.getEmail());
        try {
            this.jRDate.setDate((new SimpleDateFormat("dd-MM-yyyy").parse(m.getRegistrationDate())));
        } catch (ParseException ex) {
            Logger.getLogger(AddMember.class.getName()).log(Level.SEVERE, null, ex);
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
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtFirstName = new javax.swing.JTextField();
        jtxtLastName = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jtxtCity = new javax.swing.JTextField();
        jtxtPostalCode = new javax.swing.JTextField();
        jtxtTelephone = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jBDate = new com.toedter.calendar.JDateChooser();
        jRDate = new com.toedter.calendar.JDateChooser();
        jbtnAddMember = new javax.swing.JButton();
        jbtnCancel = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Member"));

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        jLabel3.setText("Birth Date:");

        jLabel4.setText("Address:");

        jLabel5.setText("City:");

        jLabel6.setText("Postal Code");

        jLabel7.setText("Telephone:");

        jLabel8.setText("E-mail:");

        jtxtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFirstNameActionPerformed(evt);
            }
        });

        jLabel9.setText("Registration Date:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtFirstName)
                    .addComponent(jtxtLastName)
                    .addComponent(jtxtAddress)
                    .addComponent(jtxtCity)
                    .addComponent(jtxtPostalCode)
                    .addComponent(jtxtTelephone)
                    .addComponent(jtxtEmail)
                    .addComponent(jBDate, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jRDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jBDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtxtPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jtxtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jRDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jbtnAddMember.setText("Add Member");
        jbtnAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddMemberActionPerformed(evt);
            }
        });

        jbtnCancel.setText("Cancel");
        jbtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jbtnAddMember)
                .addGap(53, 53, 53)
                .addComponent(jbtnCancel)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCancel)
                    .addComponent(jbtnAddMember))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFirstNameActionPerformed

    private void jbtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnCancelActionPerformed

    private void jbtnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddMemberActionPerformed

        //Create date formatter and instantiate birthDate and registrationDate
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String birthDate = sdf.format(jBDate.getCalendar().getTime());
        String registrationDate = sdf.format(jRDate.getCalendar().getTime());
        
        //instantiate the AddMember form attributes
        String fName = jtxtFirstName.getText();
        String lName = jtxtLastName.getText();
        String bDate = birthDate;
        String address = jtxtAddress.getText();
        String city = jtxtCity.getText();
        String pCode = jtxtPostalCode.getText();
        String telephone = jtxtTelephone.getText();
        String email = jtxtEmail.getText();
        String rDate = registrationDate;
        if (eM == null){
            member = new Member(fName, lName, bDate, address, city, pCode, telephone, email, rDate);
        //add member inside the member list
            ml.add(member);
            //write new member in text file
            FileManagement.writeFile("memberlist.txt", member.toString(), true);
        //show message for add new user 
            JOptionPane.showMessageDialog(null, "New member added successfully!", "Add member", JOptionPane.INFORMATION_MESSAGE);
        }else{
            File file = new File("MemberList.txt");
            eM.setFistName(fName);
            eM.setLastName(lName);
            eM.setBirthdate(bDate);
            eM.setAddress(address);
            eM.setCity(city);
            eM.setPostalCode(pCode);
            eM.setTelephone(telephone);
            eM.setEmail(email);
            eM.setRegistrationDate(rDate);
            file.delete();
            for (Member m : ml) {
                FileManagement.writeFile("MemberList.txt", m.toString(), true);
                }
            JOptionPane.showMessageDialog(null, eM.getFistName()+"'s informations changed", "Member Data", JOptionPane.INFORMATION_MESSAGE);
        }
        dispose();
    }//GEN-LAST:event_jbtnAddMemberActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddMember().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jBDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jRDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnAddMember;
    private javax.swing.JButton jbtnCancel;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtCity;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFirstName;
    private javax.swing.JTextField jtxtLastName;
    private javax.swing.JTextField jtxtPostalCode;
    private javax.swing.JTextField jtxtTelephone;
    // End of variables declaration//GEN-END:variables
}
