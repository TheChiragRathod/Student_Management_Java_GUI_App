package MyForm;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Date;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Insert extends javax.swing.JFrame
{
    static int id=0;
    static DisplayData TableRecord;
    public Insert() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        Enrollment = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtEnrollment = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        Skill = new javax.swing.JLabel();
        chkJAVA = new javax.swing.JCheckBox();
        chkPython = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insert Student Details");
        setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHIRAG-PC\\Documents\\NetBeansProjects\\Form\\src\\MyForm\\student.png")); // NOI18N
        jLabel2.setText("jLabel2");

        Enrollment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Enrollment.setText("Enrollment No : ");

        Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name.setText("Name : ");

        Address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Address.setText("Address : ");

        Gender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Gender.setText("Gender : ");

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtEnrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnrollmentActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        btnGroupGender.add(Male);
        Male.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Male.setSelected(true);
        Male.setText("Male");

        btnGroupGender.add(Female);
        Female.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Female.setText("Female");

        Skill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Skill.setText("Skill : ");

        chkJAVA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkJAVA.setText("JAVA");
        chkJAVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkJAVAActionPerformed(evt);
            }
        });

        chkPython.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkPython.setText("Python");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Username : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password :");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnSubmit)
                        .addGap(0, 253, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Gender)
                                    .addComponent(Skill))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkPython, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Female, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(213, 213, 213)
                                        .addComponent(btnReset)
                                        .addGap(0, 36, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Address)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(Name)
                                    .addComponent(Enrollment))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Male)
                                            .addComponent(chkJAVA)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Enrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Name)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Address)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkJAVA)
                    .addComponent(chkPython)
                    .addComponent(Skill))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Male)
                    .addComponent(Female))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnReset))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CleareAllField()
    {
        txtEnrollment.setText(null);
        txtName.setText(null);
        txtUsername.setText(null);
        txtPassword.setText(null);
        txtAddress.setText(null);
        chkJAVA.setSelected(false);
        chkPython.setSelected(false);
   
        //chkC.clear();
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       About a= new About();
                a.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnrollmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnrollmentActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //Reset all fields...
        CleareAllField();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        String enrollment=txtEnrollment.getText();
        String name=txtName.getText();
        String username=txtUsername.getText();
        String password=txtPassword.getText();
        String address=txtAddress.getText().trim();
        String gender="Male";
        String java="";
        String python="";
        
        if(txtEnrollment.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter your Enrollment...");
            txtEnrollment.grabFocus();
            return;
        }
        else if(txtName.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter your Name...");
            txtName.grabFocus();
            return;
        }
        else if(txtUsername.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter your Username...");
            txtUsername.grabFocus();
            return;
        }
        else if(txtPassword.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter your Password...");
            txtPassword.grabFocus();
            return;
        }
        else if(txtAddress.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter your Address...");
            txtAddress.grabFocus();
            return;
        }
        else
        {
            
            if(!txtUsername.getText().trim().isEmpty())
            {
                String user=txtUsername.getText().trim();
            
                if(user.length()<7)
                   {
                JOptionPane.showMessageDialog(this,"Please enter valid username...");
                txtUsername.grabFocus();
                return;
                }
            }
            
            
            
            
            if(Female.isSelected())
                gender="Female";
            if(chkJAVA.isSelected())
                java="Yes";
            if(chkPython.isSelected())
                python="Yes";
            
            
            //Record Update Code Start Here........
            if(id>0)
            {
                try
                {
                    //load jdbc driver...
                    Class.forName("com.mysql.jdbc.Driver");
            
                    //connection url...
                    String MySqlUrl="jdbc:mysql://localhost:3306/javadb?user=root";
            
                    //Connection established...
                    Connection con=DriverManager.getConnection(MySqlUrl);
              
                    //Sql Query...
                    String Query="UPDATE students set enrollment=?, name=?, username=?, password=?, address=?, gender=?, java=?, python=? where id="+id;
                    
                    PreparedStatement pst=con.prepareStatement(Query);
                    
                    pst.setString(1,enrollment);
                    pst.setString(2,name);
                    pst.setString(3,username);
                    pst.setString(4,password);
                    pst.setString(5,address);
                    pst.setString(6,gender);
                    pst.setString(7,java);
                    pst.setString(8,python);
                    pst.executeUpdate();
                    
                    //Creating Update logs...
                    FileWriter fw =new FileWriter("UpdateLog.txt",true);
                    BufferedWriter out =new BufferedWriter(fw);
                    Date date = new Date();
                    SimpleDateFormat formater=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    String str=formater.format(date)+"  "+enrollment+"  "+name+"  "+address+"  "+gender;
                    out.write(str);
                    out.write("\n");
                    out.close();
                    //Update Log Code Finish...
                    
                    
                    JOptionPane.showMessageDialog(this,"Record updated successfully...");
                    Insert.id=0;
                    setVisible(false);
                    TableRecord.TableRefresh();
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
                return;
            }
            
           
            //Record Insert Code....
            try
            {
            //load jdbc driver...
            Class.forName("com.mysql.jdbc.Driver");
            
            //connection url...
            String MySqlUrl="jdbc:mysql://localhost:3306/javadb?user=root";
            
            //Connection established...
            Connection con=DriverManager.getConnection(MySqlUrl);
            
            Statement stm=con.createStatement();
            
            //Sql Query...
            
            String Query="INSERT INTO students (enrollment,name,username,password,address,gender,java,python) VALUES ('"+enrollment+"','"+name+"','"+username+"','"+password+"','"+address+"','"+gender+"','"+java+"','"+python+"')";
            
            stm.execute(Query);
            CleareAllField();
            
            //Creating Insert logs...
            FileWriter fw =new FileWriter("InsertLog.txt",true);
            BufferedWriter out =new BufferedWriter(fw);
            Date date;
                date = new Date();
            SimpleDateFormat formater=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String str=formater.format(date)+"  "+enrollment+"  "+name+"  "+address+"  "+gender;
            out.write(str);
            out.write("\n");
            out.close();
            //Insert Log Code Finish...
            
            JOptionPane.showMessageDialog(this,"Data Inserted...");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            
        }
    }//GEN-LAST:event_btnSubmitActionPerformed
    public void setValue(String id,String E,String N,String U,String Pass,String A,String G,String J,String P)
    {
        Insert.id=Integer.parseInt(id);
        txtEnrollment.setText(E);
        txtName.setText(N);
        txtUsername.setText(U);
        txtPassword.setText(Pass);
        txtAddress.setText(A);
        if(J.equals("Yes"))
            chkJAVA.setSelected(true);
        if(P.equals("Yes"))
            chkPython.setSelected(true);
        if(G.equals("Male"))
            Male.setSelected(true);
        else
            Female.setSelected(true);
    }
    private void chkJAVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkJAVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkJAVAActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Enrollment;
    private javax.swing.JRadioButton Female;
    private javax.swing.JLabel Gender;
    private javax.swing.JRadioButton Male;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Skill;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox chkJAVA;
    private javax.swing.JCheckBox chkPython;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEnrollment;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
