import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class inscription_verification {

	  JFrame frame;
	  JTextField tt2;
	  JTextField tt3;
	  JTextField tt6;
	  JTextField tt7;
	  JTextField tt8;
	  JTextField tt4;
	 JTextField tt5;
	  JTextField tt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inscription_verification window = new inscription_verification();
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
	public inscription_verification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 895, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 879, 679);
		frame.getContentPane().add(panel);
		
		tt2 = new JTextField();
		tt2.setForeground(new Color(75, 0, 130));
		tt2.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt2.setEditable(false);
		tt2.setColumns(10);
		tt2.setBounds(199, 201, 176, 20);
		panel.add(tt2);
		
		tt3 = new JTextField();
		tt3.setForeground(new Color(75, 0, 130));
		tt3.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt3.setEditable(false);
		tt3.setColumns(10);
		tt3.setBounds(199, 244, 176, 20);
		panel.add(tt3);
		
		tt6 = new JTextField();
		tt6.setForeground(new Color(75, 0, 130));
		tt6.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt6.setEditable(false);
		tt6.setColumns(10);
		tt6.setBounds(585, 204, 176, 20);
		panel.add(tt6);
		
		tt7 = new JTextField();
		tt7.setForeground(new Color(75, 0, 130));
		tt7.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt7.setEditable(false);
		tt7.setColumns(10);
		tt7.setBounds(585, 248, 176, 20);
		panel.add(tt7);
		
		tt8 = new JTextField();
		tt8.setForeground(new Color(75, 0, 130));
		tt8.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt8.setEditable(false);
		tt8.setColumns(10);
		tt8.setBounds(585, 289, 176, 20);
		panel.add(tt8);
		
		JLabel label_1 = new JLabel("Pr\u00E9nom:");
		label_1.setForeground(new Color(72, 61, 139));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(79, 204, 73, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Date Naissance:");
		label_2.setForeground(new Color(72, 61, 139));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(79, 247, 97, 14);
		panel.add(label_2);
		
		JLabel label_6 = new JLabel("M\u00E9tier:");
		label_6.setForeground(new Color(72, 61, 139));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(468, 247, 46, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Pays:");
		label_7.setForeground(new Color(72, 61, 139));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(79, 292, 46, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Ville:");
		label_8.setForeground(new Color(72, 61, 139));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(468, 166, 46, 14);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("E_mail:");
		label_9.setForeground(new Color(72, 61, 139));
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_9.setBounds(468, 295, 46, 14);
		panel.add(label_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				frame.dispose();
			}
		});
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBounds(403, 426, 238, 48);
		panel.add(panel_1);
		
		JLabel label_10 = new JLabel("Sortir");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Century Gothic", Font.BOLD, 13));
		label_10.setBounds(48, 11, 74, 26);
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel(" ");
		label_11.setIcon(new ImageIcon(inscription_verification.class.getResource("/org/eclipse/wb/swing/icons8-export-filled-24.png")));
		label_11.setBounds(10, 1, 47, 50);
		panel_1.add(label_11);
		
		tt4 = new JTextField();
		tt4.setForeground(new Color(75, 0, 130));
		tt4.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt4.setEditable(false);
		tt4.setColumns(10);
		tt4.setBounds(199, 285, 176, 20);
		panel.add(tt4);
		
		tt5 = new JTextField();
		tt5.setForeground(new Color(75, 0, 130));
		tt5.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt5.setEditable(false);
		tt5.setColumns(10);
		tt5.setBounds(585, 163, 176, 20);
		panel.add(tt5);
		
		tt1 = new JTextField();
		tt1.setForeground(new Color(51, 0, 102));
		tt1.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt1.setEditable(false);
		tt1.setColumns(10);
		tt1.setBounds(199, 163, 176, 20);
		panel.add(tt1);
		
		JLabel lblNom = new JLabel("NOM:");
		lblNom.setForeground(new Color(72, 61, 139));
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNom.setBounds(79, 169, 46, 14);
		panel.add(lblNom);
		
		JLabel lblEvenement = new JLabel("Evenement:");
		lblEvenement.setForeground(new Color(72, 61, 139));
		lblEvenement.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEvenement.setBounds(466, 204, 73, 14);
		panel.add(lblEvenement);
	}

}
