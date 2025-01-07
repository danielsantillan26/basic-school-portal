package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class Panel11TeacherMessageEdits extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel centerPanel;
	private SpringLayout sl;
	
	public Panel11TeacherMessageEdits() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelTeacherEdits = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("TEACHER_MESSAGE_EDITS_HEADER.png")));
		northPanel.add(labelTeacherEdits);
		add(northPanel, BorderLayout.NORTH);
	}
	
	
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);
		
		JLabel enterClass = new JLabel("Enter Class");
		enterClass.setFont(GraphicsConstants.montserratBold30);
		
		JComboBox<String> selectClass = new JComboBox<String>();
		
		JLabel enterMessage = new JLabel("Enter your message:");
		enterMessage.setFont(GraphicsConstants.montserratBold30);
	
		JTextArea givenMessage = new JTextArea();
		givenMessage.setFont(GraphicsConstants.montserratBold30);
		givenMessage.setPreferredSize(new Dimension(800, 550));
		givenMessage.setLineWrap(true);
		
		centerPanel.add(enterClass);
		centerPanel.add(selectClass);
		centerPanel.add(enterMessage);
		centerPanel.add(givenMessage);
		
		sl.putConstraint(SpringLayout.WEST, enterClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterClass, 40, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, selectClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, selectClass, 100, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterMessage, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterMessage, 150, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenMessage, 450, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, givenMessage, 50, SpringLayout.NORTH, centerPanel);
		
		add(centerPanel, BorderLayout.CENTER);
		
	}
	
	
	public void addChangePageButtons(JButton goHome) {
		centerPanel.add(goHome);
		sl.putConstraint(SpringLayout.WEST, goHome, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, goHome, 550, SpringLayout.NORTH, centerPanel);
	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Panel11TeacherMessageEdits [centerPanel=" + centerPanel + ", sl=" + sl + "]";
	}

}
