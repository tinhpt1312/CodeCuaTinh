/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.TRAILING;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Tinh
 */
public class bai1 {
    private JFrame mainFrame;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    
    public bai1(){
        prepareGUI();
    }
    
    public void prepareGUI(){
        mainFrame = new JFrame("Demo Layout");
        mainFrame.setSize(600, 500);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        mainFrame.setLayout(new GridLayout(4,1));
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel1.setLayout(new FlowLayout(TRAILING));
        panel2.setLayout(new BorderLayout());
        panel3.setLayout(new FlowLayout());
        panel4.setLayout(new GridLayout(2,5));
        mainFrame.add(panel1);
        mainFrame.add(panel2);
        mainFrame.add(panel3);
        mainFrame.add(panel4);
        mainFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        bai1 awtbai1 = new bai1();
        awtbai1.showBai1();
    }
    
    public void showBai1(){
        JTextField txtComment = new JTextField("Chào các bạn sinh viên FPoly", 40);
        JButton btnRed = new JButton("Red");
        JButton btnGreen = new JButton("Green");
        JButton btnYellow = new JButton("Yellow");
        JButton btnNorth = new JButton("North");
        JButton btnCenter = new JButton("Center");
        JButton btnSouth = new JButton("South");
        JButton btnEast = new JButton("East");
        JButton btnWest = new JButton("West");
        JButton btn0 = new JButton();
        JButton btn1 = new JButton();
        JButton btn2 = new JButton();
        JButton btn3 = new JButton();
        JButton btn4 = new JButton();
        JButton btn5 = new JButton();
        JButton btn6 = new JButton();
        JButton btn7 = new JButton();
        JButton btn8 = new JButton();
        JButton btn9 = new JButton();
        btnRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               panel1.setBackground(Color.red);
            }
        });
        btnGreen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               panel1.setBackground(Color.green);
            }
        });
        btnYellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               panel1.setBackground(Color.yellow);
            }
        });
        btnNorth.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               txtComment.setText("Bạn đã chọn NorthSide");
            }
        });
        btnSouth.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               txtComment.setText("Bạn đã chọn SouthSide");
            }
        });
        btnEast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               txtComment.setText("Bạn đã chọn EastSide");
            }
        });
        btnWest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               txtComment.setText("Bạn đã chọn WestSide");
            }
        });
        btnCenter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               txtComment.setText("Bạn đã chọn Center");
            }
        });
        panel1.add(btnRed);
        panel1.add(btnGreen);
        panel1.add(btnYellow);
        panel2.add(btnNorth, BorderLayout.NORTH);
        panel2.add(btnCenter, BorderLayout.CENTER);
        panel2.add(btnSouth, BorderLayout.SOUTH);
        panel2.add(btnEast, BorderLayout.EAST);
        panel2.add(btnWest, BorderLayout.WEST);
        panel3.add(txtComment);
        panel4.add(btn0);
        panel4.add(btn1);
        panel4.add(btn2);
        panel4.add(btn3);
        panel4.add(btn4);
        panel4.add(btn5);
        panel4.add(btn6);
        panel4.add(btn7);
        panel4.add(btn8);
        panel4.add(btn9);
        mainFrame.setVisible(true);
    }
}
