package GUI.JList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class tuna extends JFrame{
	private JList list;
	private static String[] colornames = {"black","blue","red","white"};
	private static Color[] colors= {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
	
	public tuna() {
		super("title");
		setLayout(new FlowLayout());
		
		list= new JList(colornames);
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
				
				new ListSelectionListener() {
					
					public void valueChanged(ListSelectionEvent event) {
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
					}
					
				}
				
				);
	
	}
	
	
}
