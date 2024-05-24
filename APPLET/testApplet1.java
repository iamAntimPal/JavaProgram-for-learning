import java.applet.*;
import java.awt.*;

/* 
 <applet code="testApplet" height="400" width="200"></applet>
*/

public class testApplet1 extends Applet{
     public void paint(Graphics G)
     {
          G.setColor(Color.blue);
          G.drawLine(20, 30, 150, 30);
          G.drawRect(20, 60,40, 70);
          G.fillRect(20,120,40,40);
          G.drawOval(20,200, 30,40);
     }
}
