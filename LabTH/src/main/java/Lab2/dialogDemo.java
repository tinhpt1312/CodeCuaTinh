/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tinh
 */
public class dialogDemo {

    private JFrame mainFrame;

    public dialogDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        dialogDemo AWTLab2_3 = new dialogDemo();
        AWTLab2_3.showDialog();
    }

    public void prepareGUI() {
        mainFrame = new JFrame("Thông báo");
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setSize(300, 200);
        mainFrame.setLayout(new GridLayout(2, 2));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        mainFrame.setVisible(true);
    }

    public void showDialog() {
        JButton btnMD = new JButton("Message Dialog");
        JButton btnID = new JButton("Input Dialog");
        JButton btnCD = new JButton("Confirm Dialog");
        JButton btnOD = new JButton("Options Dialog");
        
        btnMD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Nó là show message");
            }
        });
        btnID.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String choice = JOptionPane.showInputDialog("Your name is: ");
                JOptionPane.showMessageDialog(null, "Your name is: " + choice);
            }
        });
        btnCD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int ret = JOptionPane.showConfirmDialog(null, "Are you sure?",
                        "Confirm", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (ret == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Bạn đã chọn yes");
                } else {
                    JOptionPane.showMessageDialog(null, "Bạn đã chọn no");
                }
            }
        });
        btnOD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int messageType = JOptionPane.QUESTION_MESSAGE;
                String[] options = {"Java", "PHP", "C#", "Pascal"};
                int code = JOptionPane.showOptionDialog(null, "What languege do you perfect",
                        "Options Dialog Box", 0, messageType, null, options, "PHP");
                JOptionPane.showMessageDialog(null, "Answer: " + (code + 1));
            }
        });
        mainFrame.add(btnMD);
        mainFrame.add(btnID);
        mainFrame.add(btnCD);
        mainFrame.add(btnOD);
        mainFrame.setVisible(true);
    }

}
