import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.DropMode;

public class evenement_verification {

	public JFrame frame;
	public JTextField t1;
	public JTextArea t2;
	public JTextField t4;
	public JTextField t5;
	public JTextField t6;
	public JTextField t7;
	public JTextField t8;
	public JTextField t9;
	public JTextField t10;
	public JTextField t11;
	public JTextField t12;
	public JTextField t3;
	public JLabel l1;
	 public JTextField t13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					evenement_verification window = new evenement_verification();
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
	public evenement_verification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1404, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, -166, 1372, 643);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1109, 156);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(75, 0, 130));
		panel.add(panel_1);
		
		JLabel label = new JLabel("Cr\u00E9er Evenement");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Century Gothic", Font.BOLD, 30));
		label.setBounds(77, 37, 260, 71);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 28, 57, 80);
		panel_1.add(label_1);
		
		t1 = new JTextField();
		t1.setBounds(200, 201, 164, 29);
		t1.setFont(new Font("Tahoma", Font.BOLD, 12));
		t1.setEditable(false);
		t1.setForeground(new Color(75, 0, 130));
		t1.setColumns(10);
		panel.add(t1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(200, 241, 567, 174);
		panel.add(scrollPane);
		
		t2 = new JTextArea();
		t2.setEditable(false);
		scrollPane.setViewportView(t2);
		t2.setToolTipText("");
		t2.setDropMode(DropMode.INSERT);
		t2.setFont(new Font("Tahoma", Font.BOLD, 12));
		t2.setForeground(new Color(75, 0, 130));
		t2.setColumns(40);
		
		t4 = new JTextField();
		t4.setBounds(200, 480, 164, 29);
		t4.setFont(new Font("Tahoma", Font.BOLD, 12));
		t4.setEditable(false);
		t4.setForeground(new Color(75, 0, 130));
		t4.setColumns(10);
		panel.add(t4);
		
		t5 = new JTextField();
		t5.setBounds(200, 538, 164, 29);
		t5.setFont(new Font("Tahoma", Font.BOLD, 12));
		t5.setEditable(false);
		t5.setForeground(new Color(75, 0, 130));
		t5.setColumns(10);
		panel.add(t5);
		
		t6 = new JTextField();
		t6.setBounds(923, 206, 164, 29);
		t6.setFont(new Font("Tahoma", Font.BOLD, 12));
		t6.setEditable(false);
		t6.setForeground(new Color(75, 0, 130));
		t6.setColumns(10);
		panel.add(t6);
		
		t7 = new JTextField();
		t7.setBounds(923, 264, 164, 29);
		t7.setFont(new Font("Tahoma", Font.BOLD, 12));
		t7.setEditable(false);
		t7.setForeground(new Color(75, 0, 130));
		t7.setColumns(10);
		panel.add(t7);
		
		t8 = new JTextField();
		t8.setBounds(923, 321, 164, 29);
		t8.setFont(new Font("Tahoma", Font.BOLD, 12));
		t8.setEditable(false);
		t8.setForeground(new Color(75, 0, 130));
		t8.setColumns(10);
		panel.add(t8);
		
		t9 = new JTextField();
		t9.setBounds(923, 373, 164, 29);
		t9.setFont(new Font("Tahoma", Font.BOLD, 12));
		t9.setEditable(false);
		t9.setForeground(new Color(75, 0, 130));
		t9.setColumns(10);
		panel.add(t9);
		
		t10 = new JTextField();
		t10.setBounds(923, 425, 164, 29);
		t10.setFont(new Font("Tahoma", Font.BOLD, 12));
		t10.setEditable(false);
		t10.setForeground(new Color(75, 0, 130));
		t10.setColumns(10);
		panel.add(t10);
		
		JLabel label_2 = new JLabel("Titre:");
		label_2.setBounds(10, 207, 46, 14);
		label_2.setForeground(new Color(75, 0, 130));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Discription Scientifique:");
		label_3.setBounds(10, 266, 164, 14);
		label_3.setForeground(new Color(75, 0, 130));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Metier:");
		label_4.setBounds(10, 435, 46, 14);
		label_4.setForeground(new Color(75, 0, 130));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Du:");
		label_5.setBounds(10, 487, 46, 14);
		label_5.setForeground(new Color(75, 0, 130));
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Au:");
		label_6.setBounds(10, 545, 46, 14);
		label_6.setForeground(new Color(75, 0, 130));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Lieu:");
		label_7.setBounds(826, 206, 46, 14);
		label_7.setForeground(new Color(75, 0, 130));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Ville:");
		label_8.setBounds(826, 264, 33, 14);
		label_8.setForeground(new Color(75, 0, 130));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Pays:");
		label_9.setBounds(826, 321, 46, 14);
		label_9.setForeground(new Color(75, 0, 130));
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Organization:");
		label_10.setBounds(826, 373, 87, 14);
		label_10.setForeground(new Color(75, 0, 130));
		label_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Nombre:");
		label_11.setBounds(826, 428, 58, 14);
		label_11.setForeground(new Color(75, 0, 130));
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(label_11);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(507, 574, 238, 48);
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				frame.dispose();
			}
		});
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(72, 61, 139));
		panel.add(panel_3);
		
		JLabel lblSortir = new JLabel("Sortir");
		lblSortir.setForeground(Color.WHITE);
		lblSortir.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblSortir.setBounds(85, 11, 74, 26);
		panel_3.add(lblSortir);
		
		JLabel label_15 = new JLabel(" ");
		label_15.setIcon(new ImageIcon(evenement_verification.class.getResource("/org/eclipse/wb/swing/icons8-export-filled-24.png")));
		label_15.setBounds(10, 1, 47, 50);
		panel_3.add(label_15);
		
		t11 = new JTextField();
		t11.setBounds(923, 465, 164, 29);
		t11.setFont(new Font("Tahoma", Font.BOLD, 12));
		t11.setEditable(false);
		t11.setForeground(new Color(75, 0, 130));
		t11.setColumns(10);
		panel.add(t11);
		
		JLabel label_16 = new JLabel("ID:");
		label_16.setBounds(826, 472, 58, 14);
		label_16.setForeground(new Color(75, 0, 130));
		label_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(label_16);
		
		t12 = new JTextField();
		t12.setBounds(923, 511, 164, 29);
		t12.setToolTipText("");
		t12.setFont(new Font("Tahoma", Font.BOLD, 12));
		t12.setEditable(false);
		t12.setForeground(new Color(75, 0, 130));
		t12.setColumns(10);
		panel.add(t12);
		
		JLabel label_17 = new JLabel("ROWID:");
		label_17.setBounds(826, 518, 58, 14);
		label_17.setForeground(new Color(75, 0, 130));
		label_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(label_17);
		
		t3 = new JTextField();
		t3.setBounds(200, 429, 164, 29);
		t3.setFont(new Font("Tahoma", Font.BOLD, 12));
		t3.setEditable(false);
		panel.add(t3);
		t3.setColumns(10);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setToolTipText("");
		desktopPane.setForeground(Color.BLACK);
		desktopPane.setBounds(1147, 201, 142, 123);
		panel.add(desktopPane);
		
		  l1 = new JLabel(" ");
		l1.setBounds(0, 0, 142, 123);
		desktopPane.add(l1);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String v=t13.getText();
				try
				{
					Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+v);
				}catch (Exception t)
				{
					JOptionPane.showMessageDialog(null, "error");
				}
			}
		});
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(72, 61, 139));
		panel_2.setBounds(1124, 435, 238, 48);
		panel.add(panel_2);
		
		JLabel lblAfficherDocumment = new JLabel("Afficher Documment");
		lblAfficherDocumment.setForeground(Color.WHITE);
		lblAfficherDocumment.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblAfficherDocumment.setBounds(85, 11, 143, 26);
		panel_2.add(lblAfficherDocumment);
		
		JLabel label_13 = new JLabel(" ");
		label_13.setIcon(new ImageIcon(evenement_verification.class.getResource("/org/eclipse/wb/swing/icons8-document-50.png")));
		label_13.setBounds(10, 1, 47, 50);
		panel_2.add(label_13);
		
		t13 = new JTextField();
		t13.setBounds(196, 594, -55, 20);
		panel.add(t13);
		t13.setColumns(10);
	}
}
