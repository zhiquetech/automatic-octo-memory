package rjgc;

import java.awt.*;
import java.awt.event.*;
import java.security.cert.PKIXRevocationChecker.Option;

import javax.swing.*;
import java.sql.*;

 
class Qframe extends JFrame implements ActionListener{
                        
  JPanel contentPane;
  BorderLayout borderLayout1=new BorderLayout(5,10);
  Label prompt;
  JTextField stm;
  Button run;
  public static final TextArea result=new TextArea();
    
  public Qframe(){
	  contentPane=(JPanel)this.getContentPane();
	  contentPane.setLayout(borderLayout1);
	  this.setTitle("学生信息管理系统");
	 
	  addWindowListener(new WindowAdapter(){
		  public void windowClosing(WindowEvent e){
			  System.exit(0);
		  }
	  });
	  prompt =new Label("执行语句:");
	  run=new Button("开始执行");
	  result.setEditable(false);
	  stm=new JTextField(100);
	  JPanel option =new JPanel();
	  Button zenjia=new Button("增加(add)");
	  option.add(zenjia,BorderLayout.NORTH);
	  zenjia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(e.getSource()==zenjia){
					  Adddialog add1= new Adddialog();
					  add1.setVisible(true);
				  }
				
			}
		});
	  Button shanchu=new Button("删除(delet)");
	  option.add(shanchu,BorderLayout.NORTH);
	 shanchu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(e.getSource()==shanchu){
					  Deletedialog dt1=new Deletedialog();
					  dt1.setVisible(true);
				  }
				
			}
		});
	  shanchu.addActionListener(this);
	  Button xiugai=new Button("修改(alter)");
	  option.add(xiugai,BorderLayout.NORTH);
	  xiugai.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(e.getSource()==xiugai){
					 Alterdialog af=new Alterdialog();
					 af.setVisible(true);
					
				  }
				
			}
		});
	  Button cx=new Button("查询(query)");
	  option.add(cx,BorderLayout.NORTH);
	  cx.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(e.getSource()==cx){
					 Cxdialog cj=new Cxdialog();
					 cj.show();
				  }
				
			}
		});
	 cx.addActionListener(this);
	  xiugai.addActionListener(this);
	  Button chaxun=new Button("刷新(refresh)");
	  option.add(chaxun,BorderLayout.NORTH);
	  chaxun.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(e.getSource()==chaxun){
					 Connection sin=Dbcon.getconnectin();
					 ResultSet rs=Dbcon.query(sin);
					 
					 try {
						 result.setText("刷新成功\n\n\n");
						while(rs.next())
							{
							     String msg=rs.getString("sno")+"\t"+rs.getString("sname")+rs.getString("ssex")+"\n";
							     result.append(msg);
							}
						sin.close();
						rs.close();
					 }catch(Exception h){ 
						 h.printStackTrace(); 
					 }
				  }
				
			}
		});
	  chaxun.addActionListener(this);
	  Button tuichu=new Button("退出(quit)"); 
	  option.add(tuichu,BorderLayout.NORTH);
	  tuichu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(e.getSource()==tuichu){
					 System.exit(0);
					 }
				  }
				
			
		});
	  
	  
	  //界面布局
	  contentPane.add(prompt,BorderLayout.WEST);
	  contentPane.add(stm,BorderLayout.CENTER);
	  contentPane.add(run,BorderLayout.EAST);
	  contentPane.add(result,BorderLayout.SOUTH);
	  contentPane.add(option,BorderLayout.NORTH);
	  run.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e){
	  if(e.getSource()==run){
		  String url="jdbc:sqlserver://localhost:1433;DatabaseName=wtf";
	    	try{
	    		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
	    		//System.out.println("数据库驱动加载成功");
	    		String user="sa";
	    		String password="123456";
	    		Connection con=DriverManager.getConnection(url,user,password);
	    		//System.out.println("连接成功");
	    		String msg1="lianjiechenggong";
	    		result.setText("连接成功\n\n\n");
	    		 
	    		String yuju=stm.getText();
	    		Statement st=con.createStatement();
	    		ResultSet rs=st.executeQuery(yuju);
	    		//System.out.println("wangtangfu");
	    		//result.setText("");
	    		while(rs.next())
	    		{
	    		     String msg=rs.getString("sno")+"\t"+rs.getString("sname")+rs.getString("sage")+"\n";
	    		     result.append(msg);
	    		}
	    		rs.close();
	    		st.close();
	    		con.close();
	    		//System.out.println("连接完成");
	    	}catch(SQLException sqle){
	    		result.setText(sqle+"lianjiecuowu");
	            //System.out.println(sqle+"lianjiecuowu");
	            }
	    	catch(Exception h){
	    		result.setText(h+"diercuowu");
	    		//System.out.println(h+"diergecuowu");
	    	
	    	}
	  }
	 
  }
  //@SuppressWarnings("deprecation")
/*public static void main(String argc[]){
	  
	  LoginIn dl=new LoginIn();
	  dl.show();
	  
	  
	  Qframe frame= new Qframe();
	  frame.setLocation(400,200);
	  frame.resize(400,285);
	  frame.show();
	 
  }*/

}

	  
	  

