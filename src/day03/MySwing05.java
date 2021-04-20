package day03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing05 extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing05 frame = new MySwing05();
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
	public MySwing05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC5D0\uC11C");
		lblNewLabel.setBounds(112, 97, 36, 42);
		contentPane.add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.setBounds(29, 108, 71, 21);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(143, 108, 51, 21);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(295, 108, 116, 21);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		JButton btn = new JButton("\uAE4C\uC9C0 \uD569\uC740");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int t1 = Integer.parseInt(tf1.getText());
				int t2 = Integer.parseInt(tf2.getText());
				int t3 = 0;
				for(int i=t1; i<=t2; i++) {
				t3 += i;
					
				}
				tf3.setText(Integer.toString(t3)); 
//				tf3.setText(t3+""); 
				
			}
		});
		btn.setBounds(207, 107, 85, 23);
		contentPane.add(btn);
	}
}
