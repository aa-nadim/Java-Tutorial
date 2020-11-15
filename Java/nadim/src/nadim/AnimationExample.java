
package nadim;

import java.applet.*; 
import java.awt.Graphics;
import java.awt.Image;
public class AnimationExample extends Applet{
    Image picture;   
    public void init() { 
        picture =getImage(getDocumentBase(),"a.gif");   
    }
    public void paint(Graphics g) { 
         for(int i=0;i<5;i=i+2){  
              g.drawImage(picture, i,0, this); 
              try{Thread.sleep(100);}catch(Exception e){}
         }
    }  
}
