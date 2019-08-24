package GUI.mouseEvents;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class tuna extends JFrame{

	private JPanel mousepanel;
	private JLabel statusbar;
	
	
	public tuna() {
		super("the title");
		mousepanel= new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel,BorderLayout.CENTER);
		
		statusbar= new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		HandlerClass handler = new HandlerClass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
	
	}
		private class HandlerClass implements MouseListener, MouseMotionListener{
			public void mouseClicked(MouseEvent event) {
				statusbar.setText(String.format("mouse clicked at %d%d",event.getX(),event.getY() ));
			}
			public void mousePressed(MouseEvent event) {
				statusbar.setText("mouse  pressed");
			}
			public void mouseReleased(MouseEvent event) {
				statusbar.setText("mouse  released");
			}
			public void mouseEntered(MouseEvent event) {
				statusbar.setText("mouse  entered");
				mousepanel.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent event) {
				statusbar.setText("mouse  exited");
				mousepanel.setBackground(Color.WHITE);
			}
			public void mouseMoved(MouseEvent event) {
				statusbar.setText("mouse  moved");
			}
			public void mouseDragged(MouseEvent event) {
				statusbar.setText("mouse dragged");
			}
			
			
		}
		
	
}
