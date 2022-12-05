package quizbox;

import javax.swing.*;   /*From Extended Package*/
import java.awt.*;      ;/*for Color Package*/
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {  /*JFrame Class*/  /*ActionListenerfrom awt for click event*/
    
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane ().setBackground(Color.WHITE);
        setLayout(null);                        /*Own Layout*/
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));           /*Class = Object*/
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,400);
        add(image);                           /*to add component on frame*/
        
        JLabel heading = new JLabel("Fun Playing");
        heading.setBounds(690,40,500,80);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(719,100,500,30);
        name.setFont(new Font("Mongolian Baiti ", Font.BOLD, 15));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(640,150,300,30);
        tfname.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(660, 220, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);             /*click event*/
        add(rules);

        
        
        back = new JButton("Back");
        back.setBounds(800, 220, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1000, 430);
        setLocation(140,150);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae) {   /*Method Overiding*/ /*ae class*/
        if (ae.getSource() == rules) {
            String name = tfname.getText();  /*Obtaining Val from get Text*/
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Login();
    }
    
}
