/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import Items.Book;
import Items.Computer;
import static System.CusBookInterface.readObjFromFile;
import User.Customer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class CusComputerInterface extends javax.swing.JFrame {
    private static final String fileName = "Computer.txt";
    private static final String loginFile = "LoginUser.txt";
    /**
     * Creates new form CusComputerInterface
     */
    public CusComputerInterface() {
        initComponents();
        Item_Load();
    }
     public void Item_Load(){ //这个是加载数据库的方法
        int c;
        
            ArrayList<Computer> comList = new ArrayList<>();
            readObjFromFile(comList);
            DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);//如果插入行数大于这个值，那么就会在表中插入新行。如果插入行数小于这个值，那么原来表中大于等于这些行的都会被删掉。
            //Sets the number of columns in the model. If the new size is greater than the current size, 
            //new columns are added to the end of the model with null cell values. 
            //If the new size is less than the current size, all columns at index columnCount and greater are discarded.
            for(Computer com: comList){
                Vector v2 = new Vector();
                v2.add(com.getComCode());
                v2.add(com.getSystem());
                v2.add(com.getColor());
                v2.add(com.getBorrowDate());
                v2.add(com.getReturnDate());
                d.addRow(v2);  //Vector Rowdata
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

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtSystem = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Computer Code");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Computer Managment");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Operating System");

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Borrow");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("Extend");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setText("Return");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Color");

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "System", "Color", "Borrow Date", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(26, 26, 26)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(213, 213, 213)
                                        .addComponent(txtSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(txtSystem)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addGap(44, 44, 44)
                        .addComponent(jButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String code = txtCode.getText();
        String system = txtSystem.getText();
        String color = txtColor.getText();
        ArrayList<Computer> comList = new ArrayList<>();
        ArrayList<Customer> userList = new ArrayList<>();
        Customer user = new Customer("School","Ok111","owner");
        readObjFromFile(loginFile,userList);
        user = userList.get(userList.size()-1);
        readObjFromFile(comList);
        boolean find = false;
        for(int i = 0;i<comList.size();i++){
            if(comList.get(i).getComCode().equals(code) && comList.get(i).getSystem().equals(system) && comList.get(i).getColor().equals(color)){
                //BookList.remove(i);
                find = true;
                DefaultTableModel a = (DefaultTableModel)jTable1.getModel();
                int selectIndex = jTable1.getSelectedRow();//Returns the index of the first selected row, -1 if no row is selected.
        //就是得到时第几行
          //每一行的数据从第一列开始的数据编号是0，1，2，3，4....就像数组，所以这里的0得到的是id号
          a.setValueAt(code, selectIndex, 0);      
          a.setValueAt(system, selectIndex, 1);
          a.setValueAt(color, selectIndex, 2);
          a.setValueAt(LocalDate.now().toString(), selectIndex, 3);
          a.setValueAt("",selectIndex , 4);
          
            }
        }
        if(find){
            JOptionPane.showMessageDialog(this, "Computer Borrowed!");
        }else{
            JOptionPane.showMessageDialog(this, "Computer Not Found!");
        }
        
        try{
            FileOutputStream output=new FileOutputStream("Computer.txt");
            ObjectOutputStream oop=null;
            for(int i = 0;i<comList.size();i++){
                if(comList.get(i).getComCode().equals(code) && comList.get(i).getSystem().equals(system) && comList.get(i).getColor().equals(color)){
                    oop=new ObjectOutputStream(output);
                    oop.writeObject(new Computer(code,color,system,LocalDate.now().toString(), comList.get(i).getReturnDate(),user));
                }else{
                oop=new ObjectOutputStream(output);
                oop.writeObject(comList.get(i));
                }
            }
         }catch(Exception e){
             
         }  
        txtCode.setText(code);
        txtColor.setText(color);
        txtSystem.setText(system);
        //JOptionPane.showMessageDialog(this, "Umbrella Deleted!");
        readObjFromFile();
        System.out.println();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String code = txtCode.getText();
        String system = txtSystem.getText();
        String color = txtColor.getText();
        ArrayList<Computer> comList = new ArrayList<>();
        ArrayList<Customer> userList = new ArrayList<>();
        Customer user = new Customer("School","Ok111","owner");
        readObjFromFile(loginFile,userList);
        user = userList.get(userList.size()-1);
        readObjFromFile(comList);
        boolean find = false;
        for(int i = 0;i<comList.size();i++){
            if(comList.get(i).getComCode().equals(code) && comList.get(i).getSystem().equals(system) && comList.get(i).getColor().equals(color)){
                //BookList.remove(i);
                find = true;
                DefaultTableModel a = (DefaultTableModel)jTable1.getModel();
                int selectIndex = jTable1.getSelectedRow();//Returns the index of the first selected row, -1 if no row is selected.
        //就是得到时第几行
          //每一行的数据从第一列开始的数据编号是0，1，2，3，4....就像数组，所以这里的0得到的是id号
           a.setValueAt(code, selectIndex, 0);      
          a.setValueAt(system, selectIndex, 1);
          a.setValueAt(color, selectIndex, 2);
          a.setValueAt(LocalDate.now().toString(), selectIndex, 3);
          a.setValueAt("",selectIndex , 4);
          
            }
        }
        if(find){
            JOptionPane.showMessageDialog(this, "Computer Extended!");
        }else{
            JOptionPane.showMessageDialog(this, "Computer Not Found!");
        }
        
        try{
            FileOutputStream output=new FileOutputStream("Computer.txt");
            ObjectOutputStream oop=null;
            for(int i = 0;i<comList.size();i++){
                if(comList.get(i).getComCode().equals(code) && comList.get(i).getSystem().equals(system) && comList.get(i).getColor().equals(color)){
                    oop=new ObjectOutputStream(output);
                    oop.writeObject(new Computer(code,color,system,LocalDate.now().toString(), "1990-10-01",user));
                }else{
                oop=new ObjectOutputStream(output);
                oop.writeObject(comList.get(i));
                }
            }
         }catch(Exception e){
             
         }  
        txtCode.setText(code);
        txtColor.setText(color);
        txtSystem.setText(system);
        //JOptionPane.showMessageDialog(this, "Umbrella Deleted!");
        readObjFromFile();
        System.out.println();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 // TODO add your handling code here:
        String code = txtCode.getText();
        String system = txtSystem.getText();
        String color = txtColor.getText();
        ArrayList<Computer> comList = new ArrayList<>();
        readObjFromFile(comList);
        boolean find = false;
        for(int i = 0;i<comList.size();i++){
            if(comList.get(i).getComCode().equals(code) && comList.get(i).getSystem().equals(system) && comList.get(i).getColor().equals(color)){
                //bookList.set(i, new Book(author,name));
                find = true;
                DefaultTableModel a = (DefaultTableModel)jTable1.getModel();
                int selectIndex = jTable1.getSelectedRow();//Returns the index of the first selected row, -1 if no row is selected.
        //就是得到时第几行
          //每一行的数据从第一列开始的数据编号是0，1，2，3，4....就像数组，所以这里的0得到的是id号
          a.setValueAt(code, selectIndex, 0);      
          a.setValueAt(system, selectIndex, 1);
          a.setValueAt(color, selectIndex, 2);
          a.setValueAt(comList.get(i).getBorrowDate(), selectIndex, 3);
          a.setValueAt(LocalDate.now().toString(),selectIndex , 4);
            }
        }
        if(find){
            JOptionPane.showMessageDialog(this, "Computer Returned!");
        }else{
            JOptionPane.showMessageDialog(this, "Computer Not Found!");
        }
        try{
            FileOutputStream output=new FileOutputStream("Computer.txt");
            ObjectOutputStream oop=null;
            for(int i = 0;i<comList.size();i++){
                if(comList.get(i).getComCode().equals(code) && comList.get(i).getSystem().equals(system) && comList.get(i).getColor().equals(color)){
                    oop=new ObjectOutputStream(output);
                    oop.writeObject(new Computer(code,color,system,comList.get(i).getBorrowDate(), LocalDate.now().toString(),new Customer("School","Ok111","owner")));
                }else{
                oop=new ObjectOutputStream(output);
                oop.writeObject(comList.get(i));
                }
            }
         }catch(Exception e){
             
         }  
        txtCode.setText(code);
        txtColor.setText(color);
        txtSystem.setText(system);
        //JOptionPane.showMessageDialog(this, "Umbrella Deleted!");
        for(Computer com: comList){
                System.out.println(com);
            }
        System.out.println();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        cusItemInterface a = new cusItemInterface();
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel a = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();//Returns the index of the first selected row, -1 if no row is selected.
        //就是得到时第几行
          //每一行的数据从第一列开始的数据编号是0，1，2，3，4....就像数组，所以这里的0得到的是id号
        txtCode.setText(a.getValueAt(selectIndex, 0).toString());//这个得到的是category name
        txtSystem.setText(a.getValueAt(selectIndex, 1).toString());//这个是设置好选项中的内容
        txtColor.setText(a.getValueAt(selectIndex, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked
      public static void readObjFromFile(ArrayList<Computer> a){  
        try {  
            
            ObjectInputStream ois=null;
            FileInputStream fis=new FileInputStream(fileName);
            while(fis.available()>0){
                ois=new ObjectInputStream(fis);   
                a.add((Computer)ois.readObject());
            }
           
            ois.close();
            
        } catch (Exception e) {    
            System.out.println(e.toString());
        }
        
   }
    public static void readObjFromFile(String fileName, ArrayList<Customer> a){  
        try {  
            
            ObjectInputStream ois=null;
            FileInputStream fis=new FileInputStream(fileName);
            while(fis.available()>0){
                ois=new ObjectInputStream(fis);   
                a.add((Customer)ois.readObject());
            }
           
            ois.close();
            
        } catch (Exception e) {    
            System.out.println(e.toString());
        }
        
   }
     public static void appendObjToFile(Object p){
        try {
            FileOutputStream fos=new FileOutputStream(fileName,true);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
        } 
         catch (Exception e) {
            System.out.println(e.toString());
        } 
    } 
     public static void readObjFromFile(){
        try {  
            Object obj=null;
            ObjectInputStream ois=null;
            FileInputStream fis=new FileInputStream(fileName);
            while(fis.available()>0){
                ois=new ObjectInputStream(fis);    
                obj=ois.readObject();
                System.out.println(obj);
            }
            ois.close();
        } catch (Exception e) {    
            System.out.println(e.toString());
        }
    }
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
            java.util.logging.Logger.getLogger(CusComputerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CusComputerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CusComputerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CusComputerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CusComputerInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtSystem;
    // End of variables declaration//GEN-END:variables
}
