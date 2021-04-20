package day04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing02 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing02 frame = new MySwing02();
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
	public MySwing02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(24, 53, 146, 183);
		contentPane.add(ta);
		
		tf = new JTextField();
		tf.setBounds(193, 55, 78, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JLabel lbll = new JLabel("\uB2E8");
		lbll.setBounds(283, 58, 57, 15);
		contentPane.add(lbll);
		
		JButton btn = new JButton("click");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int dan = Integer.parseInt(tf.getText());
				
				for(int i=1; i<=9; i++) {
					String a = ta.getText();
					
					ta.setText(dan+" * " + i + " = " + dan*i);
					
					
					
//					String a = ta.getText();
//					int sum = dan * i;
//					ta.setText(a +"\n"+ dan+" * " + i +" = "+sum);
					
				}
				
			}
		});
		btn.setBounds(218, 86, 97, 23);
		contentPane.add(btn);
	}
}
