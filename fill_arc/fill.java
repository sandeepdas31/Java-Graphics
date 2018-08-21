import java.applet.Applet;  
import java.awt.*;  
  
public class fill extends Applet{  
	
public void paint(Graphics g)
{  

g.fillArc(230,200,30,30,0,180);
g.fillOval(120,150,30,30);  
g.fillArc(170,200,30,30,180,180);

}

public static void main(String[] args)
{



}  
}