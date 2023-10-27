import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.JTable;

public class Customer {

	private JFrame frame;
	private JTextField id;
	private JPasswordField password;
	private JTextField name;
	private JTextField age;
	private JTextField phone;
	private JTextField birth;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer window = new Customer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Customer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		CustomerVO customer = new CustomerVO();
		frame = new JFrame();
		
		ImagePanel welPanel = new ImagePanel(new ImageIcon("C:/Users/hoyeo/eclipse-workspace/javaWin/image/welcome.jpg").getImage());
		welPanel.setBounds(0, 1, 1266, 730);
		frame.setSize(welPanel.getWidth(), welPanel.getHeight());
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JPanel table = new JPanel();
		table.setBounds(0, 0, 1266, 708);
		frame.getContentPane().add(table);
		table.setLayout(null);
		
		String[][] data = new String[][] {{"1","2"},{"4","5"}};
		String[] headers = new String[] {"id", "Name"};
		table_1 = new JTable(data, headers);
		table_1.setBounds(27, 24, 1093, 661);
		table.add(table_1);
		
		table.setVisible(true);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBounds(0, 0, 1266, 731);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("Welcom main");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_2.setBounds(277, 10, 590, 71);
		mainPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(116, 140, 108, 35);
		mainPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Age");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(116, 201, 108, 35);
		mainPanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Gender");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_3_1_1.setBounds(116, 274, 108, 35);
		mainPanel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Phone");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1.setBounds(587, 140, 108, 35);
		mainPanel.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Birth");
		lblNewLabel_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1.setBounds(587, 201, 108, 35);
		mainPanel.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Note");
		lblNewLabel_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1_1.setBounds(587, 274, 108, 35);
		mainPanel.add(lblNewLabel_3_1_1_1_1_1);
		
		name = new JTextField();
		name.setBounds(263, 143, 247, 35);
		mainPanel.add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(263, 201, 247, 35);
		mainPanel.add(age);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(714, 140, 247, 35);
		mainPanel.add(phone);
		
		birth = new JTextField();
		birth.setColumns(10);
		birth.setBounds(714, 201, 247, 35);
		mainPanel.add(birth);
		
		JTextArea note = new JTextArea();
		note.setBorder(new LineBorder(new Color(0, 0, 0)));
		note.setBounds(714, 283, 247, 110);
		mainPanel.add(note);
		
		JComboBox gender = new JComboBox(new String[] {"Male", "Female"});
		gender.setBounds(262, 274, 248, 40);
		mainPanel.add(gender);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameTxt = name.getText();
				String ageTxt = age.getText();
				String phoneTxt = phone.getText();
				String birthText = birth.getText();
				String noteText = note.getText();
				String genderTxt = gender.getSelectedItem().toString();
				
				customer.creatCustomer(nameTxt);
				JOptionPane.showMessageDialog(null, "save customer seccess");
				mainPanel.setVisible(false);
			}
		});
		submit.setFont(new Font("Arial", Font.BOLD, 25));
		submit.setBounds(468, 421, 212, 40);
		mainPanel.add(submit);
		
		
		frame.getContentPane().add(welPanel);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setBounds(548, 289, 118, 37);
		welPanel.add(lblNewLabel);
		
		id = new JTextField();
		id.setFont(new Font("Arial", Font.PLAIN, 20));
		id.setToolTipText("");
		id.setBounds(463, 336, 278, 37);
		welPanel.add(id);
		id.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(463, 393, 278, 37);
		welPanel.add(password);
		
		JLabel lblNewLabel_1 = new JLabel("ID : ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(422, 336, 43, 37);
		welPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("P/W : ");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(405, 393, 57, 37);
		welPanel.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("click");
				String id_v =   "phy";
				char[] pass_v =   "0000".toCharArray();
				if(id_v.equals(id.getText()) && Arrays.equals(password.getPassword(),pass_v)) {
					JOptionPane.showMessageDialog(null, "log in success");
					welPanel.setVisible(false);
					mainPanel.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "log in fail");
				}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 22));
		btnNewButton.setBounds(442, 448, 326, 52);
		welPanel.add(btnNewButton);
		
		frame.setJMenuBar(menuBar());
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public JMenuBar menuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu abourMenu = new JMenu("About");
		
		bar.add(fileMenu);
		bar.add(abourMenu);
		
		JMenuItem openFile = new JMenuItem("Open");
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		fileMenu.add(openFile);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		
		return bar;
	}
}

class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	
	public int getWidth() {
		return img.getWidth(null);
	}
	
	public int getHeight() {
		return img.getHeight(null);
	}
	
}
