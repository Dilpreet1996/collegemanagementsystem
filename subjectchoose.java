
import java.awt.PopupMenu;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
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
public class subjectchoose extends javax.swing.JFrame {

    /**
     * Creates new form subjectchoose
     */
    
    String sub[]=new String[4];
    
    String h="";
    int count=0;
    int ct=0;
    clscon obj=new clscon();
    public subjectchoose() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sos = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        opn1 = new javax.swing.JLabel();
        opn2 = new javax.swing.JLabel();
        opn3 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Roll No");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Class");

        rn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rnFocusLost(evt);
            }
        });
        rn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Semester");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Semester", "Subjects"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Name");

        jLabel9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel9FocusGained(evt);
            }
        });
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel9KeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel11.setText("   Choose Subjects");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Open Electives");

        sos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 255), null, null));
        sos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sosItemStateChanged(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("     Optional Subjects");

        opn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opn1MouseClicked(evt);
            }
        });

        opn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opn2MouseClicked(evt);
            }
        });

        opn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opn3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sos, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 265, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(132, 132, 132))))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(453, 453, 453))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(rn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(26, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(opn1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opn2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opn3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void gettable()
        {
            String columnNames[]={"semester","subjects"};
        
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

        



       
      


     
        String semm="";

        String subject= "";
        
      
         String qry="select semester,subject from stusub where semester='"+jLabel9.getText().toString()+"' && stype='compulsory'";
        ResultSet rs=obj.connection2(qry);
         try 
        {
          int i = 0;

           while(rs.next()) {

         

              

            semm =rs.getString("semester");
           
            
             subject = rs.getString("subject");
           
           
             
            
                    
              

                model.addRow(new Object[]{semm,subject});

                i++;

            }
          
               // rs.close();
                
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

    private void rnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rnFocusLost
    jButton2.setText("Add");

        // TODO add your handling code here:
        String qry="select rollno,name,class,photo from tbstudentadmission where rollno='"+rn.getText().toString()+"'";
        ResultSet rs=obj.connection2(qry);
        try 
        {
            int a=0;
            while(rs.next())
            {
                a++;
                jLabel5.setText("");
                 jLabel7.setText(rs.getString(2));
                 jLabel8.setText(rs.getString(3));
                 photo.setIcon(new ImageIcon("student/"+rs.getString(4)));
                h="student/"+rs.getString(4);
                
            }
           
            if(a<1)
            {
                jLabel5.setText("not valid roll no");
                 jLabel7.setText("");
                 jLabel8.setText("");
                 jLabel9.setText("");
                photo.setIcon(new ImageIcon(""));
                
            }
            else
            {
         qry="";            
        qry="select semester from studentfee where rollno='"+rn.getText().toString()+"'";
        ResultSet rs1=obj.connection2(qry);
          while(rs1.next())
            {
                a++;
                jLabel9.setText(rs1.getString(1));
                
            }
        }
            
    if(jLabel9.getText().equals("1") || jLabel9.getText().equals("2") || jLabel9.getText().equals("3") || jLabel9.getText().equals("4") || jLabel9.getText().equals("8"))
{
    JOptionPane.showMessageDialog(opn1,"mitti");
    
    jLabel3.setVisible(false);
    
    jLabel14.setVisible(false);
    opn1.setVisible(false);
    opn2.setVisible(false);
    opn3.setVisible(false);
    sos.setVisible(false);
    jButton2.setVisible(false);
    jButton1.setVisible(true);    
}
else
{
    JOptionPane.showMessageDialog(opn1," ok ");
    
    jLabel3.setVisible(true);
    jLabel14.setVisible(true);
    opn1.setVisible(true);
    opn2.setVisible(true);
    opn3.setVisible(true);
    sos.setVisible(true);
    jButton2.setVisible(true); 
    jButton1.setVisible(false);
}
        
    
        
    
        
        
                
                
            
           
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
       
        
        
        
        
       
            try 
            {
                
                qry="";
              
              String  cse="Computer Science & Engg";    
                  
               if(jLabel8.getText().equals(cse) && jLabel9.getText().equals("5"))
               {
                qry="select * from stusub where  class='"+jLabel8.getText().toString()+"' && semester='"+jLabel9.getText().toString()+"'";
                ResultSet rs2=obj.connection2(qry);
                    sos.removeAllItems();
                    count=1;
                  int a=0;
                while(rs2.next())
                {
                     
                  a++;
                     if(rs2.getString(5).toString().equals("Optional(1)") ||rs2.getString(5).toString().equals("Optional(2)") || rs2.getString(5).toString().equals("Optional(3)"))
                     {
                        sos.addItem(rs2.getString(4) +"--"+rs2.getString(5) );
                       
                    }
                }
               }
               
                 if(jLabel8.getText().equals(cse) && jLabel9.getText().equals("6"))
               {
                   count=2;
                qry="select * from stusub where  class='"+jLabel8.getText().toString()+"' && semester='"+jLabel9.getText().toString()+"'";
                ResultSet rs2=obj.connection2(qry);
   sos.removeAllItems();
                    
                  int a=0;
                while(rs2.next())
                {
                     
                  a++;
                     if(rs2.getString(5).toString().equals("Optional(1)") ||rs2.getString(5).toString().equals("Optional(2)") || rs2.getString(5).toString().equals("Optional(3)"))
                     {
                        sos.addItem(rs2.getString(4) +"--"+rs2.getString(5) );
                       
                    }
                }
               }
                  
                 if(jLabel8.getText().equals(cse) && jLabel9.getText().equals("7"))
               {
                   count=2;
                qry="select * from stusub where  class='"+jLabel8.getText().toString()+"' && semester='"+jLabel9.getText().toString()+"'";
                ResultSet rs2=obj.connection2(qry);
   sos.removeAllItems();
                    
                  int a=0;
                while(rs2.next())
                {
                     
                  a++;
                     if(rs2.getString(5).toString().equals("Optional(1)") ||rs2.getString(5).toString().equals("Optional(2)") || rs2.getString(5).toString().equals("Optional(3)"))
                     {
                        sos.addItem(rs2.getString(4) +"--"+rs2.getString(5) );
                       
                    }
                }
               }
                
                   if(jLabel8.getText().equals(cse) && jLabel9.getText().equals("8"))
               {
                   count=0;
                qry="select * from stusub where  class='"+jLabel8.getText().toString()+"' && semester='"+jLabel9.getText().toString()+"'";
                ResultSet rs2=obj.connection2(qry);
   sos.removeAllItems();
                    
                  int a=0;
                while(rs2.next())
                {
                     
                  a++;
                     if(rs2.getString(5).toString().equals("Optional(1)") ||rs2.getString(5).toString().equals("Optional(2)") || rs2.getString(5).toString().equals("Optional(3)"))
                     {
                        sos.addItem(rs2.getString(4) +"--"+rs2.getString(5) );
                       
                    }
                }
               }
                
                
            }
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        
        
        
        
        
        
        
        gettable();
        
      
               
           if(jLabel9.getText().toString().equals("5")){
               opn1.setVisible(true);
               opn2.setVisible(false);
                  opn3.setVisible(false);
                
               
            
               
           }    
           
           if(jLabel9.getText().toString().equals("6")){
               opn3.setVisible(false);
               opn1.setVisible(true);
               opn2.setVisible(true);

               
           }    
           if(jLabel9.getText().toString().equals("7")){
                opn1.setVisible(false);
               opn2.setVisible(true);
               opn3.setVisible(true);
               
               
           }
        
        
    }//GEN-LAST:event_rnFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        // TODO add your handling code here:
     jLabel3.setVisible(false);
     sos.setVisible(false);
     jButton2.setVisible(false);
     jLabel14.setVisible(false);
     opn1.setVisible(false);
     opn2.setVisible(false);
     opn3.setVisible(false);
       
        
       
    }//GEN-LAST:event_formWindowOpened

    private void jLabel9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel9KeyTyped

    private void jLabel9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel9FocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel9FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        try 
        {
            ct++;
            
                 
           if(jLabel9.getText().toString().equals("5")){
               opn1.setVisible(true);
               opn2.setVisible(false);
                  opn3.setVisible(false);
               
               if(sos.getSelectedItem().toString().contains("Optional(1)")){
                   
                  opn1.setText(sos.getSelectedItem().toString());
                  
               }
               
           }    
           
           if(jLabel9.getText().toString().equals("6")){
               opn3.setVisible(false);
               opn1.setVisible(true);
               opn2.setVisible(true);
               if(sos.getSelectedItem().toString().contains("Optional(1)")){
                   opn1.setText(sos.getSelectedItem().toString());
                   
               }
               if(sos.getSelectedItem().toString().contains("Optional(2)")){
                   opn2.setText(sos.getSelectedItem().toString());
              
               }
               
           }    
           if(jLabel9.getText().toString().equals("7")){
                opn1.setVisible(false);
               opn2.setVisible(true);
               opn3.setVisible(true);
               if(sos.getSelectedItem().toString().contains("Optional(2)")){
                  opn2.setText(sos.getSelectedItem().toString());
                  
                  
               }
               if(sos.getSelectedItem().toString().contains("Optional(3)")){
                 opn3.setText(sos.getSelectedItem().toString());
              
                  
               }
           }
           
           
        
        
            
      
        

       
        


     
       
        
        
             
             
               
               
               
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        
        String cse="Computer Science & Engg";
        
        if(jLabel8.getText().equals(cse) && jLabel9.getText().equals("1") || jLabel9.getText().equals("2") || jLabel9.getText().equals("3") || jLabel9.getText().equals("4") || jLabel9.getText().equals("8"))
        {
            jButton1.setVisible(true);
        }
        if(jLabel8.getText().equals(cse) && jLabel9.getText().equals("5"))
        {
            if(!opn1.getText().toString().equals(""))
            {
                jButton1.setVisible(true);
            }
        }
         if(jLabel8.getText().equals(cse) && jLabel9.getText().equals("6"))
        {
            if(!opn1.getText().toString().equals("") && !opn2.getText().toString().equals(""))
            {
                jButton1.setVisible(true);
            }
        }
          if(jLabel8.getText().equals(cse) && jLabel9.getText().equals("7"))
        {
            if(!opn2.getText().toString().equals("") && !opn3.getText().toString().equals(""))
            {
                jButton1.setVisible(true);
            }
        }
        
        
        
          
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void sosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sosItemStateChanged
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_sosItemStateChanged

    private void rnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnActionPerformed

    private void opn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opn1MouseClicked
        // TODO add your handling code here:
        jButton2.setText("Update");
    }//GEN-LAST:event_opn1MouseClicked

    private void opn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opn2MouseClicked
        // TODO add your handling code here:
        jButton2.setText("Update");
    }//GEN-LAST:event_opn2MouseClicked

    private void opn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opn3MouseClicked
        // TODO add your handling code here:
        jButton2.setText("Update");
    }//GEN-LAST:event_opn3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        String subject="";
        for(int x=0; x<jTable1.getRowCount();x++)
        {
            subject=subject+jTable1.getValueAt(x, 1)+",";
        }
        
        if(!opn1.getText().toString().equals("")){
                subject=subject+opn1.getText()+",";
        }
        if(!opn2.getText().toString().equals("")){
             subject=subject+opn2.getText()+",";
        }
        if(!opn3.getText().toString().equals("")){
            subject=subject+opn3.getText()+",";
        }
        
        
        if(!rn.getText().equals("") && !jLabel7.equals("") && !jLabel8.equals("") && !h.equals(""))
        {
            String qry="select rollno,class,semester from studentsubjectsselected where rollno='"+rn.getText()+"' && class='"+jLabel8.getText()+"' && semester='"+jLabel9.getText()+"'";
            ResultSet rs1=obj.connection2(qry);
            try 
            {
                int a=0;
               while(rs1.next())
               {
                 a++; 
               
                 
               }
               if(a==0)
               {
                   qry="";
                   qry="insert into studentsubjectsselected(rollno,name,class,semester,subjects,photo) values('"+rn.getText().toString()+"' , '"+jLabel7.getText().toString()+"','"+jLabel8.getText().toString()+"','"+jLabel9.getText().toString()+"','"+subject+"','"+h+"')";
                    obj.connection(qry);
                     
                    JOptionPane.showMessageDialog(null, "Data Successfully Registered");
                   
               }
               if(a>0)
               {
                   JOptionPane.showMessageDialog(null, "Data Already Registered");
               }
               
            } catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(subjectchoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subjectchoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subjectchoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subjectchoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subjectchoose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel opn1;
    private javax.swing.JLabel opn2;
    private javax.swing.JLabel opn3;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField rn;
    private javax.swing.JComboBox<String> sos;
    // End of variables declaration//GEN-END:variables
}