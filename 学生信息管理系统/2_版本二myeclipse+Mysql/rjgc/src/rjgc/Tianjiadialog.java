package rjgc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.sql.*;

 public class Tianjiadialog extends JFrame {
	 public static final int Width =320;
	 public static final int Heigth =230;
	
	 Button btn,btn2;
      JTextField jt,jt2,jt3,jt4,jt5,jt6;
	
	/*class MyPanel extends JPanel{
		 Label lb ;
		
		MyPanel(String s,JTextField jt){
			setLayout(new FlowLayout());
			
			lb=new Label(s);
			add(lb);add(jt);
		}
		 
	 }*/
public Tianjiadialog(){
		setSize(Width,Heigth);
		setLocation(820,200);
		setTitle(new String("�������µ���Ϣ��"));
		setLayout(new FlowLayout());
		jt=new JTextField(20);
		Label lb=new Label("ѧ�ţ�");
		jt2=new JTextField(20);
		Label lb2=new Label("������");
		jt3=new JTextField(20);
		Label lb3=new Label("�Ա�");
		
		jt4=new JTextField(20);
		Label lb4=new Label("���䣺");
		jt5=new JTextField(20);
		Label lb5=new Label("�༶��");
		jt6=new JTextField(20);
		Label lb6=new Label("רҵ��");
		btn=new Button("�޸�");
		btn.addActionListener(new Enter());
	    btn2=new Button("ȡ��");
		/*MyPanel p1=new MyPanel("ѧ�ţ�",jt);
		MyPanel p2=new MyPanel("������",jt2);
		MyPanel p3=new MyPanel("�Ա�",jt3);*/
		add(lb);add(jt);add(lb2);add(jt2);add(lb3);add(jt3);
		add(lb4);add(jt4);add(lb5);add(jt5);add(lb6);add(jt6);
		add(btn);add(btn2);
		
	}
class Enter implements ActionListener{
	
   public void actionPerformed(ActionEvent e){
	
	    Container con=getContentPane();
	
	if(e.getActionCommand().equals("�޸�")){
		
	con.setBackground(Color.blue);
		
		
			String sno=jt.getText();
			String sname=jt2.getText();
			String ssex=jt3.getText();
			String sage=jt4.getText();
			String sclass=jt5.getText();
			String smajor=jt6.getText();
			Object str[]={sno,sname,ssex,sage,sclass,smajor};
			Connection sin=Dbcon.getconnectin();
			Dbcon.insert(sin, str);
			JOptionPane.showMessageDialog(null,"�޸ĳɹ�!","������ʾ",JOptionPane.NO_OPTION );
	        dispose();
	   
	   
	  }
 }
 }
 }

