import javax.swing.*;
import java.awt.*;
public class Demo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Title");
		frame.setLayout(new BorderLayout());
		JButton btn = new JButton("Click Me");
		frame.setBounds(23,34,300,450);
		frame.add(btn);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
