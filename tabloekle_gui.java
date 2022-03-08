package GUÝ;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ana.Tablo;
import Ana.User;
import DataBase.Helper;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import DataBase.DBConnection;

public class tabloekle_gui extends JFrame {
static User user=new User();
private DBConnection conn=new DBConnection();
	private JPanel contentPane;
	private JTextField txt_eser_adi;
	private JTextField txt_x;
	private JTextField txt_y;
Tablo tablo=new Tablo();
private JTextField txt_konu;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tabloekle_gui frame = new tabloekle_gui(user);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public tabloekle_gui(User user) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 581, 413);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_eseradi = new JLabel("Tablo Ad\u0131:");
		lbl_eseradi.setFont(new Font("Arial", Font.PLAIN, 17));
		lbl_eseradi.setBounds(10, 52, 152, 35);
		panel.add(lbl_eseradi);
		
		txt_eser_adi = new JTextField();
		txt_eser_adi.setFont(new Font("Arial", Font.PLAIN, 17));
		txt_eser_adi.setBounds(279, 55, 206, 29);
		panel.add(txt_eser_adi);
		txt_eser_adi.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tablonuzun eni(cm cinsinden) :");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 166, 241, 50);
		panel.add(lblNewLabel_1);
		
		txt_x = new JTextField();
		txt_x.setFont(new Font("Arial", Font.PLAIN, 17));
		txt_x.setBounds(279, 177, 206, 29);
		panel.add(txt_x);
		txt_x.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tablonuzun boyu(cm cinsinden) :");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 240, 259, 35);
		panel.add(lblNewLabel);
		
		txt_y = new JTextField();
		txt_y.setFont(new Font("Arial", Font.PLAIN, 17));
		txt_y.setBounds(279, 243, 206, 29);
		panel.add(txt_y);
		txt_y.setColumns(10);
		
		JButton bttn_kaydet = new JButton("KAYDET");
		bttn_kaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txt_eser_adi.getText().length()==0||txt_konu.getText().length()==0||txt_y.getText().length()==0)
				{Helper.showMsg("fill");}
				
				tablo.setId(user.getId());
				tablo.setEser_adi(txt_eser_adi.getText());
				tablo.seteser_konusu(txt_konu.getText());
				tablo.setEser_sirasi(user.getsira_no());
			
				int x=Integer.parseInt(txt_x.getText());
				int y=Integer.parseInt(txt_y.getText());
				if(tablo.boyut_kontrol(x, y)==true) {Helper.showMsg("Girdiðiniz en ve boy deðerleri sergi standartlarýmýzý uygun deðildir");}
			 //database kayýt
				
				try {
					
					String ad=tablo.getEser_adi();
					String eser=tablo.geteser_konusu();
					int sýra=tablo.getEser_sirasi();
					int id=tablo.getId();
					String sorgu="UPDATE tablo SET id="+tablo.getId()+",Eser_adi='"+tablo.getEser_adi()+"',Eser_konu='"+tablo.geteser_konusu()+"'  WHERE Eser_sirasi="+tablo.getEser_sirasi()+"";
					Connection con=conn.connDB();
					Statement ss=con.createStatement();		
					ss.executeUpdate(sorgu);
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
			
			
				
				
				
			}
		});
		bttn_kaydet.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_kaydet.setBounds(378, 300, 107, 35);
		panel.add(bttn_kaydet);
		
		JLabel lblNewLabel_2 = new JLabel("Tablo Konusu :");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 125, 132, 14);
		panel.add(lblNewLabel_2);
		
		txt_konu = new JTextField();
		txt_konu.setFont(new Font("Arial", Font.PLAIN, 17));
		txt_konu.setBounds(279, 110, 206, 29);
		panel.add(txt_konu);
		txt_konu.setColumns(10);
		Icon geri =new ImageIcon(getClass().getResource("buttonicon.png"));
		JButton btnNewButton = new JButton(geri);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tablo_gui java =new Tablo_gui(user);
				java.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton.setBounds(10, 11, 40, 40);
		panel.add(btnNewButton);
	}
}
