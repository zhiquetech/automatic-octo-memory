package rjgc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.sql.*;

 public class Deletedialog extends JFrame {
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
public Deletedialog(){
		setSize(Width,Heigth);
		setLocation(820,200);
		setTitle(new String("ɾ����"));
		setLayout(new FlowLayout());
		Container con=getContentPane();
		jt=new JTextField(20);
		Label lb=new Label("ѧ�ţ�");
		/*jt2=new JTextField(20);
		Label lb2=new Label("������");
		jt3=new JTextField(20);
		Label lb3=new Label("�Ա�");*/
		btn=new Button("ȷ��");
		btn.addActionListener(new Enter());
	    btn2=new Button("ȡ��");
		/*MyPanel p1=new MyPanel("ѧ�ţ�",jt);
		MyPanel p2=new MyPanel("������",jt2);
		MyPanel p3=new MyPanel("�Ա�",jt3);*/
		add(lb);add(jt);
		//add(lb2);add(jt2);add(lb3);add(jt3);
		add(btn);add(btn2);
		
		
	}
class Enter implements ActionListener{
	
   public void actionPerformed(ActionEvent e){
	
	    Container con=getContentPane();
	    
	
	if(e.getActionCommand().equals("ȷ��")){
		
	con.setBackground(Color.red);
		
		
			String sno=jt.getText();
			
			Connection sin=Dbcon.getconnectin();
			Dbcon.delete(sin, sno);
			JOptionPane.showMessageDialog(null,"��Ϣɾ���ɹ�!","��Ϣ",JOptionPane.INFORMATION_MESSAGE );
	        dispose();
	   
	   
	  }
     }
    }

}