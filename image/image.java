import java.applet.Applet;  
import java.awt.*;  
  
public class image extends Applet

{
Image picture;
	  public void init()
                 {  
		    picture = getImage(getDocumentBase(),"Penguins.jpg");  
		  }  

	
public void paint(Graphics g)
{  

g.drawImage(picture,300,10,100,200, this);


}

public static void main(String[] args)
{



}  
}