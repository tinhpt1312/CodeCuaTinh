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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.lang.Math;


/**
 *
 * @author Tinh
 */
public class maytinh {

    private JFrame mainFrame;
    private JPanel headerPanel;
    private JPanel lastPanel;
    private long a = 0;
    private String pheptoan = "";

    public maytinh() {
        prepareGUI();
    }

    public static void main(String[] args) {
        maytinh AWTlab2 = new maytinh();
        AWTlab2.showLab2();
    }

    public void prepareGUI() {
        mainFrame = new JFrame("Máy tính");
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setSize(500, 300);
        mainFrame.setLayout(new GridLayout(2, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerPanel = new JPanel();
        headerPanel.setLayout(new FlowLayout());
        lastPanel = new JPanel();
        lastPanel.setLayout(new GridLayout(4, 5));
        mainFrame.add(headerPanel);
        mainFrame.add(lastPanel);
        mainFrame.setVisible(true);

    }

    public void showLab2() {
        final JTextField txtSo = new JTextField(null, 50);
        txtSo.setHorizontalAlignment(JTextField.TRAILING);
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn0 = new JButton("0");
        JButton btncongtru = new JButton("+/-");
        JButton btnC = new JButton("C");
        JButton btnchia = new JButton("/");
        JButton btnnhan = new JButton("x");
        JButton btntru = new JButton("-");
        JButton btncong = new JButton("+");
        JButton btncan2 = new JButton("sqrt");
        JButton btnphantram = new JButton("%");
        JButton btn1chia = new JButton("1/x");
        JButton btnbang = new JButton("=");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gt = txtSo.getText();
                if (gt.length() < 12) {
                    if (gt.equals("0")) {
                        gt = "";
                    }
                    long so = Long.parseLong(gt + btn1.getText());
                    txtSo.setText(String.valueOf(so));
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gt = txtSo.getText();
                if (gt.length() < 12) {
                    if (gt.equals("0")) {
                        gt = "";
                    }
                    long so = Long.parseLong(gt + btn2.getText());
                    txtSo.setText(String.valueOf(so));
                }
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gt = txtSo.getText();
                if (gt.length() < 12) {
                    if (gt.equals("0")) {
                        gt = "";
                    }
                    long so = Long.parseLong(gt + btn3.getText());
                    txtSo.setText(String.valueOf(so));
                }
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gt = txtSo.getText();
                if (gt.length() < 12) {
                    if (gt.equals("0")) {
                        gt = "";
                    }
                    long so = Long.parseLong(gt + btn4.getText());
                    txtSo.setText(String.valueOf(so));
                }
            }
        });
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gt = txtSo.getText();
                if (gt.length() < 12) {
                    if (gt.equals("0")) {
                        gt = "";
                    }
                    long so = Long.parseLong(gt + btn5.getText());
                    txtSo.setText(String.valueOf(so));
                }
            }
        });
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gt = txtSo.getText();
                if (gt.length() < 12) {
                    if (gt.equals("0")) {
                        gt = "";
                    }
                    long so = Long.parseLong(gt + btn6.getText());
                    txtSo.setText(String.valueOf(so));
                }
            }
        });
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gt = txtSo.getText();
                if (gt.length() < 12) {
                    if (gt.equals("0")) {
                        gt = "";
                    }
                    long so = Long.parseLong(gt + btn7.getText());
                    txtSo.setText(String.valueOf(so));
                }
            }
        });
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gt = txtSo.getText();
                if (gt.length() < 12) {
                    if (gt.equals("0")) {
                        gt = "";
                    }
                    long so = Long.parseLong(gt + btn8.getText());
                    txtSo.setText(String.valueOf(so));
                }
            }
        });
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gt = txtSo.getText();
                if (gt.length() < 12) {
                    if (gt.equals("0")) {
                        gt = "";
                    }
                    long so = Long.parseLong(gt + btn9.getText());
                    txtSo.setText(String.valueOf(so));
                }
            }
        });
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gt = txtSo.getText();
                if (gt.length() < 12) {
                    if (gt.equals("0")) {
                        gt = "";
                    }
                    long so = Long.parseLong(gt + btn0.getText());
                }
            }
        });
        btnchia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a = Long.parseLong(txtSo.getText());
                if (a != 0) {
                    pheptoan = "/";
                    txtSo.setText("0");
                }
            }
        });
        btnnhan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a = Long.parseLong(txtSo.getText());
                if (a != 0) {
                    pheptoan = "x";
                    txtSo.setText("0");
                }
            }
        });
        btntru.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a = Long.parseLong(txtSo.getText());
                if (a != 0) {
                    pheptoan = "-";
                    txtSo.setText("0");
                }
            }
        });
        btncong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a = Long.parseLong(txtSo.getText());
                if (a != 0) {
                    pheptoan = "+";
                    txtSo.setText("0");
                }
            }
        });
        btnbang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                long kq = 0;
                long b = Long.parseLong(txtSo.getText());
                if (pheptoan.length() > 0) {
                    if (pheptoan.equals("+")) {
                        kq = a + b;
                        txtSo.setText(String.valueOf(kq));
                    } else if (pheptoan.equals("-")) {
                        kq = a - b;
                        txtSo.setText(String.valueOf(kq));
                    } else if (pheptoan.equals("x")) {
                        kq = a * b;
                        txtSo.setText(String.valueOf(kq));
                    } else if (pheptoan.equals("/")) {
                        kq = a / b;
                        txtSo.setText(String.valueOf(kq));
                    }
                    pheptoan = "";
                    a = 0;
                }
            }
        });
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtSo.setText("");
            }
        });
        btncan2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double kq = 0;
                double b = Long.parseLong(txtSo.getText());
                if(b != 0){
                    
                    kq = Math.sqrt(b);
                }
                txtSo.setText(kq + "");
                
            }
        });
        txtSo.setEnabled(false);
        headerPanel.add(txtSo);
        lastPanel.add(btn1);
        lastPanel.add(btn2);
        lastPanel.add(btn3);
        lastPanel.add(btnchia);
        lastPanel.add(btncan2);
        lastPanel.add(btn4);
        lastPanel.add(btn5);
        lastPanel.add(btn6);
        lastPanel.add(btnnhan);
        lastPanel.add(btnphantram);
        lastPanel.add(btn7);
        lastPanel.add(btn8);
        lastPanel.add(btn9);
        lastPanel.add(btntru);
        lastPanel.add(btn1chia);
        lastPanel.add(btn0);
        lastPanel.add(btncongtru);
        lastPanel.add(btnC);
        lastPanel.add(btncong);
        lastPanel.add(btnbang);
        mainFrame.setVisible(true);
        mainFrame.pack();

    }
}
