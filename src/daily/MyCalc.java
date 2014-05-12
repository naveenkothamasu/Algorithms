package daily;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyCalc extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyCalc().MyCalculator();

	}

	protected void MyCalculator() {

		// Objects, variables
		boolean flag = false;
		int b = 0;
		JButton[] button = new JButton[16];
		Font font = new Font("SanSerif", Font.BOLD, 16);
		String[] buttonChar = { "7", "8", "9", "/", "4", "5", "6", "*", "1",
				"2", "3", "-", "0", ".", "=", "+" };

		// Design frame
		final JFrame frame = new JFrame("Calculator");
		frame.setSize(250, 250);
		frame.setResizable(false);
		frame.setLocation(500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea display = new JTextArea(1, 1);// JTextArea(int rows, int
												// columns)
		display.setFont(font);
		display.setEditable(false);
		display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		// Create buttonPanel
		JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));

		// add buttons to panel with grid
		for (int i = 0; i < 16; i++) {
			button[i] = new JButton();
			button[i].setText(buttonChar[i]);
			button[i].setFont(font);
			switch (i) {
			case 0:
				button[i].setBackground(Color.white);
				button[i].setForeground(Color.black);
				break;
			case 1:
				button[i].setBackground(Color.black);
				button[i].setForeground(Color.white);
				break;
			case 2:
				button[i].setBackground(Color.white);
				button[i].setForeground(Color.black);
				break;
			case 3:
				button[i].setBackground(Color.black);
				button[i].setForeground(Color.white);
				break;
			case 4:
				button[i].setBackground(Color.black);
				button[i].setForeground(Color.white);
				break;
			case 5:
				button[i].setBackground(Color.white);
				button[i].setForeground(Color.black);
				break;
			case 6:
				button[i].setBackground(Color.black);
				button[i].setForeground(Color.white);
				break;
			case 7:
				button[i].setBackground(Color.white);
				button[i].setForeground(Color.black);
				break;
			case 8:
				button[i].setBackground(Color.white);
				button[i].setForeground(Color.black);
				break;
			case 9:
				button[i].setBackground(Color.black);
				button[i].setForeground(Color.white);
				break;
			case 10:
				button[i].setBackground(Color.white);
				button[i].setForeground(Color.black);
				break;
			case 11:
				button[i].setBackground(Color.black);
				button[i].setForeground(Color.white);
				break;
			case 12:
				button[i].setBackground(Color.black);
				button[i].setForeground(Color.white);
				break;
			case 13:
				button[i].setBackground(Color.white);
				button[i].setForeground(Color.black);
				break;
			case 14:
				button[i].setBackground(Color.black);
				button[i].setForeground(Color.white);
				break;
			case 15:
				button[i].setBackground(Color.white);
				button[i].setForeground(Color.black);
				break;
			}
			buttonPanel.add(button[i]);
		}

		// Adds panel and buttons to frame.
		frame.add(display, BorderLayout.NORTH);
		frame.add(buttonPanel);
		frame.setVisible(true);

	}

}
