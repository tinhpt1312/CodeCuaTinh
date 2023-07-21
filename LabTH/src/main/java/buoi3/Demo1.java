/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Tinh
 */
public class Demo1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setLocation(200, 200);
        frame.setSize(550, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        ImageIcon usIcon = new ImageIcon("D:\\tinhpt26461\\Java3\\Bai Lab\\LabTH\\src\\main\\java\\Icon\\america-usa.png");
        ImageIcon amIcon = new ImageIcon("D:\\tinhpt26461\\Java3\\Bai Lab\\LabTH\\src\\main\\java\\Icon\\united-kingdom.png");
        ImageIcon vnIcon = new ImageIcon("D:\\tinhpt26461\\Java3\\Bai Lab\\LabTH\\src\\main\\java\\Icon\\VietNam.png");

        JPanel p = new JPanel();
        JButton b1 = new JButton("Click it", usIcon);
        JButton b2 = new JButton("Click it", amIcon);
        JButton b3 = new JButton("Click it", vnIcon);

        b1.setPressedIcon(amIcon);
        b1.setRolloverIcon(vnIcon);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bạn đã chọn Việt Nam");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bạn đã chọn Mẽo");
            }
        });
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Demo"));
        frame.add(p);
        frame.setVisible(true);
    }
}
