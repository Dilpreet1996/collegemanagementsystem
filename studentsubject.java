
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dilpreet
 */
public class studentsubject extends javax.swing.JFrame {

    /**
     * Creates new form studentsubject
     */
    clscon obj=new clscon();
    public studentsubject() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cls = new javax.swing.JComboBox<>();
        sub = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sem = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ss = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cn = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ws = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select Class");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Subject Status");

        cls.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                clsItemStateChanged(evt);
            }
        });
        cls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setText("Add Subjects to Classes");

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Select Semester");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Add Subject");

        ss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "compulsory", "Optional(1)", "Optional(2)", "Optional(3)" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1)
                        .addGap(66, 66, 66)
                        .addComponent(jButton2)
                        .addGap(44, 44, 44)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(208, 208, 208)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cls, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Semester", "Class", "Complosry Subject", "Optional Subject"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Search By Class Name");

        cn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cnItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("With Semester");

        ws.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Semesters" }));
        ws.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                wsItemStateChanged(evt);
            }
        });
        ws.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ws, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ws, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           jButton3.setVisible(false);
        jButton2.setVisible(false);
        // TODO add your handling code here:
        
        String qry="select * from stusub where class='"+cls.getSelectedItem().toString()+"' &&  subject='"+sub.getText().toString()+"' && semester='"+sem.getSelectedItem().toString()+"'";
        ResultSet rs=obj.connection2(qry);
        try {
            int a=0;
           while(rs.next())
           {
               a++;
           }
           if(a==0)
           {
            
       
        qry="";
        qry="insert into stusub (class,semester,subject,stype) values('"+cls.getSelectedItem().toString()+"','"+sem.getSelectedItem().toString()+"','"+sub.getText().toString()+"','"+ss.getSelectedItem().toString()+"')";
        obj.connection(qry);
        JOptionPane.showMessageDialog(null,"Data Successfully Entered");
         }
           else
           {
               JOptionPane.showMessageDialog(null, "Data Already Registereds");
           }
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        gettable();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            String qry="select distinct class_name from addclass";
            
            ResultSet rs1=obj.connection2(qry);
            try 
            {
            int a=0;
            while(rs1.next())
            {
                a++;
                cls.addItem(rs1.getString(1));
            }
            } 
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            
            
        jButton3.setVisible(false);
        jButton2.setVisible(false);
// TODO add your handling code here:
        qry="";
        qry="select distinct class from stusub";
        ResultSet rs=obj.connection2(qry);
        try
        {
            while(rs.next())
            {
                cn.addItem(rs.getString(1).toString());
            }
            
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
                
    }//GEN-LAST:event_formWindowOpened
        
    public void gettable()
        {
            String columnNames[]={"semester","class","Compulasry subject","Optional Subjects"};
        
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

        



       
      


        String sc = "";
        String semm="";

        String ss= "";
        String os="";
      
         String qry="select semester,class,subject,stype   from stusub where class='"+cn.getSelectedItem().toString()+"'";
        ResultSet rs=obj.connection2(qry);
         try 
        {
          int i = 0;

           while(rs.next()) {

                sc= rs.getString("class");

                ss = rs.getString("subject");

            semm =rs.getString("semester");
            os=rs.getString("stype");
                    
              

                model.addRow(new Object[]{semm,sc,ss,os});

                i++;

            }
          
                rs.close();
                
            if (i < 1) {

                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);

            }

            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                System.out.println(i + " Records Found");

            }
              jTable1.setModel(model);
                
               System.out.println(i); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    private void cnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cnItemStateChanged
                String qry="select distinct semester from stusub";
                ResultSet rs=obj.connection2(qry);
                try 
                {
                    int a=0;
                    while(rs.next())
                    {
                        a++;
                        ws.addItem(rs.getString(1));
                    }
                }   
                catch (Exception e) 
                {
                    System.out.println(e.getMessage());
                }
        // TODO add your handling code here:
        gettable();
    }//GEN-LAST:event_cnItemStateChanged
String clas="";
String subj="";
String semmester="";
String osub="";
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // TODO add your handling code here:
        jButton3.setVisible(true);
      jButton2.setVisible(true);
      int y=jTable1.getSelectedRow();
   
      semmester=jTable1.getValueAt(y,0).toString();
      clas=jTable1.getValueAt(y, 1).toString();
      subj=jTable1.getValueAt(y, 2).toString();
      osub=jTable1.getValueAt(y, 3).toString();
      
      sub.setText(jTable1.getValueAt(y, 2).toString());
      String h=jTable1.getValueAt(y, 1).toString();
      String s=jTable1.getValueAt(y, 0).toString();
      String o=jTable1.getValueAt(y, 2).toString();
     int h1=cls.getItemCount();
     int s1=sem.getItemCount();
     int o1=ss.getItemCount();
     int id=0;
     int id1=0;
     int id2=0;
     for(int a=0;a<h1;a++)
     
         {
         if(cls.getItemAt(a).toString().equals(h))
         {
             id=a;
         }
     }
      
      
      cls.setSelectedIndex(id);
     
     for(int a=0;a<s1;a++)
     {
         if(sem.getItemAt(a).toString().equals(s))
         {
             id1=a;
      
         }
         
     }
     sem.setSelectedIndex(id1);
      for(int a=0;a<o1;a++)
      {
          if(ss.getItemAt(a).toString().equals(o))
          {
              id2=a;
          }
      }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        // TODO add your handling code here:
           String qry="update stusub set subject='"+sub.getText().toString()+"', class='"+cls.getSelectedItem().toString()+"', stype ='"+ss.getSelectedItem().toString()+"' where semester='"+semmester+"' && class='"+clas+"' && subject='"+subj+"' && stype='"+osub+"'";
         obj.connection(qry);
         JOptionPane.showMessageDialog(null, "Data successfully updated");
         sub.setText("");
         gettable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String qry="delete from stusub where subject='"+sub.getText().toString()+"'";
        obj.connection(qry);
        JOptionPane.showMessageDialog(null, "data delete");
        gettable();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void clsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clsActionPerformed

    private void wsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wsActionPerformed

    private void wsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_wsItemStateChanged
        
                if(ws.getSelectedItem().equals("All Semesters"))
                {
                    gettable();
                }
                else
                {

            String columnNames[]={"semester","class","Compulasry subject","Optional Subjects"};
        
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

        



       
      


        String sc = "";
        String semm="";

        String ss= "";
        String os="";
      String qry="select * from stusub where class='"+cls.getSelectedItem().toString()+"' && semester='"+ws.getSelectedItem().toString()+"'";
        ResultSet rs=obj.connection2(qry);
        

        try 
        {
          int i = 0;

           while(rs.next()) {

                sc= rs.getString("class");

                ss = rs.getString("subject");

            semm =rs.getString("semester");
            os=rs.getString("stype");
                    
              

                model.addRow(new Object[]{semm,sc,ss,os});

                i++;

            }
          
                rs.close();
                
            if (i < 1) {

                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);

            }

            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                System.out.println(i + " Records Found");

            }
              jTable1.setModel(model);
                
               System.out.println(i); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
                }
                }
        



// TODO add your handling code here:
               
    }//GEN-LAST:event_wsItemStateChanged

    private void clsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_clsItemStateChanged
        // TODO add your handling code here:
        String qry="select  semester  from addclass where class_name='"+cls.getSelectedItem().toString()+"'";
        ResultSet rs=obj.connection2(qry);
        try 
        {
            int a=0;
             sem.removeAllItems();
            while(rs.next())
            {
                a++;
               
                sem.addItem(rs.getString(1));
            }
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_clsItemStateChanged

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
            java.util.logging.Logger.getLogger(studentsubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentsubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentsubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentsubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentsubject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cls;
    private javax.swing.JComboBox<String> cn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> sem;
    private javax.swing.JComboBox<String> ss;
    private javax.swing.JTextField sub;
    private javax.swing.JComboBox<String> ws;
    // End of variables declaration//GEN-END:variables
}
