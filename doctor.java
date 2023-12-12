import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Doctor {
	static GraphicsConfiguration gc;
	public Doctor()
	{
		JFrame f=new JFrame("");
		JLabel  head=new JLabel("Doctor Details");
		head.setBounds(130,30,300,30);
		head.setForeground(Color.BLUE);
		head.setFont(head.getFont().deriveFont(30.0f));
		JLabel  l1=new JLabel("Doctor ID");
		l1.setBounds(40,70,100,60);
		l1.setFont(l1.getFont().deriveFont(16.0f));
		JTextField id=new JTextField();
		id.setBounds(160,90,150,25);
		JLabel  l2=new JLabel("Full Name");
		l2.setBounds(40,138,400,30);
		l2.setFont(l2.getFont().deriveFont(16.0f));
		JTextField name=new JTextField();
		name.setBounds(160,140,150,25);
		JLabel  l3=new JLabel("Father's Name");
		l3.setBounds(40,170,150,60);
		l3.setFont(l3.getFont().deriveFont(16.0f));
		JTextField fn=new JTextField();
		fn.setBounds(160,190,150,25);
		
		JLabel  l4=new JLabel("Email ID");
		l4.setBounds(40,220,150,60);
		l4.setFont(l4.getFont().deriveFont(16.0f));
		JTextField em=new JTextField();
		em.setBounds(160,240,150,25);
		
		JLabel  l5=new JLabel("Contact no");
		l5.setBounds(40,270,150,60);
		l5.setFont(l5.getFont().deriveFont(16.0f));
		JTextField Cn=new JTextField();
		Cn.setBounds(160,290,150,25);
		
		JLabel  l6=new JLabel("Address");
		l6.setBounds(40,320,150,60);
		l6.setFont(l6.getFont().deriveFont(16.0f));
		JTextField Ad=new JTextField();
		Ad.setBounds(160,340,150,25);
		
		JLabel  l7=new JLabel("Qualifications");
		l7.setBounds(40,370,150,60);
		l7.setFont(l7.getFont().deriveFont(16.0f));
		JTextField q=new JTextField();
		q.setBounds(160,390,150,25);
		
		JLabel l8=new JLabel("Gender");
		l8.setFont(l8.getFont().deriveFont(16.0f));
		 l8.setBounds(40,435,300,30);
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(130,430,300,30);
	    JRadioButton r2 = new JRadioButton("Female");
	    r2.setBounds(130,450,300,30);
	    ButtonGroup bg=new ButtonGroup();
		
	    JLabel l9=new JLabel("Blood Group");
		 l9.setFont(l9.getFont().deriveFont(16.0f));
		 l9.setBounds(40,500,100,30);
		 String bloodgr[]= {"Select one","A+","B+","A-","B-","AB+","AB-","O-","O+"};
		 JComboBox bgr=new JComboBox(bloodgr);
		 bgr.setBounds(180,500,130,25);
		 
		 JLabel  l10=new JLabel("Date of Joining");
			l10.setBounds(40,530,150,90);
			l10.setFont(l10.getFont().deriveFont(16.0f));
			JTextField d=new JTextField("DD/MM/YYYY");
			d.setBounds(180,570,130,25);
		 
		f.add(head);
		f.add(l1);
		f.add(id);
		f.add(l2);
		f.add(name);
		f.add(l3);
		f.add(fn);
		f.add(l4);
		f.add(em);
		f.add(l5);
		f.add(Cn);
		f.add(l6);
		f.add(Ad);
		f.add(l7);
		f.add(q);
		f.add(l8);
		f.add(r1);
		f.add(r2);
		bg.add(r1);
		bg.add(r2);
		f.add(l9);
		f.add(bgr);
		f.add(l10);
		f.add(d);
		f.setSize(500,700);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setResizable(false);
	}
	public static void main(String args[])
	{
		new Doctor();
	}

}
