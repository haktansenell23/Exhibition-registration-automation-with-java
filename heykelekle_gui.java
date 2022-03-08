package GUÝ;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ana.Heykel;
import Ana.User;
import DataBase.*;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class heykelekle_gui extends JFrame {
     Heykel heykel=new Heykel();
    static User user=new User();
    DBConnection conn=new DBConnection();
	private JPanel contentPane;
	private JTextField txt_heykelad;
	private JTextField txt_heykeltaban;
	private JTextField txt_heykelkonu;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					heykelekle_gui frame = new heykelekle_gui(user);
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
	public heykelekle_gui(User user) {
		setTitle("Sergi Kay\u0131t Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Heykel Ad\u0131:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(59, 84, 150, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblHeykelTabanAlan = new JLabel("Heykel Taban Alan\u0131 :");
		lblHeykelTabanAlan.setFont(new Font("Arial", Font.PLAIN, 17));
		lblHeykelTabanAlan.setBounds(59, 251, 199, 45);
		contentPane.add(lblHeykelTabanAlan);
		
		txt_heykelad = new JTextField();
		txt_heykelad.setFont(new Font("Arial", Font.PLAIN, 17));
		txt_heykelad.setBounds(279, 90, 150, 34);
		contentPane.add(txt_heykelad);
		txt_heykelad.setColumns(10);
		
		txt_heykeltaban = new JTextField();
		txt_heykeltaban.setFont(new Font("Arial", Font.PLAIN, 17));
		txt_heykeltaban.setColumns(10);
		txt_heykeltaban.setBounds(279, 257, 150, 34);
		contentPane.add(txt_heykeltaban);
		
		JLabel lblNewLabel_1 = new JLabel("Heykel Konusu :");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(59, 171, 230, 34);
		contentPane.add(lblNewLabel_1);
		
		txt_heykelkonu = new JTextField();
		txt_heykelkonu.setFont(new Font("Arial", Font.PLAIN, 17));
		txt_heykelkonu.setColumns(10);
		txt_heykelkonu.setBounds(279, 172, 150, 34);
		contentPane.add(txt_heykelkonu);
		
		JButton btnNewButton = new JButton("KAYDET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_heykelad.getText().length()==0||txt_heykelkonu.getText().length()==0||txt_heykeltaban.getText().length()==0)
				{Helper.showMsg("fill");}
				
				heykel.setId(user.getId());
				heykel.setEser_adi(txt_heykelad.getText());
	            heykel.seteser_konusu(txt_heykelkonu.getText());
	            heykel.setEser_sirasi(user.getsira_no());
	            int taban_alani;
	           taban_alani=Integer.parseInt(txt_heykeltaban.getText());
	          if(heykel.taban_alani(taban_alani)==true)
	          {
	        Helper.showMsg("Girmiþ olduðunuz taban alaný sergi standartlarýna uygun deðil");	  
	          }
	        
	            
	            String ad=heykel.getEser_adi();
				String eser=heykel.geteser_konusu();
				int sýra=heykel.getEser_sirasi();
				int id=heykel.getId();
				
				//database kayýt
				String sorgu="UPDATE heykel SET id="+heykel.getId()+",Eser_adi='"+heykel.getEser_adi()+"',Eser_konu='"+heykel.geteser_konusu()+"'  WHERE Eser_sirasi="+heykel.getEser_sirasi()+"";
				Connection con=conn.connDB();
				Statement ss;
				try {
					ss = con.createStatement();
					ss.executeUpdate(sorgu);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
			
		
			
			
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 17));
		btnNewButton.setBounds(302, 340, 126, 40);
		contentPane.add(btnNewButton);
		Icon geri =new ImageIcon(getClass().getResource("buttonicon.png"));
		
		JButton btnNewButton_1 = new JButton(geri);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Heykel_gui java =new Heykel_gui(user);
				java.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 22, 40, 40);
		contentPane.add(btnNewButton_1);
	}

}
