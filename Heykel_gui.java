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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import DataBase.*;

public class Heykel_gui extends JFrame {
static User user =new User();
private DBConnection c=new DBConnection();

private JPanel contentPane;
static int id_sorgu1,id_sorgu2,id_sorgu3,id_sorgu4,id_sorgu5,id_sorgu6,id_sorgu7,id_sorgu8,id_sorgu9,id_sorgu10,id_sorgu11,id_sorgu12;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Heykel_gui frame = new Heykel_gui(user);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Heykel_gui(User user) {
		setTitle("Serg\u0130 Kay\u0131t Sistemi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 726, 491);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton bttn_5 = new JButton("5");
		int sira5=5;
		bttn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(5);
				heykelekle_gui heykel=new heykelekle_gui(user);
				heykel.setVisible(true);
				dispose();
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu5="SELECT * FROM heykel where Eser_sirasi="+sira5+"";
			ResultSet rs1=s.executeQuery(sorgu5);
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
		bttn_5.setBounds(300, 162, 104, 40);
		panel.add(bttn_5);
		
		JButton bttn_8 = new JButton("8");
		int sira8=8;
		bttn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(8);
				heykelekle_gui heykel=new heykelekle_gui(user);
				heykel.setVisible(true);
				dispose();
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu8="SELECT * FROM heykel where Eser_sirasi="+sira8+"";
			ResultSet rs1=s.executeQuery(sorgu8);
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
		bttn_8.setBounds(300, 257, 104, 40);
		panel.add(bttn_8);
		
		JButton bttn_11 = new JButton("11");
		int sira11=11;
		bttn_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(11);
				heykelekle_gui heykel=new heykelekle_gui(user);
				heykel.setVisible(true);
				dispose();
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu11="SELECT * FROM heykel where Eser_sirasi="+sira11+"";
			ResultSet rs1=s.executeQuery(sorgu11);
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
		bttn_11.setBounds(300, 352, 104, 40);
		panel.add(bttn_11);
		
		JButton bttn_6 = new JButton("6");
		int sira6=6;
		bttn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(6);
				heykelekle_gui heykel=new heykelekle_gui(user);
				heykel.setVisible(true);
				dispose();
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu6="SELECT * FROM heykel where Eser_sirasi="+sira6+"";
			ResultSet rs1=s.executeQuery(sorgu6);
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
		bttn_6.setBounds(494, 162, 104, 40);
		panel.add(bttn_6);
		
		JButton bttn_9 = new JButton("9");
		int sira9=9;
		bttn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(9);
				heykelekle_gui heykel=new heykelekle_gui(user);
				heykel.setVisible(true);
				dispose();
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu9="SELECT * FROM heykel where Eser_sirasi="+sira9+"";
			ResultSet rs1=s.executeQuery(sorgu9);
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
		bttn_9.setBounds(494, 257, 104, 40);
		panel.add(bttn_9);
		
		JButton bttn_4 = new JButton("4");
		int sira4=4;
		bttn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(4);
				heykelekle_gui heykel=new heykelekle_gui(user);
				heykel.setVisible(true);
				dispose();
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu1="SELECT * FROM heykel where Eser_sirasi="+sira4+"";
			ResultSet rs1=s.executeQuery(sorgu1);
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
		bttn_4.setBounds(97, 162, 104, 40);
		panel.add(bttn_4);
		
		JButton bttn_7 = new JButton("7");
		int sira7=7;
		bttn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(7);
				heykelekle_gui heykel=new heykelekle_gui(user);
				heykel.setVisible(true);
				dispose();
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu7="SELECT * FROM heykel where Eser_sirasi="+sira7+"";
			ResultSet rs1=s.executeQuery(sorgu7);
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
		bttn_7.setBounds(97, 257, 104, 40);
		panel.add(bttn_7);
		
		JButton bttn_10 = new JButton("10");
		int sira10=10;
		bttn_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(10);
				heykelekle_gui heykel=new heykelekle_gui(user);
				heykel.setVisible(true);
				dispose();
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu10="SELECT * FROM heykel where Eser_sirasi="+sira10+"";
			ResultSet rs1=s.executeQuery(sorgu10);
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
		bttn_10.setBounds(97, 352, 104, 40);
		panel.add(bttn_10);
		
		JButton bttn_12 = new JButton("12");
		int sira12=12;
		bttn_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(12);
				heykelekle_gui heykel=new heykelekle_gui(user);
				heykel.setVisible(true);
				dispose();
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu1="SELECT * FROM heykel where Eser_sirasi="+sira12+"";
			ResultSet rs1=s.executeQuery(sorgu1);
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
		bttn_12.setBounds(494, 352, 104, 40);
		panel.add(bttn_12);
		
		JButton bttn_1 = new JButton("1");
		int sira1=1;
		bttn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(1);
				heykelekle_gui heykel=new heykelekle_gui(user);
				heykel.setVisible(true);
				dispose();
				
			}
		});
		
		
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu1="SELECT * FROM heykel where Eser_sirasi="+sira1+"";
			ResultSet rs1=s.executeQuery(sorgu1);
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
		bttn_1.setBounds(97, 73, 104, 40);
		panel.add(bttn_1);
		
		JButton bttn_2 = new JButton("2");
		int sira2=2;
		bttn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(2);
				heykelekle_gui heykel=new heykelekle_gui(user);
				heykel.setVisible(true);
				dispose();
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu2="SELECT * FROM heykel where Eser_sirasi="+sira2+"";
			ResultSet rs1=s.executeQuery(sorgu2);
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
		bttn_2.setBounds(300, 73, 104, 40);
		panel.add(bttn_2);
		
		JButton bttn_3 = new JButton("3");
		int sira3=3;
		bttn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setsira_no(3);
				heykelekle_gui heykel=new heykelekle_gui(user);
				heykel.setVisible(true);
				dispose();
			}
		});
		try {
			Connection con=c.connDB();
			Statement s=con.createStatement();
			String sorgu3="SELECT * FROM heykel where Eser_sirasi="+sira3+"";
			ResultSet rs1=s.executeQuery(sorgu3);
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
		bttn_3.setBounds(494, 73, 104, 40);
		panel.add(bttn_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(631, 421, 21, 14);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Eser Alan\u0131 Dolu");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(494, 421, 136, 14);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(631, 455, 21, 14);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Eser Alan\u0131 Bo\u015F");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(494, 455, 136, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Eserinizi eklemek istedi\u011Finiz eser alan\u0131n\u0131 t\u0131klay\u0131n\u0131z");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(33, 435, 391, 34);
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
		btnNewButton_2.setBounds(10, 11, 40, 40);
		panel.add(btnNewButton_2);
	}
}
