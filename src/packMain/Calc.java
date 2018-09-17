package packMain;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Calc extends JFrame{
	
	private JTextArea JT1 = new JTextArea("0",1,16);
	private JButton JB0 = new JButton("0");
	private JButton JB1 = new JButton("1");
	private JButton JB2 = new JButton("2");
	private JButton JB3 = new JButton("3");
	private JButton JB4 = new JButton("4");
	private JButton JB5 = new JButton("5");
	private JButton JB6 = new JButton("6");
	private JButton JB7 = new JButton("7");
	private JButton JB8 = new JButton("8");
	private JButton JB9 = new JButton("9");
	private JButton JBPlus = new JButton("+");
	private JButton JBMinus = new JButton("-");
	private JButton JBMultiply = new JButton("*");
	private JButton JBDivide = new JButton("/");
	private JButton JBRes = new JButton("=");
	private JButton JBClear = new JButton("C");
	private Integer res1;
	private Integer res2;
	private String operation;
	
	JFrame frame = new JFrame();	
	{
		setTitle("Calculator");
		setSize(200, 180);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);
		
		add(JT1);
		add(JB7);
		add(JB8);
		add(JB9);
		add(JBPlus);
		add(JB4);
		add(JB5);
		add(JB6);
		add(JBMinus);
		add(JB1);
		add(JB2);
		add(JB3);
		add(JBMultiply);
		add(JB0);
		add(JBRes);
		add(JBClear);
		add(JBDivide);
		
		JT1.setEditable(false);
		
		JB0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(JT1.getText().equals("0"))
				{JT1.setText("0");}
			else
			{JT1.setText(JT1.getText()+"0");}
				
			}
		});
		
		JB1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(JT1.getText().equals("0"))
					{JT1.setText("1");}
				else
				{JT1.setText(JT1.getText()+"1");}
				
			}
		});
		
		JB2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(JT1.getText().equals("0"))
				{JT1.setText("2");}
			else
			{JT1.setText(JT1.getText()+"2");}
				
			}
		});
		
		JB3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(JT1.getText().equals("0"))
				{JT1.setText("3");}
			else
			{JT1.setText(JT1.getText()+"3");}
				
			}
		});
		
		JB4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(JT1.getText().equals("0"))
				{JT1.setText("4");}
			else
			{JT1.setText(JT1.getText()+"4");}
				
			}
		});
		
		JB5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(JT1.getText().equals("0"))
				{JT1.setText("5");}
			else
			{JT1.setText(JT1.getText()+"5");}
				
			}
		});
		
		JB6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(JT1.getText().equals("0"))
				{JT1.setText("6");}
			else
			{JT1.setText(JT1.getText()+"6");}
				
			}
		});
		
		JB7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(JT1.getText().equals("0"))
				{JT1.setText("7");}
			else
			{JT1.setText(JT1.getText()+"7");}
				
			}
		});
		
		JB8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(JT1.getText().equals("0"))
				{JT1.setText("8");}
			else
			{JT1.setText(JT1.getText()+"8");}
				
			}
		});
		
		JB9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(JT1.getText().equals("0"))
				{JT1.setText("9");}
			else
			{JT1.setText(JT1.getText()+"9");}
				
			}
		});
		
		JBClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				res1=0;
				JT1.setText("0");
			}
		});
		
		
		JBPlus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				res1=Integer.valueOf(JT1.getText());
				operation="+";
				JT1.setText("0");
				
			}
		});
		
		JBMinus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				res1=Integer.valueOf(JT1.getText());
				operation="-";
				JT1.setText("0");
				
			}
		});
		
		JBMultiply.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				res1=Integer.valueOf(JT1.getText());
				operation="*";
				JT1.setText("0");
				
			}
		});
		
		JBDivide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				res1=Integer.valueOf(JT1.getText());
				operation="/";
				JT1.setText("0");
				
			}
		});
		
		JBRes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				res2=Integer.valueOf(JT1.getText());
				
				methodCalc();
				
				 JT1.setText(res1.toString()); 
			}

			
		});
	}
	
	public void methodCalc() {
		
			
			switch(operation)
			{
			 case "+":
			 res1 = sum(res1,res2);
			 break;
			 case "-":
			 res1 = min(res1,res2);
			 break;
			 case "*":
			 res1 = multiply(res1,res2);
			 break;
			 case "/":	
					 try{res1 = divide(res1,res2);
					 break;
					 }
					 catch(ArithmeticException ae)
					 {
						 new JOptionPane();
						JOptionPane.showMessageDialog(null,ae,"Ошибка", 3);
						 res1=0;
						 JT1.setText("0");
						 break;
					 }
			 
			 default:
			 res1 = 0;
			 break;
			 }
			// TODO Auto-generated method stub
			
		}

	public static Integer divide(Integer res12, Integer res22) {
		return res12/res22;
	}
	public	static Integer multiply(Integer res12, Integer res22) {
		return res12*res22;
	}
	public	static Integer min(Integer res12, Integer res22) {
		return res12-res22;
	}
	public	static Integer sum(Integer res12, Integer res22) {
		return res12+res22;
	}
		
	
}
