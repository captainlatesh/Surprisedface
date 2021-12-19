import java.applet.*;
import java.awt.*;
import java.awt.event.*;


/*<applet code="surpriseface.class" width="600" height="600"></applet>*/
public class surpriseface extends Applet implements ActionListener
{
	int lx=250,ly=230,lw=20,lh=30,rx=330;
Button b1= new Button("original");
Button b2= new Button("eye_left");
Button b3= new Button("eye_right");
Button b4= new Button("eye_up");
Button b5= new Button("eye_down");

public void init()
{
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);

	b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
}



public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{  
			repaint();
			lx=250;
			rx=330;
			ly=230;
			lw=20;
			lh=30;
		}
		if(ae.getSource()==b2)
		{  
			repaint();
			lx=220;
			rx=300;
			ly=230;
			lw=20;
			lh=30;
		}
	    

		if(ae.getSource()==b3)
		{  
			repaint();
			lx=280;
			rx=360;
			ly=230;
			lw=20;
			lh=30;
		}


		if(ae.getSource()==b4)
		{  
			repaint();
			ly=210;
			lx=250;
			lw=20;
			lh=30;
			rx=330;
			
		}

		if(ae.getSource()==b5)
		{  
			repaint();
			ly=250;
             lx=250;
             lw=20;
             lh=30;
             rx=330;			
		}
		
			
	}

	public void paint(Graphics g){
              g.setColor(Color.YELLOW);
  		   g.fillOval(200,200,200,200);
           g.setColor(Color.BLACK);
           g.fillOval(270,300,50,80);
		
           g.setColor(Color.BLACK);
            //g.fillOval(240,230,20,30);
             //g.fillOval(320,230,20,30);
           g.fillOval(lx,ly,lw,lh);
           g.fillOval(rx,ly,lw,lh);

		}
}