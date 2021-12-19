import java.applet.*;
import java.awt.*;
import java.awt.event.*;


/*<applet code="face.class" width="600" height="600"></applet>*/
public class face extends Applet implements ActionListener
{
	int lx=350,ly=350,lw=20,lh=30,rx=440;
	int ox=380,oy=410,ow=50,oh=80,x1=300,x2=300,y=200;

Button b1= new Button("original");
Button b2= new Button("left");
Button b3= new Button("right");
Button b4= new Button("up");
Button b5= new Button("down");

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
			y=200;
			x1=300;
			ox=380;
			x2=300;
			oy=410;
			ow=50;
			oh=80;
			lx=350;
			rx=440;
			ly=350;
			lw=20;
			lh=30;
		}
		if(ae.getSource()==b2)
		{  
			repaint();
			
			y=200;
			x1=100;
			x2=300;
			lx=150;
			rx=240;
			ly=350;
			lw=20;
			lh=30;
			ox=180;
			oy=410;
			ow=50;
			oh=80;


		}
	    

		if(ae.getSource()==b3)
		{  
			repaint();
			
			y=200;
			x1=800;
			ox=880;
			x2=300;
			oy=410;
			ow=50;
			oh=80;
			lx=850;
			rx=940;
			ly=350;
			lw=20;
			lh=30;
		}


		if(ae.getSource()==b4)
		{  
			repaint();
			
			x1=300;
			ox=380;
			x2=100;
			oy=210;
			ow=50;
			oh=80;
			lx=350;
			rx=440;
			ly=150;
			lw=20;
			lh=30;
		}

		if(ae.getSource()==b5)
		{  
			repaint();
			
			x1=300;
			ox=380;
			x2=450;
			oy=560;
			ow=50;
			oh=80;
			lx=350;
			rx=440;
			ly=490;
			lw=20;
			lh=30;		
		}
		
			
	}

	public void paint(Graphics g){
              g.setColor(Color.YELLOW);
  		   g.fillOval(x1,x2,y,y);
           g.setColor(Color.BLACK);
          // g.fillOval(270,300,50,80);
             g.fillOval(ox,oy,ow,oh);
		    
           g.setColor(Color.BLACK);
            
           g.fillOval(lx,ly,lw,lh);
           g.fillOval(rx,ly,lw,lh);


//g.fillOval(240,230,20,30);
             //g.fillOval(320,230,20,30);
		}
}