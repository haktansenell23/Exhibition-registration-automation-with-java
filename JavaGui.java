package GUÝ;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ana.User;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.sql.ConnectionEvent;
import javax.swing.DropMode;
import javax.swing.JTabbedPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import DataBase.*;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.SystemColor;
public class JavaGui extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lbl_baslik;
	private JTextField txtgirisEposta;
	private JPasswordField password_giris;
	private JTextField txt_adsoyad;
	private JTextField txt_kayýteposta;
	private JPasswordField password_kayýt;
	private DBConnection conn=new DBConnection();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaGui frame = new JavaGui();
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
	public JavaGui() {
		setResizable(false);
		setTitle("Sergi Kay\u0131t Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_icon = new JLabel(new ImageIcon(getClass().getResource("monalisa.png")));
		lbl_icon.setBounds(249, 43, 71, 74);
		contentPane.add(lbl_icon);
		
		lbl_baslik = new JLabel("Sergi Kay\u0131t Sistemine Ho\u015Fgeldiniz");
		lbl_baslik.setBounds(76, 11, 419, 36);
		lbl_baslik.setFont(new Font("Arial", Font.PLAIN, 25));
		lbl_baslik.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl_baslik);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 111, 694, 310);
		contentPane.add(tabbedPane);
		
		JPanel panel_giris = new JPanel();
		panel_giris.setForeground(Color.LIGHT_GRAY);
		panel_giris.setBackground(Color.WHITE);
		tabbedPane.addTab("GÝRÝÞ YAP", null, panel_giris, null);
		panel_giris.setLayout(null);
		
		JLabel lbl_giriseposta = new JLabel("Eposta :");
		lbl_giriseposta.setBounds(54, 25, 81, 36);
		lbl_giriseposta.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_giriseposta.setFont(new Font("Arial", Font.PLAIN, 19));
		panel_giris.add(lbl_giriseposta);
		
		JLabel lbl_girissifre = new JLabel("\u015Eifre :");
		lbl_girissifre.setBounds(64, 105, 71, 24);
		lbl_girissifre.setFont(new Font("Arial", Font.PLAIN, 19));
		panel_giris.add(lbl_girissifre);
		
		txtgirisEposta = new JTextField();
		txtgirisEposta.setBounds(225, 33, 304, 28);
		txtgirisEposta.setFont(new Font("Arial", Font.PLAIN, 19));
		panel_giris.add(txtgirisEposta);
		txtgirisEposta.setColumns(10);
		
		JButton bttn_giris = new JButton("G\u0130R\u0130\u015E YAP");
		bttn_giris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtgirisEposta.getText().length()==0||password_giris.getText().length()==0) {
	                Helper.showMsg("fill");
					}
				else {
				
				try {
					Connection c=conn.connDB();
					Statement s=c.createStatement();
					ResultSet rs=s.executeQuery("SELECT * FROM login");
					while(rs.next()) {
						if(txtgirisEposta.getText().equals(rs.getString("eposta"))&&password_giris.getText().equals(rs.getString("sifre")))
						{
						User user=new User();
						user.setId(rs.getInt("id"));
						user.setAdvesoyad(rs.getString("adsoyad"));
						user.setEposta(rs.getString("eposta"));
						user.setSifre(rs.getString("sifre"));
						giris_ekraniGui ekran=new giris_ekraniGui(user);
						ekran.setVisible(true);
						dispose();
						}
					
					}
					
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
				}
				
				
				
			}
		});
		bttn_giris.setBounds(397, 152, 132, 36);
		panel_giris.add(bttn_giris);
		
		password_giris = new JPasswordField();
		password_giris.setBounds(225, 107, 304, 28);
		password_giris.setFont(new Font("Arial", Font.PLAIN, 19));
		panel_giris.add(password_giris);
		
		JPanel panel_kayýtol = new JPanel();
		panel_kayýtol.setBackground(Color.WHITE);
		tabbedPane.addTab("Kayýt Ol", null, panel_kayýtol, null);
		panel_kayýtol.setLayout(null);
		
		JLabel lbl_kayýtisim = new JLabel("Ad ve  Soyad  :");
		lbl_kayýtisim.setFont(new Font("Arial", Font.PLAIN, 17));
		lbl_kayýtisim.setBounds(10, 37, 116, 52);
		panel_kayýtol.add(lbl_kayýtisim);
		
		JLabel lbl_kayýtisim_2 = new JLabel("Eposta :");
		lbl_kayýtisim_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lbl_kayýtisim_2.setBounds(10, 100, 73, 41);
		panel_kayýtol.add(lbl_kayýtisim_2);
		
		JLabel lbl_kayýtisim_2_1 = new JLabel("\u015Eifre  :");
		lbl_kayýtisim_2_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lbl_kayýtisim_2_1.setBounds(10, 145, 132, 60);
		panel_kayýtol.add(lbl_kayýtisim_2_1);
		
	
		
		txt_adsoyad = new JTextField();
		txt_adsoyad.setFont(new Font("Arial", Font.PLAIN, 17));
		txt_adsoyad.setBounds(159, 50, 258, 27);
		panel_kayýtol.add(txt_adsoyad);
		txt_adsoyad.setColumns(10);
		
		txt_kayýteposta = new JTextField();
		txt_kayýteposta.setFont(new Font("Arial", Font.PLAIN, 17));
		txt_kayýteposta.setColumns(10);
		txt_kayýteposta.setBounds(159, 107, 258, 27);
		panel_kayýtol.add(txt_kayýteposta);
		
		password_kayýt = new JPasswordField();
		password_kayýt.setFont(new Font("Arial", Font.PLAIN, 17));
		password_kayýt.setBounds(159, 162, 258, 27);
		panel_kayýtol.add(password_kayýt);
		
		JButton bttn_kayýtol = new JButton("Kay\u0131t Ol");
		bttn_kayýtol.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_kayýtol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_adsoyad.getText().length()==0||txt_kayýteposta.getText().length()==0||password_kayýt.getText().length()==0) {
			         
	                Helper.showMsg("fill");
					}
				else {
		try {
			Connection con=conn.connDB();
			Statement st=con.createStatement();
			String ad=txt_adsoyad.getText();
			String eposta=txt_kayýteposta.getText();
			String sifre=password_kayýt.getText();
			String veri="INSERT INTO login (adsoyad,eposta,sifre) VALUES('"+ad+"','"+eposta+"','"+sifre+"')";
		st.executeUpdate(veri);
		
		} catch (SQLException e1) {
		
			e1.printStackTrace();
		}
		
				
				Helper.showMsg("Baþarýlý þekilde kayýt oldunuz");
				
			}
			}
		});
		bttn_kayýtol.setBounds(10, 207, 123, 41);
		panel_kayýtol.add(bttn_kayýtol);
		
	
	
		
		
		
	
	}
}
