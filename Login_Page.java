import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
 
public class Login_Page extends JFrame{
	static GraphicsConfiguration gc;
	Image img=Toolkit.getDefaultToolkit().getImage("E:\\login.jpg");
	 public Login_Page() throws IOException {
		 Component frame=null;
		 JMenu Users,Patients,Doctors,help;
		 JMenuBar mb=new JMenuBar();
		 Users=new JMenu("Users");
		 Patients=new JMenu("Patients");
		 Doctors=new JMenu("Doctors");
		 help=new JMenu("Help"); 
		 mb.add(Users);
		 mb.add(Patients);
		 mb.add(Doctors);
		 mb.add(help);
		 setJMenuBar(mb);  
		
		 setVisible(true);
		// JFrame f=new JFrame("Project",gc);
		 setVisible(true);
	      this.setContentPane(new JPanel() {
	         @Override
	         public void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            g.drawImage(img, 340, 100, null); 
	         }
	      });
	      getContentPane().setBackground(Color.DARK_GRAY);
			 pack();
			 JLabel l1=new JLabel("User name");
			 l1.setForeground(Color.white);
				l1.setFont(l1.getFont().deriveFont(25.0f));
				 l1.setBounds(30,120,140,50);
				 JTextField id=new JTextField();
				 id.setBounds(180,130,122,27);
				                                             
				JLabel l2=new JLabel("Password");
					l2.setFont(l2.getFont().deriveFont(25.0f));
					l2.setForeground(Color.white);
					 l2.setBounds(30,200,140,35);
					 JTextField p=new JTextField();
					 p.setBounds(180,205,122,27);
				//	container.add(frame); 
		JButton btnlogin=new JButton("Login");
		btnlogin.setBounds(120,280,70,30);
		btnlogin.addActionListener(new ActionListener()
				{
			       public void actionPerformed(ActionEvent e) {
			    	   String user=l1.getText();
			    	   String pad=l2.getText();
			    	   if(user=="name" && pad=="hi")
			    	   {
			    		   JOptionPane.showMessageDialog(frame,"you are sucessfully logined");
			    	   }
			    	   else {
			    		   JOptionPane.showMessageDialog(frame,"Invalid username and Password");
			    	   }
			       }
				});
	    				
	      pack();
	      add(l1);
		   add(id);
		  
		   add(l2);
		   add(p);
	      add(btnlogin);
	      setSize(1000,700);
		  
		   setResizable(false);
		   setLayout(null);
		   setVisible(true);
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
	
	public static void main(String args[])  throws Exception
	{
		new Login_Page();
		
	}
	

}
