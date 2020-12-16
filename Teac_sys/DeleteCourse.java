/**
 * 
 */
package Teac_sys;

/**
 * @author 
 * @Date
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
public  class DeleteCourse extends JPanel implements ActionListener{
	   JLabel Idlabel;
	   JTextField Idtext;
	   JButton Delbt;
	   JTable table;
	  
	   public DeleteCourse() {
		   
		   this.setSize(650,350);
		   this.setLocation(100, 20);
		   this.setLayout(null);
	       this.setBackground(Color.lightGray);
	    

			Idlabel=new JLabel("请输入删除信息");
			Idlabel.setSize(150,50);
			Idlabel.setLocation(100, 280);
			this.add(Idlabel);
			
			Idtext=new JTextField();
			Idtext.setSize(160,40);
			Idtext.setLocation(200, 280);
			this.add(Idtext);
			
			Delbt=new JButton("确认删除");
			Delbt.setSize(90,38);
			Delbt.setLocation(420, 280);
			this.add(Delbt); 
			Delbt.addActionListener(this);
			

	        Object[] columnTitle= {"教师工号","教师姓名","所授科目","联系方式"};
	    	 //表格行对象数据
	    	Object[][] tableData= {
	    	new Object[] {"001","王宏","c++","123456"},
	        new Object[] {"002","李刚","java","4152698"},
	    	new Object[] {"003","马超","英语","789456"},  
	    	  };
	    	  
	    	  //创建表格
	    	 JTable  table=new JTable(tableData,columnTitle);
	    	 JScrollPane scrollpane=new JScrollPane(table);
	    	 scrollpane.setSize(550,150);
	    	 scrollpane.setLocation(60, 20);
	    	 this.add(scrollpane);
		
			this.setVisible(true);
	   }
       
	
	
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				String delId=Idtext.getText();
				
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
				   String strSQL="delete from  dbo.Table_2 where CourseId='"+delId+"' ";
				  
				    int rs=st.executeUpdate(strSQL);
					if(rs==1) {
						JOptionPane.showMessageDialog(null,"信息删除成功");
					}
					else{
						JOptionPane.showMessageDialog(null,"信息删除失败");
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

