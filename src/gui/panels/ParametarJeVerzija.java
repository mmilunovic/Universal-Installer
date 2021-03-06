package gui.panels;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gui.model.Parameter;

public class ParametarJeVerzija extends JPanel {

	private JTextField tf;

	public ParametarJeVerzija(Parameter p) {

		tf = new JTextField();
		tf.setPreferredSize(new Dimension(200, 30));

		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

		tf.setText(p.getValue());
		tf.setEditable(true);

		add(new JLabel("Verzija modula: "));
		add(tf);
	}

	public JTextField getTf() {
		return tf;
	}

	public void setTf(JTextField tf) {
		this.tf = tf;
	}

}
