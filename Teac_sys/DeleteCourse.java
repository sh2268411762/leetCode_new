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
	    

			Idlabel=new JLabel("������ɾ����Ϣ");
			Idlabel.setSize(150,50);
			Idlabel.setLocation(100, 280);
			this.add(Idlabel);
			
			Idtext=new JTextField();
			Idtext.setSize(160,40);
			Idtext.setLocation(200, 280);
			this.add(Idtext);
			
			Delbt=new JButton("ȷ��ɾ��");
			Delbt.setSize(90,38);
			Delbt.setLocation(420, 280);
			this.add(Delbt); 
			Delbt.addActionListener(this);
			

	        Object[] columnTitle= {"��ʦ����","��ʦ����","���ڿ�Ŀ","��ϵ��ʽ"};
	    	 //����ж�������
	    	Object[][] tableData= {
	    	new Object[] {"001","����","c++","123456"},
	        new Object[] {"002","���","java","4152698"},
	    	new Object[] {"003","��","Ӣ��","789456"},  
	    	  };
	    	  
	    	  //�������
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
			        System.out.println("���سɹ�");

			        String url = "jdbc:mysql://localhost:3306/teachercourse?useSSL=false";
			        String user = "root";
			        String passwd = "123456";
					Connection conn=DriverManager.getConnection(url,user,passwd);
					//�������ݿ����Ӷ���
					Statement st=conn.createStatement();
					//����SQL���ִ�ж���
				   String strSQL="delete from  dbo.Table_2 where CourseId='"+delId+"' ";
				  
				    int rs=st.executeUpdate(strSQL);
					if(rs==1) {
						JOptionPane.showMessageDialog(null,"��Ϣɾ���ɹ�");
					}
					else{
						JOptionPane.showMessageDialog(null,"��Ϣɾ��ʧ��");
					}
				    conn.close();
				   
					//�ر����ݿ�����	
				} 
				catch (ClassNotFoundException ex) {
					System.out.println("û���ҵ���Ӧ�����ݿ�������");
				}
				catch (SQLException ex) {
					System.out.println("���ݿ����ӻ��������ݿ����ʧ��");
}
}
}

