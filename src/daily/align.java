package daily;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.GridLayout;

public class align extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public align() {
		setTitle("Align");

		// Creates button panel with components stacked on top of eachother
		JPanel panONE = new JPanel();
		panONE.setLayout(new GridLayout(3, 1));
		panONE.add(new JButton("OK"));
		panONE.add(new JButton("CANCEL"));
		panONE.add(new JButton("HELP!"));

		// Creates a panel to hold the check boxes
		JPanel panTWO = new JPanel();
		panTWO.setLayout(new GridLayout(2, 2));
		panTWO.add(new JCheckBox("Snap To Grid"));
		panTWO.add(new JCheckBox("Show Grid"));

		// Creates a panel to hold the label and text fields
		JPanel panTHREE = new JPanel();
		panTHREE.setLayout(new GridLayout(2, 1));
		panTHREE.setSize(600, 100);
		panTHREE.add(new JLabel("X", SwingConstants.RIGHT));
		panTHREE.add(new JTextField(3));
		panTHREE.add(new JLabel("Y", SwingConstants.RIGHT));
		panTHREE.add(new JTextField(3));

		// Puts the Panels into the Container
		setLayout(new GridLayout(1, 3));
		add(panTWO);
		add(panTHREE);
		add(panONE);

	}

	public static void main(String[] args) {
		align thing = new align();
		thing.setSize(400, 200);
		thing.pack();
		thing.setLocationRelativeTo(null);
		thing.setVisible(true);
		thing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
