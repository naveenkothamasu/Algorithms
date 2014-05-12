package daily;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Alignment {
	private JFrame frame;
	private JButton okJButton;
	private JButton cancelJButton;
	private JButton helpJButton;
	private JTextField xJTextField;
	private JTextField yJTextField;
	private JCheckBox snapJCheckBox;
	private JCheckBox showJCheckBox;
	private JLabel xJLabel;
	private JLabel yJLabel;
	private JPanel checkJPanel;
	private JPanel buttonJPanel;
	private JPanel fieldJPanel1;
	private JPanel fieldJPanel2;
	private JPanel fieldJPanel;

	// constructor sets up GUI
	public Alignment() {
		// build checkJPanel
		snapJCheckBox = new JCheckBox("Snap to Grid");
		showJCheckBox = new JCheckBox("Show Grid");
		checkJPanel = new JPanel();
		checkJPanel.setLayout(new GridLayout(2, 1)); // use gridlayout
		checkJPanel.add(snapJCheckBox); // add snap checkbox
		checkJPanel.add(showJCheckBox); // add show checkbox

		// build field panel1
		xJLabel = new JLabel("X: ");
		xJTextField = new JTextField("8", 3); // set width of textfield 
		fieldJPanel1 = new JPanel();
		fieldJPanel1.setLayout(new FlowLayout()); // use flowlayout
		fieldJPanel1.add(xJLabel);
		fieldJPanel1.add(xJTextField);

		// build field panel2
		yJLabel = new JLabel("Y: ");
		yJTextField = new JTextField("8", 3); // set width of textfield
		fieldJPanel2 = new JPanel();
		fieldJPanel2.setLayout(new FlowLayout()); // use flowlayout
		fieldJPanel2.add(yJLabel);
		fieldJPanel2.add(yJTextField);

		// build field panel
		fieldJPanel = new JPanel();
		fieldJPanel.setLayout(new BorderLayout()); // use border layout
		fieldJPanel.add(fieldJPanel1, BorderLayout.NORTH);
		fieldJPanel.add(fieldJPanel2, BorderLayout.SOUTH);

		// build button panel
		okJButton = new JButton("Ok");
		cancelJButton = new JButton("Cancel");
		helpJButton = new JButton("Help");
		buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new GridLayout(3, 1, 10, 5));
		buttonJPanel.add(okJButton);
		buttonJPanel.add(cancelJButton);
		buttonJPanel.add(helpJButton);

		// use flowlayout center-aligned and add components
		frame = new JFrame("Align");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		frame.add(checkJPanel);
		frame.add(fieldJPanel);
		frame.add(buttonJPanel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Alignment align = new Alignment();
	}
}
