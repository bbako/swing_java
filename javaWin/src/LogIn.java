import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	public LogIn() {
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel label2 = new JLabel("Password : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10);
		JButton btn = new JButton("Log In");
		
		panel.add(label);
		panel.add(txtID);
		panel.add(label2);
		panel.add(txtPass);
		panel.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id =   "phy";
				String pass =   "0000";
				
				if(id.equals(txtID.getText()) && pass.equals(txtPass.getText())) {
					JOptionPane.showMessageDialog(null, "log in success");
				}else {
					JOptionPane.showMessageDialog(null, "log in fail");
				}
			}
		});
		add(panel);
				
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new LogIn();
	}

}
