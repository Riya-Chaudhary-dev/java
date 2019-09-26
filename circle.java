
import java.applet.Applet;
import java.awt.Graphics;
/* 
<applet code="Circle" width=200 height=60> 
</applet> 
*/

public class Circle extends Applet{
	@Override
	public void paint(Graphics g){
	g.drawString("Hello World",20,20);
}
}