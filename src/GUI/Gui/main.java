package GUI.Gui;
import javax.swing.JOptionPane;
public class main {
	public static void main(String[] args) {
		
		String fn = JOptionPane.showInputDialog("enter first number");
		String sn = JOptionPane.showInputDialog("enter the second number");
		
		int num1= Integer.parseInt(fn);
		int num2= Integer.parseInt(sn);
		int sum= num1+num2;
		
		JOptionPane.showMessageDialog(null,"the answer is" +sum,"the title",JOptionPane.QUESTION_MESSAGE );
		
	}
	
}
