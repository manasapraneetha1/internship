import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 import java.util.Calendar;
 import java.util.GregorianCalendar;
 
 import java.text.SimpleDateFormat;
 import java.util.Date;
class Main 
{
	 static GraphicsConfiguration gc;
	// public JComboBox birthDate,birthMonth,birthYear;
	
	 public void form()
	 {
		 
		 JFrame f=new JFrame("Project",gc);
		 f.getContentPane().setBackground(Color.MAGENTA);
		 f.pack();
		 f.setVisible(true); 
		 JPanel p=new JPanel();
		 JLabel l=new JLabel("Medical Information Form");
		
		 l.setBounds(130,30,300,30);
		 l.setForeground(Color.BLUE);
		 l.setFont(l.getFont().deriveFont(27.0f));
		
		
		 JLabel l2=new JLabel("Fill out your medical information carefully");
         l2.setBounds(10,20,30,30);
		 JLabel fname=new JLabel("Patient Name");
		 fname.setFont(fname.getFont().deriveFont(14.0f));
		 fname.setBounds(40,78,400,30);
;
		JTextField tname=new JTextField("First Name");
		tname.setBounds(140,80,120,25);
		JTextField tlast=new JTextField("Last Name");
		tlast.setBounds(270,80,120,25);
		  
		 JLabel pnum=new JLabel("Phone Number");
		 pnum.setFont(pnum.getFont().deriveFont(14.0f));
		 pnum.setBounds(40,128,400,30);
	    JTextField tnum=new JTextField("Phone Number");
	    tnum.setBounds(160,128,120,28);
	    
		 JLabel birth=new JLabel("Birth Date");
		 birth.setFont(birth.getFont().deriveFont(14.0f));
		 birth.setBounds(40,178,400,30);
		 JComboBox combo = new JComboBox();
		 combo.setBounds(140,178,100,30);
		    GregorianCalendar calendar = new GregorianCalendar();
		    combo.addItem(calendar.getTime());

		    calendar.roll(GregorianCalendar.DAY_OF_MONTH, 1);
		    combo.addItem(calendar.getTime());

		    combo.setRenderer(new DateComboBoxRenderer());
		 
		/* Calendar  cal=new GregorianCalendar();
		 int year = cal.get(Calendar.YEAR);
		 JComboBox birthYear =new JComboBox();
			int mn  = cal.get(Calendar.MONTH);
			 JComboBox birthMonth =new JComboBox();
			 birthMonth.addItem(mn);
			int dts  = cal.get(Calendar.DATE);
			 JComboBox  birthDate=new JComboBox();
			  f.add(birthYear);
		 f.add(birthMonth);
		 f.add(birthDate);
			 */
			
			JLabel l4=new JLabel("Gender");
			l4.setFont(l4.getFont().deriveFont(14.0f));
			 l4.setBounds(40,238,400,30);
			JRadioButton r1 = new JRadioButton("Male");
			r1.setBounds(130,258,400,30);
		    JRadioButton r2 = new JRadioButton("Female");
		    r2.setBounds(130,228,400,30);
		    ButtonGroup bg=new ButtonGroup();
		    
			JLabel l5=new JLabel("Email ID");
			l5.setFont(l5.getFont().deriveFont(14.0f));
			 l5.setBounds(40,300,400,30);
			 JTextField id=new JTextField("Enter Here");
			 id.setBounds(120,308,200,25);
			 
			 JLabel l6=new JLabel("Address");
			 l6.setFont(l6.getFont().deriveFont(16.0f));
			 l6.setBounds(40,340,400,30);
			 JTextField d1=new JTextField("Street Address");
			 d1.setBounds(40,380,260,25);
			 JTextField d2=new JTextField("City");
			 d2.setBounds(40,420,130,25);
			 JTextField d3=new JTextField("State/Province");
			 d3.setBounds(190,420,130,25);
			 JTextField d4=new JTextField("Postal/Zip Code");
			 d4.setBounds(40,460,100,25);
			 String country[]= {"Country","India","France","Spain","United States","China","Italy","Germany"};
			 JComboBox con=new JComboBox(country);
			 con.setBounds(180,460,100,25);
			 
			 JLabel l7=new JLabel("Blood Group");
			 l7.setFont(l7.getFont().deriveFont(14.0f));
			 l7.setBounds(40,490,100,30);
			 String bloodgr[]= {"Select one","A+","B+","A-","B-","AB+","AB-","O-","O+"};
			 JComboBox bgr=new JComboBox(bloodgr);
			 bgr.setBounds(180,500,130,25);
			 
			 JLabel l8=new JLabel("Height");
			 l8.setFont(l8.getFont().deriveFont(14.0f));
			 l8.setBounds(40,540,100,30);
			 JTextField h=new JTextField("Enter Height");
			 h.setBounds(140,550,100,25);
			 JLabel l9=new JLabel("Weight");
			 l9.setFont(l9.getFont().deriveFont(14.0f));
			 l9.setBounds(40,580,100,30);
			 JTextField w=new JTextField("Enter Weight");
			 w.setBounds(140,590,100,25);
			/* JTextField t1;  
			  t1=new JTextField("Information");  
			    t1.setBounds(170,640, 200,100); */ 
			
		 p.add(l);
		 p.add(l2);
		 f.add(fname);
		 f.add(tname);
		 f.add(tlast);
		 f.add(pnum);
		 f.add(tnum);
		 f.add(birth);
		 f.add(combo);
		 f.add(l4);
		 bg.add(r1);
		 bg.add(r2);
		 f.add(r1);
		 f.add(r2);
		 f.add(l5);
		f.add(id);
		f.add(l6);
		f.add(d1);
		f.add(d2);
		f.add(d3);
		f.add(d4);
		f.add(con);
		f.add(l7);
		f.add(bgr);
		f.add(l8);
		f.add(l9);
		f.add(h);
		f.add(w);
		 f.add(p);
	//	f.add(t1);
		
		
		   f.setSize(500,800);
		   f.setVisible(true);
		   f.setLayout(null);
		   f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		  // f.setResizable(false);
		   f.setVisible(true);
		  
	 }
	public static void main(String args[])
	{
		Main m=new Main();
		m.form();
	}
}
class DateComboBoxRenderer extends DefaultListCellRenderer {
	  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	  public Component getListCellRendererComponent(JList list, Object value,
	      int index, boolean isSelected, boolean cellHasFocus) {
	    Object item = value;
	    if (item instanceof Date) {
	      item = dateFormat.format((Date) item);
	    }
	    return super.getListCellRendererComponent(list, item, index, isSelected,
	        cellHasFocus);
	  }
	}
