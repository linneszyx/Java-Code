import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends Applet implements ActionListener
{
	String s="",op="";
	int i=0,j=0;
	TextField text;
        Button one,two,three,four,five,six,seven,eight,nine,zero;
	Button plus,minus,mul,div,equal,ce;
	Button blist[] = new Button[10];

	public void init()
        {
		setLayout(null);
		one = new Button("1");
		two = new Button("2");
		three = new Button("3");
		four = new Button("4");
		five = new Button("5");
		six = new Button("6");
		seven = new Button("7");
		eight = new Button("8");
		nine = new Button("9");
		zero = new Button("0");

		plus = new Button("+");
		minus = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		equal = new Button("=");
		ce = new Button("c");

		one.setBounds(100,100,20,20);
		two.setBounds(130,100,20,20);
		three.setBounds(160,100,20,20);
		four.setBounds(100,130,20,20);
		five.setBounds(130,130,20,20);
		six.setBounds(160,130,20,20);
		seven.setBounds(100,160,20,20);
		eight.setBounds(130,160,20,20);
		nine.setBounds(160,160,20,20);
		zero.setBounds(100,190,20,20);

		plus.setBounds(190,100,20,20);
		minus.setBounds(190,130,20,20);
		mul.setBounds(190,160,20,20);
		div.setBounds(190,190,20,20);
		equal.setBounds(160,190,20,20);
		ce.setBounds(130,190,20,20);

		text = new TextField(10);
		text.setBounds(100,70,110,20);
		blist[0] = (Button) add(zero);
		blist[1] = (Button) add(one);
		blist[2] = (Button) add(two);
		blist[3] = (Button) add(three);
		blist[4] = (Button) add(four);
		blist[5] = (Button) add(five);
		blist[6] = (Button) add(six);
		blist[7] = (Button) add(seven);
		blist[8] = (Button) add(eight);
		blist[9] = (Button) add(nine);
		add(plus);
		add(minus);
		add(mul);
		add(div);
		add(equal);
		add(ce);
		add(text);
		for(int i=0;i<10;i++)
                {
			blist[i].addActionListener(this);
		}
                plus.addActionListener(this);
		minus.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		equal.addActionListener(this);
		ce.addActionListener(this);
		text.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae){
		String str = ae.getActionCommand();
		
		if(str.equals("1"))
			i = i*10 + 1;
		else if(str.equals("2"))
			i = i*10 + 2;
		else if(str.equals("3"))
			i = i*10 + 3;
		else if(str.equals("4"))
			i = i*10 + 4;
		else if(str.equals("5"))
			i = i*10 + 5;
		else if(str.equals("6"))
			i = i*10 + 6;
		else if(str.equals("7"))
			i = i*10 + 7;
		else if(str.equals("8"))
			i = i*10 + 8;
		else if(str.equals("9"))
			i = i*10 + 9;
		else if(str.equals("0"))
			i = i*10;
		
		if (str.equals("="))
                {
			if (op.equals("+"))
				i += j;
			if (op.equals("-"))
				i = j-i;
			if (op.equals("*"))
				i *= j;
			if (op.equals("/"))
				i = j/i;
		}
			
		if (str.equals("+")){
			if (op.equals("+"))
				{
                                i += j;
                                j=i;
                                }
			else
				{
                                j = i;
                                i=0;
                                }
			op = "+";
		}
		if (str.equals("-"))
                {
			if (op.equals("-"))
			{	i = j-i;j=i;}
			else
				{j = i;i=0;}
			op = "-";
		}
		if (str.equals("*")){
			if (op.equals("*"))
			{	i *= j;j=i;}
			else
				{j = i;i=0;}
			op = "*";
		}
		if (str.equals("/")){
			if (op.equals("/"))
			{	i = j/i;j=i;}
			else
				{j = i;i=0;}
			op = "/";
		}
		if (str.equals("c"))
		{	i = 0;j=0;op = "";}

		
		text.setText(i+"");
		if (str.equals("=")) i=0;
		repaint();
	}

	public void paint(Graphics g)
        {
		g.setColor(Color.RED);
                g.drawString(s,100,100);
                setBackground(Color.YELLOW);
	}
}

/*
<applet code = calculator width = 300 height = 300>
</applet>
*/
