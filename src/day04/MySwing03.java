package day04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing03 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing03 frame = new MySwing03();
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
	public MySwing03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(30, 27, 223, 28);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str_old = tf.getText();
				String str_new = ((JButton)e.getSource()).getText();
				tf.setText(str_old+str_new);
			}
		});
		btn1.setBounds(30, 79, 62, 23);
		contentPane.add(btn1);
		
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str_old = tf.getText();
				String str_new = ((JButton)e.getSource()).getText();
				tf.setText(str_old+str_new);
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2.setBounds(104, 79, 62, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str_old = tf.getText();
				String str_new = ((JButton)e.getSource()).getText();
				tf.setText(str_old+str_new);
			}
		});
		btn3.setBounds(178, 79, 62, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str_old = tf.getText();
				String str_new = ((JButton)e.getSource()).getText();
				tf.setText(str_old+str_new);
			}
		});
		btn4.setBounds(32, 124, 62, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str_old = tf.getText();
				String str_new = ((JButton)e.getSource()).getText();
				tf.setText(str_old+str_new);
			}
		});
		btn5.setBounds(104, 124, 67, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str_old = tf.getText();
				String str_new = ((JButton)e.getSource()).getText();
				tf.setText(str_old+str_new);
			}
		});
		btn6.setBounds(181, 124, 62, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str_old = tf.getText();
				String str_new = ((JButton)e.getSource()).getText();
				tf.setText(str_old+str_new);
			}
		});
		btn7.setBounds(30, 168, 64, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str_old = tf.getText();
				String str_new = ((JButton)e.getSource()).getText();
				tf.setText(str_old+str_new);
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(104, 168, 67, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str_old = tf.getText();
				String str_new = ((JButton)e.getSource()).getText();
				tf.setText(str_old+str_new);
			}
		});
		btn9.setBounds(181, 168, 62, 23);
		contentPane.add(btn9);
		
		JButton btn10 = new JButton("call");
		btn10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, tf.getText()+"ÀüÈ­Áß");

				
			}
		});
		btn10.setBounds(187, 211, 53, 23);
		contentPane.add(btn10);
		
		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str_old = tf.getText();
				String str_new = ((JButton)e.getSource()).getText();
				tf.setText(str_old+str_new);
			}
		});
		btn0.setBounds(104, 211, 67, 23);
		contentPane.add(btn0);
	}

}
