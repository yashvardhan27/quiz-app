package quizapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener{
	
	JButton rules,back;
	JTextField t;
	Login()
	{
		getContentPane().setBackground(Color.WHITE);//it turns the background color white 
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));// J frame has inbuilt class for imageIcon
		JLabel image=new JLabel(i1);
		image.setBounds(0,0,600,500);// setbounds helps to create your own layout(600-length,500width) and first two are x and y coordinates
		add(image);
		
		JLabel heading = new JLabel("simple minds");
		heading.setBounds(750,60,300,45);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		heading.setForeground(Color.BLUE);
		add(heading);
		
		JLabel name = new JLabel("Enter your name");
		name.setBounds(810,150,300,20);
		name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
		name.setForeground(Color.BLUE);
		add(name);
		t= new JTextField();
		t.setBounds(735,200,300,25);
		t.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(t);
		
		 rules = new JButton("RULES");
		rules.setBounds(735,270,120,25);
		rules.setBackground(new Color(30,144,254));
		rules.setForeground(Color.white);
		rules.addActionListener(this);
		add(rules);
		
		 back  = new JButton("BACK");
		back .setBounds(915,270,120,25);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		setSize(1200,500);
		setLocation(400,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		new Login();
		
		
		
	}


	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== rules)
		{
			String name= t.getText();
			dispose();
			new Rules(name);
			
			
		}
		
		if(e.getSource()==back)
		{
			dispose();
			
		}
		// TODO Auto-generated method stub
		
	}
	
	

	
	
}
