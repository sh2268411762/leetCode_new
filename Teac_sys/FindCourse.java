/**
 * 
 */
package Teac_sys;

/**
 * @author 
 * @Date
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public  class FindCourse extends JPanel implements ActionListener{
	   JLabel Inputlabel;
	   JTextField Inputtext;
	   JButton Findbt;
	   JLabel Idlabel;
	   JLabel Namelabel;
	   JLabel Daikelabel;
	   JLabel Phonetlabel;
	   JTextField Idtext;
	   JTextField Nametext;
	   JTextField Daiketext;
	   JTextField Phonetext;
	 
	     public FindCourse() {
		  
	       this.setSize(650,350);
		   this.setLocation(100, 20);
		   this.setLayout(null);
	       this.setBackground(Color.lightGray);
	     
	       
	       
	        Idlabel=new JLabel("教师工号");
	        Idlabel.setSize(100,30);
	        Idlabel.setLocation(100, 120);
			this.add(Idlabel);
			
			Idtext=new JTextField();
			Idtext.setSize(120,30);
			Idtext.setLocation(220, 120);
			this.add(Idtext);
			
			Namelabel=new JLabel("教师姓名");
			Namelabel.setSize(100,30);
			Namelabel.setLocation(100, 160);
			this.add(Namelabel);
			
			Nametext=new JTextField();
			Nametext.setSize(120,30);
			Nametext.setLocation(220, 160);
			this.add(Nametext);
			
			Daikelabel=new JLabel("所授科目");
			Daikelabel.setSize(100,30);
			Daikelabel.setLocation(100, 200);
			this.add(Daikelabel);
			
			Daiketext=new JTextField();
			Daiketext.setSize(120, 30);
			Daiketext.setLocation(220, 200);
			this.add(Daiketext);
			
			Phonetlabel=new JLabel("联系方式");
			Phonetlabel.setSize(100,30);
			Phonetlabel.setLocation(100, 240);
			this.add(Phonetlabel);
			 
			Phonetext=new JTextField();
			Phonetext.setSize(120, 30);
			Phonetext.setLocation(220, 240);
			this.add(Phonetext);
			
	       
	       Inputlabel=new JLabel("请输入教师工号");
	       Inputlabel.setSize(150,50);
	       Inputlabel.setLocation(100, 45);
			this.add(Inputlabel);
			
			Inputtext=new JTextField();
			Inputtext.setSize(160,40);
			Inputtext.setLocation(200, 45);
			this.add(Inputtext);
			
			Findbt=new JButton("查询");
			Findbt.setSize(90,38);
			Findbt.setLocation(420, 45);
			this.add(Findbt);
			Findbt.addActionListener(this);
			
			this.setVisible(true);
		  } 
	    

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String inputId=Inputtext.getText();
			
	try {
		Class.forName("com.mysql.jdbc.Driver");
        System.out.println("加载成功");

        String url = "jdbc:mysql://localhost:3306/teachercourse?useSSL=false";
        String user = "root";
        String passwd = "123456";
		Connection conn=DriverManager.getConnection(url,user,passwd);
		//创建数据库连接对象
		Statement st=conn.createStatement();
		//创建SQL语句执行对象

	   String  strSQL="(Select* from  dbo.Table_2 where CourseId='"+inputId+"' )";
		ResultSet rs=st.executeQuery(strSQL);

		if(rs.next())
		{
			 Idtext.setText(rs.getString(1));
			 Nametext.setText(rs.getString(2));
			 Daiketext.setText(rs.getString(3));
			 Phonetext.setText(rs.getString(4));
		}
		else
		{ 
			JOptionPane.showMessageDialog(null, "您查询的教师不存在，请重新输入");
		}
	    conn.close();
	   
		//关闭数据库连接	
	} 
	catch (ClassNotFoundException ex) {
		System.out.println("没有找到对应的数据库驱动类");
	}
	catch (SQLException ex) {
		System.out.println("数据库连接或者是数据库操作失败");
	}

}
			
		}

