package com.elaq.test;

import java.awt.*;
import acm.program.*;
import acm.graphics.*;
 public class Sierpinski extends GraphicsProgram {
   public void run() {
	   // draw black background square
          GRect box = new GRect(20, 20, 242, 242);
          box.setFilled(true);
          add(box);
  
          // recursively draw all the white squares on top
          drawGasket(20, 20, 243);
      }
  
      public void drawGasket(int x, int y, int side) {
          // draw single white square in middle
          int sub = side / 3; // length of sub-squares
         GRect box = new GRect(x + sub, y + sub, sub - 1, sub - 1);
          box.setFilled(true);
          box.setColor(Color.WHITE);
          add(box);
  
          if(sub >= 3) {
              // now draw eight sub-gaskets around the white square
              drawGasket(x,           y, sub);
              drawGasket(x + sub,     y, sub);
              drawGasket(x + 2 * sub, y, sub);
              drawGasket(x,           y + sub, sub);
              drawGasket(x + 2 * sub, y + sub, sub);
              drawGasket(x,           y + 2 * sub, sub);
              drawGasket(x + sub,     y + 2 * sub, sub);
             drawGasket(x + 2 * sub, y + 2 * sub, sub);
          }
      }
  }