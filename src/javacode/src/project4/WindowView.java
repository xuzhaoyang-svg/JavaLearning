package javacode.src.project4;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WindowView extends JFrame {
    public JTextField inputText;
    public JTextArea textShow;
    public JButton button;
    public WindowView() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    void init() {
        setLayout(new FlowLayout());
        Font font = new Font("宋体",Font.PLAIN,20);
        inputText = new JTextField(20);
        inputText.setFont(font);
        button = new JButton("确定");
        button.setFont(font);
        font = new Font("宋体",Font.BOLD,22);
        textShow = new JTextArea(9,30);
        textShow.setFont(font);
        inputText.addActionListener(new PoliceListen());//
        button.addActionListener(new PoliceListen());//
        add(inputText);
        add(button);
        add(new JScrollPane(textShow));
    }
    public class PoliceListen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==inputText){
                String str = inputText.getText();
                textShow.append("\""+str+"\"的长度:"+str.length()+"\n");
            }
            else if (e.getSource()==button){
                String str = button.getText();
                textShow.append(str+"\n");
            }

        }
    }
}

