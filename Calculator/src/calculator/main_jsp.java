package calculator;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class main_jsp extends JFrame {
	
	private JPanel contentPane;
	private JTextField textArea;
	private JButton num2_Bt;
	private JButton num3_Bt;
	private JButton num4_Bt;
	private JButton num5_Bt;
	private JButton num6_Bt;
	private JButton num7_Bt;
	private JButton num8_Bt;
	private JButton num9_Bt;
	private JButton num0_Bt;
	private JButton plus_Bt;
	private JButton sub_bt;
	private JButton multi_bt;
	private JButton devide_bt;
	private JButton result_bt;
	private CalcuatorController cal;
	String nData;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_jsp frame = new main_jsp();
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

	public main_jsp() {
		cal = new CalcuatorController();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textArea = new JTextField();
		textArea.setText("0");
		textArea.setBounds(32, 10, 261, 31);
		contentPane.add(textArea);
		textArea.setColumns(10);
		nData = textArea.getText();
		
		JButton num1_Bt = new JButton("1");
		num1_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		num1_Bt.setBounds(32, 53, 45, 45);
		contentPane.add(num1_Bt);

		num2_Bt = new JButton("2");
		num2_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		num2_Bt.setBounds(84, 53, 45, 45);
		contentPane.add(num2_Bt);

		num3_Bt = new JButton("3");
		num3_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		num3_Bt.setBounds(136, 53, 45, 45);
		contentPane.add(num3_Bt);

		num4_Bt = new JButton("4");
		num4_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		num4_Bt.setBounds(32, 99, 45, 45);
		contentPane.add(num4_Bt);

		num5_Bt = new JButton("5");
		num5_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		num5_Bt.setBounds(84, 99, 45, 45);
		contentPane.add(num5_Bt);

		num6_Bt = new JButton("6");
		num6_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		num6_Bt.setBounds(136, 99, 45, 45);
		contentPane.add(num6_Bt);

		num7_Bt = new JButton("7");
		num7_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		num7_Bt.setBounds(32, 149, 45, 45);
		contentPane.add(num7_Bt);

		num8_Bt = new JButton("8");
		num8_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		num8_Bt.setBounds(84, 149, 45, 45);
		contentPane.add(num8_Bt);

		num9_Bt = new JButton("9");
		num9_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		num9_Bt.setBounds(136, 149, 45, 45);
		contentPane.add(num9_Bt);

		num0_Bt = new JButton("0");
		num0_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		num0_Bt.setBounds(84, 199, 45, 45);
		contentPane.add(num0_Bt);

		plus_Bt = new JButton("+");
		plus_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		plus_Bt.setBounds(201, 53, 45, 45);
		contentPane.add(plus_Bt);

		sub_bt = new JButton("-");
		sub_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		sub_bt.setBounds(201, 99, 45, 45);
		contentPane.add(sub_bt);

		multi_bt = new JButton("*");
		multi_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		multi_bt.setBounds(201, 149, 45, 45);
		contentPane.add(multi_bt);

		devide_bt = new JButton("/");
		devide_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		devide_bt.setBounds(201, 199, 45, 45);
		contentPane.add(devide_bt);

		result_bt = new JButton("=");
		result_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		result_bt.setBounds(253, 53, 45, 190);
		contentPane.add(result_bt);

		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(cal.eventController(e));
			}
		});
		clear.setBounds(136, 199, 45, 45);
		contentPane.add(clear);
	}
}
