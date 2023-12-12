import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Room extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Room frame = new Room();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Room() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("New label");
		   getContentPane().setLayout(null);
		   
		   JLabel lblNewLabel_1 = new JLabel("Room Info");
		   lblNewLabel_1.setBounds(29, 27, 65, 19);
		   getContentPane().add(lblNewLabel_1);
		   
		   JLabel lblNewLabel_1_1 = new JLabel("Room No");
		   lblNewLabel_1_1.setBounds(29, 64, 65, 19);
		   getContentPane().add(lblNewLabel_1_1);
		   
		   JLabel lblNewLabel_1_2 = new JLabel("RoomType");
		   lblNewLabel_1_2.setBounds(29, 104, 65, 19);
		   getContentPane().add(lblNewLabel_1_2);
		   
		   JLabel lblNewLabel_1_3 = new JLabel("Room Charges/day");
		   lblNewLabel_1_3.setBounds(29, 144, 97, 19);
		   getContentPane().add(lblNewLabel_1_3);
		   
		   textField = new JTextField();
		   textField.setBounds(115, 63, 86, 20);
		   getContentPane().add(textField);
		   textField.setColumns(10);
		   
		   textField_1 = new JTextField();
		   textField_1.setColumns(10);
		   textField_1.setBounds(140, 143, 86, 20);
		   getContentPane().add(textField_1);
		   
		   JComboBox comboBox = new JComboBox();
		   comboBox.setModel(new DefaultComboBoxModel(new String[] {"General", "A/C", "Non A/C"}));
		   comboBox.setBounds(115, 103, 72, 20);
		   getContentPane().add(comboBox);
		   
		   JButton btnNewButton = new JButton("Save");
		   btnNewButton.addActionListener(new ActionListener() {
		   	public void actionPerformed(ActionEvent e) {
		   	}
		   });
		   btnNewButton.setBounds(140, 204, 89, 23);
		   getContentPane().add(btnNewButton);
	}
}
