/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ASM;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author user
 */
public class MainPage2 extends javax.swing.JFrame {

    /**
     * Creates new form MainPage2
     */
    public MainPage2() {
        initComponents();
         DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
        tblModel.setRowCount(0);
        ArrayList<Students> list = new ArrayList<Students>();
        try {
            FileInputStream fis = new FileInputStream("StudentList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList<Students>) ois.readObject();
            ois.close();

            Object rowData[] = new Object[4];
            for(int i = 0; i< list.size(); i ++){
                rowData[0]= list.get(i).sClass;
                rowData[1]= list.get(i).Name;
                rowData[2]= list.get(i).Course;
                rowData[3]= list.get(i).Score;

                tblModel.addRow(rowData);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
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

        lbName = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lbCourse = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        lbScore = new javax.swing.JLabel();
        txtClass = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtCourse = new javax.swing.JTextField();
        txtScore = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Search_box = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnSave = new javax.swing.JMenuItem();
        btnOpen = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("Name");

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbCourse.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCourse.setText("Course");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lbID.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbID.setText("Class");

        lbScore.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbScore.setText("Score");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Class", "Name", "Course", "Score"
            }
        ));
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        table.setUpdateSelectionOnSort(false);
        table.setVerifyInputWhenFocusTarget(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        Search_box.setText("Search...");
        Search_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_boxActionPerformed(evt);
            }
        });
        Search_box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Search_boxKeyPressed(evt);
            }
        });

        jMenu1.setText("File");

        btnSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jMenu1.add(btnSave);

        btnOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        jMenu1.add(btnOpen);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbScore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Search_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbScore)
                            .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        File file = new File("StudentList.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ArrayList<Students> list = new ArrayList<Students>();
        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
        for(int i=0; i<tblModel.getRowCount();i++){
            String sClass =(String) tblModel.getValueAt(i, 0);
            String Name = (String) tblModel.getValueAt(i, 1);
            String Course = (String) tblModel.getValueAt(i, 2);
            int Score = (int) tblModel.getValueAt(i, 3);
            Students student = new Students(sClass, Name, Course, Score);
            list.add(student);
        }

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(list);
            oos.close();
            JOptionPane.showMessageDialog(this, "Save success!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
        tblModel.setRowCount(0);
        ArrayList<Students> list = new ArrayList<Students>();
        try {
            FileInputStream fis = new FileInputStream("StudentList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList<Students>) ois.readObject();
            ois.close();

            Object rowData[] = new Object[4];
            for(int i = 0; i< list.size(); i ++){
                rowData[0]= list.get(i).sClass;
                rowData[1]= list.get(i).Name;
                rowData[2]= list.get(i).Course;
                rowData[3]= list.get(i).Score;

                tblModel.addRow(rowData);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();

        if(table.getSelectedRowCount()==1){
            tblModel.removeRow(table.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Record Deleted.");
        }
        else if(table.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Table is empty!");
        }
        else{
            JOptionPane.showMessageDialog(this, "PLease choose a record to delete.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
        
        String sClass;
        String Name;
        String Course;
        double Score;    
                
            if(table.getSelectedRowCount() == 1){
            //Update Class 
            try{
                sClass = txtClass.getText().trim();
                
                if(!sClass.isEmpty()){
                    tblModel.setValueAt(sClass, table.getSelectedRow(), 0);
                    JOptionPane.showMessageDialog(this, "Table updated!");
                }else{
                    throw new Exception();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Empty input Class!");
                return;
            } 
            
            //Update Name
            try{
                Name = txtName.getText().trim();
                
                if(!Name.isEmpty()){
                    tblModel.setValueAt(Name, table.getSelectedRow(), 1);
                    
                }else{
                    throw new Exception();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Empty input Name!");
                return;
            }
            //Update Course
            try{
                Course = txtCourse.getText().trim();                
                if(!Course.isEmpty()){
                    tblModel.setValueAt(Course, table.getSelectedRow(), 2);

                }else{
                    throw new Exception();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Empty input Course!");
                return;
            }
                
            try{
                Score = Double.parseDouble(txtScore.getText().trim());              
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Only accept Number type!");
                return;
            }    
                Object rcd[] = {sClass, Name, Course, Score};
                tblModel.addRow(rcd);
                tblModel.removeRow(table.getSelectedRow());
            }
            else if(table.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(this, "Null data table!");
            
            }
            else{
                JOptionPane.showMessageDialog(this, "Please choose a record to update!");
               
            }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();

        // add records
        try{
            String sClass = "";
            String Name = "";
            String Course = "";
            double Score = 0;

            try{
                sClass = txtClass.getText();

                if(sClass.isEmpty()){
                    throw new Exception();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Empty input Class!");
                return;
            }

            //Update Name
            try{
                Name = txtName.getText();

                if(Name.isEmpty()){
                    throw new Exception();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Empty input Name!");
                return;
            }
            //Update Course
            try{
                Course = txtCourse.getText();
                if(Course.isEmpty()){
                    throw new Exception();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Empty input Course!");
                return;
            }

            try{
                Score = Double.parseDouble(txtScore.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Only accept Number type!");
                return;
            }

            Object rcd[] = {sClass, Name, Course, Score};
            tblModel.addRow(rcd);
            JOptionPane.showMessageDialog(this, "Record added successfully!");

            //Empty the field to input new data
            txtClass.setText("");
            txtName.setText("");
            txtCourse.setText("");
            txtScore.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Empty input fields!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
        String tblClass = tblModel.getValueAt(table.getSelectedRow(), 0).toString();
        String tblName = tblModel.getValueAt(table.getSelectedRow(), 1).toString();
        String tblCourse = tblModel.getValueAt(table.getSelectedRow(), 2).toString();
        String tblScore = tblModel.getValueAt(table.getSelectedRow(), 3).toString();

        txtClass.setText(tblClass);
        txtName.setText(tblName);
        txtCourse.setText(tblCourse);
        txtScore.setText(tblScore);
    }//GEN-LAST:event_tableMouseClicked

    private void Search_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_boxActionPerformed

    private void Search_boxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_boxKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(Search_box.getText().trim()));
    }//GEN-LAST:event_Search_boxKeyPressed

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
            java.util.logging.Logger.getLogger(MainPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search_box;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JMenuItem btnOpen;
    private javax.swing.JMenuItem btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCourse;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbScore;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtScore;
    // End of variables declaration//GEN-END:variables
}
