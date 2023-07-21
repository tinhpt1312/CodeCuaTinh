/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Tinh
 */
public class tinhtoan {

    private JFrame mainFrame;
    private JPanel controlPanel;
    private JPanel headerLabel;
    final JTextField txtso1 = new JTextField(10);
    final JTextField txtso2 = new JTextField(10);
    final JTextField txtkq = new JTextField(10);
    
    public boolean validate() {
                if (txtso1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Chưa nhập giá trị");
                    txtso1.requestFocus();
                    return false;
                } else if (txtso2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Chưa nhập giá trị");
                    txtso2.requestFocus();
                    return false;
                } else {
                    return true;
                }
            }

    public tinhtoan() {
        prepareGUI();
    }

    public static void main(String[] args) {
        tinhtoan AWTLab1 = new tinhtoan();
        AWTLab1.showLab1Demo();

    }

    public void prepareGUI() {
        mainFrame = new JFrame("Tính toán Lab 1");
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setSize(400, 270);
        mainFrame.setLayout(new GridLayout(2, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JPanel();
        headerLabel.setLayout(new GridLayout(3, 2));
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.setVisible(true);
    }

    public void showLab1Demo() {
        JLabel first = new JLabel("First number:", JLabel.LEFT);
        JLabel second = new JLabel("Seconds number:", JLabel.LEFT);
        JLabel last = new JLabel("Result:", JLabel.LEFT);
        txtkq.setEnabled(false);
        JButton btncong = new JButton("+");
        JButton btntru = new JButton("-");
        JButton btnnhan = new JButton("x");
        JButton btnchia = new JButton("/");
        btncong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validate()) {
                    double so1 = Double.parseDouble(txtso1.getText());
                    double so2 = Double.parseDouble(txtso2.getText());
                    double ketqua = so1 + so2;
                    txtkq.setText(ketqua + "");
                }
            }
        });
        btntru.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validate()) {
                    double so1 = Double.parseDouble(txtso1.getText());
                    double so2 = Double.parseDouble(txtso2.getText());
                    double ketqua = so1 - so2;
                    txtkq.setText(ketqua + "");
                }
            }
        });
        btnnhan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validate()) {
                    double so1 = Double.parseDouble(txtso1.getText());
                    double so2 = Double.parseDouble(txtso2.getText());
                    double ketqua = so1 * so2;
                    txtkq.setText(ketqua + "");
                }
            }

        });
        btnchia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validate()) {
                    double so1 = Double.parseDouble(txtso1.getText());
                    double so2 = Double.parseDouble(txtso2.getText());
                    double ketqua = so1 / so2;
                    txtkq.setText(ketqua + "");
                }
            }
        });
        headerLabel.add(first);
        headerLabel.add(txtso1);
        headerLabel.add(second);
        headerLabel.add(txtso2);
        headerLabel.add(last);
        headerLabel.add(txtkq);
        controlPanel.add(btncong);
        controlPanel.add(btntru);
        controlPanel.add(btnnhan);
        controlPanel.add(btnchia);
        mainFrame.setVisible(true);
    }

}
