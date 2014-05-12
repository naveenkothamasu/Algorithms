package daily;

import java.awt.*;
import javax.swing.*;

public class myGUI extends JFrame {

	private JFrame frmCalculator;
	private JTextField textField;

	public myGUI() {
		super("Calculator");
		addFrame();

	}

	public void addFrame() {

		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBackground(Color.WHITE);
		frmCalculator.setBounds(100, 250, 250, 250);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(0, 0, 234, 20);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);

		Button button_15 = new Button("8");
		button_15.setForeground(Color.BLACK);
		button_15.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_15.setBackground(Color.WHITE);
		button_15.setBounds(60, 25, 55, 43);
		frmCalculator.getContentPane().add(button_15);

		Button button_16 = new Button("9");
		button_16.setForeground(Color.WHITE);
		button_16.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_16.setBackground(Color.BLACK);
		button_16.setBounds(120, 25, 55, 43);
		frmCalculator.getContentPane().add(button_16);

		Button button_17 = new Button("/");
		button_17.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_17.setForeground(Color.BLACK);
		button_17.setBackground(Color.WHITE);
		button_17.setBounds(180, 25, 55, 43);
		frmCalculator.getContentPane().add(button_17);

		Button button_18 = new Button("4");
		button_18.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_18.setForeground(Color.BLACK);
		button_18.setBackground(Color.WHITE);
		button_18.setBounds(0, 73, 55, 43);
		frmCalculator.getContentPane().add(button_18);

		Button button_19 = new Button("7");
		button_19.setForeground(Color.WHITE);
		button_19.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_19.setBackground(Color.BLACK);
		button_19.setBounds(0, 25, 55, 43);
		frmCalculator.getContentPane().add(button_19);

		Button button_20 = new Button("1");
		button_20.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_20.setForeground(Color.WHITE);
		button_20.setBackground(Color.BLACK);
		button_20.setBounds(0, 121, 55, 43);
		frmCalculator.getContentPane().add(button_20);

		Button button_21 = new Button("+");
		button_21.setForeground(Color.WHITE);
		button_21.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_21.setBackground(Color.BLACK);
		button_21.setBounds(179, 169, 55, 43);
		frmCalculator.getContentPane().add(button_21);

		Button button_22 = new Button(".");
		button_22.setForeground(Color.WHITE);
		button_22.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_22.setBackground(Color.BLACK);
		button_22.setBounds(60, 169, 55, 43);
		frmCalculator.getContentPane().add(button_22);

		Button button_23 = new Button("2");
		button_23.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_23.setForeground(Color.BLACK);
		button_23.setBackground(Color.WHITE);
		button_23.setBounds(60, 121, 55, 43);
		frmCalculator.getContentPane().add(button_23);

		Button button_24 = new Button("5");
		button_24.setForeground(Color.WHITE);
		button_24.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_24.setBackground(Color.BLACK);
		button_24.setBounds(60, 73, 55, 43);
		frmCalculator.getContentPane().add(button_24);

		Button button_25 = new Button("0");
		button_25.setForeground(Color.BLACK);
		button_25.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_25.setBackground(Color.WHITE);
		button_25.setBounds(0, 169, 55, 43);
		frmCalculator.getContentPane().add(button_25);

		Button button = new Button("-");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("SansSerif", Font.BOLD, 16));
		button.setBackground(Color.WHITE);
		button.setBounds(180, 121, 55, 43);
		frmCalculator.getContentPane().add(button);

		Button button_1 = new Button("*");
		button_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(179, 73, 55, 43);
		frmCalculator.getContentPane().add(button_1);

		Button button_2 = new Button("=");
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(120, 169, 55, 43);
		frmCalculator.getContentPane().add(button_2);

		Button button_3 = new Button("3");
		button_3.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_3.setForeground(Color.WHITE);
		button_3.setBackground(Color.BLACK);
		button_3.setBounds(120, 121, 55, 43);
		frmCalculator.getContentPane().add(button_3);

		Button button_4 = new Button("6");
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("SansSerif", Font.BOLD, 16));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(120, 73, 55, 43);
		frmCalculator.getContentPane().add(button_4);
	}

	public static void main(String[] args) {

		myGUI window = new myGUI();
		window.frmCalculator.setVisible(true);

	}

}
