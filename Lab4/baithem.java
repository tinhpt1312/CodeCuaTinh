/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author Tinh
 */
public class baithem extends javax.swing.JFrame {

    String filename = "D:\\tinhpt26461\\Java3\\JavaApplication2\\src\\Lab4\\employee2.txt";
    DefaultMutableTreeNode root = null;
    DefaultMutableTreeNode curDepNode = null;
    DefaultMutableTreeNode curEmpNode = null;
    boolean addNewDep = false;
    boolean addNewEmp = false;

    public baithem() {
        initComponents();
        this.setLocationRelativeTo(null);
        root = (DefaultMutableTreeNode) (this.tree.getModel().getRoot());
        loadData();
        TreePath path = new TreePath(root);
        tree.expandPath(path);
    }

    private void loadData() {
        String S = "";
        StringTokenizer stk;
        try {
            FileReader f = new FileReader(filename);
            BufferedReader bf = new BufferedReader(f);
            while ((S = bf.readLine()) != null) {
                S = S.trim();
                boolean isDept = (S.charAt(S.length() - 1) == ':');
                stk = new StringTokenizer(S, "-:,");
                String code = stk.nextToken().trim();
                String name = stk.nextToken().trim();
                if (isDept) {
                    curDepNode = new DefaultMutableTreeNode(new Department(code, name));
                    root.add(curDepNode);
                } else {
                    int salary = Integer.parseInt(stk.nextToken().trim());
                    curEmpNode = new DefaultMutableTreeNode(new Employee(code, name, salary));
                    curDepNode.add(curEmpNode);
                }
            }
            bf.close();
            f.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void viewDeptAndEmp() {
        Department curDep = null;
        Employee curEmp = null;
        if (curDepNode != null) {
            curDep = (Department) (curDepNode.getUserObject());
        }
        if (curEmpNode != null) {
            curEmp = (Employee) (curEmpNode.getUserObject());
        }
        this.txtDepcode.setText(curDep != null ? curDep.getDepCode() : "");
        this.txtDepname.setText(curDep != null ? curDep.getDepName() : "");
        this.txtEmpcode.setText(curEmp != null ? curEmp.getEmpCode() : "");
        this.txtEmpname.setText(curEmp != null ? curEmp.getEmpName() : "");
        this.txtDepcode.setEditable(false);
        this.txtEmpcode.setEditable(false);

    }

    private boolean validDepDetails() {
        if (txtDepcode.getText().equals("") || txtDepname.getText().equals("")) {
            return false;
        }
        return true;
    }

    private boolean validEmpDetails() {
        if (txtEmpcode.getText().equals("") || txtEmpname.getText().equals("") || txtSalary.getText().equals("")) {
            return false;
        }

        return true;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDepcode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDepname = new javax.swing.JTextField();
        btnDepnew = new javax.swing.JButton();
        btnDepremove = new javax.swing.JButton();
        btnDepsave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtEmpcode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmpname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        btnEmpremove = new javax.swing.JButton();
        btnEmpsave = new javax.swing.JButton();
        btnEmpnew = new javax.swing.JButton();
        btnSavefile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Department");
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tree);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Departmemt Detailt"));

        jLabel1.setText("Dept. code:");

        jLabel2.setText("Dept. name:");

        btnDepnew.setText("New");
        btnDepnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepnewActionPerformed(evt);
            }
        });

        btnDepremove.setText("Remove");
        btnDepremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepremoveActionPerformed(evt);
            }
        });

        btnDepsave.setText("Save");
        btnDepsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDepcode, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtDepname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnDepnew, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnDepremove)
                .addGap(6, 6, 6)
                .addComponent(btnDepsave))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(txtDepcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtDepname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDepnew)
                    .addComponent(btnDepremove)
                    .addComponent(btnDepsave)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Deatilt"));

        jLabel4.setText("Emp. name:");

        jLabel3.setText("Emp. code:");

        jLabel5.setText("Salary:");

        btnEmpremove.setText("Remove");
        btnEmpremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpremoveActionPerformed(evt);
            }
        });

        btnEmpsave.setText("Save");
        btnEmpsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpsaveActionPerformed(evt);
            }
        });

        btnEmpnew.setText("New");
        btnEmpnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpnewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmpcode, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmpname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnEmpnew, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnEmpremove)
                .addGap(6, 6, 6)
                .addComponent(btnEmpsave))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(txtEmpcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtEmpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmpnew)
                    .addComponent(btnEmpremove)
                    .addComponent(btnEmpsave)))
        );

        btnSavefile.setText("Save to file");
        btnSavefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavefileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnSavefile, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSavefile)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void treeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeMouseClicked
        tree.cancelEditing();
        TreePath path = tree.getSelectionPath();
        if (path == null) {
            return;
        }
        DefaultMutableTreeNode selectedNode = null;
        selectedNode = (DefaultMutableTreeNode) (path.getLastPathComponent());
        Object selectedObj = selectedNode.getUserObject();
        if (selectedNode == root) {
            this.curDepNode = this.curEmpNode = null;
        } else {
            if (selectedObj instanceof Department) {
                this.curDepNode = selectedNode;
                this.curEmpNode = null;
            } else if (selectedObj instanceof Employee) {
                curEmpNode = selectedNode;
                curDepNode = (DefaultMutableTreeNode) (selectedNode.getParent());
            }
        }
        viewDeptAndEmp();
    }//GEN-LAST:event_treeMouseClicked

    private void btnDepnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepnewActionPerformed
        this.addNewDep = true;
        this.txtDepcode.setText("");
        this.txtDepname.setText("");
        this.txtEmpcode.setText("");
        this.txtEmpname.setText("");
        this.txtSalary.setText("");
        this.txtDepcode.requestFocus();
    }//GEN-LAST:event_btnDepnewActionPerformed

    private void btnDepremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepremoveActionPerformed
        if (this.curDepNode.getChildCount() > 0) {
            String msg = "Remove all employee before deleting a department.";
            JOptionPane.showMessageDialog(null, msg);
        } else {
            int response = JOptionPane.showConfirmDialog(null, "Delete this depaertment - OK?");
            if (response == JOptionPane.OK_OPTION) {
                root.remove(this.curDepNode);
                tree.updateUI();
            }
        }
    }//GEN-LAST:event_btnDepremoveActionPerformed

    private void btnDepsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepsaveActionPerformed
        String code = this.txtDepcode.getText().trim().toUpperCase();
        txtDepcode.setText(code);
        String name = this.txtDepname.getText().trim();
        txtDepname.setText(name);
        if (!validDepDetails()) {
            return;
        }
        if (addNewDep == true) {
            Department newDep = new Department(code, name);
            root.add(new DefaultMutableTreeNode(newDep));

        } else {
            ((Department) curDepNode.getUserObject()).setDepName(name);

        }
        this.tree.updateUI();
        this.addNewDep = false;
    }//GEN-LAST:event_btnDepsaveActionPerformed

    private void btnEmpnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpnewActionPerformed
        this.addNewEmp = true;
        txtEmpcode.setText("");
        txtEmpname.setText("");
        txtSalary.setText("");
        txtEmpcode.setEditable(false);
        txtEmpcode.requestFocus();
    }//GEN-LAST:event_btnEmpnewActionPerformed

    private void btnEmpremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpremoveActionPerformed
        if (this.curEmpNode != null) {
            int response = JOptionPane.showConfirmDialog(null, "Delete this Employee - OK?");
            if (response == JOptionPane.OK_OPTION) {
                curDepNode.remove(this.curEmpNode);
                tree.updateUI();
            }
        }
    }//GEN-LAST:event_btnEmpremoveActionPerformed

    private void btnEmpsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpsaveActionPerformed
        String code = this.txtEmpcode.getText().trim().toUpperCase();
        txtEmpcode.setText(code);
        String name = this.txtEmpname.getText().trim();
        txtEmpname.setText(name);
        String salaryStr = this.txtSalary.getText().trim();
        txtSalary.setText(salaryStr);
        int sal = Integer.parseInt(salaryStr);
        if (!validEmpDetails()) {
            return;
        }
        if (addNewEmp == true) {
            Employee newEmp = new Employee(code, name, sal);
            curDepNode.add(new DefaultMutableTreeNode(newEmp));

        } else {
            Employee emp = (Employee) (curEmpNode.getUserObject());
            emp.setEmpName(name);
            emp.setSalary(sal);
        }
        this.tree.updateUI();
        this.addNewEmp = false;

    }//GEN-LAST:event_btnEmpsaveActionPerformed

    private void btnSavefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavefileActionPerformed
        if (root.getChildCount() == 0) {
            return;
        }
        String S;
        try {
            FileWriter f = new FileWriter(filename);
            PrintWriter pf = new PrintWriter(f);
            Enumeration depts = root.children();
            while (depts.hasMoreElements()) {
                DefaultMutableTreeNode depNode = (DefaultMutableTreeNode) depts.nextElement();
                Department dept = (Department) (depNode.getUserObject());
                S = dept.getDepCode() + "-" + dept.getDepName() + ":";
                pf.println(S);
                Enumeration emps = depNode.children();
                while (emps.hasMoreElements()) {
                    DefaultMutableTreeNode empNode = (DefaultMutableTreeNode) emps.nextElement();
                    Employee emp = (Employee) (empNode.getUserObject());
                    S = emp.getEmpCode() + "," + emp.getEmpName() + "," + emp.getSalary();
                    pf.println(S);
                }
            }
            pf.close();
            f.close();
            JOptionPane.showMessageDialog(null, "Data are saved to the file " + filename);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSavefileActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new baithem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepnew;
    private javax.swing.JButton btnDepremove;
    private javax.swing.JButton btnDepsave;
    private javax.swing.JButton btnEmpnew;
    private javax.swing.JButton btnEmpremove;
    private javax.swing.JButton btnEmpsave;
    private javax.swing.JButton btnSavefile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree tree;
    private javax.swing.JTextField txtDepcode;
    private javax.swing.JTextField txtDepname;
    private javax.swing.JTextField txtEmpcode;
    private javax.swing.JTextField txtEmpname;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
