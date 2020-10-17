package javaframe;

import java.awt.*;
class Awttest extends Frame
{
public void button()
{
Button b=new Button("Click here");
b.setBounds(150,200,200,200);
b.setBackground(Color.green);
add(b);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public static void main(String args[]){
Awttest s=new Awttest();
s.button();
}
}