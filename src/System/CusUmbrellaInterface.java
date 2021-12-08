/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import Items.Book;
import Items.Umbrella;
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
public class CusUmbrellaInterface extends javax.swing.JFrame {
    private static final String fileName = "Umbrella.txt";
    private static final String loginFile = "LoginUser.txt";
    /**
     * Creates new form CusUmbrellaInterface
     */
    public CusUmbrellaInterface() {
        initComponents();
         Item_Load();
    }
     public void Item_Load(){ //这个是加载数据库的方法
        int c;
        
            ArrayList<Umbrella> umbrellaList = new ArrayList<>();
            readObjFromFile(umbrellaList);
            DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);//如果插入行数大于这个值，那么就会在表中插入新行。如果插入行数小于这个值，那么原来表中大于等于这些行的都会被删掉。
            //Sets the number of columns in the model. If the new size is greater than the current size, 
            //new columns are added to the end of the model with null cell values. 
            //If the new size is less than the current size, all columns at index columnCount and greater are discarded.
            for(Umbrella um: umbrellaList){
                Vector v2 = new Vector();
                v2.add(um.getCode());
                v2.add(um.getColor());
                v2.add(um.getBorrowDate());
                v2.add(um.getReturnDate());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtCode = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To The Umbrella System");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        jTable1.setForeground(new java.awt.Color(153, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Color", "Borrow Time", "Return Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Code");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Color");

        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        txtColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Borrow");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Today's Date:");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 255));
        jLabel4.setText("Please Firstly Select An Umbrella From The Table");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 255));
        jLabel5.setText("And Then Do the Borrow And Return Process");

        jButton5.setText("Extend");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)))))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(161, 161, 161))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel a = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();//Returns the index of the first selected row, -1 if no row is selected.
        //就是得到时第几行
        //每一行的数据从第一列开始的数据编号是0，1，2，3，4....就像数组，所以这里的0得到的是id号
        txtCode.setText(a.getValueAt(selectIndex, 0).toString());//这个得到的是category name
        txtColor.setText(a.getValueAt(selectIndex, 1).toString());//这个是设置好选项中的内容

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String code = txtCode.getText();
        String color = txtColor.getText();
        ArrayList<Umbrella> umList = new ArrayList<>();
        readObjFromFile(umList);
        boolean find = false;
        for(int i = 0;i<umList.size();i++){
            if(umList.get(i).getCode().equals(code) && umList.get(i).getColor().equals(color)){
                //bookList.set(i, new Book(author,name));
                find = true;
                DefaultTableModel a = (DefaultTableModel)jTable1.getModel();
                int selectIndex = jTable1.getSelectedRow();//Returns the index of the first selected row, -1 if no row is selected.
                //就是得到时第几行
                //每一行的数据从第一列开始的数据编号是0，1，2，3，4....就像数组，所以这里的0得到的是id号
                a.setValueAt(code, selectIndex, 0);
                a.setValueAt(color, selectIndex, 1);
                a.setValueAt(umList.get(i).getBorrowDate(), selectIndex, 2);
                a.setValueAt(LocalDate.now().toString(),selectIndex , 3);
            }
        }
        if(find){
            JOptionPane.showMessageDialog(this, "Umbrella Returned!");
        }else{
            JOptionPane.showMessageDialog(this, "Umbrella Not Found!");
        }
        try{
            FileOutputStream output=new FileOutputStream("Umbrella.txt");
            ObjectOutputStream oop=null;
            for(int i = 0;i<umList.size();i++){
                if(umList.get(i).getCode().equals(code) && umList.get(i).getColor().equals(color)){
                    oop=new ObjectOutputStream(output);
                    oop.writeObject(new Umbrella(code,color,umList.get(i).getBorrowDate(), LocalDate.now().toString(),new Customer("School","Ok111","owner")));
                }else{
                    oop=new ObjectOutputStream(output);
                    oop.writeObject(umList.get(i));
                }
            }
        }catch(Exception e){

        }
        txtCode.setText(code);
        txtColor.setText(color);
        //JOptionPane.showMessageDialog(this, "Umbrella Deleted!");
        for(Umbrella um: umList){
            System.out.println(um);
        }
        System.out.println();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
        this.setVisible(true);
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cusItemInterface a = new cusItemInterface();
        this.hide();
        a.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String code = txtCode.getText();
        String color = txtColor.getText();
        ArrayList<Umbrella> umList = new ArrayList<>();
        ArrayList<Customer> userList = new ArrayList<>();
        Customer user = new Customer("School","Ok111","owner");
        readObjFromFile(loginFile,userList);
        user = userList.get(userList.size()-1);
        readObjFromFile(umList);
        boolean find = false;
        for(int i = 0;i<umList.size();i++){
            if(umList.get(i).getCode().equals(code) && umList.get(i).getColor().equals(color)){
                //BookList.remove(i);
                find = true;
                DefaultTableModel a = (DefaultTableModel)jTable1.getModel();
                int selectIndex = jTable1.getSelectedRow();//Returns the index of the first selected row, -1 if no row is selected.
                //就是得到时第几行
                //每一行的数据从第一列开始的数据编号是0，1，2，3，4....就像数组，所以这里的0得到的是id号
                a.setValueAt(code, selectIndex, 0);
                a.setValueAt(color, selectIndex, 1);
                a.setValueAt(LocalDate.now().toString(), selectIndex, 2);
                a.setValueAt("",selectIndex , 3);

            }
        }
        if(find){
            JOptionPane.showMessageDialog(this, "Umbrella Borrowed!");
        }else{
            JOptionPane.showMessageDialog(this, "Umbrella Not Found!");
        }

        try{
            FileOutputStream output=new FileOutputStream("Umbrella.txt");
            ObjectOutputStream oop=null;
            for(int i = 0;i<umList.size();i++){
                if(umList.get(i).getCode().equals(code) && umList.get(i).getColor().equals(color)){
                    oop=new ObjectOutputStream(output);
                    oop.writeObject(new Umbrella(code, color,LocalDate.now().toString(), umList.get(i).getReturnDate(),user));
                }else{
                    oop=new ObjectOutputStream(output);
                    oop.writeObject(umList.get(i));
                }
            }
        }catch(Exception e){

        }
        txtCode.setText(code);
        txtColor.setText(color);
        //JOptionPane.showMessageDialog(this, "Umbrella Deleted!");
        readObjFromFile();
        System.out.println();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String date = LocalDate.now().toString();
        txtDate.setText(date);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String code = txtCode.getText();
        String color = txtColor.getText();
        ArrayList<Umbrella> umList = new ArrayList<>();
        ArrayList<Customer> userList = new ArrayList<>();
        Customer user = new Customer("School","Ok111","owner");
        readObjFromFile(loginFile,userList);
        user = userList.get(userList.size()-1);
        readObjFromFile(umList);
        boolean find = false;
        for(int i = 0;i<umList.size();i++){
            if(umList.get(i).getCode().equals(code) && umList.get(i).getColor().equals(color)){
                //BookList.remove(i);
                find = true;
                DefaultTableModel a = (DefaultTableModel)jTable1.getModel();
                int selectIndex = jTable1.getSelectedRow();//Returns the index of the first selected row, -1 if no row is selected.
                //就是得到时第几行
                //每一行的数据从第一列开始的数据编号是0，1，2，3，4....就像数组，所以这里的0得到的是id号
                a.setValueAt(code, selectIndex, 0);
                a.setValueAt(color, selectIndex, 1);
                a.setValueAt(LocalDate.now().toString(), selectIndex, 2);
                a.setValueAt("",selectIndex , 3);

            }
        }
        if(find){
            JOptionPane.showMessageDialog(this, "Umbrella Extended!");
        }else{
            JOptionPane.showMessageDialog(this, "Umbrella Not Found!");
        }

        try{
            FileOutputStream output=new FileOutputStream("Umbrella.txt");
            ObjectOutputStream oop=null;
            for(int i = 0;i<umList.size();i++){
                if(umList.get(i).getCode().equals(code) && umList.get(i).getColor().equals(color)){
                    oop=new ObjectOutputStream(output);
                    oop.writeObject(new Umbrella(code, color,LocalDate.now().toString(), "1990-10-01",user));
                }else{
                    oop=new ObjectOutputStream(output);
                    oop.writeObject(umList.get(i));
                }
            }
        }catch(Exception e){

        }
        txtCode.setText(code);
        txtColor.setText(color);
        //JOptionPane.showMessageDialog(this, "Umbrella Deleted!");
        readObjFromFile();
        System.out.println();

    }//GEN-LAST:event_jButton5ActionPerformed
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
    public static void readObjFromFile(ArrayList<Umbrella> a){  
        try {  
            
            ObjectInputStream ois=null;
            FileInputStream fis=new FileInputStream(fileName);
            while(fis.available()>0){
                ois=new ObjectInputStream(fis);   
                a.add((Umbrella)ois.readObject());
            }
           
            ois.close();
            
        } catch (Exception e) {    
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
            java.util.logging.Logger.getLogger(CusUmbrellaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CusUmbrellaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CusUmbrellaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CusUmbrellaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CusUmbrellaInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}