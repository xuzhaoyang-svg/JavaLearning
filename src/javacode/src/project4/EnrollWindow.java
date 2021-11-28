package javacode.src.project4;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Objects;

public class EnrollWindow extends JFrame {
    public JTextField inputText1,inputText2;

    public JButton button1,button2;
    public EnrollWindow() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    void init() {
        setLayout(new FlowLayout());
        Font font = new Font("宋体",Font.PLAIN,20);
        inputText1 = new JTextField(20);
        inputText1.setFont(font);
        inputText2 = new JTextField(20);
        inputText2.setFont(font);
        button1 = new JButton("确定");
        button1.setFont(font);
        button2 = new JButton("取消");
        button2.setFont(font);

        inputText1.addActionListener(new PoliceListen());//
        inputText2.addActionListener(new PoliceListen());//
        button1.addActionListener(new PoliceListen());//
        button2.addActionListener(new PoliceListen());//
        add(inputText1);
        add(inputText2);
        add(button1);
        add(button2);

    }
    public class PoliceListen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button1){
                String str1 = inputText1.getText();
                String str2 = inputText2.getText();
                String conut="123";
                String password="123";
                int type = JOptionPane.PLAIN_MESSAGE;
                String message = "";
                if (Objects.equals(str1, conut)){
                    System.out.println("账号正确");
                }
                else {
                    System.out.println("账号错误");
                    type = JOptionPane.ERROR_MESSAGE;
                    message = "Error Message";
                }
                if (Objects.equals(str2, password)){
                    System.out.println("密码正确");
                }
                else {
                    System.out.println("密码错误");
                }
            }
            else if (e.getSource()==button2){
                inputText1.setText("");
                inputText2.setText("");

            }

        }
    }
}

