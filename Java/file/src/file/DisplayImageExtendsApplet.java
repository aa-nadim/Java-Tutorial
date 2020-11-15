/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

/**
 *
 * @author Abdul Awal Nadim
 */
public class DisplayImageExtendsApplet {
      Image picture;   
      public void init() {   
          picture = getImage(getDocumentBase(),"a.jpg");   
      }    
      public void paint(Graphics g) { 
          g.drawImage(picture, 30,30, (ImageObserver) this);   
      } 
}
