package javaframe;
import java.applet.Applet;
import java.awt.*;
public class AppletDemo extends Applet{
public void init()
{
setBackground(Color.black);
setForeground(Color.yellow);
}
public void paint(Graphics g)
{
	g.drawString("Welcome",100,100);
}
}
//<applet code="AppletDemo.class" width="200" height="200">
//</applet>