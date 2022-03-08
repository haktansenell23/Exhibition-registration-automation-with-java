package GUÝ;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Ana.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import DataBase.*;

public class Seramik_gui extends JFrame {
static User user=new User();

static int id_sorgu1,id_sorgu2,id_sorgu3,id_sorgu4,id_sorgu5,id_sorgu6,id_sorgu7,id_sorgu8,id_sorgu9,id_sorgu10,id_sorgu11,id_sorgu12;
DBConnection c=new DBConnection();
private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seramik_gui frame = new Seramik_gui(user);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Seramik_gui(User user) {
		setTitle("Sergi Kay\u0131t Sistemi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 668, 473);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton bttn_1 = new JButton("1");
		int sira1=1;
		bttn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				user.setsira_no(1);
				seramikekle_gui seramik=new seramikekle_gui(user);
				seramik.setVisible(true);
				dispose();	
				
				
				
				
				
			}
		});

		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu="SELECT * FROM seramik where Eser_sirasi="+sira1+"";
			ResultSet rs1=s.executeQuery(sorgu);
			while(rs1.next())
			{
		id_sorgu1=rs1.getInt("id");
				
					}
		if(id_sorgu1==0)
		{
			bttn_1.setBackground(Color.LIGHT_GRAY);
		}
		else {
			bttn_1.setBackground(Color.RED);
			bttn_1.setEnabled(false);
		}
		
			
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		
		
		bttn_1.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_1.setBounds(50, 85, 96, 42);
		panel.add(bttn_1);
		
		JButton bttn_4 = new JButton("4");
		bttn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(4);
				seramikekle_gui seramik=new seramikekle_gui(user);
				seramik.setVisible(true);
				dispose();	
				
				
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu="SELECT * FROM seramik where Eser_sirasi="+4+"";
			ResultSet rs1=s.executeQuery(sorgu);
			while(rs1.next())
			{
		id_sorgu4=rs1.getInt("id");
					}
		if(id_sorgu4==0)
		{
			bttn_4.setBackground(Color.LIGHT_GRAY);
		}
		else {
			bttn_4.setBackground(Color.RED);
			bttn_4.setEnabled(false);
		}
		
			
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		
		
		
		bttn_4.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_4.setBounds(50, 174, 96, 42);
		panel.add(bttn_4);
		
		JButton bttn_7 = new JButton("7");
		bttn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(7);
				seramikekle_gui seramik=new seramikekle_gui(user);
				seramik.setVisible(true);
				dispose();	
				
				
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu="SELECT * FROM seramik where Eser_sirasi="+7+"";
			ResultSet rs1=s.executeQuery(sorgu);
			while(rs1.next())
			{
		id_sorgu7=rs1.getInt("id");
				
					}
		if(id_sorgu7==0)
		{
			bttn_7.setBackground(Color.LIGHT_GRAY);
		}
		else {
			bttn_7.setBackground(Color.RED);
			bttn_7.setEnabled(false);
		}
		
			
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		bttn_7.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_7.setBounds(55, 251, 96, 42);
		panel.add(bttn_7);
		
		JButton bttn_10 = new JButton("10");
		bttn_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(10);
				seramikekle_gui seramik=new seramikekle_gui(user);
				seramik.setVisible(true);
				dispose();	
				
				
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu="SELECT * FROM seramik where Eser_sirasi="+10+"";
			ResultSet rs1=s.executeQuery(sorgu);
			while(rs1.next())
			{
		id_sorgu10=rs1.getInt("id");
				
					}
		if(id_sorgu10==0)
		{
			bttn_10.setBackground(Color.LIGHT_GRAY);
		}
		else {
			bttn_10.setBackground(Color.RED);
			bttn_10.setEnabled(false);
		}
		
			
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		bttn_10.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_10.setBounds(55, 333, 96, 42);
		panel.add(bttn_10);
		
		JButton bttn_2 = new JButton("2");
		bttn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(2);
				seramikekle_gui seramik=new seramikekle_gui(user);
				seramik.setVisible(true);
				dispose();	
				
				
				
				
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu="SELECT * FROM seramik where Eser_sirasi="+2+"";
			ResultSet rs1=s.executeQuery(sorgu);
			while(rs1.next())
			{
		id_sorgu2=rs1.getInt("id");
				
					}
		if(id_sorgu2==0)
		{
			bttn_2.setBackground(Color.LIGHT_GRAY);
		}
		else {
			bttn_2.setBackground(Color.RED);
			bttn_2.setEnabled(false);
		}
		
			
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		bttn_2.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_2.setBounds(250, 85, 101, 42);
		panel.add(bttn_2);
		
		JButton bttn_5 = new JButton("5");
		bttn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(5);
				seramikekle_gui seramik=new seramikekle_gui(user);
				seramik.setVisible(true);
				dispose();	
				
				
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu="SELECT * FROM seramik where Eser_sirasi="+5+"";
			ResultSet rs1=s.executeQuery(sorgu);
			while(rs1.next())
			{
		id_sorgu5=rs1.getInt("id");
				
					}
		if(id_sorgu5==0)
		{
			bttn_5.setBackground(Color.LIGHT_GRAY);
		}
		else {
			bttn_5.setBackground(Color.RED);
			bttn_5.setEnabled(false);
		}
		
			
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		
		
		bttn_5.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_5.setBounds(250, 174, 101, 42);
		panel.add(bttn_5);
		
		JButton bttn_8 = new JButton("8");
		bttn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(8);
				seramikekle_gui seramik=new seramikekle_gui(user);
				seramik.setVisible(true);
				dispose();	
				
				
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu="SELECT * FROM seramik where Eser_sirasi="+8+"";
			ResultSet rs1=s.executeQuery(sorgu);
			while(rs1.next())
			{
		id_sorgu8=rs1.getInt("id");
				
					}
		if(id_sorgu8==0)
		{
			bttn_8.setBackground(Color.LIGHT_GRAY);
		}
		else {
			bttn_8.setBackground(Color.RED);
			bttn_8.setEnabled(false);
		}
		
			
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		bttn_8.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_8.setBounds(250, 251, 101, 42);
		panel.add(bttn_8);
		
		JButton bttn_11 = new JButton("11");
		bttn_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(11);
				seramikekle_gui seramik=new seramikekle_gui(user);
				seramik.setVisible(true);
				dispose();	
				
				
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu="SELECT * FROM seramik where Eser_sirasi="+11+"";
			ResultSet rs1=s.executeQuery(sorgu);
			while(rs1.next())
			{
		id_sorgu11=rs1.getInt("id");
				
					}
		if(id_sorgu11==0)
		{
			bttn_11.setBackground(Color.LIGHT_GRAY);
		}
		else {
			bttn_11.setBackground(Color.RED);
			bttn_11.setEnabled(false);
		}
		
			
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		bttn_11.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_11.setBounds(250, 333, 101, 42);
		panel.add(bttn_11);
		
		JButton bttn_3 = new JButton("3");
		bttn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(3);
				seramikekle_gui seramik=new seramikekle_gui(user);
				seramik.setVisible(true);
				dispose();	
				
				
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu="SELECT * FROM seramik where Eser_sirasi="+3+"";
			ResultSet rs1=s.executeQuery(sorgu);
			while(rs1.next())
			{
		id_sorgu3=rs1.getInt("id");
				
					}
		if(id_sorgu3==0)
		{
			bttn_3.setBackground(Color.LIGHT_GRAY);
		}
		else {
			bttn_3.setBackground(Color.RED);
			bttn_3.setEnabled(false);
		}
		
			
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		bttn_3.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_3.setBounds(450, 85, 89, 42);
		panel.add(bttn_3);
		
		JButton bttn_6 = new JButton("6");
		bttn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(6);
				seramikekle_gui seramik=new seramikekle_gui(user);
				seramik.setVisible(true);
				dispose();	
				
				
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu="SELECT * FROM seramik where Eser_sirasi="+6+"";
			ResultSet rs1=s.executeQuery(sorgu);
			while(rs1.next())
			{
		id_sorgu6=rs1.getInt("id");
				
					}
		if(id_sorgu6==0)
		{
			bttn_6.setBackground(Color.LIGHT_GRAY);
		}
		else {
			bttn_6.setBackground(Color.RED);
			bttn_6.setEnabled(false);
		}
		
			
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		bttn_6.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_6.setBounds(450, 174, 89, 42);
		panel.add(bttn_6);
		
		JButton bttn_9 = new JButton("9");
		bttn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(9);
				seramikekle_gui seramik=new seramikekle_gui(user);
				seramik.setVisible(true);
				dispose();	
				
				
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu="SELECT * FROM seramik where Eser_sirasi="+9+"";
			ResultSet rs1=s.executeQuery(sorgu);
			while(rs1.next())
			{
		id_sorgu9=rs1.getInt("id");
				
					}
		if(id_sorgu9==0)
		{
			bttn_9.setBackground(Color.LIGHT_GRAY);
		}
		else {
			bttn_9.setBackground(Color.RED);
			bttn_9.setEnabled(false);
		}
		
			
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		bttn_9.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_9.setBounds(450, 251, 89, 42);
		panel.add(bttn_9);
		
		JButton bttn_12 = new JButton("12");
		bttn_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(12);
				seramikekle_gui seramik=new seramikekle_gui(user);
				seramik.setVisible(true);
				dispose();	
				
				
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu="SELECT * FROM seramik where Eser_sirasi="+12+"";
			ResultSet rs1=s.executeQuery(sorgu);
			while(rs1.next())
			{
		id_sorgu12=rs1.getInt("id");
				
					}
		if(id_sorgu12==0)
		{
			bttn_12.setBackground(Color.LIGHT_GRAY);
		}
		else {
			bttn_12.setBackground(Color.RED);
			bttn_12.setEnabled(false);
		}
		
			
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		bttn_12.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_12.setBounds(450, 333, 89, 42);
		panel.add(bttn_12);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setEnabled(false);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(581, 402, 23, 14);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Eser Alan\u0131 Dolu");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(445, 402, 126, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Eser Alan\u0131 Bo\u015F");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(445, 427, 126, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(581, 427, 23, 14);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Eserinizi eklemek istedi\u011Finiz eser alan\u0131na t\u0131klay\u0131n\u0131z");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 413, 386, 42);
		panel.add(lblNewLabel_2);
		Icon geri =new ImageIcon(getClass().getResource("buttonicon.png"));
		JButton btnNewButton_2 = new JButton(geri);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giris_ekraniGui java =new giris_ekraniGui(user);
				java.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(10, 23, 40, 40);
		panel.add(btnNewButton_2);
		
		
		
	}
}
