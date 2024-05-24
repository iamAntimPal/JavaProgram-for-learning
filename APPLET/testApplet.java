import java.applet.Applet.*;
import java.awt.*;

/* 
 <applet code="testApplet" height="400" width="200"></applet>
*/
public class testApplet extends Applet
{
     public void paint(Graphics g)
     {
          g.drawString("Hello... ! Welcome to Java Applet ", 20, 30);
     }
}