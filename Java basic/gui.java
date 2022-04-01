import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog( "What\'s ur name??  ");
		JOptionPane.showMessageDialog(null,"Hello "+name);
	}
}