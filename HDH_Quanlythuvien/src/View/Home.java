package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setTitle("HOME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 650);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1186, 92);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setBounds(459, 36, 268, 46);
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lblWelcome);
		
		JButton btnQuanLySach = new JButton("QU\u1EA2N L\u00DD S\u00C1CH");
		btnQuanLySach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLySach obj=new QuanLySach();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnQuanLySach.setBackground(Color.GRAY);
		btnQuanLySach.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnQuanLySach.setBounds(390, 143, 406, 54);
		contentPane.add(btnQuanLySach);
		
		JButton btnNewButton_1 = new JButton("QU\u1EA2N L\u00DD \u0110\u1ED8C GI\u1EA2");
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyDocGia obj=new QuanLyDocGia();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(390, 253, 406, 54);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("QU\u1EA2N L\u00DD PHI\u1EBEU M\u01AF\u1EE2N");
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyPhieuMuon obj=new QuanLyPhieuMuon();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(390, 363, 406, 54);
		contentPane.add(btnNewButton_2);
	}
}
