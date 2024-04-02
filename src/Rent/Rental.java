/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Rent;

/**
 *
 * @author moham
 */
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.Statement;


public class Rental extends javax.swing.JFrame {

    /**
     * Creates new form Rental
     */
    public Rental() {
        initComponents();
        Color col = new Color (73,88,103);
        getContentPane().setBackground(col);
        
        LoadCarID();
        Date.setDateFormatString("yyyy/MM/dd");
        DueDate.setDateFormatString("yyyy/MM/dd");
        
        CusID.setEnabled(false);
        CusName.setEnabled(false);
        Date.setEnabled(false);
        DueDate.setEnabled(false);
        RFee.setEnabled(false);
    }
    
    Connection con;
    ResultSet rs;
    ResultSet rs1;
    PreparedStatement pst= null;
    PreparedStatement pst1=null;
    PreparedStatement pst2=null;
    PreparedStatement pst3=null;
    PreparedStatement pst4;

    
    public void LoadCarID()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mr rentals","root","");
            pst = con.prepareStatement("select * from carregistration");
            rs = pst.executeQuery();
            CarID.removeAllItems();
            
            while (rs.next())
            {
                CarID.addItem(rs.getString(1));
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Date = new com.toedter.calendar.JDateChooser();
        CusID = new javax.swing.JTextField();
        CusName = new javax.swing.JTextField();
        RFee = new javax.swing.JTextField();
        DueDate = new com.toedter.calendar.JDateChooser();
        CarID = new javax.swing.JComboBox<>();
        CarAVL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(158, 173, 167));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Car ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Customer ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Customer Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Date");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Due Date");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Rental Fee");

        jButton1.setBackground(new java.awt.Color(219, 161, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(219, 161, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Date.setBackground(new java.awt.Color(242, 242, 153));

        CusID.setBackground(new java.awt.Color(255, 255, 153));
        CusID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CusIDKeyPressed(evt);
            }
        });

        CusName.setBackground(new java.awt.Color(255, 255, 153));

        RFee.setBackground(new java.awt.Color(255, 255, 153));

        DueDate.setBackground(new java.awt.Color(242, 242, 153));

        CarID.setBackground(new java.awt.Color(255, 255, 153));
        CarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarIDActionPerformed(evt);
            }
        });
        CarID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CarIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CarIDKeyReleased(evt);
            }
        });

        CarAVL.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(CusID)
                    .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CusName)
                    .addComponent(DueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RFee)
                    .addComponent(CarID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CarAVL, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton4});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CarAVL, CarID, CusID, CusName, Date, DueDate, RFee});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarAVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CusID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(RFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton4});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CarAVL, CarID, CusID, CusName, Date, DueDate, RFee});

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Rental Menu");
        jLabel7.setAutoscrolls(true);

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\Documents\\JAVA\\MR Rentals\\Icons\\car-icon-3-coloring-page R.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.hide();
        Main frm = new Main ();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarIDActionPerformed

        String car_id =  CarID.getSelectedItem().toString();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mr rentals","root","");
            pst1 = con.prepareStatement("select * from carregistration where Car_ID = ?");
            pst1.setString(1, car_id);
            rs1 = pst1.executeQuery();
              
            if (!rs1.next()) //if false
            {
                JOptionPane.showMessageDialog(this, "Car Not Found");
            }
            else
            {
               String avl = rs1.getString("Available");
               CarAVL.setText(avl.trim());
               
               if(avl.equals("Yes"))
               {
                    CusID.setEnabled(true);
                    CusName.setEnabled(true);
                    Date.setEnabled(true);
                    DueDate.setEnabled(true);
                    RFee.setEnabled(true);
               }
               else
               {
                     CusID.setEnabled(false);
                     CusName.setEnabled(false);
                     Date.setEnabled(false);
                     DueDate.setEnabled(false);
                     RFee.setEnabled(false);
               }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CarIDActionPerformed

    private void CusIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CusIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER )
        {
            String cus_id = CusID.getText();
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mr rentals","root","");
                
                pst2 = con.prepareStatement("select * from customer where Customer_ID = ?");
                pst2.setString(1, cus_id);
                rs = pst2.executeQuery();

                if (rs.next()== false)
            {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
            else
            {
               String cus_name = rs.getString("Customer_Name");
               CusName.setText(cus_name.trim());
            }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CusIDKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String car_id = CarID.getSelectedItem().toString();
        String cus_id = CusID.getText();
        SimpleDateFormat Date_Format = new SimpleDateFormat ("yyyy/MM/dd");
        String date = Date_Format.format(Date.getDate());
        SimpleDateFormat Date_Format1 = new SimpleDateFormat ("yyyy/MM/dd");
        String due = Date_Format1.format(DueDate.getDate());
        String fee = RFee.getText();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mr rentals","root","");
            if (date.equals("")||due.equals("")||fee.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Some Fields are empty");   
            }
            else
            {
                pst3 = con.prepareStatement("insert into rental (Car_ID, Customer_ID, Date, Due, Fee)Values (?,?,?,?,?)");
                pst3.setString(1, car_id);
                pst3.setString(2, cus_id);
                pst3.setString(3, date);
                pst3.setString(4, due);
                pst3.setString(5, fee);
                pst3.executeUpdate();
           
                pst4 = con.prepareStatement("update carregistration set Available ='No' where Car_ID = ? ");
                pst4.setString(1, car_id);
                pst4.executeUpdate();
            
                JOptionPane.showMessageDialog(this , "Car Booked");
            
            
                CusID.setText("");
                CusName.setText("");
                Date.setDateFormatString("");
                DueDate.setDateFormatString("");
                RFee.setText("");
                CusID.requestFocus();
                
                CusID.setEnabled(false);
                CusName.setEnabled(false);
                Date.setEnabled(false);
                DueDate.setEnabled(false);
                RFee.setEnabled(false);
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void getData() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mr rentals", "root", "");
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM carregistration";
        ResultSet rs = stmt.executeQuery(sql);

        // Process result set here

        // Properly close ResultSet object
        rs.close();
        
        // Properly close Statement object
        stmt.close();
        
        // Properly close Connection object
        con.close();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        // handle class not found exception here
    } catch (SQLException e) {
        e.printStackTrace();
        // handle SQL exception here
    } catch (Exception e) {
        e.printStackTrace();
        // handle any other exception here
    }
}

    private void CarIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CarIDKeyPressed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_CarIDKeyPressed

    private void CarIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CarIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_CarIDKeyReleased

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
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(() -> {
           new Rental().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CarAVL;
    private javax.swing.JComboBox<String> CarID;
    private javax.swing.JTextField CusID;
    private javax.swing.JTextField CusName;
    private com.toedter.calendar.JDateChooser Date;
    private com.toedter.calendar.JDateChooser DueDate;
    private javax.swing.JTextField RFee;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
