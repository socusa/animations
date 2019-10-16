package animations;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import static animations.MyFrame.*;

import java.awt.Dimension;

public class ControlPanel extends JPanel {
	
	public ControlPanel() {
		animate = new JButton("Animate");
		
		animate.setFont(font);
		
		add(animate);
		
		animate.addActionListener(listener);
		
		add(shape = new JRadioButton("Shape"));
		
		shape.setFont(font);
		
		shape.addItemListener(listener);
		
		add(words = new JRadioButton("Words"));
		
		words.setFont(font);
		
		words.addItemListener(listener);
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(shape);
		group.add(words);
		
		JLabel label = new JLabel("Delay in milliseconds");
		
		label.setFont(font);
		
		add(label);
		
		add(delay = new JTextField());
		
		delay.setFont(font);
		
		delay.setPreferredSize(new Dimension(100,20));
		
		delay.setText("1000");
	}

}
