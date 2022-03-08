package GUÝ;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ana.Tablo;
import Ana.User;
import DataBase.DBConnection;

import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import DataBase.*;
import java.awt.SystemColor;



public class giris_ekraniGui extends JFrame {
    static User user=new User();
	private JPanel pane_giris_ekrani;
	private JTable table;
	DBConnection conn=new DBConnection();
DefaultTableModel model=new DefaultTableModel();
String[] sutunlar= {"Eser Adý","Eser Konusu","Eser Sýrasý","Eser Türü"};
Object[]satirlar= new Object[4];

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giris_ekraniGui frame = new giris_ekraniGui(user);
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
	public giris_ekraniGui(User user) {
		setResizable(false);
		setTitle("Sergi Kay\u0131t Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 631);
		pane_giris_ekrani = new JPanel();
		pane_giris_ekrani.setBackground(Color.WHITE);
		pane_giris_ekrani.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane_giris_ekrani);
		pane_giris_ekrani.setLayout(null);
		
		JLabel lbl_kullaniciekrani = new JLabel("Ho\u015Fgeldin, "+user.getAdvesoyad());
		lbl_kullaniciekrani.setBounds(262, 26, 359, 21);
		lbl_kullaniciekrani.setFont(new Font("Arial", Font.PLAIN, 17));
		pane_giris_ekrani.add(lbl_kullaniciekrani);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 65, 738, 537);
		pane_giris_ekrani.add(panel);
		panel.setLayout(null);
		String eser_tur[]= {"Tablo","Heykel","Seramik"};
		
		JButton btnNewButton = new JButton("Seramik Eser Ekle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seramik_gui tablo=new Seramik_gui(user);
				tablo.setVisible(true);
				dispose();
						
				
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 17));
		btnNewButton.setBounds(540, 324, 175, 43);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 521, 537);
		panel.add(scrollPane);
		
		table = new JTable();
	
		model.setColumnIdentifiers(sutunlar);
		model.addRow(satirlar);
		
		
		JButton bttn_guncelle = new JButton("G\u00FCncelle/G\u00F6r\u00FCnt\u00FCle");
		bttn_guncelle.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_guncelle.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				ResultSet rs;
				
				for(int j=0;j<3;j++)
				{
				
					if(j==0)
					{
						
						String str="select * from tablo where id="+user.getId()+"";
						rs=Helper.dbsorgu(str, j);
						try {
							while(rs.next()) {
								
							satirlar[0]=rs.getString("Eser_adi");
							satirlar[1]=rs.getString("Eser_konu");
							satirlar[2]=rs.getString("Eser_sirasi");
						    satirlar[3]=rs.getString("Eser_tür");
							model.addRow(satirlar);
								
								
							}
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
					
					}
					if(j==1)
					{
						
						String str="select * from heykel where id="+user.getId()+"";
						rs=Helper.dbsorgu(str, j);
						try {
							while(rs.next()) {
								
							satirlar[0]=rs.getString("Eser_adi");
							satirlar[1]=rs.getString("Eser_konu");
							satirlar[2]=rs.getString("Eser_sirasi");
							 satirlar[3]=rs.getString("Eser_tür");
							model.addRow(satirlar);
								
								
							}
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
								
						
					}
					if(j==2)
					{
						String str="select * from seramik where id="+user.getId()+"";
						rs=Helper.dbsorgu(str, j);
						try {
							while(rs.next()) {
								
							satirlar[0]=rs.getString("Eser_adi");
							satirlar[1]=rs.getString("Eser_konu");
							satirlar[2]=rs.getString("Eser_sirasi");
							 satirlar[3]=rs.getString("Eser_tür");
							model.addRow(satirlar);
								
								
							}
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
						
					}
					
				}
	
				
			
		   bttn_guncelle.setEnabled(false);
			}
		});
		
		
		table.setModel(model);
		scrollPane.setViewportView(table);
		bttn_guncelle.setBounds(540, 392, 175, 43);
		panel.add(bttn_guncelle);
		
		JButton bttn_tabloekle = new JButton("Tablo Eser Ekle");
		bttn_tabloekle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
				
				
		Tablo_gui tablo=new Tablo_gui(user);
		tablo.setVisible(true);
		dispose();
				
				
				
			}
		});
		
		bttn_tabloekle.setFont(new Font("Arial", Font.PLAIN, 17));
		bttn_tabloekle.setBounds(540, 185, 175, 43);
		panel.add(bttn_tabloekle);
		
		JButton btnNewButton_1 = new JButton("Heykel Eser Ekle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Heykel_gui tablo=new Heykel_gui(user);
				tablo.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 17));
		btnNewButton_1.setBounds(540, 259, 175, 43);
		panel.add(btnNewButton_1);
		Icon geri =new ImageIcon(getClass().getResource("buttonicon.png"));
		JButton btnNewButton_2 = new JButton(geri);
		btnNewButton_2.setForeground(SystemColor.activeCaption);
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setBounds(10, 11, 38, 38);
		pane_giris_ekrani.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JavaGui java =new JavaGui();
				java.setVisible(true);
				dispose();
				
				
			}
		});
		
		
		
		
		
		
		

	}
}
