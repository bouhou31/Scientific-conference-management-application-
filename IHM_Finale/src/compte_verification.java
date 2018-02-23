import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class compte_verification {

	  JFrame frame;
	  JTextField tt1;
	  JTextField tt2;
	  JTextField tt5;
	  JTextField tt6;
	  JTextField tt8;
	  JTextField tt9;
	  JTextField tt10;
	  JTextField tt3;
	 JTextField tt7;
  JTextField tt0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					compte_verification window = new compte_verification();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public compte_verification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 996, 680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(-77, -25, 1286, 679);
		frame.getContentPane().add(panel);
		
		tt1 = new JTextField();
		tt1.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt1.setEditable(false);
		tt1.setForeground(new Color(75, 0, 130));
		tt1.setColumns(10);
		tt1.setBounds(291, 203, 176, 20);
		panel.add(tt1);
		
		tt2 = new JTextField();
		tt2.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt2.setEditable(false);
		tt2.setForeground(new Color(75, 0, 130));
		tt2.setColumns(10);
		tt2.setBounds(291, 246, 176, 20);
		panel.add(tt2);
		
		tt5 = new JTextField();
		tt5.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt5.setEditable(false);
		tt5.setForeground(new Color(75, 0, 130));
		tt5.setColumns(10);
		tt5.setBounds(291, 337, 176, 20);
		panel.add(tt5);
		
		tt6 = new JTextField();
		tt6.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt6.setEditable(false);
		tt6.setForeground(new Color(75, 0, 130));
		tt6.setColumns(10);
		tt6.setBounds(690, 165, 176, 20);
		panel.add(tt6);
		
		tt8 = new JTextField();
		tt8.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt8.setEditable(false);
		tt8.setForeground(new Color(75, 0, 130));
		tt8.setColumns(10);
		tt8.setBounds(690, 249, 176, 20);
		panel.add(tt8);
		
		tt9 = new JTextField();
		tt9.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt9.setEditable(false);
		tt9.setForeground(new Color(75, 0, 130));
		tt9.setColumns(10);
		tt9.setBounds(690, 293, 176, 20);
		panel.add(tt9);
		
		tt10 = new JTextField();
		tt10.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt10.setEditable(false);
		tt10.setForeground(new Color(75, 0, 130));
		tt10.setColumns(10);
		tt10.setBounds(690, 334, 176, 20);
		panel.add(tt10);
		
		JLabel label_2 = new JLabel("Nom:");
		label_2.setForeground(new Color(72, 61, 139));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(184, 206, 46, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Pr\u00E9nom:");
		label_3.setForeground(new Color(72, 61, 139));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(184, 249, 73, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Date Naissance:");
		label_4.setForeground(new Color(72, 61, 139));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(184, 290, 97, 14);
		panel.add(label_4);
		
		JLabel label_6 = new JLabel("Password:");
		label_6.setForeground(new Color(72, 61, 139));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(184, 340, 97, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Verifier Pssword:");
		label_7.setForeground(new Color(72, 61, 139));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(573, 167, 107, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("M\u00E9tier:");
		label_8.setForeground(new Color(72, 61, 139));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(573, 214, 46, 14);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Pays:");
		label_9.setForeground(new Color(72, 61, 139));
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_9.setBounds(573, 255, 46, 14);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Ville:");
		label_10.setForeground(new Color(72, 61, 139));
		label_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_10.setBounds(573, 299, 46, 14);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("E_mail:");
		label_11.setForeground(new Color(72, 61, 139));
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_11.setBounds(573, 340, 46, 14);
		panel.add(label_11);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				frame.dispose();
				
			}
		});
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(72, 61, 139));
		panel_3.setBounds(455, 481, 238, 48);
		panel.add(panel_3);
		
		JLabel lblSortir = new JLabel("Sortir");
		lblSortir.setForeground(Color.WHITE);
		lblSortir.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblSortir.setBounds(44, 11, 74, 26);
		panel_3.add(lblSortir);
		
		JLabel label_15 = new JLabel(" ");
		label_15.setIcon(new ImageIcon(compte_verification.class.getResource("/org/eclipse/wb/swing/icons8-export-filled-24.png")));
		label_15.setBounds(10, 1, 47, 50);
		panel_3.add(label_15);
		
		tt3 = new JTextField();
		tt3.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt3.setEditable(false);
		tt3.setForeground(new Color(75, 0, 130));
		tt3.setColumns(10);
		tt3.setBounds(291, 287, 176, 20);
		panel.add(tt3);
		
		tt7 = new JTextField();
		tt7.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt7.setEditable(false);
		tt7.setForeground(new Color(75, 0, 130));
		tt7.setColumns(10);
		tt7.setBounds(690, 208, 176, 20);
		panel.add(tt7);
		
		tt0 = new JTextField();
		tt0.setForeground(new Color(75, 0, 130));
		tt0.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt0.setEditable(false);
		tt0.setColumns(10);
		tt0.setBounds(291, 165, 176, 20);
		panel.add(tt0);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setForeground(new Color(72, 61, 139));
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(184, 168, 46, 14);
		panel.add(lblId);
	}
}
