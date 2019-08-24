package GUI.JList.JListexample;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JList;

public class tuna extends JFrame {
	
	private JList rightlist;
	private JList leftlist;
	private JButton movebutton;
	public static String[] foods= {"bacon", "wings","peperoni", "boneless", "morebacon"};
	public tuna() {
		super("the title");
		setLayout(new FlowLayout());
		leftlist= new JList(foods);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		
		movebutton= new JButton("move -->");
		movebutton.addActionListener(
				
				new ActionListener () {
					public void actionPerformed(ActionEvent event) {
						rightlist.setListData(leftlist.getSelectedValues());
					}
				}
				);
		add(movebutton);
		
		rightlist=new JList();
		rightlist.setFixedCellHeight(15);
		rightlist.setFixedCellWidth(500);
		rightlist.setVisibleRowCount(3);
		add(new JScrollPane(rightlist));
		
		
		
	}
}
