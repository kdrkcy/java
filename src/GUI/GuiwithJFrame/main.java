
package GUI.GuiwithJFrame;
import javax.swing.JFrame;
public class main {
	public static void main(String[] args) {
		
		tuna tunaObject= new tuna();
		tunaObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tunaObject.setSize(275, 180);
		tunaObject.setVisible(true);
	}
	
}
