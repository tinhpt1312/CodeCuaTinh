/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Tinh
 */
public class FormPanelCT extends JFrame{

    public FormPanelCT(String title) throws HeadlessException {
        super(title);
        initComponents();
    }
    
    private void initComponents(){
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pn1 = new JPanel(new GridLayout(3, 3));
        pn1.setBorder(new TitledBorder("Grid Layout"));
        
        JButton btn1[] = new JButton[9];
        
        for(int i = 0; i < 9; i++){
            btn1[i] = new JButton("Button " + (i + 1));
            pn1.add(btn1[i]);
        }
        
        getContentPane().add(pn1);
    }
    
    public static void main(String[] args) {
        FormPanelCT jpanel = new FormPanelCT("Demo JPanel Code");
        jpanel.setVisible(true);
    }
    
}
