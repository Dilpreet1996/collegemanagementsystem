
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dilpreet
 */
public class frmsignup extends javax.swing.JFrame {

    /**
     * Creates new form frmsignup
     */
     
    public frmsignup() {
        initComponents();
             ButtonGroup bg=new ButtonGroup();
             bg.add(umale);
             bg.add(ufemale);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        uemail = new javax.swing.JTextField();
        uphone = new javax.swing.JTextField();
        umale = new javax.swing.JRadioButton();
        ufemale = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        nnotification = new javax.swing.JLabel();
        enotification = new javax.swing.JLabel();
        pnotification = new javax.swing.JLabel();
        cpassnotification = new javax.swing.JLabel();
        passnotification = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ten = new javax.swing.JLabel();
        upass = new javax.swing.JPasswordField();
        ucpass = new javax.swing.JPasswordField();
        em = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("E-mail");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("phone Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Confirm Password");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Gender");

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unameKeyTyped(evt);
            }
        });

        uemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uemailFocusLost(evt);
            }
        });
        uemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uemailActionPerformed(evt);
            }
        });

        uphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uphoneFocusLost(evt);
            }
        });
        uphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uphoneActionPerformed(evt);
            }
        });
        uphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uphoneKeyTyped(evt);
            }
        });

        umale.setText("Male");
        umale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umaleActionPerformed(evt);
            }
        });

        ufemale.setText("Female");
        ufemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufemaleActionPerformed(evt);
            }
        });

        jButton1.setText("Sign up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ten.setBackground(new java.awt.Color(255, 0, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Student Sign Up");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(umale, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ufemale))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(uemail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ten, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(uphone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(upass, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ucpass))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enotification, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnotification, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpassnotification, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passnotification, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(uname, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(nnotification, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jButton1)
                .addGap(96, 96, 96)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nnotification, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(uemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enotification, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(uphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnotification, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(upass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passnotification, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(ucpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cpassnotification, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(umale)
                    .addComponent(ufemale))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uemailActionPerformed

    private void umaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umaleActionPerformed

    private void ufemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufemaleActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void unameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c) ||(c==KeyEvent.VK_SPACE) ||(c==KeyEvent.VK_BACKSPACE) ))
        { 
            evt.consume();
            nnotification.setText("Enter only Characters");
            
        }
        else
        {
            nnotification.setText("");
        }
    }//GEN-LAST:event_unameKeyTyped

    private void uphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uphoneKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if((Character.isAlphabetic(c) ||(c==KeyEvent.VK_SPACE) ||(c==KeyEvent.VK_BACKSPACE) ))
        { 
            evt.consume();
            pnotification.setText("Enter only integer values");
            
        }
        else
        {
            pnotification.setText("");
        }
    }//GEN-LAST:event_uphoneKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
if (!(Pattern.matches("^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$", uemail.getText()))) 
                {
            //JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            em.setText("*Please enter a valid email");
 uemail.setText("");
            }
            else
            {
                em.setText("");
               
            }

// TODO add your handling code here:
        
        
        
        
        
        try {
            clscon obj=new clscon();
            String qry="select * from tbstudentadmission where email= '"+uemail.getText().toString()+"' && phone='"+uphone.getText().toString()+"' && name='"+uname.getText().toString()+"'";
            ResultSet rs=obj.connection2(qry);
            int z=0;
            while(rs.next())
            {
                z++;
                
            }
       
            String gn="";
            if(umale.isSelected())
            {
                gn="male";
            }
            if(ufemale.isSelected())
            {
                gn="female";
            }
             
            
            
            if(upass.getText().equals(ucpass.getText()) && !uname.getText().equals("") && !uemail.getText().equals("") && !uphone.getText().equals("") && !upass.getText().equals("") && !ucpass.getText().equals("")&& !gn.equals(""))
            {
                if(z>0){
                    
                    clscon objn=new clscon();
                    qry="";
                    qry="select * from tbstudentlogin where email='"+uemail.getText().toString()+"'";
                ResultSet rss=objn.connection2(qry);
                int a=0;
                while(rss.next())
                {
                    a++;
                }
                    qry="";
                    qry="select * from tbstudentlogin where phone='"+uphone.getText().toString()+"'";
                ResultSet rss1=objn.connection2(qry);
                int a1=0;
                while(rss1.next())
                {
                    a1++;
                }
                if(a==0 && a1==0){
                clscon obj1=new clscon();
                qry="";
                qry="insert into tbstudentlogin (name,email,phone,password,gender,ssts) values ('"+uname.getText().toString()+"','"+uemail.getText().toString()+"','"+uphone.getText().toString()+"','"+upass.getText().toString()+"','"+gn+"','0')";
                obj1.connection(qry);
                JOptionPane.showMessageDialog(null, "Data Inserted");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "This username & mobile already registered");
                }
                
                
                
                }
               
                else
                {
                    pnotification.setText("This phone  not registered");
                    enotification.setText("This email not registered");
                    nnotification.setText("This name not registered");
                    
                }
                
            }
            else
            {
                //JOptionPane.showMessageDialog(null, "Please fill all the entries");
                if(!upass.getText().equals(ucpass.getText()))
                {
                 JOptionPane.showMessageDialog(null, "password does not match");
                }
               
            }
                
            
            
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uphoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uphoneFocusLost
        // TODO add your handling code here:
        int l=uphone.getText().length();
        if(l==10){
            
            ten.setText("");
            
            
     }
        else
        {
            ten.setText("*Please enter 10 Digit mobile Number");
        }
    }//GEN-LAST:event_uphoneFocusLost

    private void uemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uemailFocusLost
        // TODO add your handling code here:
            if (!(Pattern.matches("^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$", uemail.getText()))) 
                {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            em.setText("*Please enter a valid email");

            }
            else
            {
                em.setText("");
            }
            
            
    }//GEN-LAST:event_uemailFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
          uname.setText("");
        upass.setText("");
        ucpass.setText("");
         uphone.setText("");
         uemail.setText("");
         ten.setText("");
        em.setText("");
        nnotification.setText("");
        enotification.setText("");
        pnotification.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    private void uphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uphoneActionPerformed

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
            java.util.logging.Logger.getLogger(frmsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmsignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpassnotification;
    private javax.swing.JLabel em;
    private javax.swing.JLabel enotification;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nnotification;
    private javax.swing.JLabel passnotification;
    private javax.swing.JLabel pnotification;
    private javax.swing.JLabel ten;
    private javax.swing.JPasswordField ucpass;
    private javax.swing.JTextField uemail;
    private javax.swing.JRadioButton ufemale;
    private javax.swing.JRadioButton umale;
    private javax.swing.JTextField uname;
    private javax.swing.JPasswordField upass;
    private javax.swing.JTextField uphone;
    // End of variables declaration//GEN-END:variables
}
