package GUÝ;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ana.Seramik;
import Ana.User;
import DataBase.DBConnection;
import DataBase.Helper;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class seramikekle_gui extends JFrame {
private static User user=new User();
private static Seramik seramik=new Seramik();
DBConnection conn=new DBConnection();
	private JPanel contentPane;
	private JTextField txt_eseradý;
	private JTextField txt_eserkonu;
	private JTextField txt_tabanalaný;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seramikekle_gui frame = new seramikekle_gui(user);
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
	public seramikekle_gui(User user) {
		setTitle("Sergi Kay\u0131t Sistemi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 616, 466);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txt_eseradý = new JTextField();
		txt_eseradý.setFont(new Font("Arial", Font.PLAIN, 17));
		txt_eseradý.setBounds(252, 111, 206, 34);
		panel.add(txt_eseradý);
		txt_eseradý.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Seramik Eser Ad\u0131 :");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(21, 98, 157, 57);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seramik Eser Konusu :");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(21, 174, 183, 49);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Seramik Taban Alan\u0131 :");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(21, 251, 206, 24);
		panel.add(lblNewLabel_2);
		
		txt_eserkonu = new JTextField();
		txt_eserkonu.setFont(new Font("Arial", Font.PLAIN, 17));
		txt_eserkonu.setBounds(252, 186, 206, 29);
		panel.add(txt_eserkonu);
		txt_eserkonu.setColumns(10);
		
		txt_tabanalaný = new JTextField();
		txt_tabanalaný.setFont(new Font("Arial", Font.PLAIN, 17));
		txt_tabanalaný.setBounds(252, 248, 206, 34);
		panel.add(txt_tabanalaný);
		txt_tabanalaný.setColumns(10);
		
		JButton bttn_kayýt = new JButton("KAYDET");
		bttn_kayýt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_eseradý.getText().length()==0||txt_eserkonu.getText().length()==0||txt_tabanalaný.getText().length()==0)
				{Helper.showMsg("fill");}
				seramik.setId(user.getId());
				seramik.setEser_adi(txt_eseradý.getText());
				seramik.seteser_konusu(txt_eserkonu.getText());
				seramik.setEser_sirasi(user.getsira_no());
				
				
				
				int taban;
				taban=Integer.parseInt(txt_tabanalaný.getText());
		if(seramik.taban_alani(taban)==false)
		{
			Helper.showMsg("Girmiþ olduðunuz taban alaný deðeri sergi standartlarýna uygun deðildir");
		}
		
				
					
			
				
				

				//database kayýt
				
					try {
						String sorgu="UPDATE seramik SET id="+seramik.getId()+",Eser_adi='"+seramik.getEser_adi()+"',Eser_konu='"+seramik.geteser_konusu()+"'  WHERE Eser_sirasi="+seramik.getEser_sirasi()+"";
						Connection con=conn.connDB();
						Statement ss;
						ss = con.createStatement();
						ss.executeUpdate(sorgu);
					} catch (SQLException e1) {
					
						e1.printStackTrace();
					}
				
				
				
				
			
			}
		});
		bttn_kayýt.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_kayýt.setBounds(336, 319, 122, 40);
		panel.add(bttn_kayýt);
		Icon geri =new ImageIcon(getClass().getResource("buttonicon.png"));
		JButton btnNewButton = new JButton(geri);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seramik_gui java =new Seramik_gui(user);
				java.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 24, 40, 40);
		panel.add(btnNewButton);
	}
}
