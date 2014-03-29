import javax.swing.JApplet;
import java.awt.*;

/**
* Lily Peng
* Sept. 10, 2011
* CS1331
* This class creates a Java applet, advertising an iPod Nano, 5th generation.
*/

public class AdvertisementApplet extends JApplet
{
	public void paint(Graphics page) 
	{
		page.setColor(Color.green);
		page.fillRoundRect(150, 75, 100, 200, 5, 5); //body of the iPod
		page.setColor(Color.black);
		page.fillRoundRect(160, 85, 80, 100, 5, 5); // border of the screen
		page.setColor(Color.gray); 
		page.fillRect(165, 90, 70, 90); //iPod screen
		page.setColor(Color.white);
		page.fillOval(165, 195, 70, 70); //the iPod click wheel
		page.setColor(Color.green);
		page.fillOval(185, 215, 30, 30); //the button inside the click wheel

		page.setColor(Color.blue);
		page.drawLine(0, 75, 75, 0); //left corner decoration
		page.drawLine(325, 0, 400, 75); //right corner decoration
		
		Color header = new Color(255, 0, 130); //custom reddish, pinkish color for the header String
		page.setColor(header);
		page.setFont(new Font("Times New Roman", Font.BOLD, 24));
		page.drawString("FREE", 170, 50); //this String advertises that the iPod is "FREE"
		
		Color body = new Color(186, 68, 255); //custom lavender body String color
		page.setColor(body);
		page.drawString("iPod Nano 5th Generation!", 65, 315); //this is the first body String
		
		Color body2 = new Color(98, 195, 255); //custom baby blue color for second body String
		page.setColor(body2);
		page.drawString("Retrieve your prize from Lily Peng", 20, 345); //this is the second body String
		
	} //end paint method
	
} //end class AdvertisementApplet
