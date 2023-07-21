/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Tinh
 */
public class qlSinhVien {

    private JFrame mainFrame;
    private JPanel onePanel;
    private JPanel twoPanel;
    private JPanel threePanel;
    private JPanel fourPanel;
    final JTextField txtName = new JTextField(15);
    final JTextArea txtAddress = new JTextArea(null, null, 8, 20);

    public boolean check() {
        if (txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa nhập tên");
            txtName.requestFocus();
            return false;
        }
        if (txtAddress.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa nhập địa chỉ");
            txtAddress.requestFocus();
            return false;
        }
        return true;
    }

    public qlSinhVien() {
        prepareGUI();
    }

    public void prepareGUI() {
        mainFrame = new JFrame("Quản lý sinh viên");
        mainFrame.setSize(800, 500);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new GridLayout(4, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        onePanel = new JPanel();
        twoPanel = new JPanel();
        threePanel = new JPanel();
        fourPanel = new JPanel();
        onePanel.setLayout(new FlowLayout());
        twoPanel.setLayout(new FlowLayout());
        threePanel.setLayout(new FlowLayout());
        fourPanel.setLayout(new FlowLayout());
        mainFrame.add(onePanel);
        mainFrame.add(twoPanel);
        mainFrame.add(threePanel);
        mainFrame.add(fourPanel);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        qlSinhVien AWTBai1 = new qlSinhVien();
        AWTBai1.showBai1();
    }

    public void showBai1() {
        
        JLabel label1 = new JLabel("Name: ", JLabel.RIGHT);
        JLabel label2 = new JLabel("Address: ", JLabel.RIGHT);
        JLabel label3 = new JLabel("Qualification: ", JLabel.RIGHT);
        JLabel label4 = new JLabel("Hobby: ", JLabel.RIGHT);
        JLabel label5 = new JLabel("Sex: ", JLabel.RIGHT);
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup bt = new ButtonGroup();
        bt.add(male);
        bt.add(female);
        JComboBox cbo1 = new JComboBox();
        cbo1.addItem("Graduate");
        cbo1.addItem("Students");
        JCheckBox reading = new JCheckBox("Reading");
        JCheckBox singing = new JCheckBox("Singing");
        JCheckBox dancing = new JCheckBox("Dancing");
        JButton btnvalidate = new JButton("Validate");
        JButton btnreset = new JButton("Reset");
        btnvalidate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (check()) {
                    String str = "";
                    str = "Name: " + txtName.getText() + "\n";
                    str = str + "Address: " + txtAddress.getText() + "\n";
                    if (male.isSelected()) {
                        str = str + "Sex : Male \n";
                    } else {
                        str = str + "Sex : Female \n";
                    }
                    str = str + "Qualification: " + cbo1.getSelectedItem() + "\n";
                    if (dancing.isSelected()) {
                        str = str + "Hobby: Dancing \n";
                    }
                    if (reading.isSelected()) {
                        str = str + "Hobby: Reading \n";
                    }
                    if (singing.isSelected()) {
                        str = str + "Hobby: Singing \n";
                    }
                    JOptionPane.showMessageDialog(null, str);
                }
            }
        });
        btnreset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAddress.setText("");
                txtName.setText("");
                male.setSelected(false);
                female.setSelected(false);
                cbo1.setSelectedIndex(0);
                reading.setSelected(false);
                dancing.setSelected(false);
                singing.setSelected(false);
            }
        });
        onePanel.add(label1);
        onePanel.add(txtName);
        onePanel.add(label3);
        onePanel.add(cbo1);
        twoPanel.add(label2);
        twoPanel.add(txtAddress);
        twoPanel.add(label4);
        twoPanel.add(reading);
        twoPanel.add(singing);
        twoPanel.add(dancing);
        threePanel.add(label5);
        threePanel.add(male);
        threePanel.add(female);
        fourPanel.add(btnvalidate);
        fourPanel.add(btnreset);
        mainFrame.setVisible(true);

    }
}
