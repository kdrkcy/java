package GUI.adapterClass;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;

import javax.swing.*;

public class tuna extends JFrame {

	private String details;
	private JLabel statusbar;
	
	public tuna() {
		super("the title");
		statusbar = new JLabel("this is default");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
		
		
	}
	public class Mouseclass extends MouseAdapter{
		public void mouseClicked(MouseEvent event) {
			details= String.format("you clicked %d", event.getClickCount());
			if(event.isMetaDown()) {
				details+= "with right button";
			}
			
		
			statusbar.setText(details);
		}
		
	}
	
}
