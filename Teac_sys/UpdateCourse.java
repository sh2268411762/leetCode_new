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
import java.sql.SQLException;
import java.sql.Statement;
  public  class UpdateCourse extends JPanel implements ActionListener {
	  
	   JLabel Idlabel;
	   JLabel Namelabel;
	   JLabel Daikelabel;
	   JLabel Phonelabel;
	   JTextField Idtext;
	   JTextField Nametext;
	   JTextField Daiketext;
	   JTextField Phonetext;
	   JButton Updatebt;
	   JScrollPane scrollpane;
	   JTable table;
		
	    public UpdateCourse() {
		   this.setSize(650,350);
		   this.setLocation(100, 20);
		   this.setLayout(null);
	       this.setBackground(Color.lightGray);
	      
	       
	        Idlabel=new JLabel("�������ʦ����");
			Idlabel.setSize(100,30);
			Idlabel.setLocation(60, 20);
			
			this.add(Namelabel);
			
			Idtext=new JTextField();
			Idtext.setSize(120,30);
			Idtext.setLocation(180, 20);
			this.add(Idtext);
			
			Namelabel=new JLabel("�������ڿν�ʦ");
			Namelabel.setSize(100,30);
			Namelabel.setLocation(60, 60);
			this.add(Namelabel);
			
			Nametext=new JTextField();
			Nametext.setSize(120,30);
			Nametext.setLocation(180, 60);
			this.add(Nametext);
			
			Daikelabel=new JLabel("��ѡ��γ�����");
			Daikelabel.setSize(100,30);
			Daikelabel.setLocation(60, 100);
			this.add(Daikelabel);
			
			Daiketext=new JTextField();
			Daiketext.setSize(120,30);
			Daiketext.setLocation(180, 100);
			this.add(Daiketext);
			
			 Updatebt=new JButton("�޸�");
			 Updatebt.setSize(80,30);
			 Updatebt.setLocation(350, 80);
			 this.add( Updatebt);  
			 Updatebt.addActionListener(this);
			
			Phonelabel=new JLabel("������γ�ѧ��");
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
			String updateId=Idtext.getText();
			String updateName=Nametext.getText();
			String updateDaike=Daiketext.getText();
			String updatePhone=Phonetext.getText();
		
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
	   String  strSQL1="update dbo.Table_2 set CourseName='"+updateName+"' where CourseName='"+updateName+"'";
	   String  strSQL2="update dbo.Table_2 set CourseDaike='"+updateDaike+"' where CourseName='"+updateDaike+"'";
	   String  strSQL3="update dbo.Table_2 set CoursePhone='"+updatePhone+"' where CourseName='"+updatePhone+"'";
	
		int rs1=st.executeUpdate(strSQL1);
		int rs2=st.executeUpdate(strSQL2);
		int rs3=st.executeUpdate(strSQL3);
		if(rs1==1&&rs2==1&&rs3==1) {
			JOptionPane.showMessageDialog(null,"��Ϣ�޸ĳɹ�");
		}
		else{
			JOptionPane.showMessageDialog(null,"��Ϣ�޸�ʧ��");
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

