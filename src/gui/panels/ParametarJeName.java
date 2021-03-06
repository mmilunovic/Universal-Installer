package gui.panels;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gui.model.Parameter;

public class ParametarJeName extends JPanel{

	private JTextField tf;
	
	public ParametarJeName(Parameter p){
		
		tf = new JTextField();
		tf.setPreferredSize(new Dimension(200, 30));

		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

		tf.setEditable(true);
		tf.setText(p.getValue());

		add(new JLabel("Naziv: "));
		add(tf);		
		
	}

	public JTextField getTf() {
		return tf;
	}

	public void setTf(JTextField tf) {
		this.tf = tf;
	}
	
	
}
