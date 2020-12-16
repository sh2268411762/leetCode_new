/**
 * 
 */
package Teac_sys;

/**
 * @author 
 * @Date
 */

import java.awt.Color;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public  class AddCourse extends JPanel implements ActionListener{
   JLabel Idlabel;
   JLabel Namelabel;
   JLabel Daikelabel;
   JLabel Phonelabel;
   JTextField Idtext;
   JTextField Nametext;
   JTextField Daiketext;
   JTextField Phonetext;
   JButton Addbt;
   JScrollPane scrollpane;
   JTable table;

	
    public AddCourse() {
	   this.setSize(650,350);
	   this.setLocation(100, 20);
	   this.setLayout(null);
       this.setBackground(Color.lightGray);
    
       
		Idlabel=new JLabel("请输入教师工号");
		Idlabel.setSize(100,30);
		Idlabel.setLocation(60, 20);
		
		this.add(Idlabel);
		
		Idtext=new JTextField();
		Idtext.setSize(120,30);
		Idtext.setLocation(180, 20);
		this.add(Idtext);
		
		Namelabel=new JLabel("请输入教师姓名");
		Namelabel.setSize(100,30);
		Namelabel.setLocation(60, 60);
		this.add(Namelabel);
		
		Nametext=new JTextField();
		Nametext.setSize(120,30);
		Nametext.setLocation(180, 60);
		this.add(Nametext);
		
		Daikelabel=new JLabel("请选择所授科目");
		Daikelabel.setSize(100,30);
		Daikelabel.setLocation(60, 100);
		this.add(Daikelabel);
		
		Daiketext=new JTextField();
		Daiketext.setSize(120,30);
		Daiketext.setLocation(180, 60);
		this.add(Daiketext);
		
		Addbt=new JButton("添加");
		Addbt.setSize(80,30);
		Addbt.setLocation(350, 80);
		this.add(Addbt);  
		Addbt.addActionListener(this);
		
		
		Phonelabel=new JLabel("请输入教师电话");
		Phonelabel.setSize(100,30);
		Phonelabel.setLocation(60, 140);
		this.add(Phonelabel);
		
		Phonetext=new JTextField();
		Phonetext.setSize(120,30);
		Phonetext.setLocation(180, 140);
		this.add(Phonetext);
		this.setVisible(true);
    }	
	

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String addId=Idtext.getText();
			String addName=Nametext.getText();
			String addDaike=Daiketext.getText();
			String addPhone=Phonetext.getText();
		
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
     
	   String  strSQL="insert into  dbo.Table_2 values('"+addId+"','"+addName+"','"+addDaike+"','"+addPhone+"')";
	   String  strSQL1="(Select* from  dbo.Table_2 where CourseId='"+addId+"' )";
	   
	  if(!addId.trim().equals("")&&!addDaike.trim().equals("")&&!addPhone.trim().equals(""))
	   {
		 ResultSet rs1=st.executeQuery(strSQL1);
		 
	   if(rs1.next())	 
	    {
		   JOptionPane.showMessageDialog(null,"该教师已存在");     }
	   else {
	   int rs=st.executeUpdate(strSQL);
		  
	   if(rs==1) {
			JOptionPane.showMessageDialog(null,"信息添加成功");
		}
		else{
			JOptionPane.showMessageDialog(null,"信息添加失败");
		}
	   }
	   }
	  else
	  { JOptionPane.showMessageDialog(null,"请输入教师信息");
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



