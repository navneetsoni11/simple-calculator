/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Navi
 */
public class Calculator extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
        String num;
        String sub;
        long result;
        double num1;
        double num2;
        char op;
        JButton clear;
        JButton back;
        JButton mul;
        JButton div;
        JButton plus;
        JButton minus;
        JButton equal;
        JButton inp9;
        JButton inp8;
        JButton inp7;
        JButton inp6;
        JButton inp5;
        JButton inp4;
        JButton inp3;
        JButton inp2;
        JButton inp1;
        JButton inp0;
        JTextArea tf;
    Calculator()
    {
        super("Calculator App");
        initComponents();
        
    }
    private void initComponents()
    {
        JPanel gui=new JPanel(new BorderLayout(5,5));
        gui.setBorder(new EmptyBorder(4,4,4,4));
        tf=new JTextArea(3,25);
        tf.setText("0");
        tf.setEditable(false);
        gui.add(tf,BorderLayout.NORTH);
        JPanel buttons=new JPanel(new GridLayout(4,4,5,5));
        clear=new JButton("C");
        back=new JButton("<--");
        mul=new JButton("x");
        div=new JButton("/");
        plus=new JButton("+");
        minus=new JButton("-");
        equal=new JButton("=");
        inp9=new JButton("9");
        inp8=new JButton("8");
        inp7=new JButton("7");
        inp6=new JButton("6");
        inp5=new JButton("5");
        inp4=new JButton("4");
        inp3=new JButton("3");
        inp2=new JButton("2");
        inp1=new JButton("1");
        inp0=new JButton("0");
        clear.addActionListener(this);
        back.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        equal.addActionListener(this);
        inp1.addActionListener(this);
        inp2.addActionListener(this);
        inp3.addActionListener(this);
        inp4.addActionListener(this);
        inp5.addActionListener(this);
        inp6.addActionListener(this);
        inp7.addActionListener(this);
        inp8.addActionListener(this);
        inp9.addActionListener(this);   
        buttons.add(clear);
        buttons.add(back);
        buttons.add(mul);
        buttons.add(div);
        buttons.add(inp9);
        buttons.add(inp8);
        buttons.add(inp7);
        buttons.add(plus);
        buttons.add(inp6);
        buttons.add(inp5);
        buttons.add(inp4);
        buttons.add(minus);
        buttons.add(inp3);
        buttons.add(inp2);
        buttons.add(inp1);
        buttons.add(equal);
        gui.add(buttons,BorderLayout.CENTER);
        setContentPane(gui);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
             
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator c=new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        num=tf.getText();
        
        if(num.equals("0")||op=='e')
        {
            op='v';
            tf.setText("");
        }
        if(ae.getSource()==clear)
        {
            tf.setText("0");
        }
        else if(ae.getSource()==back)
        {
            if(!(num.equals("0")||num.equals("")))
            {
                sub=num.substring(0,(num.length())-1);
                tf.setText(sub);
            }
        }
        else if(ae.getSource()==mul)
        {   
            num1=Double.valueOf(num);
            op='m';
            tf.setText("");
            
        }
        else if(ae.getSource()==div)
        {
            num1=Double.valueOf(num);
            op='d';
            tf.setText("");
     
        }
        else if(ae.getSource()==plus)
        {
            num1=Double.valueOf(num);
            op='p';
            tf.setText("");
        }
        else if(ae.getSource()==minus)
        {
            num1=Double.valueOf(num);
            op='s';
            tf.setText("");
        }
        else if(ae.getSource()==equal)
        {
            num2=Double.valueOf(num);
            switch(op)
            {
                case 'm':
                    result=(long)(num1*num2);
                    tf.setText(Long.toString(result));
                    break;
                case 'p':
                    result=(long)(num1+num2);
                    tf.setText(Long.toString(result));
                    break;
                case 's':
                    result=(long)(num1-num2);
                    tf.setText(Long.toString(result));
                    break;    
                case 'd':
                    Double lresult = (Double)(num1/num2);
                    tf.setText(Double.toString(lresult));
                    break;               
            }
            op='e';
            //tf.setText("");
        }
        else if(ae.getSource()==inp1)
        {
            
            tf.setText(tf.getText()+"1");
        }
        else if(ae.getSource()==inp2)
        {
            
            tf.setText(tf.getText()+"2");
        }
        else if(ae.getSource()==inp3)
        {
            
            tf.setText(tf.getText()+"3");
        }
        else if(ae.getSource()==inp4)
        {
            
            tf.setText(tf.getText()+"4");
        }
        else if(ae.getSource()==inp5)
        {
            
            tf.setText(tf.getText()+"5");
        }
        else if(ae.getSource()==inp6)
        {
            
            tf.setText(tf.getText()+"6");
        }
        else if(ae.getSource()==inp7)
        {
            
            tf.setText(tf.getText()+"7");
        }
        else if(ae.getSource()==inp8)
        {
            
            tf.setText(tf.getText()+"8");
        }
        else if(ae.getSource()==inp9)
        {
            
            tf.setText(tf.getText()+"9");
        }
        
        
    }
        
}
