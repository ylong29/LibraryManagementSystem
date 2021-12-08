



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import Items.Book;
import Items.Computer;
import Items.Umbrella;
import static System.ComputerInterface.appendObjToFile;
import static System.ComputerInterface.readObjFromFile;
import static System.Overdue.readObjFromFile;
import static System.UmbrellaInterface.readObjFromFile;
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
public class CusBookInterface extends javax.swing.JFrame {
    private static final String fileName = "Book.txt";
    private static final String loginFile = "LoginUser.txt";
    //private static final String fileNameBook = "BookList.txt";
    /**
     * Creates new form CusBookInterface
     */
    public CusBookInterface() {
        initComponents();
        Item_Load();
    }
    public void Item_Load(){ //这个是加载数据库的方法
        int c;
        
            ArrayList<Book> bookList = new ArrayList<>();
            readObjFromFile(bookList);
            DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);//如果插入行数大于这个值，那么就会在表中插入新行。如果插入行数小于这个值，那么原来表中大于等于这些行的都会被删掉。
            //Sets the number of columns in the model. If the new size is greater than the current size, 
            //new columns are added to the end of the model with null cell values. 
            //If the new size is less than the current size, all columns at index columnCount and greater are discarded.
            for(Book book: bookList){
                Vector v2 = new Vector();
                v2.add(book.getBookName());
                v2.add(book.getAuthor());
                v2.add(book.getBorrowDate());
                v2.add(book.getReturnDate());
                d.addRow(v2);  //Vector Rowdata
            }
    }
           
//             while(rs.next()){
//                System.out.println(rs.getString("id")+" "+rs.getString("catname")+" "+rs.getString("status"));
//            }
      
        
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
        txtName = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
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
        jLabel1.setText("Welcome To The Book System");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        jTable1.setForeground(new java.awt.Color(153, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Author", "Borrow Time", "Return Time"
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
        jLabel2.setText("Book Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Author");

        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAuthor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorActionPerformed(evt);
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
        jLabel4.setText("Please Firstly Select A Book From The Table");

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
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
        this.setVisible(true);
    }//GEN-LAST:event_txtNameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cusItemInterface a = new cusItemInterface();
        this.hide();
        a.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String author = txtAuthor.getText();
        ArrayList<Book> bookList = new ArrayList<>();
        readObjFromFile(bookList);
        boolean find = false;
        for(int i = 0;i<bookList.size();i++){
            if(bookList.get(i).getBookName().equals(name) && bookList.get(i).getAuthor().equals(author)){
                //bookList.set(i, new Book(author,name));
                find = true;
                DefaultTableModel a = (DefaultTableModel)jTable1.getModel();
                int selectIndex = jTable1.getSelectedRow();//Returns the index of the first selected row, -1 if no row is selected.
        //就是得到时第几行
          //每一行的数据从第一列开始的数据编号是0，1，2，3，4....就像数组，所以这里的0得到的是id号
          a.setValueAt(name, selectIndex, 0);      
          a.setValueAt(author, selectIndex, 1);
          a.setValueAt(bookList.get(i).getBorrowDate(), selectIndex, 2);
          a.setValueAt(LocalDate.now().toString(),selectIndex , 3);
            }
        }
        if(find){
            JOptionPane.showMessageDialog(this, "Book Returned!");
        }else{
            JOptionPane.showMessageDialog(this, "Book Not Found!");
        }
        try{
            FileOutputStream output=new FileOutputStream("Book.txt");
            ObjectOutputStream oop=null;
            for(int i = 0;i<bookList.size();i++){
                if(bookList.get(i).getBookName().equals(name) && bookList.get(i).getAuthor().equals(author)){
                    oop=new ObjectOutputStream(output);
                    oop.writeObject(new Book(author, name,bookList.get(i).getBorrowDate(), LocalDate.now().toString(),new Customer("School","Ok111","owner")));
                }else{
                oop=new ObjectOutputStream(output);
                oop.writeObject(bookList.get(i));
                }
            }
         }catch(Exception e){
             
         }  
        txtName.setText(name);
        txtAuthor.setText(author);
        //JOptionPane.showMessageDialog(this, "Umbrella Deleted!");
        for(Book book: bookList){
                System.out.println(book);
            }
        System.out.println();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String author = txtAuthor.getText();
        ArrayList<Book> BookList = new ArrayList<>();
        ArrayList<Customer> userList = new ArrayList<>();
        Customer user = new Customer("School","Ok111","owner");
        readObjFromFile(loginFile,userList);
        user = userList.get(userList.size()-1);
        readObjFromFile(BookList);
        boolean find = false;
        for(int i = 0;i<BookList.size();i++){
            if(BookList.get(i).getBookName().equals(name) && BookList.get(i).getAuthor().equals(author)){
                //BookList.remove(i);
                find = true;
                DefaultTableModel a = (DefaultTableModel)jTable1.getModel();
                int selectIndex = jTable1.getSelectedRow();//Returns the index of the first selected row, -1 if no row is selected.
        //就是得到时第几行
          //每一行的数据从第一列开始的数据编号是0，1，2，3，4....就像数组，所以这里的0得到的是id号
          a.setValueAt(name, selectIndex, 0);      
          a.setValueAt(author, selectIndex, 1);
          a.setValueAt(LocalDate.now().toString(), selectIndex, 2);
          a.setValueAt("",selectIndex , 3);
          
            }
        }
        if(find){
            JOptionPane.showMessageDialog(this, "Book Borrowed!");
        }else{
            JOptionPane.showMessageDialog(this, "Book Not Found!");
        }
        
        try{
            FileOutputStream output=new FileOutputStream("Book.txt");
            ObjectOutputStream oop=null;
            for(int i = 0;i<BookList.size();i++){
                if(BookList.get(i).getBookName().equals(name) && BookList.get(i).getAuthor().equals(author)){
                    oop=new ObjectOutputStream(output);
                    oop.writeObject(new Book(author, name,LocalDate.now().toString(), BookList.get(i).getReturnDate(),user));
                }else{
                oop=new ObjectOutputStream(output);
                oop.writeObject(BookList.get(i));
                }
            }
         }catch(Exception e){
             
         }  
        txtName.setText(name);
        txtAuthor.setText(author);
        //JOptionPane.showMessageDialog(this, "Umbrella Deleted!");
        readObjFromFile();
        System.out.println();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel a = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();//Returns the index of the first selected row, -1 if no row is selected.
        //就是得到时第几行
          //每一行的数据从第一列开始的数据编号是0，1，2，3，4....就像数组，所以这里的0得到的是id号
        txtName.setText(a.getValueAt(selectIndex, 0).toString());//这个得到的是category name
        txtAuthor.setText(a.getValueAt(selectIndex, 1).toString());//这个是设置好选项中的内容
        
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String date = LocalDate.now().toString();
        txtDate.setText(date);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthorActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String author = txtAuthor.getText();
        ArrayList<Book> BookList = new ArrayList<>();
        ArrayList<Customer> userList = new ArrayList<>();
        Customer user = new Customer("School","Ok111","owner");
        readObjFromFile(loginFile,userList);
        user = userList.get(userList.size()-1);
        readObjFromFile(BookList);
        boolean find = false;
        for(int i = 0;i<BookList.size();i++){
            if(BookList.get(i).getBookName().equals(name) && BookList.get(i).getAuthor().equals(author)){
                //BookList.remove(i);
                find = true;
                DefaultTableModel a = (DefaultTableModel)jTable1.getModel();
                int selectIndex = jTable1.getSelectedRow();//Returns the index of the first selected row, -1 if no row is selected.
        //就是得到时第几行
          //每一行的数据从第一列开始的数据编号是0，1，2，3，4....就像数组，所以这里的0得到的是id号
          a.setValueAt(name, selectIndex, 0);      
          a.setValueAt(author, selectIndex, 1);
          a.setValueAt(LocalDate.now().toString(), selectIndex, 2);
          a.setValueAt("",selectIndex , 3);
          
            }
        }
        if(find){
            JOptionPane.showMessageDialog(this, "Book Extended!");
        }else{
            JOptionPane.showMessageDialog(this, "Book Not Found!");
        }
        
        try{
            FileOutputStream output=new FileOutputStream("Book.txt");
            ObjectOutputStream oop=null;
            for(int i = 0;i<BookList.size();i++){
                if(BookList.get(i).getBookName().equals(name) && BookList.get(i).getAuthor().equals(author)){
                    oop=new ObjectOutputStream(output);
                    oop.writeObject(new Book(author, name,LocalDate.now().toString(), "1990-10-01",user));
                }else{
                oop=new ObjectOutputStream(output);
                oop.writeObject(BookList.get(i));
                }
            }
         }catch(Exception e){
             
         }  
        txtName.setText(name);
        txtAuthor.setText(author);
        //JOptionPane.showMessageDialog(this, "Umbrella Deleted!");
        readObjFromFile();
        System.out.println();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void readObjFromFile(ArrayList<Book> a){  
        try {  
            
            ObjectInputStream ois=null;
            FileInputStream fis=new FileInputStream(fileName);
            while(fis.available()>0){
                ois=new ObjectInputStream(fis);   
                a.add((Book)ois.readObject());
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
            java.util.logging.Logger.getLogger(CusBookInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CusBookInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CusBookInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CusBookInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CusBookInterface().setVisible(true);
                
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
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
