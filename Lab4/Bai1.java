/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab4;

import Buoi7.*;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Tinh
 */
public class Bai1 extends javax.swing.JFrame {

    /**
     * Creates new form MenuDemo
     */
    public Bai1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mnuPopup = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        mnToolBar_new = new javax.swing.JButton();
        mnToolBar_User = new javax.swing.JButton();
        mnToolBar_Exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        edPage = new javax.swing.JEditorPane();
        txtComment = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnNew = new javax.swing.JMenuItem();
        mnOpen = new javax.swing.JMenuItem();
        mnSave = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnRed = new javax.swing.JRadioButtonMenuItem();
        mnGreen = new javax.swing.JRadioButtonMenuItem();
        mnBlue = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnTextcolor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnAbout = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnExit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");
        mnuPopup.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        mnuPopup.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        mnuPopup.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jToolBar1.setRollover(true);

        mnToolBar_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Accept.png"))); // NOI18N
        mnToolBar_new.setFocusable(false);
        mnToolBar_new.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnToolBar_new.setMaximumSize(new java.awt.Dimension(50, 50));
        mnToolBar_new.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mnToolBar_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewActionPerformed(evt);
            }
        });
        jToolBar1.add(mnToolBar_new);

        mnToolBar_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User.png"))); // NOI18N
        mnToolBar_User.setFocusable(false);
        mnToolBar_User.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnToolBar_User.setMaximumSize(new java.awt.Dimension(50, 50));
        mnToolBar_User.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mnToolBar_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAboutActionPerformed(evt);
            }
        });
        jToolBar1.add(mnToolBar_User);

        mnToolBar_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Delete.png"))); // NOI18N
        mnToolBar_Exit.setFocusable(false);
        mnToolBar_Exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnToolBar_Exit.setMaximumSize(new java.awt.Dimension(50, 50));
        mnToolBar_Exit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mnToolBar_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(mnToolBar_Exit);

        edPage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                edPageMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(edPage);

        txtComment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtComment.setText("Phạm Thế Tình");

        jMenu1.setText("File");

        mnNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Add.png"))); // NOI18N
        mnNew.setMnemonic('N');
        mnNew.setText("NEW");
        mnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewActionPerformed(evt);
            }
        });
        jMenu1.add(mnNew);

        mnOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Documents.png"))); // NOI18N
        mnOpen.setMnemonic('O');
        mnOpen.setText("OPEN");
        mnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpenActionPerformed(evt);
            }
        });
        jMenu1.add(mnOpen);

        mnSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Save.png"))); // NOI18N
        mnSave.setMnemonic('S');
        mnSave.setText("SAVE");
        mnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnSave);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Color");

        buttonGroup1.add(mnRed);
        mnRed.setText("Red");
        mnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRedActionPerformed(evt);
            }
        });
        jMenu2.add(mnRed);

        buttonGroup1.add(mnGreen);
        mnGreen.setText("Green");
        mnGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGreenActionPerformed(evt);
            }
        });
        jMenu2.add(mnGreen);

        buttonGroup1.add(mnBlue);
        mnBlue.setText("Blue");
        mnBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBlueActionPerformed(evt);
            }
        });
        jMenu2.add(mnBlue);
        jMenu2.add(jSeparator1);

        mnTextcolor.setText("Text Color");
        mnTextcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTextcolorActionPerformed(evt);
            }
        });
        jMenu2.add(mnTextcolor);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("System");

        mnAbout.setText("About as");
        mnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAboutActionPerformed(evt);
            }
        });
        jMenu3.add(mnAbout);
        jMenu3.add(jSeparator2);

        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu3.add(mnExit);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtComment, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveActionPerformed
       JFileChooser fChooser = new JFileChooser();
       int result = fChooser.showSaveDialog(null);
       if(result == JFileChooser.APPROVE_OPTION){
           File fname = fChooser.getSelectedFile();
           try{
               PrintWriter pw = new PrintWriter(fname);
               pw.print(edPage.getText());
               pw.close();
           }catch(Exception e){
               e.printStackTrace();
           }
       }
    }//GEN-LAST:event_mnSaveActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewActionPerformed
        edPage.setText("");
    }//GEN-LAST:event_mnNewActionPerformed

    private void mnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRedActionPerformed
        txtComment.setBackground(Color.red);
    }//GEN-LAST:event_mnRedActionPerformed

    private void mnGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGreenActionPerformed
        txtComment.setBackground(Color.GREEN);
    }//GEN-LAST:event_mnGreenActionPerformed

    private void mnBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBlueActionPerformed
        txtComment.setBackground(Color.blue);
    }//GEN-LAST:event_mnBlueActionPerformed

    private void mnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAboutActionPerformed
        ShowAboutUs();
    }//GEN-LAST:event_mnAboutActionPerformed

    private void mnTextcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTextcolorActionPerformed
        Color c = JColorChooser.showDialog(null, "Chọn màu chủ", Color.white);
        txtComment.setForeground(c);
    }//GEN-LAST:event_mnTextcolorActionPerformed

    private void mnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpenActionPerformed
        JFileChooser fchooser = new JFileChooser();
        int result = fchooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            try{
                edPage.setPage("file:///" + fchooser.getSelectedFile().getPath());
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_mnOpenActionPerformed

    private void edPageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edPageMouseReleased
        
    }//GEN-LAST:event_edPageMouseReleased

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        mnuPopup.show(this, evt.getX(), evt.getY());
    }//GEN-LAST:event_formMouseReleased

    private void ShowAboutUs(){
        String str = "Program Demo Menu";
        str += "\nAuthor: Tình";
        str += "\nLast Update: 17 July, 2023";
        JOptionPane.showMessageDialog(null, str, "Giới thiệu", 
                JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(Bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JEditorPane edPage;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnAbout;
    private javax.swing.JRadioButtonMenuItem mnBlue;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JRadioButtonMenuItem mnGreen;
    private javax.swing.JMenuItem mnNew;
    private javax.swing.JMenuItem mnOpen;
    private javax.swing.JRadioButtonMenuItem mnRed;
    private javax.swing.JMenuItem mnSave;
    private javax.swing.JMenuItem mnTextcolor;
    private javax.swing.JButton mnToolBar_Exit;
    private javax.swing.JButton mnToolBar_User;
    private javax.swing.JButton mnToolBar_new;
    private javax.swing.JPopupMenu mnuPopup;
    private javax.swing.JTextField txtComment;
    // End of variables declaration//GEN-END:variables
}
