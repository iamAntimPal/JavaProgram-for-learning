import java.applet.*;
import java.awt.*;

/* 
 <applet code="testApplet3" height="400" width="200"></applet>
*/

public class testApplet3 extends Applet
{
     Image pic;

     public void init() {
          pic = getImage(getCodeBase(), "C:\\Users\\antim\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-05-16 135853.png");
     }
     public void paint(Graphics G)
     {
          G.drawImage(pic, 30,30,this);
     }
}
