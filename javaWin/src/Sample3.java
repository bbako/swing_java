import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Sample3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Table");
		JPanel panel = new JPanel();
		String[] headings = new String[] {"Id", "Name", "Conuntry"};
		Object[][] data = new Object[][] {
			{"1", "aaaa" , "Korea"},
			{"2", "bbbb" , "France"},
			{"3", "cccc" , "Japan"}
		};
		
		
		frame.add(panel);
		JTable table = new JTable(data, headings);
		table.setPreferredScrollableViewportSize(new Dimension(700, 600));
		table.setFillsViewportHeight(true);
		
		panel.add(new JScrollPane(table));
		
		frame.setVisible(true);
		frame.setSize(800, 640);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
