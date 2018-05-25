package rjgc;

import java.sql.*;

import javax.swing.JOptionPane;
public class Dbcon {
public final static Connection getconnectin(){
	Connection con=null;
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/wtf";
    String user = "root";
	String password = "xhs12302";
	try{
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Class.forName(driver);
	    con=DriverManager.getConnection(url,user,password);
		con.setCatalog("wtf");
		
	}
	catch(SQLException sqle){
	       System.out.println(sqle+"lianjiecuowu");
	            }
	    	catch(Exception e){
	    		System.out.println(e+"diergecuowu");
	    	
	    	}
	return con;
}
//添加数据
public final static void insert(Connection con,Object obj[]){
	PreparedStatement stmt=null;
	try {
		stmt=con.prepareStatement("insert into student(sno,sname,ssex,sage,sclass,smajor) values(?,?,?,?,?,?)");
		
		stmt.setString(1,obj[0].toString());
		stmt.setString(2,obj[1].toString());
		stmt.setString(3,obj[2].toString());
		stmt.setString(4,obj[3].toString());
		stmt.setString(5,obj[4].toString());
		stmt.setString(6,obj[5].toString());
		stmt.execute();
		
		
		
	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null,"shibai","操作提示",JOptionPane.NO_OPTION );
	}
}
//查询数据
public final static ResultSet query(Connection con){
	
	ResultSet rs=null;
	PreparedStatement stmt=null;
	try {
		stmt=con.prepareStatement("select * from student");
		 rs=stmt.executeQuery();
		
 		
 		//stmt.close();
 		//con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rs;
}
//删除数据
public final static void delete(Connection con,String s){
	try {
		PreparedStatement stmt;
		 stmt=con.prepareStatement("delete from student where sno=?");
	    stmt.setObject(1,s);
		stmt.execute();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		
	}
}

}