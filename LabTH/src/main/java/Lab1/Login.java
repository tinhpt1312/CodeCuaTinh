/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Tinh
 */
public class Login {

    private JFrame mainFrame;
    private JPanel firstPanel;
    private JPanel lastPanel;
    final JTextField txtuser = new JTextField(10);
    final JPasswordField txtpass = new JPasswordField(10);
    final JPasswordField txtconfirm = new JPasswordField(10);
    
    public boolean checknull(){
        if(txtuser.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Chưa nhập user name");
            txtuser.requestFocus();
            return false;
        }else if(txtpass.getPassword().equals("")){
            JOptionPane.showMessageDialog(null, "Chưa nhập pass");
            txtpass.requestFocus();
            return false;
        }else if(txtconfirm.getPassword().equals("")){
            JOptionPane.showMessageDialog(null, "xác nhận lại mk");
            txtconfirm.requestFocus();
            return false;
        }else return true;
    }

    public Login() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Login jlogin = new Login();
        jlogin.showLoginDemo();
    }

    public void prepareGUI() {
        mainFrame = new JFrame("Login");
        mainFrame.setSize(300, 300);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new GridLayout(2, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(3, 2));
        lastPanel = new JPanel();
        lastPanel.setLayout(new FlowLayout());
        mainFrame.add(firstPanel);
        mainFrame.add(lastPanel);
        mainFrame.setVisible(true);

    }

    public void showLoginDemo() {
        JLabel login = new JLabel("User Name", JLabel.LEFT);
        JLabel pass = new JLabel("Password", JLabel.LEFT);
        JLabel confirm = new JLabel("Confirm", JLabel.LEFT);
        JButton btnlogin = new JButton("Sign up");
        JButton btncancel = new JButton("Cancel");
        btnlogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checknull()) {
                    if(txtpass.getText().equals(txtconfirm.getText())){
                        JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                    }else{
                        JOptionPane.showMessageDialog(null, "Mật khẩu không trùng khớp");
                        txtconfirm.requestFocus();
                    }
                }
            }
        });
        btncancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        firstPanel.add(login);
        firstPanel.add(txtuser);
        firstPanel.add(pass);
        firstPanel.add(txtpass);
        firstPanel.add(confirm);
        firstPanel.add(txtconfirm);
        lastPanel.add(btnlogin);
        lastPanel.add(btncancel);
        mainFrame.setVisible(true);
    }
}
