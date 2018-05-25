package rjgc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.sql.*;

 public class Adddialog extends JFrame {
	 public static final int Width =320;
	 public static final int Heigth =230;
	
	 Button btn,btn2;
      JTextField jt,jt2,jt3;
	
	/*class MyPanel extends JPanel{
		 Label lb ;
		
		MyPanel(String s,JTextField jt){
			setLayout(new FlowLayout());
			
			lb=new Label(s);
			add(lb);add(jt);
		}
		 
	 }*/
public Adddialog(){
		setSize(Width,Heigth);
		setLocation(820,200);
		setTitle(new String("增加"));
		setLayout(new FlowLayout());
		Container con=getContentPane();
		jt=new JTextField(20);
		Label lb=new Label("学号：");
		jt2=new JTextField(20);
		Label lb2=new Label("姓名：");
		jt3=new JTextField(20);
		Label lb3=new Label("性别：");
		btn=new Button("添加");
		btn.addActionListener(new Enter());
	    btn2=new Button("取消");
		/*MyPanel p1=new MyPanel("学号：",jt);
		MyPanel p2=new MyPanel("姓名：",jt2);
		MyPanel p3=new MyPanel("性别：",jt3);*/
		add(lb);add(jt);add(lb2);add(jt2);add(lb3);add(jt3);add(btn);add(btn2);
		
		
	}
class Enter implements ActionListener{
	
   public void actionPerformed(ActionEvent e){
	
	    Container con=getContentPane();
	    Adddialog ad= new Adddialog();
	
	if(e.getActionCommand().equals("添加")){
		
	con.setBackground(Color.green);
		
		
			String sno=jt.getText();
			String sname=jt2.getText();
			String ssex=jt3.getText();
			Object str[]={sno,sname,ssex};
			Connection sin=Dbcon.getconnectin();
			Dbcon.insert(sin, str);
			JOptionPane.showMessageDialog(null,"添加成功!","操作提示",JOptionPane.NO_OPTION );
	        dispose();
	   
	   
	  }
 }
 }
 }
