package zerhaz.swingApp;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DetailsPanel extends JPanel {

	public DetailsPanel() {
		super();
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("Personal Details"));
		
		JLabel nameLabel = new JLabel("Name: ");
		JLabel occupationLabel = new JLabel("Occupation: ");
		
		JTextField nameField = new JTextField(10);
		JTextField occupationField = new JTextField(10);
		
		JButton addBtn = new JButton("ADD");
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		//first row
		gc.anchor = GridBagConstraints.LINE_END;
		gc.weightx = 0.5;
		gc.weighty = 0.5;
		gc.gridx = 0;
		gc.gridy= 0;
		add(nameLabel, gc);
		
		gc.gridx = 0;
		gc.gridy= 1;
		add(occupationLabel, gc);
		
		//second row
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy= 0;
		add(nameField, gc);
		
		gc.gridx = 1;
		gc.gridy= 1;
		add(occupationField, gc);
		
		//third row
		gc.weighty = 10;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.gridx = 1;
		gc.gridy= 2;
		add(addBtn, gc);
		
	}
	

}
