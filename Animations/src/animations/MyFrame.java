package animations;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	protected static DrawingPanel drawingPanel;
	protected static ControlPanel controlPanel;
	protected static JButton animate;
	protected static MyListener listener;
	protected static JTextField delay;
	protected static Font font;
	protected static JRadioButton shape;
	protected static JRadioButton words;
	protected static JComboBox<String> fonts;
	
	public MyFrame(String title) {
		super(title);
		
		setLayout(new FlowLayout());

		listener = new MyListener();
		
		font = new Font("Comic Sans MS",Font.BOLD,20);
		
		add(drawingPanel = new DrawingPanel(500,400));
		add(controlPanel = new ControlPanel());
		
		controlPanel.setPreferredSize(new Dimension(500,120));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame myFrame = new MyFrame("My Frame");
		
		myFrame.setResizable(false);
		
		myFrame.setSize(530,600);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}

}
