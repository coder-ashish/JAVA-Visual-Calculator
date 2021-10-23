package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class VisualCalculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualCalculator window = new VisualCalculator();
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
	public VisualCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAutoRequestFocus(false);
		frame.setBounds(100, 100, 328, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 10, 296, 91);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
				
			}
		});
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(Color.BLACK);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 177, 66, 57);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
				
			}
		});
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(Color.BLACK);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 244, 66, 57);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.BLACK);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 311, 66, 57);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
				
			}
		});
		btn0.setForeground(Color.WHITE);
		btn0.setBackground(Color.BLACK);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 378, 66, 57);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.setForeground(Color.RED);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(86, 111, 66, 57);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
				
			}
		});
		btn8.setForeground(Color.WHITE);
		btn8.setBackground(Color.BLACK);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(86, 177, 66, 57);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
				
			}
		});
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(Color.BLACK);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(86, 244, 66, 57);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
				
				
			}
		});
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.BLACK);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(86, 311, 66, 57);
		frame.getContentPane().add(btn2);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if (operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
						textField.setText(answer);
				}
				else if (operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
						textField.setText(answer);
				}
				else if (operation=="/") {
					result=first/second;
					answer=String.format("%.6f", result);
						textField.setText(answer);
				}
				else if (operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
						textField.setText(answer);
				}
				else if (operation=="%") {
					result=first*(second/100);
					answer=String.format("%.4f", result);
						textField.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(86, 378, 66, 57);
		frame.getContentPane().add(btnEqual);
		
		JButton btn00 = new JButton("00");
		btn00.setForeground(Color.WHITE);
		btn00.setBackground(Color.BLACK);
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
				
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(160, 111, 66, 57);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
				
			}
		});
		btn9.setForeground(Color.WHITE);
		btn9.setBackground(Color.BLACK);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(162, 177, 66, 57);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
				
			}
		});
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(Color.BLACK);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(160, 244, 66, 57);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
				
			}
		});
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.BLACK);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(162, 311, 66, 57);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
				
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(160, 378, 66, 57);
		frame.getContentPane().add(btnDot);
		
		JButton btnPluse = new JButton("+");
		btnPluse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnPluse.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPluse.setBounds(236, 111, 66, 57);
		frame.getContentPane().add(btnPluse);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
				
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsub.setBounds(238, 177, 66, 57);
		frame.getContentPane().add(btnsub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(236, 244, 66, 57);
		frame.getContentPane().add(btnMul);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
				
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndivide.setBounds(238, 311, 66, 57);
		frame.getContentPane().add(btndivide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
				
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(240, 378, 66, 57);
		frame.getContentPane().add(btnPercent);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if (textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
					
				}
				
				
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackspace.setBounds(10, 110, 66, 57);
		frame.getContentPane().add(btnBackspace);
	}
}
