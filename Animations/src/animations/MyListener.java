package animations;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import static animations.MyFrame.*;

public class MyListener implements ActionListener,ItemListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == animate) {
			
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getStateChange() == ItemEvent.SELECTED)
		   drawingPanel.repaint();
	}

}
