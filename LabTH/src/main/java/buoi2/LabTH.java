/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package buoi2;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Tinh
 */
public class LabTH extends JFrame {

    public LabTH() throws HeadlessException {
        initComponents();
    }
    
    private void initComponents(){
        setTitle("demo Swing code");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        JButton btn1 = new JButton("Btn 1");
        JTextField txtso1 = new JTextField(10);
        //txtso1.setSize(40, 10);
        getContentPane().add(btn1);
        getContentPane().add(txtso1);
    }
        
    public static void main(String[] args) {
        LabTH jframe = new LabTH();
        jframe.setVisible(true);
    }
    
}
